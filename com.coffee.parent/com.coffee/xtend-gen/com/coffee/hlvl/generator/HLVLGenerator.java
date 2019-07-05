/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.generator;

import com.coffee.hlvl.generator.Dialect;
import com.coffee.hlvl.generator.IHLVLParser;
import com.coffee.hlvl.generator.ParserFactory;
import com.coffee.hlvl.hLVL.ElmDeclaration;
import com.coffee.hlvl.hLVL.Group;
import com.coffee.hlvl.hLVL.Model;
import com.coffee.hlvl.hLVL.MultInstantiation;
import com.coffee.hlvl.hLVL.RelDeclaration;
import com.coffee.hlvl.hLVL.Relation;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 * /
 *  Class autogenerated by xtext and edited to define the code generator
 * for the High Level Variability Language (HLVL)
 * @author Angela Villota
 * @version HLVL 1.4
 * August 2019
 * Updated on January 2019 to the new HLVL grammar
 */
@SuppressWarnings("all")
public class HLVLGenerator extends AbstractGenerator {
  /**
   * instantiable is a flag for determine if the variability model has multiplicities
   */
  private boolean instantiable = false;
  
  /**
   * attributes is a flag for determine if the variability model has attributes
   */
  private boolean attributes = false;
  
  /**
   * generator is an instance of IGenerator
   */
  private IHLVLParser parser;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final String modelName = this.modelName(((Model) _head));
    EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head_1);
    final Dialect dialect = this.setDialect(model);
    final long startTime = System.currentTimeMillis();
    this.parser = ParserFactory.getParser(dialect, modelName);
    fsa.generateFile((modelName + ".mzn"), this.parser.parseModel(model));
    final long stopTime = System.currentTimeMillis();
    final long elapsedTime = (stopTime - startTime);
    fsa.generateFile((modelName + "_Operations.json"), this.parser.getOperations(elapsedTime));
  }
  
  /**
   * Method to obtain the name of the model
   * @param modes is of type Model
   * @returns String name with the name of the model
   */
  public String modelName(final Model model) {
    String name = StringExtensions.toFirstUpper(model.getName());
    return name;
  }
  
  /**
   * Method that determines the dialect used to specify the model
   * using the
   * @param model is an abstract representation of the model
   */
  public Dialect setDialect(final Model model) {
    if ((this.allBoolean(model) && this.booleanRelations(model))) {
      return Dialect.BOOL;
    } else {
      boolean _existInstantiable = this.existInstantiable();
      if (_existInstantiable) {
        return Dialect.INST;
      } else {
        return Dialect.ATT;
      }
    }
  }
  
  /**
   * Method to determine the type of the variables
   * If there are one variable that cannot be mapped into a boolean
   * variable, then the method returns CSP.
   * @param model
   * @return true if all elements are booleans
   */
  public boolean allBoolean(final Model model) {
    boolean isBoolean = true;
    EList<ElmDeclaration> _elements = model.getElements();
    for (final ElmDeclaration element : _elements) {
      {
        String _att = element.getAtt();
        boolean _tripleEquals = (_att == null);
        boolean _not = (!_tripleEquals);
        this.attributes = _not;
        if ((Objects.equal(element.getDataType(), "integer") || Objects.equal(element.getDataType(), "symbolic"))) {
          isBoolean = false;
          return isBoolean;
        }
      }
    }
    return isBoolean;
  }
  
  /**
   * Method to determine the type of the constraints
   * If there are one constraint that cannot be mapped into a boolean
   * constraint, then the method returns false.
   * @param model
   * @return true if all constraints can be mapped to boolean
   */
  public boolean booleanRelations(final Model model) {
    boolean allBoolean = true;
    EList<RelDeclaration> _relations = model.getRelations();
    for (final RelDeclaration rel : _relations) {
      Relation _exp = rel.getExp();
      if ((_exp instanceof MultInstantiation)) {
        this.instantiable = true;
        return false;
      } else {
        Relation _exp_1 = rel.getExp();
        if ((_exp_1 instanceof Group)) {
          Relation _exp_2 = rel.getExp();
          final int min = ((Group) _exp_2).getMin();
          Relation _exp_3 = rel.getExp();
          final int numChildren = ((Group) _exp_3).getChildren().getValues().size();
          int max = 0;
          Relation _exp_4 = rel.getExp();
          String _value = ((Group) _exp_4).getMax().getValue();
          boolean _equals = Objects.equal(_value, "*");
          if (_equals) {
            max = numChildren;
          } else {
            Relation _exp_5 = rel.getExp();
            max = Integer.parseInt(
              ((Group) _exp_5).getMax().getValue());
          }
          if (((!((min == 1) && (max == 1))) && 
            (!((min == 1) && (max == numChildren))))) {
            return false;
          }
        }
      }
    }
    return allBoolean;
  }
  
  public boolean existInstantiable() {
    return this.instantiable;
  }
}