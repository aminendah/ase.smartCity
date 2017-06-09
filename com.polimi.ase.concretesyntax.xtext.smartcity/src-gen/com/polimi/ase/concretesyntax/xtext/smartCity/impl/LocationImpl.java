/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity.impl;

import com.polimi.ase.concretesyntax.xtext.smartCity.Location;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.LocationImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.LocationImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.LocationImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MetadataImpl implements Location
{
  /**
   * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatitude()
   * @generated
   * @ordered
   */
  protected static final String LATITUDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatitude()
   * @generated
   * @ordered
   */
  protected String latitude = LATITUDE_EDEFAULT;

  /**
   * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongitude()
   * @generated
   * @ordered
   */
  protected static final String LONGITUDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongitude()
   * @generated
   * @ordered
   */
  protected String longitude = LONGITUDE_EDEFAULT;

  /**
   * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegion()
   * @generated
   * @ordered
   */
  protected static final String REGION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegion()
   * @generated
   * @ordered
   */
  protected String region = REGION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationImpl()
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
    return SmartCityPackage.Literals.LOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLatitude()
  {
    return latitude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatitude(String newLatitude)
  {
    String oldLatitude = latitude;
    latitude = newLatitude;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.LOCATION__LATITUDE, oldLatitude, latitude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongitude()
  {
    return longitude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongitude(String newLongitude)
  {
    String oldLongitude = longitude;
    longitude = newLongitude;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.LOCATION__LONGITUDE, oldLongitude, longitude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegion()
  {
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegion(String newRegion)
  {
    String oldRegion = region;
    region = newRegion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.LOCATION__REGION, oldRegion, region));
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
      case SmartCityPackage.LOCATION__LATITUDE:
        return getLatitude();
      case SmartCityPackage.LOCATION__LONGITUDE:
        return getLongitude();
      case SmartCityPackage.LOCATION__REGION:
        return getRegion();
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
      case SmartCityPackage.LOCATION__LATITUDE:
        setLatitude((String)newValue);
        return;
      case SmartCityPackage.LOCATION__LONGITUDE:
        setLongitude((String)newValue);
        return;
      case SmartCityPackage.LOCATION__REGION:
        setRegion((String)newValue);
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
      case SmartCityPackage.LOCATION__LATITUDE:
        setLatitude(LATITUDE_EDEFAULT);
        return;
      case SmartCityPackage.LOCATION__LONGITUDE:
        setLongitude(LONGITUDE_EDEFAULT);
        return;
      case SmartCityPackage.LOCATION__REGION:
        setRegion(REGION_EDEFAULT);
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
      case SmartCityPackage.LOCATION__LATITUDE:
        return LATITUDE_EDEFAULT == null ? latitude != null : !LATITUDE_EDEFAULT.equals(latitude);
      case SmartCityPackage.LOCATION__LONGITUDE:
        return LONGITUDE_EDEFAULT == null ? longitude != null : !LONGITUDE_EDEFAULT.equals(longitude);
      case SmartCityPackage.LOCATION__REGION:
        return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (latitude: ");
    result.append(latitude);
    result.append(", longitude: ");
    result.append(longitude);
    result.append(", region: ");
    result.append(region);
    result.append(')');
    return result.toString();
  }

} //LocationImpl
