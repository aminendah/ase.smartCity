/**
 */
package SmartCity.impl;

import SmartCity.Alert;
import SmartCity.Blog;
import SmartCity.Camera;
import SmartCity.CellphoneDensity;
import SmartCity.Country;
import SmartCity.Data;
import SmartCity.DataSource;
import SmartCity.Facebook;
import SmartCity.Highway;
import SmartCity.HighwayCam;
import SmartCity.Image;
import SmartCity.Instagram;
import SmartCity.Location;
import SmartCity.Metadata;
import SmartCity.MeteoData;
import SmartCity.Municipality;
import SmartCity.NewsSite;
import SmartCity.Number;
import SmartCity.Paragraph;
import SmartCity.Post;
import SmartCity.Provider;
import SmartCity.Province;
import SmartCity.PublicAlert;
import SmartCity.PublicTransport;
import SmartCity.SecurityCam;
import SmartCity.SmartCity;
import SmartCity.SmartCityFactory;
import SmartCity.SmartCityPackage;
import SmartCity.SocialNetworkCheckin;
import SmartCity.Text;
import SmartCity.TraficSensor;
import SmartCity.TransportSchedule;
import SmartCity.Twitter;
import SmartCity.UpdateFreq;
import SmartCity.Video;
import SmartCity.WebVideo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartCityFactoryImpl extends EFactoryImpl implements SmartCityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartCityFactory init() {
		try {
			SmartCityFactory theSmartCityFactory = (SmartCityFactory)EPackage.Registry.INSTANCE.getEFactory(SmartCityPackage.eNS_URI);
			if (theSmartCityFactory != null) {
				return theSmartCityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartCityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmartCityPackage.PROVIDER: return createProvider();
			case SmartCityPackage.MUNICIPALITY: return createMunicipality();
			case SmartCityPackage.COUNTRY: return createCountry();
			case SmartCityPackage.PROVINCE: return createProvince();
			case SmartCityPackage.PUBLIC_TRANSPORT: return createPublicTransport();
			case SmartCityPackage.HIGHWAY: return createHighway();
			case SmartCityPackage.NEWS_SITE: return createNewsSite();
			case SmartCityPackage.DATA_SOURCE: return createDataSource();
			case SmartCityPackage.DATA: return createData();
			case SmartCityPackage.METADATA: return createMetadata();
			case SmartCityPackage.LOCATION: return createLocation();
			case SmartCityPackage.UPDATE_FREQ: return createUpdateFreq();
			case SmartCityPackage.NUMBER: return createNumber();
			case SmartCityPackage.TEXT: return createText();
			case SmartCityPackage.IMAGE: return createImage();
			case SmartCityPackage.VIDEO: return createVideo();
			case SmartCityPackage.SOCIAL_NETWORK_CHECKIN: return createSocialNetworkCheckin();
			case SmartCityPackage.CELLPHONE_DENSITY: return createCellphoneDensity();
			case SmartCityPackage.METEO_DATA: return createMeteoData();
			case SmartCityPackage.ALERT: return createAlert();
			case SmartCityPackage.PUBLIC_ALERT: return createPublicAlert();
			case SmartCityPackage.TRAFIC_SENSOR: return createTraficSensor();
			case SmartCityPackage.TRANSPORT_SCHEDULE: return createTransportSchedule();
			case SmartCityPackage.POST: return createPost();
			case SmartCityPackage.TWITTER: return createTwitter();
			case SmartCityPackage.BLOG: return createBlog();
			case SmartCityPackage.FACEBOOK: return createFacebook();
			case SmartCityPackage.INSTAGRAM: return createInstagram();
			case SmartCityPackage.CAMERA: return createCamera();
			case SmartCityPackage.SECURITY_CAM: return createSecurityCam();
			case SmartCityPackage.HIGHWAY_CAM: return createHighwayCam();
			case SmartCityPackage.PARAGRAPH: return createParagraph();
			case SmartCityPackage.WEB_VIDEO: return createWebVideo();
			case SmartCityPackage.SMART_CITY: return createSmartCity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Municipality createMunicipality() {
		MunicipalityImpl municipality = new MunicipalityImpl();
		return municipality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Province createProvince() {
		ProvinceImpl province = new ProvinceImpl();
		return province;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicTransport createPublicTransport() {
		PublicTransportImpl publicTransport = new PublicTransportImpl();
		return publicTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Highway createHighway() {
		HighwayImpl highway = new HighwayImpl();
		return highway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewsSite createNewsSite() {
		NewsSiteImpl newsSite = new NewsSiteImpl();
		return newsSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateFreq createUpdateFreq() {
		UpdateFreqImpl updateFreq = new UpdateFreqImpl();
		return updateFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkCheckin createSocialNetworkCheckin() {
		SocialNetworkCheckinImpl socialNetworkCheckin = new SocialNetworkCheckinImpl();
		return socialNetworkCheckin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellphoneDensity createCellphoneDensity() {
		CellphoneDensityImpl cellphoneDensity = new CellphoneDensityImpl();
		return cellphoneDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteoData createMeteoData() {
		MeteoDataImpl meteoData = new MeteoDataImpl();
		return meteoData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicAlert createPublicAlert() {
		PublicAlertImpl publicAlert = new PublicAlertImpl();
		return publicAlert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficSensor createTraficSensor() {
		TraficSensorImpl traficSensor = new TraficSensorImpl();
		return traficSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportSchedule createTransportSchedule() {
		TransportScheduleImpl transportSchedule = new TransportScheduleImpl();
		return transportSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Twitter createTwitter() {
		TwitterImpl twitter = new TwitterImpl();
		return twitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blog createBlog() {
		BlogImpl blog = new BlogImpl();
		return blog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facebook createFacebook() {
		FacebookImpl facebook = new FacebookImpl();
		return facebook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instagram createInstagram() {
		InstagramImpl instagram = new InstagramImpl();
		return instagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCam createSecurityCam() {
		SecurityCamImpl securityCam = new SecurityCamImpl();
		return securityCam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighwayCam createHighwayCam() {
		HighwayCamImpl highwayCam = new HighwayCamImpl();
		return highwayCam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebVideo createWebVideo() {
		WebVideoImpl webVideo = new WebVideoImpl();
		return webVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCity createSmartCity() {
		SmartCityImpl smartCity = new SmartCityImpl();
		return smartCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCityPackage getSmartCityPackage() {
		return (SmartCityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SmartCityPackage getPackage() {
		return SmartCityPackage.eINSTANCE;
	}

	public Number createNumber1() {
		// TODO Auto-generated method stub
		return null;
	}

} //SmartCityFactoryImpl
