/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityFactory
 * @model kind="package"
 * @generated
 */
public interface SmartCityPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smartCity";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polimi.com/ase/concretesyntax/xtext/SmartCity";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smartCity";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmartCityPackage eINSTANCE = com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl.init();

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityImpl <em>Smart City</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getSmartCity()
   * @generated
   */
  int SMART_CITY = 0;

  /**
   * The feature id for the '<em><b>Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_CITY__PROVIDERS = 0;

  /**
   * The feature id for the '<em><b>Data Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_CITY__DATA_SOURCES = 1;

  /**
   * The number of structural features of the '<em>Smart City</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_CITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProviderImpl <em>Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProviderImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getProvider()
   * @generated
   */
  int PROVIDER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__SOURCES = 1;

  /**
   * The number of structural features of the '<em>Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.NewsSiteImpl <em>News Site</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.NewsSiteImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getNewsSite()
   * @generated
   */
  int NEWS_SITE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEWS_SITE__NAME = PROVIDER__NAME;

  /**
   * The feature id for the '<em><b>Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEWS_SITE__SOURCES = PROVIDER__SOURCES;

  /**
   * The number of structural features of the '<em>News Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEWS_SITE_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayImpl <em>Highway</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getHighway()
   * @generated
   */
  int HIGHWAY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHWAY__NAME = PROVIDER__NAME;

  /**
   * The feature id for the '<em><b>Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHWAY__SOURCES = PROVIDER__SOURCES;

  /**
   * The number of structural features of the '<em>Highway</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHWAY_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicTransportImpl <em>Public Transport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicTransportImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getPublicTransport()
   * @generated
   */
  int PUBLIC_TRANSPORT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_TRANSPORT__NAME = PROVIDER__NAME;

  /**
   * The feature id for the '<em><b>Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_TRANSPORT__SOURCES = PROVIDER__SOURCES;

  /**
   * The number of structural features of the '<em>Public Transport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_TRANSPORT_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProvinceImpl <em>Province</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProvinceImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getProvince()
   * @generated
   */
  int PROVINCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVINCE__NAME = PROVIDER__NAME;

  /**
   * The feature id for the '<em><b>Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVINCE__SOURCES = PROVIDER__SOURCES;

  /**
   * The number of structural features of the '<em>Province</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVINCE_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.CountyImpl <em>County</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.CountyImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getCounty()
   * @generated
   */
  int COUNTY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNTY__NAME = PROVIDER__NAME;

  /**
   * The feature id for the '<em><b>Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNTY__SOURCES = PROVIDER__SOURCES;

  /**
   * The number of structural features of the '<em>County</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNTY_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.MunicipalityImpl <em>Municipality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.MunicipalityImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getMunicipality()
   * @generated
   */
  int MUNICIPALITY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUNICIPALITY__NAME = PROVIDER__NAME;

  /**
   * The feature id for the '<em><b>Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUNICIPALITY__SOURCES = PROVIDER__SOURCES;

  /**
   * The number of structural features of the '<em>Municipality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUNICIPALITY_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataSourceImpl <em>Data Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataSourceImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getDataSource()
   * @generated
   */
  int DATA_SOURCE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE__DATA = 1;

  /**
   * The number of structural features of the '<em>Data Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.MetadataImpl <em>Metadata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.MetadataImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getMetadata()
   * @generated
   */
  int METADATA = 9;

  /**
   * The number of structural features of the '<em>Metadata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.IssuedDateImpl <em>Issued Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.IssuedDateImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getIssuedDate()
   * @generated
   */
  int ISSUED_DATE = 10;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISSUED_DATE__DATE = METADATA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Issued Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISSUED_DATE_FEATURE_COUNT = METADATA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.LocationImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 11;

  /**
   * The feature id for the '<em><b>Latitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__LATITUDE = METADATA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Longitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__LONGITUDE = METADATA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Region</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__REGION = METADATA_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = METADATA_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.UpdateFreqImpl <em>Update Freq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.UpdateFreqImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getUpdateFreq()
   * @generated
   */
  int UPDATE_FREQ = 12;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_FREQ__TIME = METADATA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Update Freq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_FREQ_FEATURE_COUNT = METADATA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getData()
   * @generated
   */
  int DATA = 13;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__METADATA = 0;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.NumberImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 14;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__METADATA = DATA__METADATA;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SocialNetworkCheckinsImpl <em>Social Network Checkins</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SocialNetworkCheckinsImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getSocialNetworkCheckins()
   * @generated
   */
  int SOCIAL_NETWORK_CHECKINS = 15;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_NETWORK_CHECKINS__METADATA = NUMBER__METADATA;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_NETWORK_CHECKINS__AMOUNT = NUMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Social Network Checkins</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOCIAL_NETWORK_CHECKINS_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.CellphoneDensityImpl <em>Cellphone Density</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.CellphoneDensityImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getCellphoneDensity()
   * @generated
   */
  int CELLPHONE_DENSITY = 16;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELLPHONE_DENSITY__METADATA = NUMBER__METADATA;

  /**
   * The feature id for the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELLPHONE_DENSITY__MEASURE = NUMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cellphone Density</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELLPHONE_DENSITY_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TextImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getText()
   * @generated
   */
  int TEXT = 17;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__METADATA = DATA__METADATA;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ParagraphImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getParagraph()
   * @generated
   */
  int PARAGRAPH = 18;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__METADATA = TEXT__METADATA;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__DATA = TEXT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.MeteoDataImpl <em>Meteo Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.MeteoDataImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getMeteoData()
   * @generated
   */
  int METEO_DATA = 19;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METEO_DATA__METADATA = TEXT__METADATA;

  /**
   * The number of structural features of the '<em>Meteo Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METEO_DATA_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TrafficSensorImpl <em>Traffic Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TrafficSensorImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getTrafficSensor()
   * @generated
   */
  int TRAFFIC_SENSOR = 20;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAFFIC_SENSOR__METADATA = TEXT__METADATA;

  /**
   * The number of structural features of the '<em>Traffic Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAFFIC_SENSOR_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TransportScheduleImpl <em>Transport Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TransportScheduleImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getTransportSchedule()
   * @generated
   */
  int TRANSPORT_SCHEDULE = 21;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT_SCHEDULE__METADATA = TEXT__METADATA;

  /**
   * The number of structural features of the '<em>Transport Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT_SCHEDULE_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.AlertImpl <em>Alert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.AlertImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getAlert()
   * @generated
   */
  int ALERT = 22;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERT__METADATA = TEXT__METADATA;

  /**
   * The number of structural features of the '<em>Alert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicAlertImpl <em>Public Alert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicAlertImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getPublicAlert()
   * @generated
   */
  int PUBLIC_ALERT = 23;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_ALERT__METADATA = ALERT__METADATA;

  /**
   * The number of structural features of the '<em>Public Alert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_ALERT_FEATURE_COUNT = ALERT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PostImpl <em>Post</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.PostImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getPost()
   * @generated
   */
  int POST = 24;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST__METADATA = DATA__METADATA;

  /**
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST__IMAGES = DATA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST__VIDEOS = DATA_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Post</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TwitterImpl <em>Twitter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TwitterImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getTwitter()
   * @generated
   */
  int TWITTER = 25;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWITTER__METADATA = POST__METADATA;

  /**
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWITTER__IMAGES = POST__IMAGES;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWITTER__VIDEOS = POST__VIDEOS;

  /**
   * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWITTER__PARAGRAPHS = POST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Twitter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWITTER_FEATURE_COUNT = POST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.BlogImpl <em>Blog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.BlogImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getBlog()
   * @generated
   */
  int BLOG = 26;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOG__METADATA = POST__METADATA;

  /**
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOG__IMAGES = POST__IMAGES;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOG__VIDEOS = POST__VIDEOS;

  /**
   * The feature id for the '<em><b>Texts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOG__TEXTS = POST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Blog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOG_FEATURE_COUNT = POST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.FacebookImpl <em>Facebook</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.FacebookImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getFacebook()
   * @generated
   */
  int FACEBOOK = 27;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACEBOOK__METADATA = POST__METADATA;

  /**
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACEBOOK__IMAGES = POST__IMAGES;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACEBOOK__VIDEOS = POST__VIDEOS;

  /**
   * The feature id for the '<em><b>Texts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACEBOOK__TEXTS = POST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Facebook</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACEBOOK_FEATURE_COUNT = POST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.InstagramImpl <em>Instagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.InstagramImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getInstagram()
   * @generated
   */
  int INSTAGRAM = 28;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTAGRAM__METADATA = POST__METADATA;

  /**
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTAGRAM__IMAGES = POST__IMAGES;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTAGRAM__VIDEOS = POST__VIDEOS;

  /**
   * The feature id for the '<em><b>Texts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTAGRAM__TEXTS = POST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTAGRAM_FEATURE_COUNT = POST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ImageImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 29;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__METADATA = DATA__METADATA;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__URL = DATA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.VideoImpl <em>Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.VideoImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getVideo()
   * @generated
   */
  int VIDEO = 30;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO__METADATA = DATA__METADATA;

  /**
   * The number of structural features of the '<em>Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.WebVideoImpl <em>Web Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.WebVideoImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getWebVideo()
   * @generated
   */
  int WEB_VIDEO = 31;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIDEO__METADATA = VIDEO__METADATA;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIDEO__URL = VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Web Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIDEO_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.CameraImpl <em>Camera</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.CameraImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getCamera()
   * @generated
   */
  int CAMERA = 32;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMERA__METADATA = VIDEO__METADATA;

  /**
   * The number of structural features of the '<em>Camera</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAMERA_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayCamImpl <em>Highway Cam</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayCamImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getHighwayCam()
   * @generated
   */
  int HIGHWAY_CAM = 33;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHWAY_CAM__METADATA = CAMERA__METADATA;

  /**
   * The number of structural features of the '<em>Highway Cam</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHWAY_CAM_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SecurityCamImpl <em>Security Cam</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SecurityCamImpl
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getSecurityCam()
   * @generated
   */
  int SECURITY_CAM = 34;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CAM__METADATA = CAMERA__METADATA;

  /**
   * The number of structural features of the '<em>Security Cam</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CAM_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity <em>Smart City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smart City</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity
   * @generated
   */
  EClass getSmartCity();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity#getProviders <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Providers</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity#getProviders()
   * @see #getSmartCity()
   * @generated
   */
  EReference getSmartCity_Providers();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity#getDataSources <em>Data Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Sources</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity#getDataSources()
   * @see #getSmartCity()
   * @generated
   */
  EReference getSmartCity_DataSources();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Provider
   * @generated
   */
  EClass getProvider();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Provider#getName()
   * @see #getProvider()
   * @generated
   */
  EAttribute getProvider_Name();

  /**
   * Returns the meta object for the reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sources</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Provider#getSources()
   * @see #getProvider()
   * @generated
   */
  EReference getProvider_Sources();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.NewsSite <em>News Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>News Site</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.NewsSite
   * @generated
   */
  EClass getNewsSite();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Highway <em>Highway</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Highway</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Highway
   * @generated
   */
  EClass getHighway();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.PublicTransport <em>Public Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Public Transport</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.PublicTransport
   * @generated
   */
  EClass getPublicTransport();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Province <em>Province</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Province</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Province
   * @generated
   */
  EClass getProvince();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.County <em>County</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>County</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.County
   * @generated
   */
  EClass getCounty();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Municipality <em>Municipality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Municipality</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Municipality
   * @generated
   */
  EClass getMunicipality();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource <em>Data Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Source</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.DataSource
   * @generated
   */
  EClass getDataSource();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.DataSource#getName()
   * @see #getDataSource()
   * @generated
   */
  EAttribute getDataSource_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.DataSource#getData()
   * @see #getDataSource()
   * @generated
   */
  EReference getDataSource_Data();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Metadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Metadata
   * @generated
   */
  EClass getMetadata();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.IssuedDate <em>Issued Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Issued Date</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.IssuedDate
   * @generated
   */
  EClass getIssuedDate();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.IssuedDate#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.IssuedDate#getDate()
   * @see #getIssuedDate()
   * @generated
   */
  EAttribute getIssuedDate_Date();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLatitude <em>Latitude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latitude</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLatitude()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Latitude();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLongitude <em>Longitude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Longitude</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Location#getLongitude()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Longitude();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location#getRegion <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Region</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Location#getRegion()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Region();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq <em>Update Freq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Freq</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq
   * @generated
   */
  EClass getUpdateFreq();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq#getTime()
   * @see #getUpdateFreq()
   * @generated
   */
  EAttribute getUpdateFreq_Time();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Data
   * @generated
   */
  EClass getData();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Data#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metadata</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Data#getMetadata()
   * @see #getData()
   * @generated
   */
  EReference getData_Metadata();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins <em>Social Network Checkins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Social Network Checkins</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins
   * @generated
   */
  EClass getSocialNetworkCheckins();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins#getAmount()
   * @see #getSocialNetworkCheckins()
   * @generated
   */
  EAttribute getSocialNetworkCheckins_Amount();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.CellphoneDensity <em>Cellphone Density</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cellphone Density</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.CellphoneDensity
   * @generated
   */
  EClass getCellphoneDensity();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.CellphoneDensity#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Measure</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.CellphoneDensity#getMeasure()
   * @see #getCellphoneDensity()
   * @generated
   */
  EAttribute getCellphoneDensity_Measure();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph#getData()
   * @see #getParagraph()
   * @generated
   */
  EAttribute getParagraph_Data();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.MeteoData <em>Meteo Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meteo Data</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.MeteoData
   * @generated
   */
  EClass getMeteoData();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.TrafficSensor <em>Traffic Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Traffic Sensor</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.TrafficSensor
   * @generated
   */
  EClass getTrafficSensor();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.TransportSchedule <em>Transport Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transport Schedule</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.TransportSchedule
   * @generated
   */
  EClass getTransportSchedule();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Alert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alert</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Alert
   * @generated
   */
  EClass getAlert();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.PublicAlert <em>Public Alert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Public Alert</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.PublicAlert
   * @generated
   */
  EClass getPublicAlert();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Post <em>Post</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Post
   * @generated
   */
  EClass getPost();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Post#getImages <em>Images</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Images</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Post#getImages()
   * @see #getPost()
   * @generated
   */
  EReference getPost_Images();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Post#getVideos <em>Videos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Videos</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Post#getVideos()
   * @see #getPost()
   * @generated
   */
  EReference getPost_Videos();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Twitter <em>Twitter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Twitter</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Twitter
   * @generated
   */
  EClass getTwitter();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Twitter#getParagraphs <em>Paragraphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Twitter#getParagraphs()
   * @see #getTwitter()
   * @generated
   */
  EReference getTwitter_Paragraphs();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Blog <em>Blog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blog</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Blog
   * @generated
   */
  EClass getBlog();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Blog#getTexts <em>Texts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Texts</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Blog#getTexts()
   * @see #getBlog()
   * @generated
   */
  EReference getBlog_Texts();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Facebook <em>Facebook</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facebook</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Facebook
   * @generated
   */
  EClass getFacebook();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Facebook#getTexts <em>Texts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Texts</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Facebook#getTexts()
   * @see #getFacebook()
   * @generated
   */
  EReference getFacebook_Texts();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Instagram <em>Instagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instagram</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Instagram
   * @generated
   */
  EClass getInstagram();

  /**
   * Returns the meta object for the containment reference list '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Instagram#getTexts <em>Texts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Texts</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Instagram#getTexts()
   * @see #getInstagram()
   * @generated
   */
  EReference getInstagram_Texts();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Image#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Image#getUrl()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Url();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Video
   * @generated
   */
  EClass getVideo();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo <em>Web Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Video</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo
   * @generated
   */
  EClass getWebVideo();

  /**
   * Returns the meta object for the attribute '{@link com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo#getUrl()
   * @see #getWebVideo()
   * @generated
   */
  EAttribute getWebVideo_Url();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Camera <em>Camera</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Camera</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Camera
   * @generated
   */
  EClass getCamera();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.HighwayCam <em>Highway Cam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Highway Cam</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.HighwayCam
   * @generated
   */
  EClass getHighwayCam();

  /**
   * Returns the meta object for class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SecurityCam <em>Security Cam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Security Cam</em>'.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SecurityCam
   * @generated
   */
  EClass getSecurityCam();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmartCityFactory getSmartCityFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityImpl <em>Smart City</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getSmartCity()
     * @generated
     */
    EClass SMART_CITY = eINSTANCE.getSmartCity();

    /**
     * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMART_CITY__PROVIDERS = eINSTANCE.getSmartCity_Providers();

    /**
     * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMART_CITY__DATA_SOURCES = eINSTANCE.getSmartCity_DataSources();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProviderImpl <em>Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProviderImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getProvider()
     * @generated
     */
    EClass PROVIDER = eINSTANCE.getProvider();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER__SOURCES = eINSTANCE.getProvider_Sources();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.NewsSiteImpl <em>News Site</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.NewsSiteImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getNewsSite()
     * @generated
     */
    EClass NEWS_SITE = eINSTANCE.getNewsSite();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayImpl <em>Highway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getHighway()
     * @generated
     */
    EClass HIGHWAY = eINSTANCE.getHighway();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicTransportImpl <em>Public Transport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicTransportImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getPublicTransport()
     * @generated
     */
    EClass PUBLIC_TRANSPORT = eINSTANCE.getPublicTransport();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProvinceImpl <em>Province</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ProvinceImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getProvince()
     * @generated
     */
    EClass PROVINCE = eINSTANCE.getProvince();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.CountyImpl <em>County</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.CountyImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getCounty()
     * @generated
     */
    EClass COUNTY = eINSTANCE.getCounty();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.MunicipalityImpl <em>Municipality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.MunicipalityImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getMunicipality()
     * @generated
     */
    EClass MUNICIPALITY = eINSTANCE.getMunicipality();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataSourceImpl <em>Data Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataSourceImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getDataSource()
     * @generated
     */
    EClass DATA_SOURCE = eINSTANCE.getDataSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE__NAME = eINSTANCE.getDataSource_Name();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE__DATA = eINSTANCE.getDataSource_Data();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.MetadataImpl <em>Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.MetadataImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getMetadata()
     * @generated
     */
    EClass METADATA = eINSTANCE.getMetadata();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.IssuedDateImpl <em>Issued Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.IssuedDateImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getIssuedDate()
     * @generated
     */
    EClass ISSUED_DATE = eINSTANCE.getIssuedDate();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISSUED_DATE__DATE = eINSTANCE.getIssuedDate_Date();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.LocationImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

    /**
     * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

    /**
     * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__REGION = eINSTANCE.getLocation_Region();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.UpdateFreqImpl <em>Update Freq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.UpdateFreqImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getUpdateFreq()
     * @generated
     */
    EClass UPDATE_FREQ = eINSTANCE.getUpdateFreq();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE_FREQ__TIME = eINSTANCE.getUpdateFreq_Time();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.DataImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getData()
     * @generated
     */
    EClass DATA = eINSTANCE.getData();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA__METADATA = eINSTANCE.getData_Metadata();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.NumberImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SocialNetworkCheckinsImpl <em>Social Network Checkins</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SocialNetworkCheckinsImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getSocialNetworkCheckins()
     * @generated
     */
    EClass SOCIAL_NETWORK_CHECKINS = eINSTANCE.getSocialNetworkCheckins();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOCIAL_NETWORK_CHECKINS__AMOUNT = eINSTANCE.getSocialNetworkCheckins_Amount();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.CellphoneDensityImpl <em>Cellphone Density</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.CellphoneDensityImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getCellphoneDensity()
     * @generated
     */
    EClass CELLPHONE_DENSITY = eINSTANCE.getCellphoneDensity();

    /**
     * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELLPHONE_DENSITY__MEASURE = eINSTANCE.getCellphoneDensity_Measure();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TextImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ParagraphImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAGRAPH__DATA = eINSTANCE.getParagraph_Data();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.MeteoDataImpl <em>Meteo Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.MeteoDataImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getMeteoData()
     * @generated
     */
    EClass METEO_DATA = eINSTANCE.getMeteoData();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TrafficSensorImpl <em>Traffic Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TrafficSensorImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getTrafficSensor()
     * @generated
     */
    EClass TRAFFIC_SENSOR = eINSTANCE.getTrafficSensor();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TransportScheduleImpl <em>Transport Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TransportScheduleImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getTransportSchedule()
     * @generated
     */
    EClass TRANSPORT_SCHEDULE = eINSTANCE.getTransportSchedule();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.AlertImpl <em>Alert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.AlertImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getAlert()
     * @generated
     */
    EClass ALERT = eINSTANCE.getAlert();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicAlertImpl <em>Public Alert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.PublicAlertImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getPublicAlert()
     * @generated
     */
    EClass PUBLIC_ALERT = eINSTANCE.getPublicAlert();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.PostImpl <em>Post</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.PostImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getPost()
     * @generated
     */
    EClass POST = eINSTANCE.getPost();

    /**
     * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST__IMAGES = eINSTANCE.getPost_Images();

    /**
     * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST__VIDEOS = eINSTANCE.getPost_Videos();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.TwitterImpl <em>Twitter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.TwitterImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getTwitter()
     * @generated
     */
    EClass TWITTER = eINSTANCE.getTwitter();

    /**
     * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWITTER__PARAGRAPHS = eINSTANCE.getTwitter_Paragraphs();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.BlogImpl <em>Blog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.BlogImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getBlog()
     * @generated
     */
    EClass BLOG = eINSTANCE.getBlog();

    /**
     * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOG__TEXTS = eINSTANCE.getBlog_Texts();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.FacebookImpl <em>Facebook</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.FacebookImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getFacebook()
     * @generated
     */
    EClass FACEBOOK = eINSTANCE.getFacebook();

    /**
     * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACEBOOK__TEXTS = eINSTANCE.getFacebook_Texts();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.InstagramImpl <em>Instagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.InstagramImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getInstagram()
     * @generated
     */
    EClass INSTAGRAM = eINSTANCE.getInstagram();

    /**
     * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTAGRAM__TEXTS = eINSTANCE.getInstagram_Texts();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.ImageImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.VideoImpl <em>Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.VideoImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getVideo()
     * @generated
     */
    EClass VIDEO = eINSTANCE.getVideo();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.WebVideoImpl <em>Web Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.WebVideoImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getWebVideo()
     * @generated
     */
    EClass WEB_VIDEO = eINSTANCE.getWebVideo();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_VIDEO__URL = eINSTANCE.getWebVideo_Url();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.CameraImpl <em>Camera</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.CameraImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getCamera()
     * @generated
     */
    EClass CAMERA = eINSTANCE.getCamera();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayCamImpl <em>Highway Cam</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.HighwayCamImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getHighwayCam()
     * @generated
     */
    EClass HIGHWAY_CAM = eINSTANCE.getHighwayCam();

    /**
     * The meta object literal for the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SecurityCamImpl <em>Security Cam</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SecurityCamImpl
     * @see com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityPackageImpl#getSecurityCam()
     * @generated
     */
    EClass SECURITY_CAM = eINSTANCE.getSecurityCam();

  }

} //SmartCityPackage
