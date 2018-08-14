/**
 * generated by Xtext 2.12.0
 */
package com.coffee.validation;

import com.coffee.pLEC.PLECPackage;
import com.coffee.pLEC.VarDeclaration;
import com.coffee.pLEC.VariantDeclaration;
import com.coffee.validation.AbstractPLECValidator;
import com.google.common.base.Objects;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class PLECValidator extends AbstractPLECValidator {
  private final static PLECPackage packageInstance = PLECPackage.eINSTANCE;
  
  /**
   * Method for checking that non boolean domains are correctly declarated
   */
  @Check
  public void checkTypeForNonBooleanDomain(final VarDeclaration decl) {
    String _type = decl.getType();
    boolean _equals = Objects.equal(_type, "boolean");
    if (_equals) {
      return;
    } else {
      VariantDeclaration _variants = decl.getVariants();
      boolean _tripleEquals = (_variants == null);
      if (_tripleEquals) {
        String _name = decl.getName();
        String _plus = ("A variants declaration is required for variable \'" + _name);
        String _plus_1 = (_plus + "\'");
        this.error(_plus_1, 
          PLECValidator.packageInstance.getVarDeclaration_Variants());
        return;
      }
    }
  }
}
