/*
 * generated by Xtext 2.12.0
 */
package org.xtext.validation
import org.eclipse.xtext.validation.Check
import org.eclipse.emf.ecore.EReference
import org.xtext.pLhlcl.VarDeclaration
import org.xtext.pLhlcl.PLhlclPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PLhlclValidator extends AbstractPLhlclValidator {
		static val packageInstance = PLhlclPackage.eINSTANCE
	/**
	 * Method for checking that non boolean domains are correctly declarated 
	 */
	@Check
	def checkTypeForNonBooleanDomain(VarDeclaration decl){
		if (decl.type=="boolean"){
			return
		}else{
			if (decl.variants === null){
				error("A variants declaration is required for variable '"+decl.name+"'",
					PLhlclPackage::eINSTANCE.varDeclaration_Variants)
				return
			}
		}
	}
	
	//TODO
	/*
	 * validar que el padre de una relación estructural este declarado
	 * cada elemento puede hacer parte de solo una relacion estructural?
	 * 
	 */
	
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					PLhlclPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
}
