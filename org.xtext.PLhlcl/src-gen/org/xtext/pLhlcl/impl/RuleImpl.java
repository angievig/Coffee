/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pLhlcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.pLhlcl.Expression;
import org.xtext.pLhlcl.PLhlclPackage;
import org.xtext.pLhlcl.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pLhlcl.impl.RuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.pLhlcl.impl.RuleImpl#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends ConsExpressionImpl implements Rule
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequence()
   * @generated
   * @ordered
   */
  protected Expression consequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PLhlclPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PLhlclPackage.RULE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PLhlclPackage.RULE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PLhlclPackage.RULE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PLhlclPackage.RULE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getConsequence()
  {
    return consequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsequence(Expression newConsequence, NotificationChain msgs)
  {
    Expression oldConsequence = consequence;
    consequence = newConsequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PLhlclPackage.RULE__CONSEQUENCE, oldConsequence, newConsequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConsequence(Expression newConsequence)
  {
    if (newConsequence != consequence)
    {
      NotificationChain msgs = null;
      if (consequence != null)
        msgs = ((InternalEObject)consequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PLhlclPackage.RULE__CONSEQUENCE, null, msgs);
      if (newConsequence != null)
        msgs = ((InternalEObject)newConsequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PLhlclPackage.RULE__CONSEQUENCE, null, msgs);
      msgs = basicSetConsequence(newConsequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PLhlclPackage.RULE__CONSEQUENCE, newConsequence, newConsequence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PLhlclPackage.RULE__CONDITION:
        return basicSetCondition(null, msgs);
      case PLhlclPackage.RULE__CONSEQUENCE:
        return basicSetConsequence(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PLhlclPackage.RULE__CONDITION:
        return getCondition();
      case PLhlclPackage.RULE__CONSEQUENCE:
        return getConsequence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PLhlclPackage.RULE__CONDITION:
        setCondition((Expression)newValue);
        return;
      case PLhlclPackage.RULE__CONSEQUENCE:
        setConsequence((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PLhlclPackage.RULE__CONDITION:
        setCondition((Expression)null);
        return;
      case PLhlclPackage.RULE__CONSEQUENCE:
        setConsequence((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PLhlclPackage.RULE__CONDITION:
        return condition != null;
      case PLhlclPackage.RULE__CONSEQUENCE:
        return consequence != null;
    }
    return super.eIsSet(featureID);
  }

} //RuleImpl