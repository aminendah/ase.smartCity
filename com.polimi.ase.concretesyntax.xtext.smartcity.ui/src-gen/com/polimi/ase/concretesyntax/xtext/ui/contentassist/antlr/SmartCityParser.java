/*
* generated by Xtext
*/
package com.polimi.ase.concretesyntax.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.polimi.ase.concretesyntax.xtext.services.SmartCityGrammarAccess;

public class SmartCityParser extends AbstractContentAssistParser {
	
	@Inject
	private SmartCityGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.polimi.ase.concretesyntax.xtext.ui.contentassist.antlr.internal.InternalSmartCityParser createParser() {
		com.polimi.ase.concretesyntax.xtext.ui.contentassist.antlr.internal.InternalSmartCityParser result = new com.polimi.ase.concretesyntax.xtext.ui.contentassist.antlr.internal.InternalSmartCityParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProviderAccess().getAlternatives(), "rule__Provider__Alternatives");
					put(grammarAccess.getMetadataAccess().getAlternatives(), "rule__Metadata__Alternatives");
					put(grammarAccess.getDataAccess().getAlternatives(), "rule__Data__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getTextAccess().getAlternatives(), "rule__Text__Alternatives");
					put(grammarAccess.getPostAccess().getAlternatives(), "rule__Post__Alternatives");
					put(grammarAccess.getVideoAccess().getAlternatives(), "rule__Video__Alternatives");
					put(grammarAccess.getCameraAccess().getAlternatives(), "rule__Camera__Alternatives");
					put(grammarAccess.getSmartCityAccess().getGroup(), "rule__SmartCity__Group__0");
					put(grammarAccess.getNewsSiteAccess().getGroup(), "rule__NewsSite__Group__0");
					put(grammarAccess.getNewsSiteAccess().getGroup_5(), "rule__NewsSite__Group_5__0");
					put(grammarAccess.getHighwayAccess().getGroup(), "rule__Highway__Group__0");
					put(grammarAccess.getHighwayAccess().getGroup_5(), "rule__Highway__Group_5__0");
					put(grammarAccess.getPublicTransportAccess().getGroup(), "rule__PublicTransport__Group__0");
					put(grammarAccess.getPublicTransportAccess().getGroup_5(), "rule__PublicTransport__Group_5__0");
					put(grammarAccess.getProvinceAccess().getGroup(), "rule__Province__Group__0");
					put(grammarAccess.getProvinceAccess().getGroup_5(), "rule__Province__Group_5__0");
					put(grammarAccess.getCountyAccess().getGroup(), "rule__County__Group__0");
					put(grammarAccess.getCountyAccess().getGroup_5(), "rule__County__Group_5__0");
					put(grammarAccess.getMunicipalityAccess().getGroup(), "rule__Municipality__Group__0");
					put(grammarAccess.getMunicipalityAccess().getGroup_5(), "rule__Municipality__Group_5__0");
					put(grammarAccess.getDataSourceAccess().getGroup(), "rule__DataSource__Group__0");
					put(grammarAccess.getIssuedDateAccess().getGroup(), "rule__IssuedDate__Group__0");
					put(grammarAccess.getLocationAccess().getGroup(), "rule__Location__Group__0");
					put(grammarAccess.getUpdateFreqAccess().getGroup(), "rule__UpdateFreq__Group__0");
					put(grammarAccess.getDataAccess().getGroup_5(), "rule__Data__Group_5__0");
					put(grammarAccess.getSocialNetworkCheckinsAccess().getGroup(), "rule__SocialNetworkCheckins__Group__0");
					put(grammarAccess.getCellphoneDensityAccess().getGroup(), "rule__CellphoneDensity__Group__0");
					put(grammarAccess.getParagraphAccess().getGroup(), "rule__Paragraph__Group__0");
					put(grammarAccess.getMeteoDataAccess().getGroup(), "rule__MeteoData__Group__0");
					put(grammarAccess.getTrafficSensorAccess().getGroup(), "rule__TrafficSensor__Group__0");
					put(grammarAccess.getTransportScheduleAccess().getGroup(), "rule__TransportSchedule__Group__0");
					put(grammarAccess.getPublicAlertAccess().getGroup(), "rule__PublicAlert__Group__0");
					put(grammarAccess.getTwitterAccess().getGroup(), "rule__Twitter__Group__0");
					put(grammarAccess.getBlogAccess().getGroup(), "rule__Blog__Group__0");
					put(grammarAccess.getFacebookAccess().getGroup(), "rule__Facebook__Group__0");
					put(grammarAccess.getInstagramAccess().getGroup(), "rule__Instagram__Group__0");
					put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
					put(grammarAccess.getWebVideoAccess().getGroup(), "rule__WebVideo__Group__0");
					put(grammarAccess.getHighwayCamAccess().getGroup(), "rule__HighwayCam__Group__0");
					put(grammarAccess.getSecurityCamAccess().getGroup(), "rule__SecurityCam__Group__0");
					put(grammarAccess.getSmartCityAccess().getProvidersAssignment_0(), "rule__SmartCity__ProvidersAssignment_0");
					put(grammarAccess.getSmartCityAccess().getDataSourcesAssignment_1(), "rule__SmartCity__DataSourcesAssignment_1");
					put(grammarAccess.getNewsSiteAccess().getNameAssignment_1(), "rule__NewsSite__NameAssignment_1");
					put(grammarAccess.getNewsSiteAccess().getSourcesAssignment_4(), "rule__NewsSite__SourcesAssignment_4");
					put(grammarAccess.getNewsSiteAccess().getSourcesAssignment_5_1(), "rule__NewsSite__SourcesAssignment_5_1");
					put(grammarAccess.getHighwayAccess().getNameAssignment_1(), "rule__Highway__NameAssignment_1");
					put(grammarAccess.getHighwayAccess().getSourcesAssignment_4(), "rule__Highway__SourcesAssignment_4");
					put(grammarAccess.getHighwayAccess().getSourcesAssignment_5_1(), "rule__Highway__SourcesAssignment_5_1");
					put(grammarAccess.getPublicTransportAccess().getNameAssignment_1(), "rule__PublicTransport__NameAssignment_1");
					put(grammarAccess.getPublicTransportAccess().getSourcesAssignment_4(), "rule__PublicTransport__SourcesAssignment_4");
					put(grammarAccess.getPublicTransportAccess().getSourcesAssignment_5_1(), "rule__PublicTransport__SourcesAssignment_5_1");
					put(grammarAccess.getProvinceAccess().getNameAssignment_1(), "rule__Province__NameAssignment_1");
					put(grammarAccess.getProvinceAccess().getSourcesAssignment_4(), "rule__Province__SourcesAssignment_4");
					put(grammarAccess.getProvinceAccess().getSourcesAssignment_5_1(), "rule__Province__SourcesAssignment_5_1");
					put(grammarAccess.getCountyAccess().getNameAssignment_1(), "rule__County__NameAssignment_1");
					put(grammarAccess.getCountyAccess().getSourcesAssignment_4(), "rule__County__SourcesAssignment_4");
					put(grammarAccess.getCountyAccess().getSourcesAssignment_5_1(), "rule__County__SourcesAssignment_5_1");
					put(grammarAccess.getMunicipalityAccess().getNameAssignment_1(), "rule__Municipality__NameAssignment_1");
					put(grammarAccess.getMunicipalityAccess().getSourcesAssignment_4(), "rule__Municipality__SourcesAssignment_4");
					put(grammarAccess.getMunicipalityAccess().getSourcesAssignment_5_1(), "rule__Municipality__SourcesAssignment_5_1");
					put(grammarAccess.getDataSourceAccess().getNameAssignment_1(), "rule__DataSource__NameAssignment_1");
					put(grammarAccess.getDataSourceAccess().getDataAssignment_3(), "rule__DataSource__DataAssignment_3");
					put(grammarAccess.getIssuedDateAccess().getDateAssignment_2(), "rule__IssuedDate__DateAssignment_2");
					put(grammarAccess.getLocationAccess().getLatitudeAssignment_2(), "rule__Location__LatitudeAssignment_2");
					put(grammarAccess.getLocationAccess().getLongitudeAssignment_4(), "rule__Location__LongitudeAssignment_4");
					put(grammarAccess.getLocationAccess().getRegionAssignment_6(), "rule__Location__RegionAssignment_6");
					put(grammarAccess.getUpdateFreqAccess().getTimeAssignment_2(), "rule__UpdateFreq__TimeAssignment_2");
					put(grammarAccess.getDataAccess().getMetadataAssignment_5_2(), "rule__Data__MetadataAssignment_5_2");
					put(grammarAccess.getSocialNetworkCheckinsAccess().getAmountAssignment_2(), "rule__SocialNetworkCheckins__AmountAssignment_2");
					put(grammarAccess.getSocialNetworkCheckinsAccess().getMetadataAssignment_4(), "rule__SocialNetworkCheckins__MetadataAssignment_4");
					put(grammarAccess.getCellphoneDensityAccess().getMeasureAssignment_2(), "rule__CellphoneDensity__MeasureAssignment_2");
					put(grammarAccess.getCellphoneDensityAccess().getMetadataAssignment_4(), "rule__CellphoneDensity__MetadataAssignment_4");
					put(grammarAccess.getParagraphAccess().getDataAssignment_1(), "rule__Paragraph__DataAssignment_1");
					put(grammarAccess.getMeteoDataAccess().getMetadataAssignment_2(), "rule__MeteoData__MetadataAssignment_2");
					put(grammarAccess.getTrafficSensorAccess().getMetadataAssignment_2(), "rule__TrafficSensor__MetadataAssignment_2");
					put(grammarAccess.getTransportScheduleAccess().getMetadataAssignment_2(), "rule__TransportSchedule__MetadataAssignment_2");
					put(grammarAccess.getPublicAlertAccess().getMetadataAssignment_2(), "rule__PublicAlert__MetadataAssignment_2");
					put(grammarAccess.getTwitterAccess().getParagraphsAssignment_2(), "rule__Twitter__ParagraphsAssignment_2");
					put(grammarAccess.getTwitterAccess().getImagesAssignment_5(), "rule__Twitter__ImagesAssignment_5");
					put(grammarAccess.getTwitterAccess().getVideosAssignment_8(), "rule__Twitter__VideosAssignment_8");
					put(grammarAccess.getTwitterAccess().getMetadataAssignment_11(), "rule__Twitter__MetadataAssignment_11");
					put(grammarAccess.getBlogAccess().getTextsAssignment_2(), "rule__Blog__TextsAssignment_2");
					put(grammarAccess.getBlogAccess().getImagesAssignment_5(), "rule__Blog__ImagesAssignment_5");
					put(grammarAccess.getBlogAccess().getVideosAssignment_8(), "rule__Blog__VideosAssignment_8");
					put(grammarAccess.getBlogAccess().getMetadataAssignment_11(), "rule__Blog__MetadataAssignment_11");
					put(grammarAccess.getFacebookAccess().getTextsAssignment_2(), "rule__Facebook__TextsAssignment_2");
					put(grammarAccess.getFacebookAccess().getImagesAssignment_5(), "rule__Facebook__ImagesAssignment_5");
					put(grammarAccess.getFacebookAccess().getVideosAssignment_8(), "rule__Facebook__VideosAssignment_8");
					put(grammarAccess.getFacebookAccess().getMetadataAssignment_11(), "rule__Facebook__MetadataAssignment_11");
					put(grammarAccess.getInstagramAccess().getTextsAssignment_2(), "rule__Instagram__TextsAssignment_2");
					put(grammarAccess.getInstagramAccess().getImagesAssignment_5(), "rule__Instagram__ImagesAssignment_5");
					put(grammarAccess.getInstagramAccess().getVideosAssignment_8(), "rule__Instagram__VideosAssignment_8");
					put(grammarAccess.getInstagramAccess().getMetadataAssignment_11(), "rule__Instagram__MetadataAssignment_11");
					put(grammarAccess.getImageAccess().getUrlAssignment_1(), "rule__Image__UrlAssignment_1");
					put(grammarAccess.getWebVideoAccess().getUrlAssignment_1(), "rule__WebVideo__UrlAssignment_1");
					put(grammarAccess.getHighwayCamAccess().getMetadataAssignment_2(), "rule__HighwayCam__MetadataAssignment_2");
					put(grammarAccess.getSecurityCamAccess().getMetadataAssignment_2(), "rule__SecurityCam__MetadataAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.polimi.ase.concretesyntax.xtext.ui.contentassist.antlr.internal.InternalSmartCityParser typedParser = (com.polimi.ase.concretesyntax.xtext.ui.contentassist.antlr.internal.InternalSmartCityParser) parser;
			typedParser.entryRuleSmartCity();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SmartCityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SmartCityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
