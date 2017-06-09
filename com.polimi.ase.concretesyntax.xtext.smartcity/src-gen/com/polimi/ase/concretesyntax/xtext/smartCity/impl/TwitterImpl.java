/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity.impl;

import com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage;
import com.polimi.ase.concretesyntax.xtext.smartCity.Twitter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TwitterImpl#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwitterImpl extends PostImpl implements Twitter
{
  /**
   * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagraphs()
   * @generated
   * @ordered
   */
  protected EList<Paragraph> paragraphs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TwitterImpl()
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
    return SmartCityPackage.Literals.TWITTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Paragraph> getParagraphs()
  {
    if (paragraphs == null)
    {
      paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, SmartCityPackage.TWITTER__PARAGRAPHS);
    }
    return paragraphs;
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
      case SmartCityPackage.TWITTER__PARAGRAPHS:
        return ((InternalEList<?>)getParagraphs()).basicRemove(otherEnd, msgs);
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
      case SmartCityPackage.TWITTER__PARAGRAPHS:
        return getParagraphs();
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
      case SmartCityPackage.TWITTER__PARAGRAPHS:
        getParagraphs().clear();
        getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
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
      case SmartCityPackage.TWITTER__PARAGRAPHS:
        getParagraphs().clear();
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
      case SmartCityPackage.TWITTER__PARAGRAPHS:
        return paragraphs != null && !paragraphs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TwitterImpl
