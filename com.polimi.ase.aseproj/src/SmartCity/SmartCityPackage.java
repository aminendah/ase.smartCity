/**
 */
package SmartCity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import SmartCity.impl.SmartCityPackageImpl;

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
 * @see SmartCity.SmartCityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SmartCityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SmartCity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://SmartCity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SmartCity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartCityPackage eINSTANCE = SmartCityPackageImpl.init();

	/**
	 * The meta object id for the '{@link SmartCity.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.ProviderImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
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
	 * The meta object id for the '{@link SmartCity.impl.MunicipalityImpl <em>Municipality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.MunicipalityImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getMunicipality()
	 * @generated
	 */
	int MUNICIPALITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUNICIPALITY__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
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
	 * The meta object id for the '{@link SmartCity.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.CountryImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__SOURCES = PROVIDER__SOURCES;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.ProvinceImpl <em>Province</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.ProvinceImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getProvince()
	 * @generated
	 */
	int PROVINCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVINCE__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
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
	 * The meta object id for the '{@link SmartCity.impl.PublicTransportImpl <em>Public Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.PublicTransportImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getPublicTransport()
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
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
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
	 * The meta object id for the '{@link SmartCity.impl.HighwayImpl <em>Highway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.HighwayImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getHighway()
	 * @generated
	 */
	int HIGHWAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
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
	 * The meta object id for the '{@link SmartCity.impl.NewsSiteImpl <em>News Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.NewsSiteImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getNewsSite()
	 * @generated
	 */
	int NEWS_SITE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_SITE__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
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
	 * The meta object id for the '{@link SmartCity.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.DataSourceImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Collected</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA_COLLECTED = 1;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SmartCity.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.DataImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getData()
	 * @generated
	 */
	int DATA = 8;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__METADATA_INFO = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SmartCity.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.MetadataImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getMetadata()
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
	 * The meta object id for the '{@link SmartCity.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.LocationImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 10;

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
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = METADATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SmartCity.impl.UpdateFreqImpl <em>Update Freq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.UpdateFreqImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getUpdateFreq()
	 * @generated
	 */
	int UPDATE_FREQ = 11;

	/**
	 * The number of structural features of the '<em>Update Freq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FREQ_FEATURE_COUNT = METADATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.NumberImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 12;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__METADATA_INFO = DATA__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.TextImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 13;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__METADATA_INFO = DATA__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.ImageImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 14;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__METADATA_INFO = DATA__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.VideoImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 15;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__METADATA_INFO = DATA__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.SocialNetworkCheckinImpl <em>Social Network Checkin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.SocialNetworkCheckinImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getSocialNetworkCheckin()
	 * @generated
	 */
	int SOCIAL_NETWORK_CHECKIN = 16;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_CHECKIN__METADATA_INFO = NUMBER__METADATA_INFO;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_CHECKIN__AMOUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Social Network Checkin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_CHECKIN_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SmartCity.impl.CellphoneDensityImpl <em>Cellphone Density</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.CellphoneDensityImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getCellphoneDensity()
	 * @generated
	 */
	int CELLPHONE_DENSITY = 17;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLPHONE_DENSITY__METADATA_INFO = NUMBER__METADATA_INFO;

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
	 * The meta object id for the '{@link SmartCity.impl.MeteoDataImpl <em>Meteo Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.MeteoDataImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getMeteoData()
	 * @generated
	 */
	int METEO_DATA = 18;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METEO_DATA__METADATA_INFO = TEXT__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Meteo Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METEO_DATA_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.AlertImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 19;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__METADATA_INFO = TEXT__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.PublicAlertImpl <em>Public Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.PublicAlertImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getPublicAlert()
	 * @generated
	 */
	int PUBLIC_ALERT = 20;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ALERT__METADATA_INFO = ALERT__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Public Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ALERT_FEATURE_COUNT = ALERT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.TraficSensorImpl <em>Trafic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.TraficSensorImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getTraficSensor()
	 * @generated
	 */
	int TRAFIC_SENSOR = 21;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFIC_SENSOR__METADATA_INFO = TEXT__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Trafic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFIC_SENSOR_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.TransportScheduleImpl <em>Transport Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.TransportScheduleImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getTransportSchedule()
	 * @generated
	 */
	int TRANSPORT_SCHEDULE = 22;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_SCHEDULE__METADATA_INFO = TEXT__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Transport Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_SCHEDULE_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.PostImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getPost()
	 * @generated
	 */
	int POST = 23;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__METADATA_INFO = TEXT__METADATA_INFO;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__VIDEOS = TEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IMAGES = TEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PARAGRAPHS = TEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = TEXT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SmartCity.impl.TwitterImpl <em>Twitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.TwitterImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getTwitter()
	 * @generated
	 */
	int TWITTER = 24;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__METADATA_INFO = POST__METADATA_INFO;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__VIDEOS = POST__VIDEOS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__IMAGES = POST__IMAGES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__PARAGRAPHS = POST__PARAGRAPHS;

	/**
	 * The number of structural features of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FEATURE_COUNT = POST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.BlogImpl <em>Blog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.BlogImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getBlog()
	 * @generated
	 */
	int BLOG = 25;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG__METADATA_INFO = POST__METADATA_INFO;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG__VIDEOS = POST__VIDEOS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG__IMAGES = POST__IMAGES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG__PARAGRAPHS = POST__PARAGRAPHS;

	/**
	 * The number of structural features of the '<em>Blog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG_FEATURE_COUNT = POST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.FacebookImpl <em>Facebook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.FacebookImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getFacebook()
	 * @generated
	 */
	int FACEBOOK = 26;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__METADATA_INFO = POST__METADATA_INFO;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__VIDEOS = POST__VIDEOS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__IMAGES = POST__IMAGES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__PARAGRAPHS = POST__PARAGRAPHS;

	/**
	 * The number of structural features of the '<em>Facebook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_FEATURE_COUNT = POST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.InstagramImpl <em>Instagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.InstagramImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getInstagram()
	 * @generated
	 */
	int INSTAGRAM = 27;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTAGRAM__METADATA_INFO = POST__METADATA_INFO;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTAGRAM__VIDEOS = POST__VIDEOS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTAGRAM__IMAGES = POST__IMAGES;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTAGRAM__PARAGRAPHS = POST__PARAGRAPHS;

	/**
	 * The number of structural features of the '<em>Instagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTAGRAM_FEATURE_COUNT = POST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.CameraImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 28;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__METADATA_INFO = VIDEO__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.SecurityCamImpl <em>Security Cam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.SecurityCamImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getSecurityCam()
	 * @generated
	 */
	int SECURITY_CAM = 29;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAM__METADATA_INFO = CAMERA__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Security Cam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAM_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.HighwayCamImpl <em>Highway Cam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.HighwayCamImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getHighwayCam()
	 * @generated
	 */
	int HIGHWAY_CAM = 30;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY_CAM__METADATA_INFO = CAMERA__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Highway Cam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHWAY_CAM_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.ParagraphImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 31;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__METADATA_INFO = TEXT__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.WebVideoImpl <em>Web Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.WebVideoImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getWebVideo()
	 * @generated
	 */
	int WEB_VIDEO = 32;

	/**
	 * The feature id for the '<em><b>Metadata Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIDEO__METADATA_INFO = VIDEO__METADATA_INFO;

	/**
	 * The number of structural features of the '<em>Web Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIDEO_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.SmartCityImpl <em>Smart City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.SmartCityImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getSmartCity()
	 * @generated
	 */
	int SMART_CITY = 33;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__PROVIDERS = 0;

	/**
	 * The number of structural features of the '<em>Smart City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link SmartCity.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see SmartCity.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartCity.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.Provider#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see SmartCity.Provider#getSources()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Sources();

	/**
	 * Returns the meta object for class '{@link SmartCity.Municipality <em>Municipality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Municipality</em>'.
	 * @see SmartCity.Municipality
	 * @generated
	 */
	EClass getMunicipality();

	/**
	 * Returns the meta object for class '{@link SmartCity.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see SmartCity.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for class '{@link SmartCity.Province <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Province</em>'.
	 * @see SmartCity.Province
	 * @generated
	 */
	EClass getProvince();

	/**
	 * Returns the meta object for class '{@link SmartCity.PublicTransport <em>Public Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport</em>'.
	 * @see SmartCity.PublicTransport
	 * @generated
	 */
	EClass getPublicTransport();

	/**
	 * Returns the meta object for class '{@link SmartCity.Highway <em>Highway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highway</em>'.
	 * @see SmartCity.Highway
	 * @generated
	 */
	EClass getHighway();

	/**
	 * Returns the meta object for class '{@link SmartCity.NewsSite <em>News Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>News Site</em>'.
	 * @see SmartCity.NewsSite
	 * @generated
	 */
	EClass getNewsSite();

	/**
	 * Returns the meta object for class '{@link SmartCity.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see SmartCity.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartCity.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.DataSource#getDataCollected <em>Data Collected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Collected</em>'.
	 * @see SmartCity.DataSource#getDataCollected()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_DataCollected();

	/**
	 * Returns the meta object for class '{@link SmartCity.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see SmartCity.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.Data#getMetadataInfo <em>Metadata Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata Info</em>'.
	 * @see SmartCity.Data#getMetadataInfo()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_MetadataInfo();

	/**
	 * Returns the meta object for class '{@link SmartCity.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see SmartCity.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for class '{@link SmartCity.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see SmartCity.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see SmartCity.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see SmartCity.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for class '{@link SmartCity.UpdateFreq <em>Update Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Freq</em>'.
	 * @see SmartCity.UpdateFreq
	 * @generated
	 */
	EClass getUpdateFreq();

	/**
	 * Returns the meta object for class '{@link SmartCity.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see SmartCity.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link SmartCity.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see SmartCity.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link SmartCity.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see SmartCity.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link SmartCity.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see SmartCity.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for class '{@link SmartCity.SocialNetworkCheckin <em>Social Network Checkin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Network Checkin</em>'.
	 * @see SmartCity.SocialNetworkCheckin
	 * @generated
	 */
	EClass getSocialNetworkCheckin();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.SocialNetworkCheckin#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see SmartCity.SocialNetworkCheckin#getAmount()
	 * @see #getSocialNetworkCheckin()
	 * @generated
	 */
	EAttribute getSocialNetworkCheckin_Amount();

	/**
	 * Returns the meta object for class '{@link SmartCity.CellphoneDensity <em>Cellphone Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cellphone Density</em>'.
	 * @see SmartCity.CellphoneDensity
	 * @generated
	 */
	EClass getCellphoneDensity();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.CellphoneDensity#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see SmartCity.CellphoneDensity#getMeasure()
	 * @see #getCellphoneDensity()
	 * @generated
	 */
	EAttribute getCellphoneDensity_Measure();

	/**
	 * Returns the meta object for class '{@link SmartCity.MeteoData <em>Meteo Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meteo Data</em>'.
	 * @see SmartCity.MeteoData
	 * @generated
	 */
	EClass getMeteoData();

	/**
	 * Returns the meta object for class '{@link SmartCity.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see SmartCity.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for class '{@link SmartCity.PublicAlert <em>Public Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Alert</em>'.
	 * @see SmartCity.PublicAlert
	 * @generated
	 */
	EClass getPublicAlert();

	/**
	 * Returns the meta object for class '{@link SmartCity.TraficSensor <em>Trafic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trafic Sensor</em>'.
	 * @see SmartCity.TraficSensor
	 * @generated
	 */
	EClass getTraficSensor();

	/**
	 * Returns the meta object for class '{@link SmartCity.TransportSchedule <em>Transport Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Schedule</em>'.
	 * @see SmartCity.TransportSchedule
	 * @generated
	 */
	EClass getTransportSchedule();

	/**
	 * Returns the meta object for class '{@link SmartCity.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see SmartCity.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.Post#getVideos <em>Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Videos</em>'.
	 * @see SmartCity.Post#getVideos()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Videos();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.Post#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see SmartCity.Post#getImages()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.Post#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see SmartCity.Post#getParagraphs()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Paragraphs();

	/**
	 * Returns the meta object for class '{@link SmartCity.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter</em>'.
	 * @see SmartCity.Twitter
	 * @generated
	 */
	EClass getTwitter();

	/**
	 * Returns the meta object for class '{@link SmartCity.Blog <em>Blog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blog</em>'.
	 * @see SmartCity.Blog
	 * @generated
	 */
	EClass getBlog();

	/**
	 * Returns the meta object for class '{@link SmartCity.Facebook <em>Facebook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook</em>'.
	 * @see SmartCity.Facebook
	 * @generated
	 */
	EClass getFacebook();

	/**
	 * Returns the meta object for class '{@link SmartCity.Instagram <em>Instagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instagram</em>'.
	 * @see SmartCity.Instagram
	 * @generated
	 */
	EClass getInstagram();

	/**
	 * Returns the meta object for class '{@link SmartCity.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see SmartCity.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for class '{@link SmartCity.SecurityCam <em>Security Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Cam</em>'.
	 * @see SmartCity.SecurityCam
	 * @generated
	 */
	EClass getSecurityCam();

	/**
	 * Returns the meta object for class '{@link SmartCity.HighwayCam <em>Highway Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highway Cam</em>'.
	 * @see SmartCity.HighwayCam
	 * @generated
	 */
	EClass getHighwayCam();

	/**
	 * Returns the meta object for class '{@link SmartCity.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see SmartCity.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link SmartCity.WebVideo <em>Web Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Video</em>'.
	 * @see SmartCity.WebVideo
	 * @generated
	 */
	EClass getWebVideo();

	/**
	 * Returns the meta object for class '{@link SmartCity.SmartCity <em>Smart City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart City</em>'.
	 * @see SmartCity.SmartCity
	 * @generated
	 */
	EClass getSmartCity();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.SmartCity#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see SmartCity.SmartCity#getProviders()
	 * @see #getSmartCity()
	 * @generated
	 */
	EReference getSmartCity_Providers();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link SmartCity.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.ProviderImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getProvider()
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
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__SOURCES = eINSTANCE.getProvider_Sources();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.MunicipalityImpl <em>Municipality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.MunicipalityImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getMunicipality()
		 * @generated
		 */
		EClass MUNICIPALITY = eINSTANCE.getMunicipality();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.CountryImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.ProvinceImpl <em>Province</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.ProvinceImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getProvince()
		 * @generated
		 */
		EClass PROVINCE = eINSTANCE.getProvince();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.PublicTransportImpl <em>Public Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.PublicTransportImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getPublicTransport()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT = eINSTANCE.getPublicTransport();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.HighwayImpl <em>Highway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.HighwayImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getHighway()
		 * @generated
		 */
		EClass HIGHWAY = eINSTANCE.getHighway();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.NewsSiteImpl <em>News Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.NewsSiteImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getNewsSite()
		 * @generated
		 */
		EClass NEWS_SITE = eINSTANCE.getNewsSite();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.DataSourceImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getDataSource()
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
		 * The meta object literal for the '<em><b>Data Collected</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DATA_COLLECTED = eINSTANCE.getDataSource_DataCollected();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.DataImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Metadata Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__METADATA_INFO = eINSTANCE.getData_MetadataInfo();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.MetadataImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.LocationImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getLocation()
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
		 * The meta object literal for the '{@link SmartCity.impl.UpdateFreqImpl <em>Update Freq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.UpdateFreqImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getUpdateFreq()
		 * @generated
		 */
		EClass UPDATE_FREQ = eINSTANCE.getUpdateFreq();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.NumberImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.TextImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.ImageImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.VideoImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.SocialNetworkCheckinImpl <em>Social Network Checkin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.SocialNetworkCheckinImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getSocialNetworkCheckin()
		 * @generated
		 */
		EClass SOCIAL_NETWORK_CHECKIN = eINSTANCE.getSocialNetworkCheckin();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_NETWORK_CHECKIN__AMOUNT = eINSTANCE.getSocialNetworkCheckin_Amount();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.CellphoneDensityImpl <em>Cellphone Density</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.CellphoneDensityImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getCellphoneDensity()
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
		 * The meta object literal for the '{@link SmartCity.impl.MeteoDataImpl <em>Meteo Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.MeteoDataImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getMeteoData()
		 * @generated
		 */
		EClass METEO_DATA = eINSTANCE.getMeteoData();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.AlertImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.PublicAlertImpl <em>Public Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.PublicAlertImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getPublicAlert()
		 * @generated
		 */
		EClass PUBLIC_ALERT = eINSTANCE.getPublicAlert();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.TraficSensorImpl <em>Trafic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.TraficSensorImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getTraficSensor()
		 * @generated
		 */
		EClass TRAFIC_SENSOR = eINSTANCE.getTraficSensor();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.TransportScheduleImpl <em>Transport Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.TransportScheduleImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getTransportSchedule()
		 * @generated
		 */
		EClass TRANSPORT_SCHEDULE = eINSTANCE.getTransportSchedule();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.PostImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__VIDEOS = eINSTANCE.getPost_Videos();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__IMAGES = eINSTANCE.getPost_Images();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__PARAGRAPHS = eINSTANCE.getPost_Paragraphs();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.TwitterImpl <em>Twitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.TwitterImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getTwitter()
		 * @generated
		 */
		EClass TWITTER = eINSTANCE.getTwitter();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.BlogImpl <em>Blog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.BlogImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getBlog()
		 * @generated
		 */
		EClass BLOG = eINSTANCE.getBlog();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.FacebookImpl <em>Facebook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.FacebookImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getFacebook()
		 * @generated
		 */
		EClass FACEBOOK = eINSTANCE.getFacebook();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.InstagramImpl <em>Instagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.InstagramImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getInstagram()
		 * @generated
		 */
		EClass INSTAGRAM = eINSTANCE.getInstagram();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.CameraImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.SecurityCamImpl <em>Security Cam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.SecurityCamImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getSecurityCam()
		 * @generated
		 */
		EClass SECURITY_CAM = eINSTANCE.getSecurityCam();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.HighwayCamImpl <em>Highway Cam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.HighwayCamImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getHighwayCam()
		 * @generated
		 */
		EClass HIGHWAY_CAM = eINSTANCE.getHighwayCam();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.ParagraphImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.WebVideoImpl <em>Web Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.WebVideoImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getWebVideo()
		 * @generated
		 */
		EClass WEB_VIDEO = eINSTANCE.getWebVideo();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.SmartCityImpl <em>Smart City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.SmartCityImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getSmartCity()
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

	}

} //SmartCityPackage
