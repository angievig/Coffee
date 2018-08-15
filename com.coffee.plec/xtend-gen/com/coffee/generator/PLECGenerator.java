/**
 * generated by Xtext 2.12.0
 */
package com.coffee.generator;

import com.coffee.pLEC.Model;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PLECGenerator extends AbstractGenerator {
  /**
   * Name of the PL model
   */
  private String modelName;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    this.modelName = this.modelName(((Model) _head));
    EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile((this.modelName + ".cp"), this.toTHLCL(((Model) _head_1)));
  }
  
  /**
   * Method to obtain the name of the model
   * @param modes is of type Model
   * @retuns String name with the name of the model
   */
  public String modelName(final Model model) {
    String name = StringExtensions.toFirstUpper(model.getName());
    return name;
  }
  
  public CharSequence toTHLCL(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
}