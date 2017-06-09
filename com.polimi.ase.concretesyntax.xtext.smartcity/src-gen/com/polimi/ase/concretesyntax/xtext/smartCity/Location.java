/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Metadata
{
  /**
   * Returns the value of the '<em><b>Latitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Latitude</em>' attribute.
   * @see #setLatitude(String)
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getLocation_Latitude()
   * @model
   * @generated
   */
  String getLatitude();

  /**
   * Sets the value of the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLatitude <em>Latitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Latitude</em>' attribute.
   * @see #getLatitude()
   * @generated
   */
  void setLatitude(String value);

  /**
   * Returns the value of the '<em><b>Longitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longitude</em>' attribute.
   * @see #setLongitude(String)
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getLocation_Longitude()
   * @model
   * @generated
   */
  String getLongitude();

  /**
   * Sets the value of the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLongitude <em>Longitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longitude</em>' attribute.
   * @see #getLongitude()
   * @generated
   */
  void setLongitude(String value);

  /**
   * Returns the value of the '<em><b>Region</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region</em>' attribute.
   * @see #setRegion(String)
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getLocation_Region()
   * @model
   * @generated
   */
  String getRegion();

  /**
   * Sets the value of the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getRegion <em>Region</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region</em>' attribute.
   * @see #getRegion()
   * @generated
   */
  void setRegion(String value);

} // Location
