package com.polimi.ase.concretesyntax.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.polimi.ase.concretesyntax.xtext.services.SmartCityGrammarAccess;
import com.polimi.ase.concretesyntax.xtext.smartCity.Blog;
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
import com.polimi.ase.concretesyntax.xtext.smartCity.MeteoData;
import com.polimi.ase.concretesyntax.xtext.smartCity.Municipality;
import com.polimi.ase.concretesyntax.xtext.smartCity.NewsSite;
import com.polimi.ase.concretesyntax.xtext.smartCity.Paragraph;
import com.polimi.ase.concretesyntax.xtext.smartCity.Province;
import com.polimi.ase.concretesyntax.xtext.smartCity.PublicAlert;
import com.polimi.ase.concretesyntax.xtext.smartCity.PublicTransport;
import com.polimi.ase.concretesyntax.xtext.smartCity.SecurityCam;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage;
import com.polimi.ase.concretesyntax.xtext.smartCity.SocialNetworkCheckins;
import com.polimi.ase.concretesyntax.xtext.smartCity.TrafficSensor;
import com.polimi.ase.concretesyntax.xtext.smartCity.TransportSchedule;
import com.polimi.ase.concretesyntax.xtext.smartCity.Twitter;
import com.polimi.ase.concretesyntax.xtext.smartCity.UpdateFreq;
import com.polimi.ase.concretesyntax.xtext.smartCity.WebVideo;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SmartCitySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmartCityGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmartCityPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmartCityPackage.BLOG:
				if(context == grammarAccess.getBlogRule() ||
				   context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getPostRule()) {
					sequence_Blog(context, (Blog) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.CELLPHONE_DENSITY:
				if(context == grammarAccess.getCellphoneDensityRule() ||
				   context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getNumberRule()) {
					sequence_CellphoneDensity(context, (CellphoneDensity) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.COUNTY:
				if(context == grammarAccess.getCountyRule() ||
				   context == grammarAccess.getProviderRule()) {
					sequence_County(context, (County) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.DATA:
				if(context == grammarAccess.getDataRule()) {
					sequence_Data(context, (Data) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.DATA_SOURCE:
				if(context == grammarAccess.getDataSourceRule()) {
					sequence_DataSource(context, (DataSource) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.FACEBOOK:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getFacebookRule() ||
				   context == grammarAccess.getPostRule()) {
					sequence_Facebook(context, (Facebook) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.HIGHWAY:
				if(context == grammarAccess.getHighwayRule() ||
				   context == grammarAccess.getProviderRule()) {
					sequence_Highway(context, (Highway) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.HIGHWAY_CAM:
				if(context == grammarAccess.getCameraRule() ||
				   context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getHighwayCamRule() ||
				   context == grammarAccess.getVideoRule()) {
					sequence_HighwayCam(context, (HighwayCam) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.IMAGE:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.INSTAGRAM:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getInstagramRule() ||
				   context == grammarAccess.getPostRule()) {
					sequence_Instagram(context, (Instagram) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.ISSUED_DATE:
				if(context == grammarAccess.getIssuedDateRule() ||
				   context == grammarAccess.getMetadataRule()) {
					sequence_IssuedDate(context, (IssuedDate) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.LOCATION:
				if(context == grammarAccess.getLocationRule() ||
				   context == grammarAccess.getMetadataRule()) {
					sequence_Location(context, (Location) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.METEO_DATA:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getMeteoDataRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_MeteoData(context, (MeteoData) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.MUNICIPALITY:
				if(context == grammarAccess.getMunicipalityRule() ||
				   context == grammarAccess.getProviderRule()) {
					sequence_Municipality(context, (Municipality) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.NEWS_SITE:
				if(context == grammarAccess.getNewsSiteRule() ||
				   context == grammarAccess.getProviderRule()) {
					sequence_NewsSite(context, (NewsSite) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.PARAGRAPH:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getParagraphRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_Paragraph(context, (Paragraph) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.PROVINCE:
				if(context == grammarAccess.getProviderRule() ||
				   context == grammarAccess.getProvinceRule()) {
					sequence_Province(context, (Province) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.PUBLIC_ALERT:
				if(context == grammarAccess.getAlertRule() ||
				   context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getPublicAlertRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_PublicAlert(context, (PublicAlert) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.PUBLIC_TRANSPORT:
				if(context == grammarAccess.getProviderRule() ||
				   context == grammarAccess.getPublicTransportRule()) {
					sequence_PublicTransport(context, (PublicTransport) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.SECURITY_CAM:
				if(context == grammarAccess.getCameraRule() ||
				   context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getSecurityCamRule() ||
				   context == grammarAccess.getVideoRule()) {
					sequence_SecurityCam(context, (SecurityCam) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.SMART_CITY:
				if(context == grammarAccess.getSmartCityRule()) {
					sequence_SmartCity(context, (SmartCity) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.SOCIAL_NETWORK_CHECKINS:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getNumberRule() ||
				   context == grammarAccess.getSocialNetworkCheckinsRule()) {
					sequence_SocialNetworkCheckins(context, (SocialNetworkCheckins) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.TRAFFIC_SENSOR:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getTextRule() ||
				   context == grammarAccess.getTrafficSensorRule()) {
					sequence_TrafficSensor(context, (TrafficSensor) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.TRANSPORT_SCHEDULE:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getTextRule() ||
				   context == grammarAccess.getTransportScheduleRule()) {
					sequence_TransportSchedule(context, (TransportSchedule) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.TWITTER:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getPostRule() ||
				   context == grammarAccess.getTwitterRule()) {
					sequence_Twitter(context, (Twitter) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.UPDATE_FREQ:
				if(context == grammarAccess.getMetadataRule() ||
				   context == grammarAccess.getUpdateFreqRule()) {
					sequence_UpdateFreq(context, (UpdateFreq) semanticObject); 
					return; 
				}
				else break;
			case SmartCityPackage.WEB_VIDEO:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getVideoRule() ||
				   context == grammarAccess.getWebVideoRule()) {
					sequence_WebVideo(context, (WebVideo) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (texts+=Paragraph* images+=Image* videos+=WebVideo* metadata+=Metadata+)
	 */
	protected void sequence_Blog(EObject context, Blog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (measure=INT metadata+=Metadata+)
	 */
	protected void sequence_CellphoneDensity(EObject context, CellphoneDensity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sources+=[DataSource|ID] sources+=[DataSource|ID]*)
	 */
	protected void sequence_County(EObject context, County semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID data+=Data+)
	 */
	protected void sequence_DataSource(EObject context, DataSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     metadata+=Metadata+
	 */
	protected void sequence_Data(EObject context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (texts+=Paragraph* images+=Image* videos+=WebVideo* metadata+=Metadata+)
	 */
	protected void sequence_Facebook(EObject context, Facebook semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     metadata+=Metadata+
	 */
	protected void sequence_HighwayCam(EObject context, HighwayCam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sources+=[DataSource|ID] sources+=[DataSource|ID]*)
	 */
	protected void sequence_Highway(EObject context, Highway semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (texts+=Paragraph* images+=Image* videos+=WebVideo* metadata+=Metadata+)
	 */
	protected void sequence_Instagram(EObject context, Instagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     date=STRING
	 */
	protected void sequence_IssuedDate(EObject context, IssuedDate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmartCityPackage.Literals.ISSUED_DATE__DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCityPackage.Literals.ISSUED_DATE__DATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIssuedDateAccess().getDateSTRINGTerminalRuleCall_2_0(), semanticObject.getDate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (latitude=STRING longitude=STRING region=STRING)
	 */
	protected void sequence_Location(EObject context, Location semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmartCityPackage.Literals.LOCATION__LATITUDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCityPackage.Literals.LOCATION__LATITUDE));
			if(transientValues.isValueTransient(semanticObject, SmartCityPackage.Literals.LOCATION__LONGITUDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCityPackage.Literals.LOCATION__LONGITUDE));
			if(transientValues.isValueTransient(semanticObject, SmartCityPackage.Literals.LOCATION__REGION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCityPackage.Literals.LOCATION__REGION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocationAccess().getLatitudeSTRINGTerminalRuleCall_2_0(), semanticObject.getLatitude());
		feeder.accept(grammarAccess.getLocationAccess().getLongitudeSTRINGTerminalRuleCall_4_0(), semanticObject.getLongitude());
		feeder.accept(grammarAccess.getLocationAccess().getRegionSTRINGTerminalRuleCall_6_0(), semanticObject.getRegion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     metadata+=Metadata+
	 */
	protected void sequence_MeteoData(EObject context, MeteoData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sources+=[DataSource|ID] sources+=[DataSource|ID]*)
	 */
	protected void sequence_Municipality(EObject context, Municipality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sources+=[DataSource|ID] sources+=[DataSource|ID]*)
	 */
	protected void sequence_NewsSite(EObject context, NewsSite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     data=STRING
	 */
	protected void sequence_Paragraph(EObject context, Paragraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sources+=[DataSource|ID] sources+=[DataSource|ID]*)
	 */
	protected void sequence_Province(EObject context, Province semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     metadata+=Metadata+
	 */
	protected void sequence_PublicAlert(EObject context, PublicAlert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sources+=[DataSource|ID] sources+=[DataSource|ID]*)
	 */
	protected void sequence_PublicTransport(EObject context, PublicTransport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     metadata+=Metadata+
	 */
	protected void sequence_SecurityCam(EObject context, SecurityCam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (providers+=Provider+ dataSources+=DataSource*)
	 */
	protected void sequence_SmartCity(EObject context, SmartCity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (amount=INT metadata+=Metadata+)
	 */
	protected void sequence_SocialNetworkCheckins(EObject context, SocialNetworkCheckins semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     metadata+=Metadata+
	 */
	protected void sequence_TrafficSensor(EObject context, TrafficSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     metadata+=Metadata+
	 */
	protected void sequence_TransportSchedule(EObject context, TransportSchedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (paragraphs+=Paragraph* images+=Image* videos+=WebVideo* metadata+=Metadata+)
	 */
	protected void sequence_Twitter(EObject context, Twitter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     time=INT
	 */
	protected void sequence_UpdateFreq(EObject context, UpdateFreq semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmartCityPackage.Literals.UPDATE_FREQ__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCityPackage.Literals.UPDATE_FREQ__TIME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateFreqAccess().getTimeINTTerminalRuleCall_2_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_WebVideo(EObject context, WebVideo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
