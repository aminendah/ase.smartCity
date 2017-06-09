/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity.impl;

import com.polimi.ase.concretesyntax.xtext.smartCity.Alert;
import com.polimi.ase.concretesyntax.xtext.smartCity.Blog;
import com.polimi.ase.concretesyntax.xtext.smartCity.Camera;
import com.polimi.ase.concretesyntax.xtext.smartCity.CellphoneDensity;
import com.polimi.ase.concretesyntax.xtext.smartCity.County;
import com.polimi.ase.concretesyntax.xtext.smartCity.Data;
import com.polimi.ase.concretesyntax.xtext.smartCity.DataSource;
import com.polimi.ase.concretesyntax.xtext.smartCity.Facebook;
import com.polimi.ase.concretesyntax.xtext.smartCity.Highway;
import com.polimi.ase.concretesyntax.xtext.smartCity.HighwayCam;
import com.polimi.ase.concretesyntax.xtext.smartCity.Image;
import com.polimi.ase.concretesyntax.xtext.smartCity.Instagram;
import com.polimi.ase.concretesyntax.xtext.smartCity.IssuedDate;
import com.polimi.ase.concretesyntax.xtext.smartCity.Location;
import com.polimi.ase.concretesyntax.xtext.smartCity.Metadata;
import com.polimi.ase.concretesyntax.xtext.smartCity.MeteoData;
import com.polimi.ase.concretesyntax.xtext.smartCity.Municipality;
import com.polimi.ase.concretesyntax.xtext.smartCity.NewsSite;
import com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph;
import com.polimi.ase.concretesyntax.xtext.smartCity.Post;
import com.polimi.ase.concretesyntax.xtext.smartCity.Provider;
import com.polimi.ase.concretesyntax.xtext.smartCity.Province;
import com.polimi.ase.concretesyntax.xtext.smartCity.PublicAlert;
import com.polimi.ase.concretesyntax.xtext.smartCity.PublicTransport;
import com.polimi.ase.concretesyntax.xtext.smartCity.SecurityCam;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityFactory;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage;
import com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins;
import com.polimi.ase.concretesyntax.xtext.smartCity.Text;
import com.polimi.ase.concretesyntax.xtext.smartCity.TrafficSensor;
import com.polimi.ase.concretesyntax.xtext.smartCity.TransportSchedule;
import com.polimi.ase.concretesyntax.xtext.smartCity.Twitter;
import com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq;
import com.polimi.ase.concretesyntax.xtext.smartCity.Video;
import com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo;

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
public class SmartCityFactoryImpl extends EFactoryImpl implements SmartCityFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmartCityFactory init()
  {
    try
    {
      SmartCityFactory theSmartCityFactory = (SmartCityFactory)EPackage.Registry.INSTANCE.getEFactory(SmartCityPackage.eNS_URI);
      if (theSmartCityFactory != null)
      {
        return theSmartCityFactory;
      }
    }
    catch (Exception exception)
    {
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
  public SmartCityFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmartCityPackage.SMART_CITY: return createSmartCity();
      case SmartCityPackage.PROVIDER: return createProvider();
      case SmartCityPackage.NEWS_SITE: return createNewsSite();
      case SmartCityPackage.HIGHWAY: return createHighway();
      case SmartCityPackage.PUBLIC_TRANSPORT: return createPublicTransport();
      case SmartCityPackage.PROVINCE: return createProvince();
      case SmartCityPackage.COUNTY: return createCounty();
      case SmartCityPackage.MUNICIPALITY: return createMunicipality();
      case SmartCityPackage.DATA_SOURCE: return createDataSource();
      case SmartCityPackage.METADATA: return createMetadata();
      case SmartCityPackage.ISSUED_DATE: return createIssuedDate();
      case SmartCityPackage.LOCATION: return createLocation();
      case SmartCityPackage.UPDATE_FREQ: return createUpdateFreq();
      case SmartCityPackage.DATA: return createData();
      case SmartCityPackage.NUMBER: return createNumber();
      case SmartCityPackage.SOCIAL_NETWORK_CHECKINS: return createSocialNetworkCheckins();
      case SmartCityPackage.CELLPHONE_DENSITY: return createCellphoneDensity();
      case SmartCityPackage.TEXT: return createText();
      case SmartCityPackage.PARAGRAPH: return createParagraph();
      case SmartCityPackage.METEO_DATA: return createMeteoData();
      case SmartCityPackage.TRAFFIC_SENSOR: return createTrafficSensor();
      case SmartCityPackage.TRANSPORT_SCHEDULE: return createTransportSchedule();
      case SmartCityPackage.ALERT: return createAlert();
      case SmartCityPackage.PUBLIC_ALERT: return createPublicAlert();
      case SmartCityPackage.POST: return createPost();
      case SmartCityPackage.TWITTER: return createTwitter();
      case SmartCityPackage.BLOG: return createBlog();
      case SmartCityPackage.FACEBOOK: return createFacebook();
      case SmartCityPackage.INSTAGRAM: return createInstagram();
      case SmartCityPackage.IMAGE: return createImage();
      case SmartCityPackage.VIDEO: return createVideo();
      case SmartCityPackage.WEB_VIDEO: return createWebVideo();
      case SmartCityPackage.CAMERA: return createCamera();
      case SmartCityPackage.HIGHWAY_CAM: return createHighwayCam();
      case SmartCityPackage.SECURITY_CAM: return createSecurityCam();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartCity createSmartCity()
  {
    SmartCityImpl smartCity = new SmartCityImpl();
    return smartCity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Provider createProvider()
  {
    ProviderImpl provider = new ProviderImpl();
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewsSite createNewsSite()
  {
    NewsSiteImpl newsSite = new NewsSiteImpl();
    return newsSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Highway createHighway()
  {
    HighwayImpl highway = new HighwayImpl();
    return highway;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PublicTransport createPublicTransport()
  {
    PublicTransportImpl publicTransport = new PublicTransportImpl();
    return publicTransport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Province createProvince()
  {
    ProvinceImpl province = new ProvinceImpl();
    return province;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public County createCounty()
  {
    CountyImpl county = new CountyImpl();
    return county;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Municipality createMunicipality()
  {
    MunicipalityImpl municipality = new MunicipalityImpl();
    return municipality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSource createDataSource()
  {
    DataSourceImpl dataSource = new DataSourceImpl();
    return dataSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadata createMetadata()
  {
    MetadataImpl metadata = new MetadataImpl();
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IssuedDate createIssuedDate()
  {
    IssuedDateImpl issuedDate = new IssuedDateImpl();
    return issuedDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location createLocation()
  {
    LocationImpl location = new LocationImpl();
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateFreq createUpdateFreq()
  {
    UpdateFreqImpl updateFreq = new UpdateFreqImpl();
    return updateFreq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.polimi.ase.concretesyntax.xtext.smartCity.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SocialNetworkCheckins createSocialNetworkCheckins()
  {
    SocialNetworkCheckinsImpl socialNetworkCheckins = new SocialNetworkCheckinsImpl();
    return socialNetworkCheckins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellphoneDensity createCellphoneDensity()
  {
    CellphoneDensityImpl cellphoneDensity = new CellphoneDensityImpl();
    return cellphoneDensity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paragraph createParagraph()
  {
    ParagraphImpl paragraph = new ParagraphImpl();
    return paragraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeteoData createMeteoData()
  {
    MeteoDataImpl meteoData = new MeteoDataImpl();
    return meteoData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrafficSensor createTrafficSensor()
  {
    TrafficSensorImpl trafficSensor = new TrafficSensorImpl();
    return trafficSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransportSchedule createTransportSchedule()
  {
    TransportScheduleImpl transportSchedule = new TransportScheduleImpl();
    return transportSchedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alert createAlert()
  {
    AlertImpl alert = new AlertImpl();
    return alert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PublicAlert createPublicAlert()
  {
    PublicAlertImpl publicAlert = new PublicAlertImpl();
    return publicAlert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Post createPost()
  {
    PostImpl post = new PostImpl();
    return post;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Twitter createTwitter()
  {
    TwitterImpl twitter = new TwitterImpl();
    return twitter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Blog createBlog()
  {
    BlogImpl blog = new BlogImpl();
    return blog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facebook createFacebook()
  {
    FacebookImpl facebook = new FacebookImpl();
    return facebook;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instagram createInstagram()
  {
    InstagramImpl instagram = new InstagramImpl();
    return instagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Video createVideo()
  {
    VideoImpl video = new VideoImpl();
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebVideo createWebVideo()
  {
    WebVideoImpl webVideo = new WebVideoImpl();
    return webVideo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Camera createCamera()
  {
    CameraImpl camera = new CameraImpl();
    return camera;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HighwayCam createHighwayCam()
  {
    HighwayCamImpl highwayCam = new HighwayCamImpl();
    return highwayCam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityCam createSecurityCam()
  {
    SecurityCamImpl securityCam = new SecurityCamImpl();
    return securityCam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartCityPackage getSmartCityPackage()
  {
    return (SmartCityPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmartCityPackage getPackage()
  {
    return SmartCityPackage.eINSTANCE;
  }

} //SmartCityFactoryImpl
