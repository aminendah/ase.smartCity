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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartCityPackageImpl extends EPackageImpl implements SmartCityPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smartCityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newsSiteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass highwayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass publicTransportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass provinceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass municipalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass issuedDateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateFreqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass socialNetworkCheckinsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellphoneDensityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paragraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass meteoDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trafficSensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transportScheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alertEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass publicAlertEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass twitterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facebookEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webVideoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cameraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass highwayCamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass securityCamEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SmartCityPackageImpl()
  {
    super(eNS_URI, SmartCityFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SmartCityPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SmartCityPackage init()
  {
    if (isInited) return (SmartCityPackage)EPackage.Registry.INSTANCE.getEPackage(SmartCityPackage.eNS_URI);

    // Obtain or create and register package
    SmartCityPackageImpl theSmartCityPackage = (SmartCityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmartCityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmartCityPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSmartCityPackage.createPackageContents();

    // Initialize created meta-data
    theSmartCityPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSmartCityPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SmartCityPackage.eNS_URI, theSmartCityPackage);
    return theSmartCityPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmartCity()
  {
    return smartCityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartCity_Providers()
  {
    return (EReference)smartCityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartCity_DataSources()
  {
    return (EReference)smartCityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvider()
  {
    return providerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvider_Name()
  {
    return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvider_Sources()
  {
    return (EReference)providerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewsSite()
  {
    return newsSiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHighway()
  {
    return highwayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPublicTransport()
  {
    return publicTransportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvince()
  {
    return provinceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCounty()
  {
    return countyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMunicipality()
  {
    return municipalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSource()
  {
    return dataSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSource_Name()
  {
    return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSource_Data()
  {
    return (EReference)dataSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadata()
  {
    return metadataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIssuedDate()
  {
    return issuedDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIssuedDate_Date()
  {
    return (EAttribute)issuedDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocation()
  {
    return locationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocation_Latitude()
  {
    return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocation_Longitude()
  {
    return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocation_Region()
  {
    return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateFreq()
  {
    return updateFreqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUpdateFreq_Time()
  {
    return (EAttribute)updateFreqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getData()
  {
    return dataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getData_Metadata()
  {
    return (EReference)dataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSocialNetworkCheckins()
  {
    return socialNetworkCheckinsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSocialNetworkCheckins_Amount()
  {
    return (EAttribute)socialNetworkCheckinsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellphoneDensity()
  {
    return cellphoneDensityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellphoneDensity_Measure()
  {
    return (EAttribute)cellphoneDensityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParagraph()
  {
    return paragraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParagraph_Data()
  {
    return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeteoData()
  {
    return meteoDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrafficSensor()
  {
    return trafficSensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransportSchedule()
  {
    return transportScheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlert()
  {
    return alertEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPublicAlert()
  {
    return publicAlertEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPost()
  {
    return postEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPost_Images()
  {
    return (EReference)postEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPost_Videos()
  {
    return (EReference)postEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTwitter()
  {
    return twitterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwitter_Paragraphs()
  {
    return (EReference)twitterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlog()
  {
    return blogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlog_Texts()
  {
    return (EReference)blogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacebook()
  {
    return facebookEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacebook_Texts()
  {
    return (EReference)facebookEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstagram()
  {
    return instagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstagram_Texts()
  {
    return (EReference)instagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Url()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideo()
  {
    return videoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebVideo()
  {
    return webVideoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebVideo_Url()
  {
    return (EAttribute)webVideoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCamera()
  {
    return cameraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHighwayCam()
  {
    return highwayCamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecurityCam()
  {
    return securityCamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartCityFactory getSmartCityFactory()
  {
    return (SmartCityFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    smartCityEClass = createEClass(SMART_CITY);
    createEReference(smartCityEClass, SMART_CITY__PROVIDERS);
    createEReference(smartCityEClass, SMART_CITY__DATA_SOURCES);

    providerEClass = createEClass(PROVIDER);
    createEAttribute(providerEClass, PROVIDER__NAME);
    createEReference(providerEClass, PROVIDER__SOURCES);

    newsSiteEClass = createEClass(NEWS_SITE);

    highwayEClass = createEClass(HIGHWAY);

    publicTransportEClass = createEClass(PUBLIC_TRANSPORT);

    provinceEClass = createEClass(PROVINCE);

    countyEClass = createEClass(COUNTY);

    municipalityEClass = createEClass(MUNICIPALITY);

    dataSourceEClass = createEClass(DATA_SOURCE);
    createEAttribute(dataSourceEClass, DATA_SOURCE__NAME);
    createEReference(dataSourceEClass, DATA_SOURCE__DATA);

    metadataEClass = createEClass(METADATA);

    issuedDateEClass = createEClass(ISSUED_DATE);
    createEAttribute(issuedDateEClass, ISSUED_DATE__DATE);

    locationEClass = createEClass(LOCATION);
    createEAttribute(locationEClass, LOCATION__LATITUDE);
    createEAttribute(locationEClass, LOCATION__LONGITUDE);
    createEAttribute(locationEClass, LOCATION__REGION);

    updateFreqEClass = createEClass(UPDATE_FREQ);
    createEAttribute(updateFreqEClass, UPDATE_FREQ__TIME);

    dataEClass = createEClass(DATA);
    createEReference(dataEClass, DATA__METADATA);

    numberEClass = createEClass(NUMBER);

    socialNetworkCheckinsEClass = createEClass(SOCIAL_NETWORK_CHECKINS);
    createEAttribute(socialNetworkCheckinsEClass, SOCIAL_NETWORK_CHECKINS__AMOUNT);

    cellphoneDensityEClass = createEClass(CELLPHONE_DENSITY);
    createEAttribute(cellphoneDensityEClass, CELLPHONE_DENSITY__MEASURE);

    textEClass = createEClass(TEXT);

    paragraphEClass = createEClass(PARAGRAPH);
    createEAttribute(paragraphEClass, PARAGRAPH__DATA);

    meteoDataEClass = createEClass(METEO_DATA);

    trafficSensorEClass = createEClass(TRAFFIC_SENSOR);

    transportScheduleEClass = createEClass(TRANSPORT_SCHEDULE);

    alertEClass = createEClass(ALERT);

    publicAlertEClass = createEClass(PUBLIC_ALERT);

    postEClass = createEClass(POST);
    createEReference(postEClass, POST__IMAGES);
    createEReference(postEClass, POST__VIDEOS);

    twitterEClass = createEClass(TWITTER);
    createEReference(twitterEClass, TWITTER__PARAGRAPHS);

    blogEClass = createEClass(BLOG);
    createEReference(blogEClass, BLOG__TEXTS);

    facebookEClass = createEClass(FACEBOOK);
    createEReference(facebookEClass, FACEBOOK__TEXTS);

    instagramEClass = createEClass(INSTAGRAM);
    createEReference(instagramEClass, INSTAGRAM__TEXTS);

    imageEClass = createEClass(IMAGE);
    createEAttribute(imageEClass, IMAGE__URL);

    videoEClass = createEClass(VIDEO);

    webVideoEClass = createEClass(WEB_VIDEO);
    createEAttribute(webVideoEClass, WEB_VIDEO__URL);

    cameraEClass = createEClass(CAMERA);

    highwayCamEClass = createEClass(HIGHWAY_CAM);

    securityCamEClass = createEClass(SECURITY_CAM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    newsSiteEClass.getESuperTypes().add(this.getProvider());
    highwayEClass.getESuperTypes().add(this.getProvider());
    publicTransportEClass.getESuperTypes().add(this.getProvider());
    provinceEClass.getESuperTypes().add(this.getProvider());
    countyEClass.getESuperTypes().add(this.getProvider());
    municipalityEClass.getESuperTypes().add(this.getProvider());
    issuedDateEClass.getESuperTypes().add(this.getMetadata());
    locationEClass.getESuperTypes().add(this.getMetadata());
    updateFreqEClass.getESuperTypes().add(this.getMetadata());
    numberEClass.getESuperTypes().add(this.getData());
    socialNetworkCheckinsEClass.getESuperTypes().add(this.getNumber());
    cellphoneDensityEClass.getESuperTypes().add(this.getNumber());
    textEClass.getESuperTypes().add(this.getData());
    paragraphEClass.getESuperTypes().add(this.getText());
    meteoDataEClass.getESuperTypes().add(this.getText());
    trafficSensorEClass.getESuperTypes().add(this.getText());
    transportScheduleEClass.getESuperTypes().add(this.getText());
    alertEClass.getESuperTypes().add(this.getText());
    publicAlertEClass.getESuperTypes().add(this.getAlert());
    postEClass.getESuperTypes().add(this.getData());
    twitterEClass.getESuperTypes().add(this.getPost());
    blogEClass.getESuperTypes().add(this.getPost());
    facebookEClass.getESuperTypes().add(this.getPost());
    instagramEClass.getESuperTypes().add(this.getPost());
    imageEClass.getESuperTypes().add(this.getData());
    videoEClass.getESuperTypes().add(this.getData());
    webVideoEClass.getESuperTypes().add(this.getVideo());
    cameraEClass.getESuperTypes().add(this.getVideo());
    highwayCamEClass.getESuperTypes().add(this.getCamera());
    securityCamEClass.getESuperTypes().add(this.getCamera());

    // Initialize classes and features; add operations and parameters
    initEClass(smartCityEClass, SmartCity.class, "SmartCity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartCity_Providers(), this.getProvider(), null, "providers", null, 0, -1, SmartCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmartCity_DataSources(), this.getDataSource(), null, "dataSources", null, 0, -1, SmartCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvider_Sources(), this.getDataSource(), null, "sources", null, 0, -1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newsSiteEClass, NewsSite.class, "NewsSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(highwayEClass, Highway.class, "Highway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(publicTransportEClass, PublicTransport.class, "PublicTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(provinceEClass, Province.class, "Province", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(countyEClass, County.class, "County", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(municipalityEClass, Municipality.class, "Municipality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSource_Data(), this.getData(), null, "data", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(issuedDateEClass, IssuedDate.class, "IssuedDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIssuedDate_Date(), ecorePackage.getEString(), "date", null, 0, 1, IssuedDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocation_Latitude(), ecorePackage.getEString(), "latitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocation_Longitude(), ecorePackage.getEString(), "longitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocation_Region(), ecorePackage.getEString(), "region", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateFreqEClass, UpdateFreq.class, "UpdateFreq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUpdateFreq_Time(), ecorePackage.getEInt(), "time", null, 0, 1, UpdateFreq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getData_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberEClass, com.polimi.ase.concretesyntax.xtext.smartCity.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(socialNetworkCheckinsEClass, SocialNetworkCheckins.class, "SocialNetworkCheckins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSocialNetworkCheckins_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1, SocialNetworkCheckins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellphoneDensityEClass, CellphoneDensity.class, "CellphoneDensity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCellphoneDensity_Measure(), ecorePackage.getEInt(), "measure", null, 0, 1, CellphoneDensity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParagraph_Data(), ecorePackage.getEString(), "data", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(meteoDataEClass, MeteoData.class, "MeteoData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trafficSensorEClass, TrafficSensor.class, "TrafficSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transportScheduleEClass, TransportSchedule.class, "TransportSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alertEClass, Alert.class, "Alert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(publicAlertEClass, PublicAlert.class, "PublicAlert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(postEClass, Post.class, "Post", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPost_Images(), this.getImage(), null, "images", null, 0, -1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPost_Videos(), this.getWebVideo(), null, "videos", null, 0, -1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(twitterEClass, Twitter.class, "Twitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTwitter_Paragraphs(), this.getParagraph(), null, "paragraphs", null, 0, -1, Twitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blogEClass, Blog.class, "Blog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlog_Texts(), this.getParagraph(), null, "texts", null, 0, -1, Blog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(facebookEClass, Facebook.class, "Facebook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFacebook_Texts(), this.getParagraph(), null, "texts", null, 0, -1, Facebook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instagramEClass, Instagram.class, "Instagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstagram_Texts(), this.getParagraph(), null, "texts", null, 0, -1, Instagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImage_Url(), ecorePackage.getEString(), "url", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(webVideoEClass, WebVideo.class, "WebVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWebVideo_Url(), ecorePackage.getEString(), "url", null, 0, 1, WebVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cameraEClass, Camera.class, "Camera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(highwayCamEClass, HighwayCam.class, "HighwayCam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(securityCamEClass, SecurityCam.class, "SecurityCam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SmartCityPackageImpl
