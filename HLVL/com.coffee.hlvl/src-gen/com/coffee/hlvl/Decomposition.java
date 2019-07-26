/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Decomposition#getParent <em>Parent</em>}</li>
 *   <li>{@link com.coffee.hlvl.Decomposition#getChildren <em>Children</em>}</li>
 *   <li>{@link com.coffee.hlvl.Decomposition#getMin <em>Min</em>}</li>
 *   <li>{@link com.coffee.hlvl.Decomposition#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends Relation
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(ElmDeclaration)
   * @see com.coffee.hlvl.HlvlPackage#getDecomposition_Parent()
   * @model
   * @generated
   */
  ElmDeclaration getParent();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Decomposition#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ElmDeclaration value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference.
   * @see #setChildren(ListOfIDs)
   * @see com.coffee.hlvl.HlvlPackage#getDecomposition_Children()
   * @model containment="true"
   * @generated
   */
  ListOfIDs getChildren();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Decomposition#getChildren <em>Children</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Children</em>' containment reference.
   * @see #getChildren()
   * @generated
   */
  void setChildren(ListOfIDs value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see com.coffee.hlvl.HlvlPackage#getDecomposition_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Decomposition#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see com.coffee.hlvl.HlvlPackage#getDecomposition_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Decomposition#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

} // Decomposition
