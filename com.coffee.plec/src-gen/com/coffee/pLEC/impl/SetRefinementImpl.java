/**
 * generated by Xtext 2.12.0
 */
package com.coffee.pLEC.impl;

import com.coffee.pLEC.ListOfIDs;
import com.coffee.pLEC.ListOfValues;
import com.coffee.pLEC.PLECPackage;
import com.coffee.pLEC.SetRefinement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.pLEC.impl.SetRefinementImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link com.coffee.pLEC.impl.SetRefinementImpl#getHead <em>Head</em>}</li>
 *   <li>{@link com.coffee.pLEC.impl.SetRefinementImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetRefinementImpl extends RefinementImpl implements SetRefinement
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected ListOfIDs vars;

  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected ListOfValues head;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected EList<ListOfValues> tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetRefinementImpl()
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
    return PLECPackage.Literals.SET_REFINEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfIDs getVars()
  {
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVars(ListOfIDs newVars, NotificationChain msgs)
  {
    ListOfIDs oldVars = vars;
    vars = newVars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PLECPackage.SET_REFINEMENT__VARS, oldVars, newVars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVars(ListOfIDs newVars)
  {
    if (newVars != vars)
    {
      NotificationChain msgs = null;
      if (vars != null)
        msgs = ((InternalEObject)vars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PLECPackage.SET_REFINEMENT__VARS, null, msgs);
      if (newVars != null)
        msgs = ((InternalEObject)newVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PLECPackage.SET_REFINEMENT__VARS, null, msgs);
      msgs = basicSetVars(newVars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PLECPackage.SET_REFINEMENT__VARS, newVars, newVars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfValues getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(ListOfValues newHead, NotificationChain msgs)
  {
    ListOfValues oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PLECPackage.SET_REFINEMENT__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(ListOfValues newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PLECPackage.SET_REFINEMENT__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PLECPackage.SET_REFINEMENT__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PLECPackage.SET_REFINEMENT__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ListOfValues> getTail()
  {
    if (tail == null)
    {
      tail = new EObjectContainmentEList<ListOfValues>(ListOfValues.class, this, PLECPackage.SET_REFINEMENT__TAIL);
    }
    return tail;
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
      case PLECPackage.SET_REFINEMENT__VARS:
        return basicSetVars(null, msgs);
      case PLECPackage.SET_REFINEMENT__HEAD:
        return basicSetHead(null, msgs);
      case PLECPackage.SET_REFINEMENT__TAIL:
        return ((InternalEList<?>)getTail()).basicRemove(otherEnd, msgs);
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
      case PLECPackage.SET_REFINEMENT__VARS:
        return getVars();
      case PLECPackage.SET_REFINEMENT__HEAD:
        return getHead();
      case PLECPackage.SET_REFINEMENT__TAIL:
        return getTail();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PLECPackage.SET_REFINEMENT__VARS:
        setVars((ListOfIDs)newValue);
        return;
      case PLECPackage.SET_REFINEMENT__HEAD:
        setHead((ListOfValues)newValue);
        return;
      case PLECPackage.SET_REFINEMENT__TAIL:
        getTail().clear();
        getTail().addAll((Collection<? extends ListOfValues>)newValue);
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
      case PLECPackage.SET_REFINEMENT__VARS:
        setVars((ListOfIDs)null);
        return;
      case PLECPackage.SET_REFINEMENT__HEAD:
        setHead((ListOfValues)null);
        return;
      case PLECPackage.SET_REFINEMENT__TAIL:
        getTail().clear();
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
      case PLECPackage.SET_REFINEMENT__VARS:
        return vars != null;
      case PLECPackage.SET_REFINEMENT__HEAD:
        return head != null;
      case PLECPackage.SET_REFINEMENT__TAIL:
        return tail != null && !tail.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SetRefinementImpl
