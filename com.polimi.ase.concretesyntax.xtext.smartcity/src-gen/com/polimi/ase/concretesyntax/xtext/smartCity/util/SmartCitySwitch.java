/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity.util;

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
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage;
import com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins;
import com.polimi.ase.concretesyntax.xtext.smartCity.Text;
import com.polimi.ase.concretesyntax.xtext.smartCity.TrafficSensor;
import com.polimi.ase.concretesyntax.xtext.smartCity.TransportSchedule;
import com.polimi.ase.concretesyntax.xtext.smartCity.Twitter;
import com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq;
import com.polimi.ase.concretesyntax.xtext.smartCity.Video;
import com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage
 * @generated
 */
public class SmartCitySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmartCityPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartCitySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SmartCityPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SmartCityPackage.SMART_CITY:
      {
        SmartCity smartCity = (SmartCity)theEObject;
        T result = caseSmartCity(smartCity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.PROVIDER:
      {
        Provider provider = (Provider)theEObject;
        T result = caseProvider(provider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.NEWS_SITE:
      {
        NewsSite newsSite = (NewsSite)theEObject;
        T result = caseNewsSite(newsSite);
        if (result == null) result = caseProvider(newsSite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.HIGHWAY:
      {
        Highway highway = (Highway)theEObject;
        T result = caseHighway(highway);
        if (result == null) result = caseProvider(highway);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.PUBLIC_TRANSPORT:
      {
        PublicTransport publicTransport = (PublicTransport)theEObject;
        T result = casePublicTransport(publicTransport);
        if (result == null) result = caseProvider(publicTransport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.PROVINCE:
      {
        Province province = (Province)theEObject;
        T result = caseProvince(province);
        if (result == null) result = caseProvider(province);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.COUNTY:
      {
        County county = (County)theEObject;
        T result = caseCounty(county);
        if (result == null) result = caseProvider(county);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.MUNICIPALITY:
      {
        Municipality municipality = (Municipality)theEObject;
        T result = caseMunicipality(municipality);
        if (result == null) result = caseProvider(municipality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.DATA_SOURCE:
      {
        DataSource dataSource = (DataSource)theEObject;
        T result = caseDataSource(dataSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.METADATA:
      {
        Metadata metadata = (Metadata)theEObject;
        T result = caseMetadata(metadata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.ISSUED_DATE:
      {
        IssuedDate issuedDate = (IssuedDate)theEObject;
        T result = caseIssuedDate(issuedDate);
        if (result == null) result = caseMetadata(issuedDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.LOCATION:
      {
        Location location = (Location)theEObject;
        T result = caseLocation(location);
        if (result == null) result = caseMetadata(location);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.UPDATE_FREQ:
      {
        UpdateFreq updateFreq = (UpdateFreq)theEObject;
        T result = caseUpdateFreq(updateFreq);
        if (result == null) result = caseMetadata(updateFreq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.DATA:
      {
        Data data = (Data)theEObject;
        T result = caseData(data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.NUMBER:
      {
        com.polimi.ase.concretesyntax.xtext.smartCity.Number number = (com.polimi.ase.concretesyntax.xtext.smartCity.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseData(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.SOCIAL_NETWORK_CHECKINS:
      {
        SocialNetworkCheckins socialNetworkCheckins = (SocialNetworkCheckins)theEObject;
        T result = caseSocialNetworkCheckins(socialNetworkCheckins);
        if (result == null) result = caseNumber(socialNetworkCheckins);
        if (result == null) result = caseData(socialNetworkCheckins);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.CELLPHONE_DENSITY:
      {
        CellphoneDensity cellphoneDensity = (CellphoneDensity)theEObject;
        T result = caseCellphoneDensity(cellphoneDensity);
        if (result == null) result = caseNumber(cellphoneDensity);
        if (result == null) result = caseData(cellphoneDensity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseData(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.PARAGRAPH:
      {
        Paragraph paragraph = (Paragraph)theEObject;
        T result = caseParagraph(paragraph);
        if (result == null) result = caseText(paragraph);
        if (result == null) result = caseData(paragraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.METEO_DATA:
      {
        MeteoData meteoData = (MeteoData)theEObject;
        T result = caseMeteoData(meteoData);
        if (result == null) result = caseText(meteoData);
        if (result == null) result = caseData(meteoData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.TRAFFIC_SENSOR:
      {
        TrafficSensor trafficSensor = (TrafficSensor)theEObject;
        T result = caseTrafficSensor(trafficSensor);
        if (result == null) result = caseText(trafficSensor);
        if (result == null) result = caseData(trafficSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.TRANSPORT_SCHEDULE:
      {
        TransportSchedule transportSchedule = (TransportSchedule)theEObject;
        T result = caseTransportSchedule(transportSchedule);
        if (result == null) result = caseText(transportSchedule);
        if (result == null) result = caseData(transportSchedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.ALERT:
      {
        Alert alert = (Alert)theEObject;
        T result = caseAlert(alert);
        if (result == null) result = caseText(alert);
        if (result == null) result = caseData(alert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.PUBLIC_ALERT:
      {
        PublicAlert publicAlert = (PublicAlert)theEObject;
        T result = casePublicAlert(publicAlert);
        if (result == null) result = caseAlert(publicAlert);
        if (result == null) result = caseText(publicAlert);
        if (result == null) result = caseData(publicAlert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.POST:
      {
        Post post = (Post)theEObject;
        T result = casePost(post);
        if (result == null) result = caseData(post);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.TWITTER:
      {
        Twitter twitter = (Twitter)theEObject;
        T result = caseTwitter(twitter);
        if (result == null) result = casePost(twitter);
        if (result == null) result = caseData(twitter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.BLOG:
      {
        Blog blog = (Blog)theEObject;
        T result = caseBlog(blog);
        if (result == null) result = casePost(blog);
        if (result == null) result = caseData(blog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.FACEBOOK:
      {
        Facebook facebook = (Facebook)theEObject;
        T result = caseFacebook(facebook);
        if (result == null) result = casePost(facebook);
        if (result == null) result = caseData(facebook);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.INSTAGRAM:
      {
        Instagram instagram = (Instagram)theEObject;
        T result = caseInstagram(instagram);
        if (result == null) result = casePost(instagram);
        if (result == null) result = caseData(instagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseData(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.VIDEO:
      {
        Video video = (Video)theEObject;
        T result = caseVideo(video);
        if (result == null) result = caseData(video);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.WEB_VIDEO:
      {
        WebVideo webVideo = (WebVideo)theEObject;
        T result = caseWebVideo(webVideo);
        if (result == null) result = caseVideo(webVideo);
        if (result == null) result = caseData(webVideo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.CAMERA:
      {
        Camera camera = (Camera)theEObject;
        T result = caseCamera(camera);
        if (result == null) result = caseVideo(camera);
        if (result == null) result = caseData(camera);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.HIGHWAY_CAM:
      {
        HighwayCam highwayCam = (HighwayCam)theEObject;
        T result = caseHighwayCam(highwayCam);
        if (result == null) result = caseCamera(highwayCam);
        if (result == null) result = caseVideo(highwayCam);
        if (result == null) result = caseData(highwayCam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmartCityPackage.SECURITY_CAM:
      {
        SecurityCam securityCam = (SecurityCam)theEObject;
        T result = caseSecurityCam(securityCam);
        if (result == null) result = caseCamera(securityCam);
        if (result == null) result = caseVideo(securityCam);
        if (result == null) result = caseData(securityCam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smart City</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smart City</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmartCity(SmartCity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvider(Provider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>News Site</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>News Site</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewsSite(NewsSite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Highway</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Highway</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHighway(Highway object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Public Transport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Public Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePublicTransport(PublicTransport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Province</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Province</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvince(Province object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>County</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>County</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCounty(County object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Municipality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Municipality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMunicipality(Municipality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSource(DataSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadata(Metadata object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Issued Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Issued Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIssuedDate(IssuedDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocation(Location object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Freq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Freq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateFreq(UpdateFreq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData(Data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(com.polimi.ase.concretesyntax.xtext.smartCity.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Social Network Checkins</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Social Network Checkins</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSocialNetworkCheckins(SocialNetworkCheckins object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cellphone Density</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cellphone Density</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellphoneDensity(CellphoneDensity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParagraph(Paragraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meteo Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meteo Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeteoData(MeteoData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Traffic Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Traffic Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrafficSensor(TrafficSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transport Schedule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transport Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransportSchedule(TransportSchedule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlert(Alert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Public Alert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Public Alert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePublicAlert(PublicAlert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePost(Post object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Twitter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Twitter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTwitter(Twitter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlog(Blog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facebook</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facebook</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacebook(Facebook object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstagram(Instagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImage(Image object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideo(Video object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Video</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Video</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebVideo(WebVideo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCamera(Camera object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Highway Cam</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Highway Cam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHighwayCam(HighwayCam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Security Cam</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Security Cam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecurityCam(SecurityCam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SmartCitySwitch
