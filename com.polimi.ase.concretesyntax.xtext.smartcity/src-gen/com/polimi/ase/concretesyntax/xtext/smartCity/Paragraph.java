/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends Text
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(String)
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getParagraph_Data()
   * @model
   * @generated
   */
  String getData();

  /**
   * Sets the value of the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph#getData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #getData()
   * @generated
   */
  void setData(String value);

} // Paragraph
