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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SmartCity.SmartCityPackage
 * @generated
 */
public class SmartCityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmartCityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmartCityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartCitySwitch modelSwitch =
		new SmartCitySwitch() {
			public Object caseProvider(Provider object) {
				return createProviderAdapter();
			}
			public Object caseMunicipality(Municipality object) {
				return createMunicipalityAdapter();
			}
			public Object caseCountry(Country object) {
				return createCountryAdapter();
			}
			public Object caseProvince(Province object) {
				return createProvinceAdapter();
			}
			public Object casePublicTransport(PublicTransport object) {
				return createPublicTransportAdapter();
			}
			public Object caseHighway(Highway object) {
				return createHighwayAdapter();
			}
			public Object caseNewsSite(NewsSite object) {
				return createNewsSiteAdapter();
			}
			public Object caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			public Object caseData(Data object) {
				return createDataAdapter();
			}
			public Object caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			public Object caseLocation(Location object) {
				return createLocationAdapter();
			}
			public Object caseUpdateFreq(UpdateFreq object) {
				return createUpdateFreqAdapter();
			}
			public Object caseNumber(Number object) {
				return createNumberAdapter();
			}
			public Object caseText(Text object) {
				return createTextAdapter();
			}
			public Object caseImage(Image object) {
				return createImageAdapter();
			}
			public Object caseVideo(Video object) {
				return createVideoAdapter();
			}
			public Object caseSocialNetworkCheckin(SocialNetworkCheckin object) {
				return createSocialNetworkCheckinAdapter();
			}
			public Object caseCellphoneDensity(CellphoneDensity object) {
				return createCellphoneDensityAdapter();
			}
			public Object caseMeteoData(MeteoData object) {
				return createMeteoDataAdapter();
			}
			public Object caseAlert(Alert object) {
				return createAlertAdapter();
			}
			public Object casePublicAlert(PublicAlert object) {
				return createPublicAlertAdapter();
			}
			public Object caseTraficSensor(TraficSensor object) {
				return createTraficSensorAdapter();
			}
			public Object caseTransportSchedule(TransportSchedule object) {
				return createTransportScheduleAdapter();
			}
			public Object casePost(Post object) {
				return createPostAdapter();
			}
			public Object caseTwitter(Twitter object) {
				return createTwitterAdapter();
			}
			public Object caseBlog(Blog object) {
				return createBlogAdapter();
			}
			public Object caseFacebook(Facebook object) {
				return createFacebookAdapter();
			}
			public Object caseInstagram(Instagram object) {
				return createInstagramAdapter();
			}
			public Object caseCamera(Camera object) {
				return createCameraAdapter();
			}
			public Object caseSecurityCam(SecurityCam object) {
				return createSecurityCamAdapter();
			}
			public Object caseHighwayCam(HighwayCam object) {
				return createHighwayCamAdapter();
			}
			public Object caseParagraph(Paragraph object) {
				return createParagraphAdapter();
			}
			public Object caseWebVideo(WebVideo object) {
				return createWebVideoAdapter();
			}
			public Object caseSmartCity(SmartCity object) {
				return createSmartCityAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Municipality <em>Municipality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Municipality
	 * @generated
	 */
	public Adapter createMunicipalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Province <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Province
	 * @generated
	 */
	public Adapter createProvinceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.PublicTransport <em>Public Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.PublicTransport
	 * @generated
	 */
	public Adapter createPublicTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Highway <em>Highway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Highway
	 * @generated
	 */
	public Adapter createHighwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.NewsSite <em>News Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.NewsSite
	 * @generated
	 */
	public Adapter createNewsSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.UpdateFreq <em>Update Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.UpdateFreq
	 * @generated
	 */
	public Adapter createUpdateFreqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.SocialNetworkCheckin <em>Social Network Checkin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.SocialNetworkCheckin
	 * @generated
	 */
	public Adapter createSocialNetworkCheckinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.CellphoneDensity <em>Cellphone Density</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.CellphoneDensity
	 * @generated
	 */
	public Adapter createCellphoneDensityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.MeteoData <em>Meteo Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.MeteoData
	 * @generated
	 */
	public Adapter createMeteoDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Alert
	 * @generated
	 */
	public Adapter createAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.PublicAlert <em>Public Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.PublicAlert
	 * @generated
	 */
	public Adapter createPublicAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.TraficSensor <em>Trafic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.TraficSensor
	 * @generated
	 */
	public Adapter createTraficSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.TransportSchedule <em>Transport Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.TransportSchedule
	 * @generated
	 */
	public Adapter createTransportScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Post
	 * @generated
	 */
	public Adapter createPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Twitter
	 * @generated
	 */
	public Adapter createTwitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Blog <em>Blog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Blog
	 * @generated
	 */
	public Adapter createBlogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Facebook <em>Facebook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Facebook
	 * @generated
	 */
	public Adapter createFacebookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Instagram <em>Instagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Instagram
	 * @generated
	 */
	public Adapter createInstagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.SecurityCam <em>Security Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.SecurityCam
	 * @generated
	 */
	public Adapter createSecurityCamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.HighwayCam <em>Highway Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.HighwayCam
	 * @generated
	 */
	public Adapter createHighwayCamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.WebVideo <em>Web Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.WebVideo
	 * @generated
	 */
	public Adapter createWebVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SmartCity.SmartCity <em>Smart City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SmartCity.SmartCity
	 * @generated
	 */
	public Adapter createSmartCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SmartCityAdapterFactory
