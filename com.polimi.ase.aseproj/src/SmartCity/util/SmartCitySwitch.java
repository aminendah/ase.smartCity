/**
 */
package SmartCity.util;

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
import SmartCity.Paragraph;
import SmartCity.Post;
import SmartCity.Provider;
import SmartCity.Province;
import SmartCity.PublicAlert;
import SmartCity.PublicTransport;
import SmartCity.SecurityCam;
import SmartCity.SmartCity;
import SmartCity.SmartCityPackage;
import SmartCity.SocialNetworkCheckin;
import SmartCity.Text;
import SmartCity.TraficSensor;
import SmartCity.TransportSchedule;
import SmartCity.Twitter;
import SmartCity.UpdateFreq;
import SmartCity.Video;
import SmartCity.WebVideo;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see SmartCity.SmartCityPackage
 * @generated
 */
public class SmartCitySwitch {
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
	public SmartCitySwitch() {
		if (modelPackage == null) {
			modelPackage = SmartCityPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SmartCityPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				Object result = caseProvider(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.MUNICIPALITY: {
				Municipality municipality = (Municipality)theEObject;
				Object result = caseMunicipality(municipality);
				if (result == null) result = caseProvider(municipality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.COUNTRY: {
				Country country = (Country)theEObject;
				Object result = caseCountry(country);
				if (result == null) result = caseProvider(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.PROVINCE: {
				Province province = (Province)theEObject;
				Object result = caseProvince(province);
				if (result == null) result = caseProvider(province);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.PUBLIC_TRANSPORT: {
				PublicTransport publicTransport = (PublicTransport)theEObject;
				Object result = casePublicTransport(publicTransport);
				if (result == null) result = caseProvider(publicTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.HIGHWAY: {
				Highway highway = (Highway)theEObject;
				Object result = caseHighway(highway);
				if (result == null) result = caseProvider(highway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.NEWS_SITE: {
				NewsSite newsSite = (NewsSite)theEObject;
				Object result = caseNewsSite(newsSite);
				if (result == null) result = caseProvider(newsSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				Object result = caseDataSource(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.DATA: {
				Data data = (Data)theEObject;
				Object result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				Object result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.LOCATION: {
				Location location = (Location)theEObject;
				Object result = caseLocation(location);
				if (result == null) result = caseMetadata(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.UPDATE_FREQ: {
				UpdateFreq updateFreq = (UpdateFreq)theEObject;
				Object result = caseUpdateFreq(updateFreq);
				if (result == null) result = caseMetadata(updateFreq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.NUMBER: {
				Number number = (Number)theEObject;
				Object result = caseNumber(number);
				if (result == null) result = caseData(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.TEXT: {
				Text text = (Text)theEObject;
				Object result = caseText(text);
				if (result == null) result = caseData(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.IMAGE: {
				Image image = (Image)theEObject;
				Object result = caseImage(image);
				if (result == null) result = caseData(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.VIDEO: {
				Video video = (Video)theEObject;
				Object result = caseVideo(video);
				if (result == null) result = caseData(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.SOCIAL_NETWORK_CHECKIN: {
				SocialNetworkCheckin socialNetworkCheckin = (SocialNetworkCheckin)theEObject;
				Object result = caseSocialNetworkCheckin(socialNetworkCheckin);
				if (result == null) result = caseNumber(socialNetworkCheckin);
				if (result == null) result = caseData(socialNetworkCheckin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.CELLPHONE_DENSITY: {
				CellphoneDensity cellphoneDensity = (CellphoneDensity)theEObject;
				Object result = caseCellphoneDensity(cellphoneDensity);
				if (result == null) result = caseNumber(cellphoneDensity);
				if (result == null) result = caseData(cellphoneDensity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.METEO_DATA: {
				MeteoData meteoData = (MeteoData)theEObject;
				Object result = caseMeteoData(meteoData);
				if (result == null) result = caseText(meteoData);
				if (result == null) result = caseData(meteoData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.ALERT: {
				Alert alert = (Alert)theEObject;
				Object result = caseAlert(alert);
				if (result == null) result = caseText(alert);
				if (result == null) result = caseData(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.PUBLIC_ALERT: {
				PublicAlert publicAlert = (PublicAlert)theEObject;
				Object result = casePublicAlert(publicAlert);
				if (result == null) result = caseAlert(publicAlert);
				if (result == null) result = caseText(publicAlert);
				if (result == null) result = caseData(publicAlert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.TRAFIC_SENSOR: {
				TraficSensor traficSensor = (TraficSensor)theEObject;
				Object result = caseTraficSensor(traficSensor);
				if (result == null) result = caseText(traficSensor);
				if (result == null) result = caseData(traficSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.TRANSPORT_SCHEDULE: {
				TransportSchedule transportSchedule = (TransportSchedule)theEObject;
				Object result = caseTransportSchedule(transportSchedule);
				if (result == null) result = caseText(transportSchedule);
				if (result == null) result = caseData(transportSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.POST: {
				Post post = (Post)theEObject;
				Object result = casePost(post);
				if (result == null) result = caseText(post);
				if (result == null) result = caseImage(post);
				if (result == null) result = caseVideo(post);
				if (result == null) result = caseData(post);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.TWITTER: {
				Twitter twitter = (Twitter)theEObject;
				Object result = caseTwitter(twitter);
				if (result == null) result = casePost(twitter);
				if (result == null) result = caseText(twitter);
				if (result == null) result = caseImage(twitter);
				if (result == null) result = caseVideo(twitter);
				if (result == null) result = caseData(twitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.BLOG: {
				Blog blog = (Blog)theEObject;
				Object result = caseBlog(blog);
				if (result == null) result = casePost(blog);
				if (result == null) result = caseText(blog);
				if (result == null) result = caseImage(blog);
				if (result == null) result = caseVideo(blog);
				if (result == null) result = caseData(blog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.FACEBOOK: {
				Facebook facebook = (Facebook)theEObject;
				Object result = caseFacebook(facebook);
				if (result == null) result = casePost(facebook);
				if (result == null) result = caseText(facebook);
				if (result == null) result = caseImage(facebook);
				if (result == null) result = caseVideo(facebook);
				if (result == null) result = caseData(facebook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.INSTAGRAM: {
				Instagram instagram = (Instagram)theEObject;
				Object result = caseInstagram(instagram);
				if (result == null) result = casePost(instagram);
				if (result == null) result = caseText(instagram);
				if (result == null) result = caseImage(instagram);
				if (result == null) result = caseVideo(instagram);
				if (result == null) result = caseData(instagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.CAMERA: {
				Camera camera = (Camera)theEObject;
				Object result = caseCamera(camera);
				if (result == null) result = caseVideo(camera);
				if (result == null) result = caseImage(camera);
				if (result == null) result = caseData(camera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.SECURITY_CAM: {
				SecurityCam securityCam = (SecurityCam)theEObject;
				Object result = caseSecurityCam(securityCam);
				if (result == null) result = caseCamera(securityCam);
				if (result == null) result = caseVideo(securityCam);
				if (result == null) result = caseImage(securityCam);
				if (result == null) result = caseData(securityCam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.HIGHWAY_CAM: {
				HighwayCam highwayCam = (HighwayCam)theEObject;
				Object result = caseHighwayCam(highwayCam);
				if (result == null) result = caseCamera(highwayCam);
				if (result == null) result = caseVideo(highwayCam);
				if (result == null) result = caseImage(highwayCam);
				if (result == null) result = caseData(highwayCam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				Object result = caseParagraph(paragraph);
				if (result == null) result = caseText(paragraph);
				if (result == null) result = caseData(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.WEB_VIDEO: {
				WebVideo webVideo = (WebVideo)theEObject;
				Object result = caseWebVideo(webVideo);
				if (result == null) result = caseVideo(webVideo);
				if (result == null) result = caseData(webVideo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmartCityPackage.SMART_CITY: {
				SmartCity smartCity = (SmartCity)theEObject;
				Object result = caseSmartCity(smartCity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public Object caseProvider(Provider object) {
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
	public Object caseMunicipality(Municipality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCountry(Country object) {
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
	public Object caseProvince(Province object) {
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
	public Object casePublicTransport(PublicTransport object) {
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
	public Object caseHighway(Highway object) {
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
	public Object caseNewsSite(NewsSite object) {
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
	public Object caseDataSource(DataSource object) {
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
	public Object caseData(Object object) {
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
	public Object caseMetadata(Metadata object) {
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
	public Object caseLocation(Location object) {
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
	public Object caseUpdateFreq(UpdateFreq object) {
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
	public Object caseNumber(Object object) {
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
	public Object caseText(Text object) {
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
	public Object caseImage(Image object) {
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
	public Object caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Network Checkin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Network Checkin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSocialNetworkCheckin(SocialNetworkCheckin object) {
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
	public Object caseCellphoneDensity(CellphoneDensity object) {
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
	public Object caseMeteoData(MeteoData object) {
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
	public Object caseAlert(Alert object) {
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
	public Object casePublicAlert(PublicAlert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trafic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trafic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTraficSensor(TraficSensor object) {
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
	public Object caseTransportSchedule(TransportSchedule object) {
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
	public Object casePost(Post object) {
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
	public Object caseTwitter(Twitter object) {
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
	public Object caseBlog(Blog object) {
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
	public Object caseFacebook(Facebook object) {
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
	public Object caseInstagram(Instagram object) {
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
	public Object caseCamera(Camera object) {
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
	public Object caseSecurityCam(SecurityCam object) {
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
	public Object caseHighwayCam(HighwayCam object) {
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
	public Object caseParagraph(Paragraph object) {
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
	public Object caseWebVideo(WebVideo object) {
		return null;
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
	public Object caseSmartCity(SmartCity object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //SmartCitySwitch
