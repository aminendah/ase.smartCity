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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage
 * @generated
 */
public class SmartCityAdapterFactory extends AdapterFactoryImpl
{
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
  public SmartCityAdapterFactory()
  {
    if (modelPackage == null)
    {
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
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected SmartCitySwitch<Adapter> modelSwitch =
    new SmartCitySwitch<Adapter>()
    {
      @Override
      public Adapter caseSmartCity(SmartCity object)
      {
        return createSmartCityAdapter();
      }
      @Override
      public Adapter caseProvider(Provider object)
      {
        return createProviderAdapter();
      }
      @Override
      public Adapter caseNewsSite(NewsSite object)
      {
        return createNewsSiteAdapter();
      }
      @Override
      public Adapter caseHighway(Highway object)
      {
        return createHighwayAdapter();
      }
      @Override
      public Adapter casePublicTransport(PublicTransport object)
      {
        return createPublicTransportAdapter();
      }
      @Override
      public Adapter caseProvince(Province object)
      {
        return createProvinceAdapter();
      }
      @Override
      public Adapter caseCounty(County object)
      {
        return createCountyAdapter();
      }
      @Override
      public Adapter caseMunicipality(Municipality object)
      {
        return createMunicipalityAdapter();
      }
      @Override
      public Adapter caseDataSource(DataSource object)
      {
        return createDataSourceAdapter();
      }
      @Override
      public Adapter caseMetadata(Metadata object)
      {
        return createMetadataAdapter();
      }
      @Override
      public Adapter caseIssuedDate(IssuedDate object)
      {
        return createIssuedDateAdapter();
      }
      @Override
      public Adapter caseLocation(Location object)
      {
        return createLocationAdapter();
      }
      @Override
      public Adapter caseUpdateFreq(UpdateFreq object)
      {
        return createUpdateFreqAdapter();
      }
      @Override
      public Adapter caseData(Data object)
      {
        return createDataAdapter();
      }
      @Override
      public Adapter caseNumber(com.polimi.ase.concretesyntax.xtext.smartCity.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter caseSocialNetworkCheckins(SocialNetworkCheckins object)
      {
        return createSocialNetworkCheckinsAdapter();
      }
      @Override
      public Adapter caseCellphoneDensity(CellphoneDensity object)
      {
        return createCellphoneDensityAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseParagraph(Paragraph object)
      {
        return createParagraphAdapter();
      }
      @Override
      public Adapter caseMeteoData(MeteoData object)
      {
        return createMeteoDataAdapter();
      }
      @Override
      public Adapter caseTrafficSensor(TrafficSensor object)
      {
        return createTrafficSensorAdapter();
      }
      @Override
      public Adapter caseTransportSchedule(TransportSchedule object)
      {
        return createTransportScheduleAdapter();
      }
      @Override
      public Adapter caseAlert(Alert object)
      {
        return createAlertAdapter();
      }
      @Override
      public Adapter casePublicAlert(PublicAlert object)
      {
        return createPublicAlertAdapter();
      }
      @Override
      public Adapter casePost(Post object)
      {
        return createPostAdapter();
      }
      @Override
      public Adapter caseTwitter(Twitter object)
      {
        return createTwitterAdapter();
      }
      @Override
      public Adapter caseBlog(Blog object)
      {
        return createBlogAdapter();
      }
      @Override
      public Adapter caseFacebook(Facebook object)
      {
        return createFacebookAdapter();
      }
      @Override
      public Adapter caseInstagram(Instagram object)
      {
        return createInstagramAdapter();
      }
      @Override
      public Adapter caseImage(Image object)
      {
        return createImageAdapter();
      }
      @Override
      public Adapter caseVideo(Video object)
      {
        return createVideoAdapter();
      }
      @Override
      public Adapter caseWebVideo(WebVideo object)
      {
        return createWebVideoAdapter();
      }
      @Override
      public Adapter caseCamera(Camera object)
      {
        return createCameraAdapter();
      }
      @Override
      public Adapter caseHighwayCam(HighwayCam object)
      {
        return createHighwayCamAdapter();
      }
      @Override
      public Adapter caseSecurityCam(SecurityCam object)
      {
        return createSecurityCamAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity <em>Smart City</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity
   * @generated
   */
  public Adapter createSmartCityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Provider
   * @generated
   */
  public Adapter createProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.NewsSite <em>News Site</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.NewsSite
   * @generated
   */
  public Adapter createNewsSiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Highway <em>Highway</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Highway
   * @generated
   */
  public Adapter createHighwayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.PublicTransport <em>Public Transport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.PublicTransport
   * @generated
   */
  public Adapter createPublicTransportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Province <em>Province</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Province
   * @generated
   */
  public Adapter createProvinceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.County <em>County</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.County
   * @generated
   */
  public Adapter createCountyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Municipality <em>Municipality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Municipality
   * @generated
   */
  public Adapter createMunicipalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource <em>Data Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.DataSource
   * @generated
   */
  public Adapter createDataSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Metadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Metadata
   * @generated
   */
  public Adapter createMetadataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.IssuedDate <em>Issued Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.IssuedDate
   * @generated
   */
  public Adapter createIssuedDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Location
   * @generated
   */
  public Adapter createLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq <em>Update Freq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq
   * @generated
   */
  public Adapter createUpdateFreqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Data
   * @generated
   */
  public Adapter createDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins <em>Social Network Checkins</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins
   * @generated
   */
  public Adapter createSocialNetworkCheckinsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.CellphoneDensity <em>Cellphone Density</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.CellphoneDensity
   * @generated
   */
  public Adapter createCellphoneDensityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph
   * @generated
   */
  public Adapter createParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.MeteoData <em>Meteo Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.MeteoData
   * @generated
   */
  public Adapter createMeteoDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.TrafficSensor <em>Traffic Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.TrafficSensor
   * @generated
   */
  public Adapter createTrafficSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.TransportSchedule <em>Transport Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.TransportSchedule
   * @generated
   */
  public Adapter createTransportScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Alert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Alert
   * @generated
   */
  public Adapter createAlertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.PublicAlert <em>Public Alert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.PublicAlert
   * @generated
   */
  public Adapter createPublicAlertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Post <em>Post</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Post
   * @generated
   */
  public Adapter createPostAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Twitter <em>Twitter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Twitter
   * @generated
   */
  public Adapter createTwitterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Blog <em>Blog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Blog
   * @generated
   */
  public Adapter createBlogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Facebook <em>Facebook</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Facebook
   * @generated
   */
  public Adapter createFacebookAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Instagram <em>Instagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Instagram
   * @generated
   */
  public Adapter createInstagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Image
   * @generated
   */
  public Adapter createImageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Video
   * @generated
   */
  public Adapter createVideoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo <em>Web Video</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo
   * @generated
   */
  public Adapter createWebVideoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Camera <em>Camera</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.Camera
   * @generated
   */
  public Adapter createCameraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.HighwayCam <em>Highway Cam</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.HighwayCam
   * @generated
   */
  public Adapter createHighwayCamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polimi.ase.concretesyntax.xtext.smartCity.SecurityCam <em>Security Cam</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SecurityCam
   * @generated
   */
  public Adapter createSecurityCamAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SmartCityAdapterFactory
