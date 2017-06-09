/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Twitter#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getTwitter()
 * @model
 * @generated
 */
public interface Twitter extends Post
{
  /**
   * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
   * The list contents are of type {@link com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paragraphs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paragraphs</em>' containment reference list.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getTwitter_Paragraphs()
   * @model containment="true"
   * @generated
   */
  EList<Paragraph> getParagraphs();

} // Twitter
