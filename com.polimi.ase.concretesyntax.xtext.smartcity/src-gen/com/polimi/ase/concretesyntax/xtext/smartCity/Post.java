/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Post#getImages <em>Images</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Post#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends Data
{
  /**
   * Returns the value of the '<em><b>Images</b></em>' containment reference list.
   * The list contents are of type {@link com.polimi.ase.concretesyntax.xtext.smartCity.Image}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Images</em>' containment reference list.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getPost_Images()
   * @model containment="true"
   * @generated
   */
  EList<Image> getImages();

  /**
   * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
   * The list contents are of type {@link com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videos</em>' containment reference list.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getPost_Videos()
   * @model containment="true"
   * @generated
   */
  EList<WebVideo> getVideos();

} // Post
