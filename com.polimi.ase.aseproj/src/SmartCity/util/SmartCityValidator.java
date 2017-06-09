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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see SmartCity.SmartCityPackage
 * @generated
 */
public class SmartCityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SmartCityValidator INSTANCE = new SmartCityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "SmartCity";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCityValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return SmartCityPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case SmartCityPackage.PROVIDER:
				return validateProvider((Provider)value, diagnostics, context);
			case SmartCityPackage.MUNICIPALITY:
				return validateMunicipality((Municipality)value, diagnostics, context);
			case SmartCityPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case SmartCityPackage.PROVINCE:
				return validateProvince((Province)value, diagnostics, context);
			case SmartCityPackage.PUBLIC_TRANSPORT:
				return validatePublicTransport((PublicTransport)value, diagnostics, context);
			case SmartCityPackage.HIGHWAY:
				return validateHighway((Highway)value, diagnostics, context);
			case SmartCityPackage.NEWS_SITE:
				return validateNewsSite((NewsSite)value, diagnostics, context);
			case SmartCityPackage.DATA_SOURCE:
				return validateDataSource((DataSource)value, diagnostics, context);
			case SmartCityPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case SmartCityPackage.METADATA:
				return validateMetadata((Metadata)value, diagnostics, context);
			case SmartCityPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case SmartCityPackage.UPDATE_FREQ:
				return validateUpdateFreq((UpdateFreq)value, diagnostics, context);
			case SmartCityPackage.NUMBER:
				return validateNumber((Number)value, diagnostics, context);
			case SmartCityPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case SmartCityPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case SmartCityPackage.VIDEO:
				return validateVideo((Video)value, diagnostics, context);
			case SmartCityPackage.SOCIAL_NETWORK_CHECKIN:
				return validateSocialNetworkCheckin((SocialNetworkCheckin)value, diagnostics, context);
			case SmartCityPackage.CELLPHONE_DENSITY:
				return validateCellphoneDensity((CellphoneDensity)value, diagnostics, context);
			case SmartCityPackage.METEO_DATA:
				return validateMeteoData((MeteoData)value, diagnostics, context);
			case SmartCityPackage.ALERT:
				return validateAlert((Alert)value, diagnostics, context);
			case SmartCityPackage.PUBLIC_ALERT:
				return validatePublicAlert((PublicAlert)value, diagnostics, context);
			case SmartCityPackage.TRAFIC_SENSOR:
				return validateTraficSensor((TraficSensor)value, diagnostics, context);
			case SmartCityPackage.TRANSPORT_SCHEDULE:
				return validateTransportSchedule((TransportSchedule)value, diagnostics, context);
			case SmartCityPackage.POST:
				return validatePost((Post)value, diagnostics, context);
			case SmartCityPackage.TWITTER:
				return validateTwitter((Twitter)value, diagnostics, context);
			case SmartCityPackage.BLOG:
				return validateBlog((Blog)value, diagnostics, context);
			case SmartCityPackage.FACEBOOK:
				return validateFacebook((Facebook)value, diagnostics, context);
			case SmartCityPackage.INSTAGRAM:
				return validateInstagram((Instagram)value, diagnostics, context);
			case SmartCityPackage.CAMERA:
				return validateCamera((Camera)value, diagnostics, context);
			case SmartCityPackage.SECURITY_CAM:
				return validateSecurityCam((SecurityCam)value, diagnostics, context);
			case SmartCityPackage.HIGHWAY_CAM:
				return validateHighwayCam((HighwayCam)value, diagnostics, context);
			case SmartCityPackage.PARAGRAPH:
				return validateParagraph((Paragraph)value, diagnostics, context);
			case SmartCityPackage.WEB_VIDEO:
				return validateWebVideo((WebVideo)value, diagnostics, context);
			case SmartCityPackage.SMART_CITY:
				return validateSmartCity((SmartCity)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(provider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMunicipality(Municipality municipality, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(municipality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(country, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvince(Province province, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(province, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicTransport(PublicTransport publicTransport, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(publicTransport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighway(Highway highway, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(highway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewsSite(NewsSite newsSite, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(newsSite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSource(DataSource dataSource, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(dataSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadata(Metadata metadata, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(metadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateFreq(UpdateFreq updateFreq, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(updateFreq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(Number number, DiagnosticChain diagnostics, Map context) {
		return true;//validate_EveryDefaultConstraint(number, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideo(Video video, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(video, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialNetworkCheckin(SocialNetworkCheckin socialNetworkCheckin, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(socialNetworkCheckin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellphoneDensity(CellphoneDensity cellphoneDensity, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(cellphoneDensity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeteoData(MeteoData meteoData, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(meteoData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlert(Alert alert, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(alert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicAlert(PublicAlert publicAlert, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(publicAlert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraficSensor(TraficSensor traficSensor, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(traficSensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportSchedule(TransportSchedule transportSchedule, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(transportSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transportSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transportSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transportSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transportSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransportSchedule_validProvider(transportSchedule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validProvider constraint of '<em>Transport Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportSchedule_validProvider(TransportSchedule transportSchedule, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "validProvider", getObjectLabel(transportSchedule, context) }),
						 new Object[] { transportSchedule }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePost(Post post, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(post, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_imageAndVideoLimitations(post, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validImages(post, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validVideos(post, diagnostics, context);
		return result;
	}

	/**
	 * Validates the imageAndVideoLimitations constraint of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePost_imageAndVideoLimitations(Post post, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "imageAndVideoLimitations", getObjectLabel(post, context) }),
						 new Object[] { post }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validImages constraint of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePost_validImages(Post post, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "validImages", getObjectLabel(post, context) }),
						 new Object[] { post }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validVideos constraint of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePost_validVideos(Post post, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "validVideos", getObjectLabel(post, context) }),
						 new Object[] { post }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwitter(Twitter twitter, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(twitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(twitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(twitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(twitter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(twitter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_imageAndVideoLimitations(twitter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validImages(twitter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validVideos(twitter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlog(Blog blog, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(blog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(blog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(blog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(blog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(blog, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_imageAndVideoLimitations(blog, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validImages(blog, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validVideos(blog, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacebook(Facebook facebook, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(facebook, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(facebook, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(facebook, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(facebook, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(facebook, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_imageAndVideoLimitations(facebook, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validImages(facebook, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validVideos(facebook, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstagram(Instagram instagram, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(instagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instagram, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_imageAndVideoLimitations(instagram, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validImages(instagram, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_validVideos(instagram, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCamera(Camera camera, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(camera, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityCam(SecurityCam securityCam, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(securityCam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighwayCam(HighwayCam highwayCam, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(highwayCam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraph(Paragraph paragraph, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(paragraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebVideo(WebVideo webVideo, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(webVideo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmartCity(SmartCity smartCity, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(smartCity, diagnostics, context);
	}

} //SmartCityValidator
