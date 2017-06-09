/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity.impl;

import com.polimi.ase.concretesyntax.xtext.smartCity.Image;
import com.polimi.ase.concretesyntax.xtext.smartCity.Post;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage;
import com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PostImpl#getImages <em>Images</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PostImpl#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostImpl extends DataImpl implements Post
{
  /**
   * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImages()
   * @generated
   * @ordered
   */
  protected EList<Image> images;

  /**
   * The cached value of the '{@link #getVideos() <em>Videos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideos()
   * @generated
   * @ordered
   */
  protected EList<WebVideo> videos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostImpl()
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
    return SmartCityPackage.Literals.POST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Image> getImages()
  {
    if (images == null)
    {
      images = new EObjectContainmentEList<Image>(Image.class, this, SmartCityPackage.POST__IMAGES);
    }
    return images;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WebVideo> getVideos()
  {
    if (videos == null)
    {
      videos = new EObjectContainmentEList<WebVideo>(WebVideo.class, this, SmartCityPackage.POST__VIDEOS);
    }
    return videos;
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
      case SmartCityPackage.POST__IMAGES:
        return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
      case SmartCityPackage.POST__VIDEOS:
        return ((InternalEList<?>)getVideos()).basicRemove(otherEnd, msgs);
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
      case SmartCityPackage.POST__IMAGES:
        return getImages();
      case SmartCityPackage.POST__VIDEOS:
        return getVideos();
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
      case SmartCityPackage.POST__IMAGES:
        getImages().clear();
        getImages().addAll((Collection<? extends Image>)newValue);
        return;
      case SmartCityPackage.POST__VIDEOS:
        getVideos().clear();
        getVideos().addAll((Collection<? extends WebVideo>)newValue);
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
      case SmartCityPackage.POST__IMAGES:
        getImages().clear();
        return;
      case SmartCityPackage.POST__VIDEOS:
        getVideos().clear();
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
      case SmartCityPackage.POST__IMAGES:
        return images != null && !images.isEmpty();
      case SmartCityPackage.POST__VIDEOS:
        return videos != null && !videos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PostImpl
