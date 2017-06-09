package com.polimi.ase.concretesyntax.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.polimi.ase.concretesyntax.xtext.services.SmartCityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartCityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NewsSite '", "' {'", "'sources '", "','", "'}'", "'Highway '", "'PublicTransport '", "'Province '", "'County '", "'Municipality '", "'DataSource '", "'IssuedDate {'", "'date'", "'Location {'", "'latitude'", "'longitude'", "'region'", "'UpdateFreq {'", "'time'", "'Data {'", "'metadataInfo {'", "'SocialNetworkCheckins {'", "'amount'", "'CellphoneDensity {'", "'measure'", "'Paragraph '", "'MeteoData {'", "'TrafficSensor {'", "'TransportSchedule {'", "'PublicAlert {'", "'Twitter {'", "'texts {'", "'images {'", "'videos {'", "'Blog {'", "'Facebook {'", "'Instagram {'", "'Image url '", "'WebVideo url '", "'HighwayCam {'", "'SecurityCam {'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSmartCityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartCityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartCityParser.tokenNames; }
    public String getGrammarFileName() { return "../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g"; }



     	private SmartCityGrammarAccess grammarAccess;
     	
        public InternalSmartCityParser(TokenStream input, SmartCityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SmartCity";	
       	}
       	
       	@Override
       	protected SmartCityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSmartCity"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:67:1: entryRuleSmartCity returns [EObject current=null] : iv_ruleSmartCity= ruleSmartCity EOF ;
    public final EObject entryRuleSmartCity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartCity = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:68:2: (iv_ruleSmartCity= ruleSmartCity EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:69:2: iv_ruleSmartCity= ruleSmartCity EOF
            {
             newCompositeNode(grammarAccess.getSmartCityRule()); 
            pushFollow(FOLLOW_ruleSmartCity_in_entryRuleSmartCity75);
            iv_ruleSmartCity=ruleSmartCity();

            state._fsp--;

             current =iv_ruleSmartCity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartCity85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartCity"


    // $ANTLR start "ruleSmartCity"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:76:1: ruleSmartCity returns [EObject current=null] : ( ( (lv_providers_0_0= ruleProvider ) )+ ( (lv_dataSources_1_0= ruleDataSource ) )* ) ;
    public final EObject ruleSmartCity() throws RecognitionException {
        EObject current = null;

        EObject lv_providers_0_0 = null;

        EObject lv_dataSources_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:79:28: ( ( ( (lv_providers_0_0= ruleProvider ) )+ ( (lv_dataSources_1_0= ruleDataSource ) )* ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:80:1: ( ( (lv_providers_0_0= ruleProvider ) )+ ( (lv_dataSources_1_0= ruleDataSource ) )* )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:80:1: ( ( (lv_providers_0_0= ruleProvider ) )+ ( (lv_dataSources_1_0= ruleDataSource ) )* )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:80:2: ( (lv_providers_0_0= ruleProvider ) )+ ( (lv_dataSources_1_0= ruleDataSource ) )*
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:80:2: ( (lv_providers_0_0= ruleProvider ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=16 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:81:1: (lv_providers_0_0= ruleProvider )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:81:1: (lv_providers_0_0= ruleProvider )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:82:3: lv_providers_0_0= ruleProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmartCityAccess().getProvidersProviderParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProvider_in_ruleSmartCity131);
            	    lv_providers_0_0=ruleProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmartCityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providers",
            	            		lv_providers_0_0, 
            	            		"Provider");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:98:3: ( (lv_dataSources_1_0= ruleDataSource ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:99:1: (lv_dataSources_1_0= ruleDataSource )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:99:1: (lv_dataSources_1_0= ruleDataSource )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:100:3: lv_dataSources_1_0= ruleDataSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmartCityAccess().getDataSourcesDataSourceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataSource_in_ruleSmartCity153);
            	    lv_dataSources_1_0=ruleDataSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmartCityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dataSources",
            	            		lv_dataSources_1_0, 
            	            		"DataSource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartCity"


    // $ANTLR start "entryRuleProvider"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:124:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:125:2: (iv_ruleProvider= ruleProvider EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:126:2: iv_ruleProvider= ruleProvider EOF
            {
             newCompositeNode(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_ruleProvider_in_entryRuleProvider190);
            iv_ruleProvider=ruleProvider();

            state._fsp--;

             current =iv_ruleProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvider200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:133:1: ruleProvider returns [EObject current=null] : (this_NewsSite_0= ruleNewsSite | this_Highway_1= ruleHighway | this_PublicTransport_2= rulePublicTransport | this_Province_3= ruleProvince | this_County_4= ruleCounty | this_Municipality_5= ruleMunicipality ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        EObject this_NewsSite_0 = null;

        EObject this_Highway_1 = null;

        EObject this_PublicTransport_2 = null;

        EObject this_Province_3 = null;

        EObject this_County_4 = null;

        EObject this_Municipality_5 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:136:28: ( (this_NewsSite_0= ruleNewsSite | this_Highway_1= ruleHighway | this_PublicTransport_2= rulePublicTransport | this_Province_3= ruleProvince | this_County_4= ruleCounty | this_Municipality_5= ruleMunicipality ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:137:1: (this_NewsSite_0= ruleNewsSite | this_Highway_1= ruleHighway | this_PublicTransport_2= rulePublicTransport | this_Province_3= ruleProvince | this_County_4= ruleCounty | this_Municipality_5= ruleMunicipality )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:137:1: (this_NewsSite_0= ruleNewsSite | this_Highway_1= ruleHighway | this_PublicTransport_2= rulePublicTransport | this_Province_3= ruleProvince | this_County_4= ruleCounty | this_Municipality_5= ruleMunicipality )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:138:5: this_NewsSite_0= ruleNewsSite
                    {
                     
                            newCompositeNode(grammarAccess.getProviderAccess().getNewsSiteParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNewsSite_in_ruleProvider247);
                    this_NewsSite_0=ruleNewsSite();

                    state._fsp--;

                     
                            current = this_NewsSite_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:148:5: this_Highway_1= ruleHighway
                    {
                     
                            newCompositeNode(grammarAccess.getProviderAccess().getHighwayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHighway_in_ruleProvider274);
                    this_Highway_1=ruleHighway();

                    state._fsp--;

                     
                            current = this_Highway_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:158:5: this_PublicTransport_2= rulePublicTransport
                    {
                     
                            newCompositeNode(grammarAccess.getProviderAccess().getPublicTransportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePublicTransport_in_ruleProvider301);
                    this_PublicTransport_2=rulePublicTransport();

                    state._fsp--;

                     
                            current = this_PublicTransport_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:168:5: this_Province_3= ruleProvince
                    {
                     
                            newCompositeNode(grammarAccess.getProviderAccess().getProvinceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleProvince_in_ruleProvider328);
                    this_Province_3=ruleProvince();

                    state._fsp--;

                     
                            current = this_Province_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:178:5: this_County_4= ruleCounty
                    {
                     
                            newCompositeNode(grammarAccess.getProviderAccess().getCountyParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCounty_in_ruleProvider355);
                    this_County_4=ruleCounty();

                    state._fsp--;

                     
                            current = this_County_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:188:5: this_Municipality_5= ruleMunicipality
                    {
                     
                            newCompositeNode(grammarAccess.getProviderAccess().getMunicipalityParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleMunicipality_in_ruleProvider382);
                    this_Municipality_5=ruleMunicipality();

                    state._fsp--;

                     
                            current = this_Municipality_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleNewsSite"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:204:1: entryRuleNewsSite returns [EObject current=null] : iv_ruleNewsSite= ruleNewsSite EOF ;
    public final EObject entryRuleNewsSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewsSite = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:205:2: (iv_ruleNewsSite= ruleNewsSite EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:206:2: iv_ruleNewsSite= ruleNewsSite EOF
            {
             newCompositeNode(grammarAccess.getNewsSiteRule()); 
            pushFollow(FOLLOW_ruleNewsSite_in_entryRuleNewsSite417);
            iv_ruleNewsSite=ruleNewsSite();

            state._fsp--;

             current =iv_ruleNewsSite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewsSite427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewsSite"


    // $ANTLR start "ruleNewsSite"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:213:1: ruleNewsSite returns [EObject current=null] : (otherlv_0= 'NewsSite ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleNewsSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:216:28: ( (otherlv_0= 'NewsSite ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:217:1: (otherlv_0= 'NewsSite ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:217:1: (otherlv_0= 'NewsSite ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:217:3: otherlv_0= 'NewsSite ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNewsSite464); 

                	newLeafNode(otherlv_0, grammarAccess.getNewsSiteAccess().getNewsSiteKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:221:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:222:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:222:1: (lv_name_1_0= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewsSite481); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNewsSiteAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNewsSiteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNewsSite498); 

                	newLeafNode(otherlv_2, grammarAccess.getNewsSiteAccess().getSpaceLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleNewsSite510); 

                	newLeafNode(otherlv_3, grammarAccess.getNewsSiteAccess().getSourcesKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:247:1: ( (otherlv_4= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:248:1: (otherlv_4= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:248:1: (otherlv_4= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:249:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNewsSiteRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewsSite530); 

            		newLeafNode(otherlv_4, grammarAccess.getNewsSiteAccess().getSourcesDataSourceCrossReference_4_0()); 
            	

            }


            }

            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:260:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:260:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleNewsSite543); 

            	        	newLeafNode(otherlv_5, grammarAccess.getNewsSiteAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:264:1: ( (otherlv_6= RULE_ID ) )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:265:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:265:1: (otherlv_6= RULE_ID )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:266:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNewsSiteRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewsSite563); 

            	    		newLeafNode(otherlv_6, grammarAccess.getNewsSiteAccess().getSourcesDataSourceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleNewsSite577); 

                	newLeafNode(otherlv_7, grammarAccess.getNewsSiteAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewsSite"


    // $ANTLR start "entryRuleHighway"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:289:1: entryRuleHighway returns [EObject current=null] : iv_ruleHighway= ruleHighway EOF ;
    public final EObject entryRuleHighway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighway = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:290:2: (iv_ruleHighway= ruleHighway EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:291:2: iv_ruleHighway= ruleHighway EOF
            {
             newCompositeNode(grammarAccess.getHighwayRule()); 
            pushFollow(FOLLOW_ruleHighway_in_entryRuleHighway613);
            iv_ruleHighway=ruleHighway();

            state._fsp--;

             current =iv_ruleHighway; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighway623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighway"


    // $ANTLR start "ruleHighway"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:298:1: ruleHighway returns [EObject current=null] : (otherlv_0= 'Highway ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleHighway() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:301:28: ( (otherlv_0= 'Highway ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:302:1: (otherlv_0= 'Highway ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:302:1: (otherlv_0= 'Highway ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:302:3: otherlv_0= 'Highway ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHighway660); 

                	newLeafNode(otherlv_0, grammarAccess.getHighwayAccess().getHighwayKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:306:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:307:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:307:1: (lv_name_1_0= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:308:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHighway677); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHighwayAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHighwayRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleHighway694); 

                	newLeafNode(otherlv_2, grammarAccess.getHighwayAccess().getSpaceLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHighway706); 

                	newLeafNode(otherlv_3, grammarAccess.getHighwayAccess().getSourcesKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:332:1: ( (otherlv_4= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:333:1: (otherlv_4= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:333:1: (otherlv_4= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:334:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getHighwayRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHighway726); 

            		newLeafNode(otherlv_4, grammarAccess.getHighwayAccess().getSourcesDataSourceCrossReference_4_0()); 
            	

            }


            }

            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:345:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:345:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleHighway739); 

            	        	newLeafNode(otherlv_5, grammarAccess.getHighwayAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:349:1: ( (otherlv_6= RULE_ID ) )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:350:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:350:1: (otherlv_6= RULE_ID )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:351:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getHighwayRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHighway759); 

            	    		newLeafNode(otherlv_6, grammarAccess.getHighwayAccess().getSourcesDataSourceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleHighway773); 

                	newLeafNode(otherlv_7, grammarAccess.getHighwayAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighway"


    // $ANTLR start "entryRulePublicTransport"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:374:1: entryRulePublicTransport returns [EObject current=null] : iv_rulePublicTransport= rulePublicTransport EOF ;
    public final EObject entryRulePublicTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicTransport = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:375:2: (iv_rulePublicTransport= rulePublicTransport EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:376:2: iv_rulePublicTransport= rulePublicTransport EOF
            {
             newCompositeNode(grammarAccess.getPublicTransportRule()); 
            pushFollow(FOLLOW_rulePublicTransport_in_entryRulePublicTransport809);
            iv_rulePublicTransport=rulePublicTransport();

            state._fsp--;

             current =iv_rulePublicTransport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicTransport819); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublicTransport"


    // $ANTLR start "rulePublicTransport"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:383:1: rulePublicTransport returns [EObject current=null] : (otherlv_0= 'PublicTransport ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject rulePublicTransport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:386:28: ( (otherlv_0= 'PublicTransport ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:387:1: (otherlv_0= 'PublicTransport ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:387:1: (otherlv_0= 'PublicTransport ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:387:3: otherlv_0= 'PublicTransport ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePublicTransport856); 

                	newLeafNode(otherlv_0, grammarAccess.getPublicTransportAccess().getPublicTransportKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:391:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:392:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:392:1: (lv_name_1_0= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:393:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePublicTransport873); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPublicTransportAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPublicTransportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePublicTransport890); 

                	newLeafNode(otherlv_2, grammarAccess.getPublicTransportAccess().getSpaceLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePublicTransport902); 

                	newLeafNode(otherlv_3, grammarAccess.getPublicTransportAccess().getSourcesKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:417:1: ( (otherlv_4= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:418:1: (otherlv_4= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:418:1: (otherlv_4= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:419:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPublicTransportRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePublicTransport922); 

            		newLeafNode(otherlv_4, grammarAccess.getPublicTransportAccess().getSourcesDataSourceCrossReference_4_0()); 
            	

            }


            }

            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:430:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:430:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePublicTransport935); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPublicTransportAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:434:1: ( (otherlv_6= RULE_ID ) )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:435:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:435:1: (otherlv_6= RULE_ID )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:436:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPublicTransportRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePublicTransport955); 

            	    		newLeafNode(otherlv_6, grammarAccess.getPublicTransportAccess().getSourcesDataSourceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_rulePublicTransport969); 

                	newLeafNode(otherlv_7, grammarAccess.getPublicTransportAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublicTransport"


    // $ANTLR start "entryRuleProvince"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:459:1: entryRuleProvince returns [EObject current=null] : iv_ruleProvince= ruleProvince EOF ;
    public final EObject entryRuleProvince() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvince = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:460:2: (iv_ruleProvince= ruleProvince EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:461:2: iv_ruleProvince= ruleProvince EOF
            {
             newCompositeNode(grammarAccess.getProvinceRule()); 
            pushFollow(FOLLOW_ruleProvince_in_entryRuleProvince1005);
            iv_ruleProvince=ruleProvince();

            state._fsp--;

             current =iv_ruleProvince; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvince1015); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvince"


    // $ANTLR start "ruleProvince"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:468:1: ruleProvince returns [EObject current=null] : (otherlv_0= 'Province ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleProvince() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:471:28: ( (otherlv_0= 'Province ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:472:1: (otherlv_0= 'Province ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:472:1: (otherlv_0= 'Province ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:472:3: otherlv_0= 'Province ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProvince1052); 

                	newLeafNode(otherlv_0, grammarAccess.getProvinceAccess().getProvinceKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:476:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:477:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:477:1: (lv_name_1_0= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:478:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvince1069); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProvinceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProvinceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProvince1086); 

                	newLeafNode(otherlv_2, grammarAccess.getProvinceAccess().getSpaceLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProvince1098); 

                	newLeafNode(otherlv_3, grammarAccess.getProvinceAccess().getSourcesKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:502:1: ( (otherlv_4= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:503:1: (otherlv_4= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:503:1: (otherlv_4= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:504:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvinceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvince1118); 

            		newLeafNode(otherlv_4, grammarAccess.getProvinceAccess().getSourcesDataSourceCrossReference_4_0()); 
            	

            }


            }

            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:515:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:515:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProvince1131); 

            	        	newLeafNode(otherlv_5, grammarAccess.getProvinceAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:519:1: ( (otherlv_6= RULE_ID ) )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:520:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:520:1: (otherlv_6= RULE_ID )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:521:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProvinceRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvince1151); 

            	    		newLeafNode(otherlv_6, grammarAccess.getProvinceAccess().getSourcesDataSourceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProvince1165); 

                	newLeafNode(otherlv_7, grammarAccess.getProvinceAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvince"


    // $ANTLR start "entryRuleCounty"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:544:1: entryRuleCounty returns [EObject current=null] : iv_ruleCounty= ruleCounty EOF ;
    public final EObject entryRuleCounty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounty = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:545:2: (iv_ruleCounty= ruleCounty EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:546:2: iv_ruleCounty= ruleCounty EOF
            {
             newCompositeNode(grammarAccess.getCountyRule()); 
            pushFollow(FOLLOW_ruleCounty_in_entryRuleCounty1201);
            iv_ruleCounty=ruleCounty();

            state._fsp--;

             current =iv_ruleCounty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCounty1211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCounty"


    // $ANTLR start "ruleCounty"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:553:1: ruleCounty returns [EObject current=null] : (otherlv_0= 'County ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleCounty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:556:28: ( (otherlv_0= 'County ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:557:1: (otherlv_0= 'County ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:557:1: (otherlv_0= 'County ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:557:3: otherlv_0= 'County ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCounty1248); 

                	newLeafNode(otherlv_0, grammarAccess.getCountyAccess().getCountyKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:561:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:562:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:562:1: (lv_name_1_0= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:563:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCounty1265); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCountyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCountyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCounty1282); 

                	newLeafNode(otherlv_2, grammarAccess.getCountyAccess().getSpaceLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCounty1294); 

                	newLeafNode(otherlv_3, grammarAccess.getCountyAccess().getSourcesKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:587:1: ( (otherlv_4= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:588:1: (otherlv_4= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:588:1: (otherlv_4= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:589:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCountyRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCounty1314); 

            		newLeafNode(otherlv_4, grammarAccess.getCountyAccess().getSourcesDataSourceCrossReference_4_0()); 
            	

            }


            }

            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:600:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:600:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCounty1327); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCountyAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:604:1: ( (otherlv_6= RULE_ID ) )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:605:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:605:1: (otherlv_6= RULE_ID )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:606:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCountyRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCounty1347); 

            	    		newLeafNode(otherlv_6, grammarAccess.getCountyAccess().getSourcesDataSourceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCounty1361); 

                	newLeafNode(otherlv_7, grammarAccess.getCountyAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCounty"


    // $ANTLR start "entryRuleMunicipality"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:629:1: entryRuleMunicipality returns [EObject current=null] : iv_ruleMunicipality= ruleMunicipality EOF ;
    public final EObject entryRuleMunicipality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMunicipality = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:630:2: (iv_ruleMunicipality= ruleMunicipality EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:631:2: iv_ruleMunicipality= ruleMunicipality EOF
            {
             newCompositeNode(grammarAccess.getMunicipalityRule()); 
            pushFollow(FOLLOW_ruleMunicipality_in_entryRuleMunicipality1397);
            iv_ruleMunicipality=ruleMunicipality();

            state._fsp--;

             current =iv_ruleMunicipality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMunicipality1407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMunicipality"


    // $ANTLR start "ruleMunicipality"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:638:1: ruleMunicipality returns [EObject current=null] : (otherlv_0= 'Municipality ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleMunicipality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:641:28: ( (otherlv_0= 'Municipality ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:642:1: (otherlv_0= 'Municipality ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:642:1: (otherlv_0= 'Municipality ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:642:3: otherlv_0= 'Municipality ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' otherlv_3= 'sources ' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleMunicipality1444); 

                	newLeafNode(otherlv_0, grammarAccess.getMunicipalityAccess().getMunicipalityKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:646:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:647:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:647:1: (lv_name_1_0= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:648:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMunicipality1461); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMunicipalityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMunicipalityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMunicipality1478); 

                	newLeafNode(otherlv_2, grammarAccess.getMunicipalityAccess().getSpaceLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMunicipality1490); 

                	newLeafNode(otherlv_3, grammarAccess.getMunicipalityAccess().getSourcesKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:672:1: ( (otherlv_4= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:673:1: (otherlv_4= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:673:1: (otherlv_4= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:674:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMunicipalityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMunicipality1510); 

            		newLeafNode(otherlv_4, grammarAccess.getMunicipalityAccess().getSourcesDataSourceCrossReference_4_0()); 
            	

            }


            }

            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:685:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:685:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleMunicipality1523); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMunicipalityAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:689:1: ( (otherlv_6= RULE_ID ) )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:690:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:690:1: (otherlv_6= RULE_ID )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:691:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMunicipalityRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMunicipality1543); 

            	    		newLeafNode(otherlv_6, grammarAccess.getMunicipalityAccess().getSourcesDataSourceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleMunicipality1557); 

                	newLeafNode(otherlv_7, grammarAccess.getMunicipalityAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMunicipality"


    // $ANTLR start "entryRuleDataSource"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:714:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:715:2: (iv_ruleDataSource= ruleDataSource EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:716:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_ruleDataSource_in_entryRuleDataSource1593);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataSource1603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:723:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'DataSource ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' ( (lv_data_3_0= ruleData ) )+ otherlv_4= '}' ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_data_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:726:28: ( (otherlv_0= 'DataSource ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' ( (lv_data_3_0= ruleData ) )+ otherlv_4= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:727:1: (otherlv_0= 'DataSource ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' ( (lv_data_3_0= ruleData ) )+ otherlv_4= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:727:1: (otherlv_0= 'DataSource ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' ( (lv_data_3_0= ruleData ) )+ otherlv_4= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:727:3: otherlv_0= 'DataSource ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ' {' ( (lv_data_3_0= ruleData ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDataSource1640); 

                	newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDataSourceKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:731:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:732:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:732:1: (lv_name_1_0= RULE_ID )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:733:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataSource1657); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataSourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDataSource1674); 

                	newLeafNode(otherlv_2, grammarAccess.getDataSourceAccess().getSpaceLeftCurlyBracketKeyword_2());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:753:1: ( (lv_data_3_0= ruleData ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30||LA10_0==32||LA10_0==34||(LA10_0>=36 && LA10_0<=41)||(LA10_0>=45 && LA10_0<=51)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:754:1: (lv_data_3_0= ruleData )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:754:1: (lv_data_3_0= ruleData )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:755:3: lv_data_3_0= ruleData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataSourceAccess().getDataDataParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleDataSource1695);
            	    lv_data_3_0=ruleData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataSourceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_3_0, 
            	            		"Data");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDataSource1708); 

                	newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleMetadata"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:783:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:784:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:785:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata1744);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata1754); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:792:1: ruleMetadata returns [EObject current=null] : (this_Location_0= ruleLocation | this_UpdateFreq_1= ruleUpdateFreq | this_IssuedDate_2= ruleIssuedDate ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        EObject this_Location_0 = null;

        EObject this_UpdateFreq_1 = null;

        EObject this_IssuedDate_2 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:795:28: ( (this_Location_0= ruleLocation | this_UpdateFreq_1= ruleUpdateFreq | this_IssuedDate_2= ruleIssuedDate ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:796:1: (this_Location_0= ruleLocation | this_UpdateFreq_1= ruleUpdateFreq | this_IssuedDate_2= ruleIssuedDate )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:796:1: (this_Location_0= ruleLocation | this_UpdateFreq_1= ruleUpdateFreq | this_IssuedDate_2= ruleIssuedDate )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:797:5: this_Location_0= ruleLocation
                    {
                     
                            newCompositeNode(grammarAccess.getMetadataAccess().getLocationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLocation_in_ruleMetadata1801);
                    this_Location_0=ruleLocation();

                    state._fsp--;

                     
                            current = this_Location_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:807:5: this_UpdateFreq_1= ruleUpdateFreq
                    {
                     
                            newCompositeNode(grammarAccess.getMetadataAccess().getUpdateFreqParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateFreq_in_ruleMetadata1828);
                    this_UpdateFreq_1=ruleUpdateFreq();

                    state._fsp--;

                     
                            current = this_UpdateFreq_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:817:5: this_IssuedDate_2= ruleIssuedDate
                    {
                     
                            newCompositeNode(grammarAccess.getMetadataAccess().getIssuedDateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIssuedDate_in_ruleMetadata1855);
                    this_IssuedDate_2=ruleIssuedDate();

                    state._fsp--;

                     
                            current = this_IssuedDate_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleIssuedDate"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:833:1: entryRuleIssuedDate returns [EObject current=null] : iv_ruleIssuedDate= ruleIssuedDate EOF ;
    public final EObject entryRuleIssuedDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIssuedDate = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:834:2: (iv_ruleIssuedDate= ruleIssuedDate EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:835:2: iv_ruleIssuedDate= ruleIssuedDate EOF
            {
             newCompositeNode(grammarAccess.getIssuedDateRule()); 
            pushFollow(FOLLOW_ruleIssuedDate_in_entryRuleIssuedDate1890);
            iv_ruleIssuedDate=ruleIssuedDate();

            state._fsp--;

             current =iv_ruleIssuedDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIssuedDate1900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIssuedDate"


    // $ANTLR start "ruleIssuedDate"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:842:1: ruleIssuedDate returns [EObject current=null] : (otherlv_0= 'IssuedDate {' otherlv_1= 'date' ( (lv_date_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleIssuedDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_date_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:845:28: ( (otherlv_0= 'IssuedDate {' otherlv_1= 'date' ( (lv_date_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:846:1: (otherlv_0= 'IssuedDate {' otherlv_1= 'date' ( (lv_date_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:846:1: (otherlv_0= 'IssuedDate {' otherlv_1= 'date' ( (lv_date_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:846:3: otherlv_0= 'IssuedDate {' otherlv_1= 'date' ( (lv_date_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleIssuedDate1937); 

                	newLeafNode(otherlv_0, grammarAccess.getIssuedDateAccess().getIssuedDateKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleIssuedDate1949); 

                	newLeafNode(otherlv_1, grammarAccess.getIssuedDateAccess().getDateKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:854:1: ( (lv_date_2_0= RULE_STRING ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:855:1: (lv_date_2_0= RULE_STRING )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:855:1: (lv_date_2_0= RULE_STRING )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:856:3: lv_date_2_0= RULE_STRING
            {
            lv_date_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIssuedDate1966); 

            			newLeafNode(lv_date_2_0, grammarAccess.getIssuedDateAccess().getDateSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIssuedDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"date",
                    		lv_date_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleIssuedDate1983); 

                	newLeafNode(otherlv_3, grammarAccess.getIssuedDateAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIssuedDate"


    // $ANTLR start "entryRuleLocation"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:884:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:885:2: (iv_ruleLocation= ruleLocation EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:886:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation2019);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation2029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:893:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location {' otherlv_1= 'latitude' ( (lv_latitude_2_0= RULE_STRING ) ) otherlv_3= 'longitude' ( (lv_longitude_4_0= RULE_STRING ) ) otherlv_5= 'region' ( (lv_region_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_latitude_2_0=null;
        Token otherlv_3=null;
        Token lv_longitude_4_0=null;
        Token otherlv_5=null;
        Token lv_region_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:896:28: ( (otherlv_0= 'Location {' otherlv_1= 'latitude' ( (lv_latitude_2_0= RULE_STRING ) ) otherlv_3= 'longitude' ( (lv_longitude_4_0= RULE_STRING ) ) otherlv_5= 'region' ( (lv_region_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:897:1: (otherlv_0= 'Location {' otherlv_1= 'latitude' ( (lv_latitude_2_0= RULE_STRING ) ) otherlv_3= 'longitude' ( (lv_longitude_4_0= RULE_STRING ) ) otherlv_5= 'region' ( (lv_region_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:897:1: (otherlv_0= 'Location {' otherlv_1= 'latitude' ( (lv_latitude_2_0= RULE_STRING ) ) otherlv_3= 'longitude' ( (lv_longitude_4_0= RULE_STRING ) ) otherlv_5= 'region' ( (lv_region_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:897:3: otherlv_0= 'Location {' otherlv_1= 'latitude' ( (lv_latitude_2_0= RULE_STRING ) ) otherlv_3= 'longitude' ( (lv_longitude_4_0= RULE_STRING ) ) otherlv_5= 'region' ( (lv_region_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleLocation2066); 

                	newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLocation2078); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLatitudeKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:905:1: ( (lv_latitude_2_0= RULE_STRING ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:906:1: (lv_latitude_2_0= RULE_STRING )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:906:1: (lv_latitude_2_0= RULE_STRING )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:907:3: lv_latitude_2_0= RULE_STRING
            {
            lv_latitude_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocation2095); 

            			newLeafNode(lv_latitude_2_0, grammarAccess.getLocationAccess().getLatitudeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"latitude",
                    		lv_latitude_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleLocation2112); 

                	newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getLongitudeKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:927:1: ( (lv_longitude_4_0= RULE_STRING ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:928:1: (lv_longitude_4_0= RULE_STRING )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:928:1: (lv_longitude_4_0= RULE_STRING )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:929:3: lv_longitude_4_0= RULE_STRING
            {
            lv_longitude_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocation2129); 

            			newLeafNode(lv_longitude_4_0, grammarAccess.getLocationAccess().getLongitudeSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"longitude",
                    		lv_longitude_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleLocation2146); 

                	newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getRegionKeyword_5());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:949:1: ( (lv_region_6_0= RULE_STRING ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:950:1: (lv_region_6_0= RULE_STRING )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:950:1: (lv_region_6_0= RULE_STRING )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:951:3: lv_region_6_0= RULE_STRING
            {
            lv_region_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocation2163); 

            			newLeafNode(lv_region_6_0, grammarAccess.getLocationAccess().getRegionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"region",
                    		lv_region_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleLocation2180); 

                	newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleUpdateFreq"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:979:1: entryRuleUpdateFreq returns [EObject current=null] : iv_ruleUpdateFreq= ruleUpdateFreq EOF ;
    public final EObject entryRuleUpdateFreq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateFreq = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:980:2: (iv_ruleUpdateFreq= ruleUpdateFreq EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:981:2: iv_ruleUpdateFreq= ruleUpdateFreq EOF
            {
             newCompositeNode(grammarAccess.getUpdateFreqRule()); 
            pushFollow(FOLLOW_ruleUpdateFreq_in_entryRuleUpdateFreq2216);
            iv_ruleUpdateFreq=ruleUpdateFreq();

            state._fsp--;

             current =iv_ruleUpdateFreq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateFreq2226); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateFreq"


    // $ANTLR start "ruleUpdateFreq"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:988:1: ruleUpdateFreq returns [EObject current=null] : (otherlv_0= 'UpdateFreq {' otherlv_1= 'time' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= '}' ) ;
    public final EObject ruleUpdateFreq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:991:28: ( (otherlv_0= 'UpdateFreq {' otherlv_1= 'time' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:992:1: (otherlv_0= 'UpdateFreq {' otherlv_1= 'time' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:992:1: (otherlv_0= 'UpdateFreq {' otherlv_1= 'time' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:992:3: otherlv_0= 'UpdateFreq {' otherlv_1= 'time' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleUpdateFreq2263); 

                	newLeafNode(otherlv_0, grammarAccess.getUpdateFreqAccess().getUpdateFreqKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleUpdateFreq2275); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateFreqAccess().getTimeKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1000:1: ( (lv_time_2_0= RULE_INT ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1001:1: (lv_time_2_0= RULE_INT )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1001:1: (lv_time_2_0= RULE_INT )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1002:3: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUpdateFreq2292); 

            			newLeafNode(lv_time_2_0, grammarAccess.getUpdateFreqAccess().getTimeINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUpdateFreqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleUpdateFreq2309); 

                	newLeafNode(otherlv_3, grammarAccess.getUpdateFreqAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateFreq"


    // $ANTLR start "entryRuleData"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1030:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1031:2: (iv_ruleData= ruleData EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1032:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData2345);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData2355); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1039:1: ruleData returns [EObject current=null] : (this_Number_0= ruleNumber | this_Text_1= ruleText | this_Image_2= ruleImage | this_Video_3= ruleVideo | this_Post_4= rulePost | (otherlv_5= 'Data {' otherlv_6= 'metadataInfo {' ( (lv_metadata_7_0= ruleMetadata ) )+ otherlv_8= '}' otherlv_9= '}' ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject this_Number_0 = null;

        EObject this_Text_1 = null;

        EObject this_Image_2 = null;

        EObject this_Video_3 = null;

        EObject this_Post_4 = null;

        EObject lv_metadata_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1042:28: ( (this_Number_0= ruleNumber | this_Text_1= ruleText | this_Image_2= ruleImage | this_Video_3= ruleVideo | this_Post_4= rulePost | (otherlv_5= 'Data {' otherlv_6= 'metadataInfo {' ( (lv_metadata_7_0= ruleMetadata ) )+ otherlv_8= '}' otherlv_9= '}' ) ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1043:1: (this_Number_0= ruleNumber | this_Text_1= ruleText | this_Image_2= ruleImage | this_Video_3= ruleVideo | this_Post_4= rulePost | (otherlv_5= 'Data {' otherlv_6= 'metadataInfo {' ( (lv_metadata_7_0= ruleMetadata ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1043:1: (this_Number_0= ruleNumber | this_Text_1= ruleText | this_Image_2= ruleImage | this_Video_3= ruleVideo | this_Post_4= rulePost | (otherlv_5= 'Data {' otherlv_6= 'metadataInfo {' ( (lv_metadata_7_0= ruleMetadata ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
                {
                alt13=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt13=2;
                }
                break;
            case 48:
                {
                alt13=3;
                }
                break;
            case 49:
            case 50:
            case 51:
                {
                alt13=4;
                }
                break;
            case 41:
            case 45:
            case 46:
            case 47:
                {
                alt13=5;
                }
                break;
            case 30:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1044:5: this_Number_0= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleData2402);
                    this_Number_0=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1054:5: this_Text_1= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleData2429);
                    this_Text_1=ruleText();

                    state._fsp--;

                     
                            current = this_Text_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1064:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleData2456);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1074:5: this_Video_3= ruleVideo
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getVideoParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVideo_in_ruleData2483);
                    this_Video_3=ruleVideo();

                    state._fsp--;

                     
                            current = this_Video_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1084:5: this_Post_4= rulePost
                    {
                     
                            newCompositeNode(grammarAccess.getDataAccess().getPostParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePost_in_ruleData2510);
                    this_Post_4=rulePost();

                    state._fsp--;

                     
                            current = this_Post_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1093:6: (otherlv_5= 'Data {' otherlv_6= 'metadataInfo {' ( (lv_metadata_7_0= ruleMetadata ) )+ otherlv_8= '}' otherlv_9= '}' )
                    {
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1093:6: (otherlv_5= 'Data {' otherlv_6= 'metadataInfo {' ( (lv_metadata_7_0= ruleMetadata ) )+ otherlv_8= '}' otherlv_9= '}' )
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1093:8: otherlv_5= 'Data {' otherlv_6= 'metadataInfo {' ( (lv_metadata_7_0= ruleMetadata ) )+ otherlv_8= '}' otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleData2528); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataAccess().getDataKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleData2540); 

                        	newLeafNode(otherlv_6, grammarAccess.getDataAccess().getMetadataInfoKeyword_5_1());
                        
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1101:1: ( (lv_metadata_7_0= ruleMetadata ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22||LA12_0==24||LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1102:1: (lv_metadata_7_0= ruleMetadata )
                    	    {
                    	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1102:1: (lv_metadata_7_0= ruleMetadata )
                    	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1103:3: lv_metadata_7_0= ruleMetadata
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataAccess().getMetadataMetadataParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetadata_in_ruleData2561);
                    	    lv_metadata_7_0=ruleMetadata();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"metadata",
                    	            		lv_metadata_7_0, 
                    	            		"Metadata");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleData2574); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_5_3());
                        
                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleData2586); 

                        	newLeafNode(otherlv_9, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleNumber"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1135:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1136:2: (iv_ruleNumber= ruleNumber EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1137:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2623);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1144:1: ruleNumber returns [EObject current=null] : (this_SocialNetworkCheckins_0= ruleSocialNetworkCheckins | this_CellphoneDensity_1= ruleCellphoneDensity ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_SocialNetworkCheckins_0 = null;

        EObject this_CellphoneDensity_1 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1147:28: ( (this_SocialNetworkCheckins_0= ruleSocialNetworkCheckins | this_CellphoneDensity_1= ruleCellphoneDensity ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1148:1: (this_SocialNetworkCheckins_0= ruleSocialNetworkCheckins | this_CellphoneDensity_1= ruleCellphoneDensity )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1148:1: (this_SocialNetworkCheckins_0= ruleSocialNetworkCheckins | this_CellphoneDensity_1= ruleCellphoneDensity )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1149:5: this_SocialNetworkCheckins_0= ruleSocialNetworkCheckins
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getSocialNetworkCheckinsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSocialNetworkCheckins_in_ruleNumber2680);
                    this_SocialNetworkCheckins_0=ruleSocialNetworkCheckins();

                    state._fsp--;

                     
                            current = this_SocialNetworkCheckins_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1159:5: this_CellphoneDensity_1= ruleCellphoneDensity
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getCellphoneDensityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCellphoneDensity_in_ruleNumber2707);
                    this_CellphoneDensity_1=ruleCellphoneDensity();

                    state._fsp--;

                     
                            current = this_CellphoneDensity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleSocialNetworkCheckins"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1175:1: entryRuleSocialNetworkCheckins returns [EObject current=null] : iv_ruleSocialNetworkCheckins= ruleSocialNetworkCheckins EOF ;
    public final EObject entryRuleSocialNetworkCheckins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSocialNetworkCheckins = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1176:2: (iv_ruleSocialNetworkCheckins= ruleSocialNetworkCheckins EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1177:2: iv_ruleSocialNetworkCheckins= ruleSocialNetworkCheckins EOF
            {
             newCompositeNode(grammarAccess.getSocialNetworkCheckinsRule()); 
            pushFollow(FOLLOW_ruleSocialNetworkCheckins_in_entryRuleSocialNetworkCheckins2742);
            iv_ruleSocialNetworkCheckins=ruleSocialNetworkCheckins();

            state._fsp--;

             current =iv_ruleSocialNetworkCheckins; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSocialNetworkCheckins2752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSocialNetworkCheckins"


    // $ANTLR start "ruleSocialNetworkCheckins"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1184:1: ruleSocialNetworkCheckins returns [EObject current=null] : (otherlv_0= 'SocialNetworkCheckins {' otherlv_1= 'amount' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' ) ;
    public final EObject ruleSocialNetworkCheckins() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_amount_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_metadata_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1187:28: ( (otherlv_0= 'SocialNetworkCheckins {' otherlv_1= 'amount' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1188:1: (otherlv_0= 'SocialNetworkCheckins {' otherlv_1= 'amount' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1188:1: (otherlv_0= 'SocialNetworkCheckins {' otherlv_1= 'amount' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1188:3: otherlv_0= 'SocialNetworkCheckins {' otherlv_1= 'amount' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleSocialNetworkCheckins2789); 

                	newLeafNode(otherlv_0, grammarAccess.getSocialNetworkCheckinsAccess().getSocialNetworkCheckinsKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSocialNetworkCheckins2801); 

                	newLeafNode(otherlv_1, grammarAccess.getSocialNetworkCheckinsAccess().getAmountKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1196:1: ( (lv_amount_2_0= RULE_INT ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1197:1: (lv_amount_2_0= RULE_INT )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1197:1: (lv_amount_2_0= RULE_INT )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1198:3: lv_amount_2_0= RULE_INT
            {
            lv_amount_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSocialNetworkCheckins2818); 

            			newLeafNode(lv_amount_2_0, grammarAccess.getSocialNetworkCheckinsAccess().getAmountINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSocialNetworkCheckinsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"amount",
                    		lv_amount_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSocialNetworkCheckins2835); 

                	newLeafNode(otherlv_3, grammarAccess.getSocialNetworkCheckinsAccess().getMetadataInfoKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1218:1: ( (lv_metadata_4_0= ruleMetadata ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22||LA15_0==24||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1219:1: (lv_metadata_4_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1219:1: (lv_metadata_4_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1220:3: lv_metadata_4_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSocialNetworkCheckinsAccess().getMetadataMetadataParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleSocialNetworkCheckins2856);
            	    lv_metadata_4_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSocialNetworkCheckinsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_4_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSocialNetworkCheckins2869); 

                	newLeafNode(otherlv_5, grammarAccess.getSocialNetworkCheckinsAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSocialNetworkCheckins2881); 

                	newLeafNode(otherlv_6, grammarAccess.getSocialNetworkCheckinsAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSocialNetworkCheckins"


    // $ANTLR start "entryRuleCellphoneDensity"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1252:1: entryRuleCellphoneDensity returns [EObject current=null] : iv_ruleCellphoneDensity= ruleCellphoneDensity EOF ;
    public final EObject entryRuleCellphoneDensity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellphoneDensity = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1253:2: (iv_ruleCellphoneDensity= ruleCellphoneDensity EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1254:2: iv_ruleCellphoneDensity= ruleCellphoneDensity EOF
            {
             newCompositeNode(grammarAccess.getCellphoneDensityRule()); 
            pushFollow(FOLLOW_ruleCellphoneDensity_in_entryRuleCellphoneDensity2917);
            iv_ruleCellphoneDensity=ruleCellphoneDensity();

            state._fsp--;

             current =iv_ruleCellphoneDensity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellphoneDensity2927); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellphoneDensity"


    // $ANTLR start "ruleCellphoneDensity"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1261:1: ruleCellphoneDensity returns [EObject current=null] : (otherlv_0= 'CellphoneDensity {' otherlv_1= 'measure' ( (lv_measure_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' ) ;
    public final EObject ruleCellphoneDensity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_measure_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_metadata_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1264:28: ( (otherlv_0= 'CellphoneDensity {' otherlv_1= 'measure' ( (lv_measure_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1265:1: (otherlv_0= 'CellphoneDensity {' otherlv_1= 'measure' ( (lv_measure_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1265:1: (otherlv_0= 'CellphoneDensity {' otherlv_1= 'measure' ( (lv_measure_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1265:3: otherlv_0= 'CellphoneDensity {' otherlv_1= 'measure' ( (lv_measure_2_0= RULE_INT ) ) otherlv_3= 'metadataInfo {' ( (lv_metadata_4_0= ruleMetadata ) )+ otherlv_5= '}' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleCellphoneDensity2964); 

                	newLeafNode(otherlv_0, grammarAccess.getCellphoneDensityAccess().getCellphoneDensityKeyword_0());
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleCellphoneDensity2976); 

                	newLeafNode(otherlv_1, grammarAccess.getCellphoneDensityAccess().getMeasureKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1273:1: ( (lv_measure_2_0= RULE_INT ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1274:1: (lv_measure_2_0= RULE_INT )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1274:1: (lv_measure_2_0= RULE_INT )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1275:3: lv_measure_2_0= RULE_INT
            {
            lv_measure_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCellphoneDensity2993); 

            			newLeafNode(lv_measure_2_0, grammarAccess.getCellphoneDensityAccess().getMeasureINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCellphoneDensityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"measure",
                    		lv_measure_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleCellphoneDensity3010); 

                	newLeafNode(otherlv_3, grammarAccess.getCellphoneDensityAccess().getMetadataInfoKeyword_3());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1295:1: ( (lv_metadata_4_0= ruleMetadata ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22||LA16_0==24||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1296:1: (lv_metadata_4_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1296:1: (lv_metadata_4_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1297:3: lv_metadata_4_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellphoneDensityAccess().getMetadataMetadataParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleCellphoneDensity3031);
            	    lv_metadata_4_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellphoneDensityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_4_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleCellphoneDensity3044); 

                	newLeafNode(otherlv_5, grammarAccess.getCellphoneDensityAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCellphoneDensity3056); 

                	newLeafNode(otherlv_6, grammarAccess.getCellphoneDensityAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellphoneDensity"


    // $ANTLR start "entryRuleText"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1329:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1330:2: (iv_ruleText= ruleText EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1331:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText3092);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText3102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1338:1: ruleText returns [EObject current=null] : (this_MeteoData_0= ruleMeteoData | this_TrafficSensor_1= ruleTrafficSensor | this_TransportSchedule_2= ruleTransportSchedule | this_Alert_3= ruleAlert | this_Paragraph_4= ruleParagraph ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        EObject this_MeteoData_0 = null;

        EObject this_TrafficSensor_1 = null;

        EObject this_TransportSchedule_2 = null;

        EObject this_Alert_3 = null;

        EObject this_Paragraph_4 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1341:28: ( (this_MeteoData_0= ruleMeteoData | this_TrafficSensor_1= ruleTrafficSensor | this_TransportSchedule_2= ruleTransportSchedule | this_Alert_3= ruleAlert | this_Paragraph_4= ruleParagraph ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1342:1: (this_MeteoData_0= ruleMeteoData | this_TrafficSensor_1= ruleTrafficSensor | this_TransportSchedule_2= ruleTransportSchedule | this_Alert_3= ruleAlert | this_Paragraph_4= ruleParagraph )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1342:1: (this_MeteoData_0= ruleMeteoData | this_TrafficSensor_1= ruleTrafficSensor | this_TransportSchedule_2= ruleTransportSchedule | this_Alert_3= ruleAlert | this_Paragraph_4= ruleParagraph )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                alt17=4;
                }
                break;
            case 36:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1343:5: this_MeteoData_0= ruleMeteoData
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getMeteoDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMeteoData_in_ruleText3149);
                    this_MeteoData_0=ruleMeteoData();

                    state._fsp--;

                     
                            current = this_MeteoData_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1353:5: this_TrafficSensor_1= ruleTrafficSensor
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getTrafficSensorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTrafficSensor_in_ruleText3176);
                    this_TrafficSensor_1=ruleTrafficSensor();

                    state._fsp--;

                     
                            current = this_TrafficSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1363:5: this_TransportSchedule_2= ruleTransportSchedule
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getTransportScheduleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTransportSchedule_in_ruleText3203);
                    this_TransportSchedule_2=ruleTransportSchedule();

                    state._fsp--;

                     
                            current = this_TransportSchedule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1373:5: this_Alert_3= ruleAlert
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getAlertParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAlert_in_ruleText3230);
                    this_Alert_3=ruleAlert();

                    state._fsp--;

                     
                            current = this_Alert_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1383:5: this_Paragraph_4= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getParagraphParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleText3257);
                    this_Paragraph_4=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleParagraph"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1399:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1400:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1401:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph3292);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph3302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1408:1: ruleParagraph returns [EObject current=null] : (otherlv_0= 'Paragraph ' ( (lv_data_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_1_0=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1411:28: ( (otherlv_0= 'Paragraph ' ( (lv_data_1_0= RULE_STRING ) ) ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1412:1: (otherlv_0= 'Paragraph ' ( (lv_data_1_0= RULE_STRING ) ) )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1412:1: (otherlv_0= 'Paragraph ' ( (lv_data_1_0= RULE_STRING ) ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1412:3: otherlv_0= 'Paragraph ' ( (lv_data_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleParagraph3339); 

                	newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getParagraphKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1416:1: ( (lv_data_1_0= RULE_STRING ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1417:1: (lv_data_1_0= RULE_STRING )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1417:1: (lv_data_1_0= RULE_STRING )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1418:3: lv_data_1_0= RULE_STRING
            {
            lv_data_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParagraph3356); 

            			newLeafNode(lv_data_1_0, grammarAccess.getParagraphAccess().getDataSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParagraphRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"data",
                    		lv_data_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleMeteoData"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1442:1: entryRuleMeteoData returns [EObject current=null] : iv_ruleMeteoData= ruleMeteoData EOF ;
    public final EObject entryRuleMeteoData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeteoData = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1443:2: (iv_ruleMeteoData= ruleMeteoData EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1444:2: iv_ruleMeteoData= ruleMeteoData EOF
            {
             newCompositeNode(grammarAccess.getMeteoDataRule()); 
            pushFollow(FOLLOW_ruleMeteoData_in_entryRuleMeteoData3397);
            iv_ruleMeteoData=ruleMeteoData();

            state._fsp--;

             current =iv_ruleMeteoData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeteoData3407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeteoData"


    // $ANTLR start "ruleMeteoData"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1451:1: ruleMeteoData returns [EObject current=null] : (otherlv_0= 'MeteoData {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) ;
    public final EObject ruleMeteoData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_metadata_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1454:28: ( (otherlv_0= 'MeteoData {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1455:1: (otherlv_0= 'MeteoData {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1455:1: (otherlv_0= 'MeteoData {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1455:3: otherlv_0= 'MeteoData {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleMeteoData3444); 

                	newLeafNode(otherlv_0, grammarAccess.getMeteoDataAccess().getMeteoDataKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleMeteoData3456); 

                	newLeafNode(otherlv_1, grammarAccess.getMeteoDataAccess().getMetadataInfoKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1463:1: ( (lv_metadata_2_0= ruleMetadata ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22||LA18_0==24||LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1464:1: (lv_metadata_2_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1464:1: (lv_metadata_2_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1465:3: lv_metadata_2_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMeteoDataAccess().getMetadataMetadataParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleMeteoData3477);
            	    lv_metadata_2_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMeteoDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_2_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMeteoData3490); 

                	newLeafNode(otherlv_3, grammarAccess.getMeteoDataAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMeteoData3502); 

                	newLeafNode(otherlv_4, grammarAccess.getMeteoDataAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeteoData"


    // $ANTLR start "entryRuleTrafficSensor"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1497:1: entryRuleTrafficSensor returns [EObject current=null] : iv_ruleTrafficSensor= ruleTrafficSensor EOF ;
    public final EObject entryRuleTrafficSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrafficSensor = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1498:2: (iv_ruleTrafficSensor= ruleTrafficSensor EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1499:2: iv_ruleTrafficSensor= ruleTrafficSensor EOF
            {
             newCompositeNode(grammarAccess.getTrafficSensorRule()); 
            pushFollow(FOLLOW_ruleTrafficSensor_in_entryRuleTrafficSensor3538);
            iv_ruleTrafficSensor=ruleTrafficSensor();

            state._fsp--;

             current =iv_ruleTrafficSensor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrafficSensor3548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrafficSensor"


    // $ANTLR start "ruleTrafficSensor"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1506:1: ruleTrafficSensor returns [EObject current=null] : (otherlv_0= 'TrafficSensor {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) ;
    public final EObject ruleTrafficSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_metadata_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1509:28: ( (otherlv_0= 'TrafficSensor {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1510:1: (otherlv_0= 'TrafficSensor {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1510:1: (otherlv_0= 'TrafficSensor {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1510:3: otherlv_0= 'TrafficSensor {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTrafficSensor3585); 

                	newLeafNode(otherlv_0, grammarAccess.getTrafficSensorAccess().getTrafficSensorKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTrafficSensor3597); 

                	newLeafNode(otherlv_1, grammarAccess.getTrafficSensorAccess().getMetadataInfoKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1518:1: ( (lv_metadata_2_0= ruleMetadata ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22||LA19_0==24||LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1519:1: (lv_metadata_2_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1519:1: (lv_metadata_2_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1520:3: lv_metadata_2_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTrafficSensorAccess().getMetadataMetadataParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleTrafficSensor3618);
            	    lv_metadata_2_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTrafficSensorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_2_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTrafficSensor3631); 

                	newLeafNode(otherlv_3, grammarAccess.getTrafficSensorAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTrafficSensor3643); 

                	newLeafNode(otherlv_4, grammarAccess.getTrafficSensorAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrafficSensor"


    // $ANTLR start "entryRuleTransportSchedule"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1552:1: entryRuleTransportSchedule returns [EObject current=null] : iv_ruleTransportSchedule= ruleTransportSchedule EOF ;
    public final EObject entryRuleTransportSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransportSchedule = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1553:2: (iv_ruleTransportSchedule= ruleTransportSchedule EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1554:2: iv_ruleTransportSchedule= ruleTransportSchedule EOF
            {
             newCompositeNode(grammarAccess.getTransportScheduleRule()); 
            pushFollow(FOLLOW_ruleTransportSchedule_in_entryRuleTransportSchedule3679);
            iv_ruleTransportSchedule=ruleTransportSchedule();

            state._fsp--;

             current =iv_ruleTransportSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransportSchedule3689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransportSchedule"


    // $ANTLR start "ruleTransportSchedule"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1561:1: ruleTransportSchedule returns [EObject current=null] : (otherlv_0= 'TransportSchedule {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) ;
    public final EObject ruleTransportSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_metadata_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1564:28: ( (otherlv_0= 'TransportSchedule {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1565:1: (otherlv_0= 'TransportSchedule {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1565:1: (otherlv_0= 'TransportSchedule {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1565:3: otherlv_0= 'TransportSchedule {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleTransportSchedule3726); 

                	newLeafNode(otherlv_0, grammarAccess.getTransportScheduleAccess().getTransportScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTransportSchedule3738); 

                	newLeafNode(otherlv_1, grammarAccess.getTransportScheduleAccess().getMetadataInfoKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1573:1: ( (lv_metadata_2_0= ruleMetadata ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22||LA20_0==24||LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1574:1: (lv_metadata_2_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1574:1: (lv_metadata_2_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1575:3: lv_metadata_2_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransportScheduleAccess().getMetadataMetadataParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleTransportSchedule3759);
            	    lv_metadata_2_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransportScheduleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_2_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTransportSchedule3772); 

                	newLeafNode(otherlv_3, grammarAccess.getTransportScheduleAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTransportSchedule3784); 

                	newLeafNode(otherlv_4, grammarAccess.getTransportScheduleAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransportSchedule"


    // $ANTLR start "entryRuleAlert"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1607:1: entryRuleAlert returns [EObject current=null] : iv_ruleAlert= ruleAlert EOF ;
    public final EObject entryRuleAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlert = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1608:2: (iv_ruleAlert= ruleAlert EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1609:2: iv_ruleAlert= ruleAlert EOF
            {
             newCompositeNode(grammarAccess.getAlertRule()); 
            pushFollow(FOLLOW_ruleAlert_in_entryRuleAlert3820);
            iv_ruleAlert=ruleAlert();

            state._fsp--;

             current =iv_ruleAlert; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlert3830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlert"


    // $ANTLR start "ruleAlert"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1616:1: ruleAlert returns [EObject current=null] : this_PublicAlert_0= rulePublicAlert ;
    public final EObject ruleAlert() throws RecognitionException {
        EObject current = null;

        EObject this_PublicAlert_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1619:28: (this_PublicAlert_0= rulePublicAlert )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1621:5: this_PublicAlert_0= rulePublicAlert
            {
             
                    newCompositeNode(grammarAccess.getAlertAccess().getPublicAlertParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePublicAlert_in_ruleAlert3876);
            this_PublicAlert_0=rulePublicAlert();

            state._fsp--;

             
                    current = this_PublicAlert_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlert"


    // $ANTLR start "entryRulePublicAlert"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1637:1: entryRulePublicAlert returns [EObject current=null] : iv_rulePublicAlert= rulePublicAlert EOF ;
    public final EObject entryRulePublicAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicAlert = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1638:2: (iv_rulePublicAlert= rulePublicAlert EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1639:2: iv_rulePublicAlert= rulePublicAlert EOF
            {
             newCompositeNode(grammarAccess.getPublicAlertRule()); 
            pushFollow(FOLLOW_rulePublicAlert_in_entryRulePublicAlert3910);
            iv_rulePublicAlert=rulePublicAlert();

            state._fsp--;

             current =iv_rulePublicAlert; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicAlert3920); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublicAlert"


    // $ANTLR start "rulePublicAlert"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1646:1: rulePublicAlert returns [EObject current=null] : (otherlv_0= 'PublicAlert {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) ;
    public final EObject rulePublicAlert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_metadata_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1649:28: ( (otherlv_0= 'PublicAlert {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1650:1: (otherlv_0= 'PublicAlert {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1650:1: (otherlv_0= 'PublicAlert {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1650:3: otherlv_0= 'PublicAlert {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_rulePublicAlert3957); 

                	newLeafNode(otherlv_0, grammarAccess.getPublicAlertAccess().getPublicAlertKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePublicAlert3969); 

                	newLeafNode(otherlv_1, grammarAccess.getPublicAlertAccess().getMetadataInfoKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1658:1: ( (lv_metadata_2_0= ruleMetadata ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22||LA21_0==24||LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1659:1: (lv_metadata_2_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1659:1: (lv_metadata_2_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1660:3: lv_metadata_2_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPublicAlertAccess().getMetadataMetadataParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_rulePublicAlert3990);
            	    lv_metadata_2_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPublicAlertRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_2_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePublicAlert4003); 

                	newLeafNode(otherlv_3, grammarAccess.getPublicAlertAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePublicAlert4015); 

                	newLeafNode(otherlv_4, grammarAccess.getPublicAlertAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublicAlert"


    // $ANTLR start "entryRulePost"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1692:1: entryRulePost returns [EObject current=null] : iv_rulePost= rulePost EOF ;
    public final EObject entryRulePost() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePost = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1693:2: (iv_rulePost= rulePost EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1694:2: iv_rulePost= rulePost EOF
            {
             newCompositeNode(grammarAccess.getPostRule()); 
            pushFollow(FOLLOW_rulePost_in_entryRulePost4051);
            iv_rulePost=rulePost();

            state._fsp--;

             current =iv_rulePost; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePost4061); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePost"


    // $ANTLR start "rulePost"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1701:1: rulePost returns [EObject current=null] : (this_Twitter_0= ruleTwitter | this_Facebook_1= ruleFacebook | this_Blog_2= ruleBlog | this_Instagram_3= ruleInstagram ) ;
    public final EObject rulePost() throws RecognitionException {
        EObject current = null;

        EObject this_Twitter_0 = null;

        EObject this_Facebook_1 = null;

        EObject this_Blog_2 = null;

        EObject this_Instagram_3 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1704:28: ( (this_Twitter_0= ruleTwitter | this_Facebook_1= ruleFacebook | this_Blog_2= ruleBlog | this_Instagram_3= ruleInstagram ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1705:1: (this_Twitter_0= ruleTwitter | this_Facebook_1= ruleFacebook | this_Blog_2= ruleBlog | this_Instagram_3= ruleInstagram )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1705:1: (this_Twitter_0= ruleTwitter | this_Facebook_1= ruleFacebook | this_Blog_2= ruleBlog | this_Instagram_3= ruleInstagram )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt22=1;
                }
                break;
            case 46:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 47:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1706:5: this_Twitter_0= ruleTwitter
                    {
                     
                            newCompositeNode(grammarAccess.getPostAccess().getTwitterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTwitter_in_rulePost4108);
                    this_Twitter_0=ruleTwitter();

                    state._fsp--;

                     
                            current = this_Twitter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1716:5: this_Facebook_1= ruleFacebook
                    {
                     
                            newCompositeNode(grammarAccess.getPostAccess().getFacebookParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFacebook_in_rulePost4135);
                    this_Facebook_1=ruleFacebook();

                    state._fsp--;

                     
                            current = this_Facebook_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1726:5: this_Blog_2= ruleBlog
                    {
                     
                            newCompositeNode(grammarAccess.getPostAccess().getBlogParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBlog_in_rulePost4162);
                    this_Blog_2=ruleBlog();

                    state._fsp--;

                     
                            current = this_Blog_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1736:5: this_Instagram_3= ruleInstagram
                    {
                     
                            newCompositeNode(grammarAccess.getPostAccess().getInstagramParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInstagram_in_rulePost4189);
                    this_Instagram_3=ruleInstagram();

                    state._fsp--;

                     
                            current = this_Instagram_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePost"


    // $ANTLR start "entryRuleTwitter"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1752:1: entryRuleTwitter returns [EObject current=null] : iv_ruleTwitter= ruleTwitter EOF ;
    public final EObject entryRuleTwitter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitter = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1753:2: (iv_ruleTwitter= ruleTwitter EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1754:2: iv_ruleTwitter= ruleTwitter EOF
            {
             newCompositeNode(grammarAccess.getTwitterRule()); 
            pushFollow(FOLLOW_ruleTwitter_in_entryRuleTwitter4224);
            iv_ruleTwitter=ruleTwitter();

            state._fsp--;

             current =iv_ruleTwitter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTwitter4234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTwitter"


    // $ANTLR start "ruleTwitter"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1761:1: ruleTwitter returns [EObject current=null] : (otherlv_0= 'Twitter {' otherlv_1= 'texts {' ( (lv_paragraphs_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleTwitter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_paragraphs_2_0 = null;

        EObject lv_images_5_0 = null;

        EObject lv_videos_8_0 = null;

        EObject lv_metadata_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1764:28: ( (otherlv_0= 'Twitter {' otherlv_1= 'texts {' ( (lv_paragraphs_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1765:1: (otherlv_0= 'Twitter {' otherlv_1= 'texts {' ( (lv_paragraphs_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1765:1: (otherlv_0= 'Twitter {' otherlv_1= 'texts {' ( (lv_paragraphs_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1765:3: otherlv_0= 'Twitter {' otherlv_1= 'texts {' ( (lv_paragraphs_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleTwitter4271); 

                	newLeafNode(otherlv_0, grammarAccess.getTwitterAccess().getTwitterKeyword_0());
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleTwitter4283); 

                	newLeafNode(otherlv_1, grammarAccess.getTwitterAccess().getTextsKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1773:1: ( (lv_paragraphs_2_0= ruleParagraph ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1774:1: (lv_paragraphs_2_0= ruleParagraph )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1774:1: (lv_paragraphs_2_0= ruleParagraph )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1775:3: lv_paragraphs_2_0= ruleParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTwitterAccess().getParagraphsParagraphParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraph_in_ruleTwitter4304);
            	    lv_paragraphs_2_0=ruleParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTwitterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"paragraphs",
            	            		lv_paragraphs_2_0, 
            	            		"Paragraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTwitter4317); 

                	newLeafNode(otherlv_3, grammarAccess.getTwitterAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleTwitter4329); 

                	newLeafNode(otherlv_4, grammarAccess.getTwitterAccess().getImagesKeyword_4());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1799:1: ( (lv_images_5_0= ruleImage ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1800:1: (lv_images_5_0= ruleImage )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1800:1: (lv_images_5_0= ruleImage )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1801:3: lv_images_5_0= ruleImage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTwitterAccess().getImagesImageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImage_in_ruleTwitter4350);
            	    lv_images_5_0=ruleImage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTwitterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"images",
            	            		lv_images_5_0, 
            	            		"Image");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTwitter4363); 

                	newLeafNode(otherlv_6, grammarAccess.getTwitterAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleTwitter4375); 

                	newLeafNode(otherlv_7, grammarAccess.getTwitterAccess().getVideosKeyword_7());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1825:1: ( (lv_videos_8_0= ruleWebVideo ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1826:1: (lv_videos_8_0= ruleWebVideo )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1826:1: (lv_videos_8_0= ruleWebVideo )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1827:3: lv_videos_8_0= ruleWebVideo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTwitterAccess().getVideosWebVideoParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWebVideo_in_ruleTwitter4396);
            	    lv_videos_8_0=ruleWebVideo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTwitterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videos",
            	            		lv_videos_8_0, 
            	            		"WebVideo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleTwitter4409); 

                	newLeafNode(otherlv_9, grammarAccess.getTwitterAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleTwitter4421); 

                	newLeafNode(otherlv_10, grammarAccess.getTwitterAccess().getMetadataInfoKeyword_10());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1851:1: ( (lv_metadata_11_0= ruleMetadata ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22||LA26_0==24||LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1852:1: (lv_metadata_11_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1852:1: (lv_metadata_11_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1853:3: lv_metadata_11_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTwitterAccess().getMetadataMetadataParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleTwitter4442);
            	    lv_metadata_11_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTwitterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_11_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleTwitter4455); 

                	newLeafNode(otherlv_12, grammarAccess.getTwitterAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleTwitter4467); 

                	newLeafNode(otherlv_13, grammarAccess.getTwitterAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTwitter"


    // $ANTLR start "entryRuleBlog"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1885:1: entryRuleBlog returns [EObject current=null] : iv_ruleBlog= ruleBlog EOF ;
    public final EObject entryRuleBlog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlog = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1886:2: (iv_ruleBlog= ruleBlog EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1887:2: iv_ruleBlog= ruleBlog EOF
            {
             newCompositeNode(grammarAccess.getBlogRule()); 
            pushFollow(FOLLOW_ruleBlog_in_entryRuleBlog4503);
            iv_ruleBlog=ruleBlog();

            state._fsp--;

             current =iv_ruleBlog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlog4513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlog"


    // $ANTLR start "ruleBlog"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1894:1: ruleBlog returns [EObject current=null] : (otherlv_0= 'Blog {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleBlog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_texts_2_0 = null;

        EObject lv_images_5_0 = null;

        EObject lv_videos_8_0 = null;

        EObject lv_metadata_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1897:28: ( (otherlv_0= 'Blog {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1898:1: (otherlv_0= 'Blog {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1898:1: (otherlv_0= 'Blog {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1898:3: otherlv_0= 'Blog {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleBlog4550); 

                	newLeafNode(otherlv_0, grammarAccess.getBlogAccess().getBlogKeyword_0());
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleBlog4562); 

                	newLeafNode(otherlv_1, grammarAccess.getBlogAccess().getTextsKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1906:1: ( (lv_texts_2_0= ruleParagraph ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1907:1: (lv_texts_2_0= ruleParagraph )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1907:1: (lv_texts_2_0= ruleParagraph )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1908:3: lv_texts_2_0= ruleParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlogAccess().getTextsParagraphParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraph_in_ruleBlog4583);
            	    lv_texts_2_0=ruleParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"texts",
            	            		lv_texts_2_0, 
            	            		"Paragraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBlog4596); 

                	newLeafNode(otherlv_3, grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleBlog4608); 

                	newLeafNode(otherlv_4, grammarAccess.getBlogAccess().getImagesKeyword_4());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1932:1: ( (lv_images_5_0= ruleImage ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1933:1: (lv_images_5_0= ruleImage )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1933:1: (lv_images_5_0= ruleImage )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1934:3: lv_images_5_0= ruleImage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlogAccess().getImagesImageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImage_in_ruleBlog4629);
            	    lv_images_5_0=ruleImage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"images",
            	            		lv_images_5_0, 
            	            		"Image");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBlog4642); 

                	newLeafNode(otherlv_6, grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleBlog4654); 

                	newLeafNode(otherlv_7, grammarAccess.getBlogAccess().getVideosKeyword_7());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1958:1: ( (lv_videos_8_0= ruleWebVideo ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==49) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1959:1: (lv_videos_8_0= ruleWebVideo )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1959:1: (lv_videos_8_0= ruleWebVideo )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1960:3: lv_videos_8_0= ruleWebVideo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlogAccess().getVideosWebVideoParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWebVideo_in_ruleBlog4675);
            	    lv_videos_8_0=ruleWebVideo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videos",
            	            		lv_videos_8_0, 
            	            		"WebVideo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleBlog4688); 

                	newLeafNode(otherlv_9, grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleBlog4700); 

                	newLeafNode(otherlv_10, grammarAccess.getBlogAccess().getMetadataInfoKeyword_10());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1984:1: ( (lv_metadata_11_0= ruleMetadata ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22||LA30_0==24||LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1985:1: (lv_metadata_11_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1985:1: (lv_metadata_11_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:1986:3: lv_metadata_11_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlogAccess().getMetadataMetadataParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleBlog4721);
            	    lv_metadata_11_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_11_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleBlog4734); 

                	newLeafNode(otherlv_12, grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleBlog4746); 

                	newLeafNode(otherlv_13, grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlog"


    // $ANTLR start "entryRuleFacebook"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2018:1: entryRuleFacebook returns [EObject current=null] : iv_ruleFacebook= ruleFacebook EOF ;
    public final EObject entryRuleFacebook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacebook = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2019:2: (iv_ruleFacebook= ruleFacebook EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2020:2: iv_ruleFacebook= ruleFacebook EOF
            {
             newCompositeNode(grammarAccess.getFacebookRule()); 
            pushFollow(FOLLOW_ruleFacebook_in_entryRuleFacebook4782);
            iv_ruleFacebook=ruleFacebook();

            state._fsp--;

             current =iv_ruleFacebook; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacebook4792); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFacebook"


    // $ANTLR start "ruleFacebook"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2027:1: ruleFacebook returns [EObject current=null] : (otherlv_0= 'Facebook {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleFacebook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_texts_2_0 = null;

        EObject lv_images_5_0 = null;

        EObject lv_videos_8_0 = null;

        EObject lv_metadata_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2030:28: ( (otherlv_0= 'Facebook {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2031:1: (otherlv_0= 'Facebook {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2031:1: (otherlv_0= 'Facebook {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2031:3: otherlv_0= 'Facebook {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleFacebook4829); 

                	newLeafNode(otherlv_0, grammarAccess.getFacebookAccess().getFacebookKeyword_0());
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleFacebook4841); 

                	newLeafNode(otherlv_1, grammarAccess.getFacebookAccess().getTextsKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2039:1: ( (lv_texts_2_0= ruleParagraph ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2040:1: (lv_texts_2_0= ruleParagraph )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2040:1: (lv_texts_2_0= ruleParagraph )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2041:3: lv_texts_2_0= ruleParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacebookAccess().getTextsParagraphParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraph_in_ruleFacebook4862);
            	    lv_texts_2_0=ruleParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFacebookRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"texts",
            	            		lv_texts_2_0, 
            	            		"Paragraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFacebook4875); 

                	newLeafNode(otherlv_3, grammarAccess.getFacebookAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleFacebook4887); 

                	newLeafNode(otherlv_4, grammarAccess.getFacebookAccess().getImagesKeyword_4());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2065:1: ( (lv_images_5_0= ruleImage ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2066:1: (lv_images_5_0= ruleImage )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2066:1: (lv_images_5_0= ruleImage )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2067:3: lv_images_5_0= ruleImage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacebookAccess().getImagesImageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImage_in_ruleFacebook4908);
            	    lv_images_5_0=ruleImage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFacebookRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"images",
            	            		lv_images_5_0, 
            	            		"Image");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleFacebook4921); 

                	newLeafNode(otherlv_6, grammarAccess.getFacebookAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleFacebook4933); 

                	newLeafNode(otherlv_7, grammarAccess.getFacebookAccess().getVideosKeyword_7());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2091:1: ( (lv_videos_8_0= ruleWebVideo ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2092:1: (lv_videos_8_0= ruleWebVideo )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2092:1: (lv_videos_8_0= ruleWebVideo )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2093:3: lv_videos_8_0= ruleWebVideo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacebookAccess().getVideosWebVideoParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWebVideo_in_ruleFacebook4954);
            	    lv_videos_8_0=ruleWebVideo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFacebookRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videos",
            	            		lv_videos_8_0, 
            	            		"WebVideo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleFacebook4967); 

                	newLeafNode(otherlv_9, grammarAccess.getFacebookAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleFacebook4979); 

                	newLeafNode(otherlv_10, grammarAccess.getFacebookAccess().getMetadataInfoKeyword_10());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2117:1: ( (lv_metadata_11_0= ruleMetadata ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==22||LA34_0==24||LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2118:1: (lv_metadata_11_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2118:1: (lv_metadata_11_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2119:3: lv_metadata_11_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacebookAccess().getMetadataMetadataParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleFacebook5000);
            	    lv_metadata_11_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFacebookRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_11_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleFacebook5013); 

                	newLeafNode(otherlv_12, grammarAccess.getFacebookAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleFacebook5025); 

                	newLeafNode(otherlv_13, grammarAccess.getFacebookAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFacebook"


    // $ANTLR start "entryRuleInstagram"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2151:1: entryRuleInstagram returns [EObject current=null] : iv_ruleInstagram= ruleInstagram EOF ;
    public final EObject entryRuleInstagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstagram = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2152:2: (iv_ruleInstagram= ruleInstagram EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2153:2: iv_ruleInstagram= ruleInstagram EOF
            {
             newCompositeNode(grammarAccess.getInstagramRule()); 
            pushFollow(FOLLOW_ruleInstagram_in_entryRuleInstagram5061);
            iv_ruleInstagram=ruleInstagram();

            state._fsp--;

             current =iv_ruleInstagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstagram5071); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstagram"


    // $ANTLR start "ruleInstagram"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2160:1: ruleInstagram returns [EObject current=null] : (otherlv_0= 'Instagram {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleInstagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_texts_2_0 = null;

        EObject lv_images_5_0 = null;

        EObject lv_videos_8_0 = null;

        EObject lv_metadata_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2163:28: ( (otherlv_0= 'Instagram {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2164:1: (otherlv_0= 'Instagram {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2164:1: (otherlv_0= 'Instagram {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2164:3: otherlv_0= 'Instagram {' otherlv_1= 'texts {' ( (lv_texts_2_0= ruleParagraph ) )* otherlv_3= '}' otherlv_4= 'images {' ( (lv_images_5_0= ruleImage ) )* otherlv_6= '}' otherlv_7= 'videos {' ( (lv_videos_8_0= ruleWebVideo ) )* otherlv_9= '}' otherlv_10= 'metadataInfo {' ( (lv_metadata_11_0= ruleMetadata ) )+ otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleInstagram5108); 

                	newLeafNode(otherlv_0, grammarAccess.getInstagramAccess().getInstagramKeyword_0());
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleInstagram5120); 

                	newLeafNode(otherlv_1, grammarAccess.getInstagramAccess().getTextsKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2172:1: ( (lv_texts_2_0= ruleParagraph ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==36) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2173:1: (lv_texts_2_0= ruleParagraph )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2173:1: (lv_texts_2_0= ruleParagraph )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2174:3: lv_texts_2_0= ruleParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstagramAccess().getTextsParagraphParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraph_in_ruleInstagram5141);
            	    lv_texts_2_0=ruleParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"texts",
            	            		lv_texts_2_0, 
            	            		"Paragraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleInstagram5154); 

                	newLeafNode(otherlv_3, grammarAccess.getInstagramAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleInstagram5166); 

                	newLeafNode(otherlv_4, grammarAccess.getInstagramAccess().getImagesKeyword_4());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2198:1: ( (lv_images_5_0= ruleImage ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==48) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2199:1: (lv_images_5_0= ruleImage )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2199:1: (lv_images_5_0= ruleImage )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2200:3: lv_images_5_0= ruleImage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstagramAccess().getImagesImageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImage_in_ruleInstagram5187);
            	    lv_images_5_0=ruleImage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"images",
            	            		lv_images_5_0, 
            	            		"Image");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleInstagram5200); 

                	newLeafNode(otherlv_6, grammarAccess.getInstagramAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleInstagram5212); 

                	newLeafNode(otherlv_7, grammarAccess.getInstagramAccess().getVideosKeyword_7());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2224:1: ( (lv_videos_8_0= ruleWebVideo ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==49) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2225:1: (lv_videos_8_0= ruleWebVideo )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2225:1: (lv_videos_8_0= ruleWebVideo )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2226:3: lv_videos_8_0= ruleWebVideo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstagramAccess().getVideosWebVideoParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWebVideo_in_ruleInstagram5233);
            	    lv_videos_8_0=ruleWebVideo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videos",
            	            		lv_videos_8_0, 
            	            		"WebVideo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleInstagram5246); 

                	newLeafNode(otherlv_9, grammarAccess.getInstagramAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleInstagram5258); 

                	newLeafNode(otherlv_10, grammarAccess.getInstagramAccess().getMetadataInfoKeyword_10());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2250:1: ( (lv_metadata_11_0= ruleMetadata ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==22||LA38_0==24||LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2251:1: (lv_metadata_11_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2251:1: (lv_metadata_11_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2252:3: lv_metadata_11_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstagramAccess().getMetadataMetadataParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleInstagram5279);
            	    lv_metadata_11_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_11_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleInstagram5292); 

                	newLeafNode(otherlv_12, grammarAccess.getInstagramAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleInstagram5304); 

                	newLeafNode(otherlv_13, grammarAccess.getInstagramAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstagram"


    // $ANTLR start "entryRuleImage"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2284:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2285:2: (iv_ruleImage= ruleImage EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2286:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage5340);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage5350); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2293:1: ruleImage returns [EObject current=null] : (otherlv_0= 'Image url ' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2296:28: ( (otherlv_0= 'Image url ' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2297:1: (otherlv_0= 'Image url ' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2297:1: (otherlv_0= 'Image url ' ( (lv_url_1_0= RULE_STRING ) ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2297:3: otherlv_0= 'Image url ' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleImage5387); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageUrlKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2301:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2302:1: (lv_url_1_0= RULE_STRING )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2302:1: (lv_url_1_0= RULE_STRING )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2303:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage5404); 

            			newLeafNode(lv_url_1_0, grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleVideo"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2327:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2328:2: (iv_ruleVideo= ruleVideo EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2329:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_ruleVideo_in_entryRuleVideo5445);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideo5455); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2336:1: ruleVideo returns [EObject current=null] : (this_Camera_0= ruleCamera | this_WebVideo_1= ruleWebVideo ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        EObject this_Camera_0 = null;

        EObject this_WebVideo_1 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2339:28: ( (this_Camera_0= ruleCamera | this_WebVideo_1= ruleWebVideo ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2340:1: (this_Camera_0= ruleCamera | this_WebVideo_1= ruleWebVideo )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2340:1: (this_Camera_0= ruleCamera | this_WebVideo_1= ruleWebVideo )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=50 && LA39_0<=51)) ) {
                alt39=1;
            }
            else if ( (LA39_0==49) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2341:5: this_Camera_0= ruleCamera
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getCameraParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCamera_in_ruleVideo5502);
                    this_Camera_0=ruleCamera();

                    state._fsp--;

                     
                            current = this_Camera_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2351:5: this_WebVideo_1= ruleWebVideo
                    {
                     
                            newCompositeNode(grammarAccess.getVideoAccess().getWebVideoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWebVideo_in_ruleVideo5529);
                    this_WebVideo_1=ruleWebVideo();

                    state._fsp--;

                     
                            current = this_WebVideo_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleWebVideo"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2367:1: entryRuleWebVideo returns [EObject current=null] : iv_ruleWebVideo= ruleWebVideo EOF ;
    public final EObject entryRuleWebVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebVideo = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2368:2: (iv_ruleWebVideo= ruleWebVideo EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2369:2: iv_ruleWebVideo= ruleWebVideo EOF
            {
             newCompositeNode(grammarAccess.getWebVideoRule()); 
            pushFollow(FOLLOW_ruleWebVideo_in_entryRuleWebVideo5564);
            iv_ruleWebVideo=ruleWebVideo();

            state._fsp--;

             current =iv_ruleWebVideo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebVideo5574); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebVideo"


    // $ANTLR start "ruleWebVideo"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2376:1: ruleWebVideo returns [EObject current=null] : (otherlv_0= 'WebVideo url ' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWebVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;

         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2379:28: ( (otherlv_0= 'WebVideo url ' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2380:1: (otherlv_0= 'WebVideo url ' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2380:1: (otherlv_0= 'WebVideo url ' ( (lv_url_1_0= RULE_STRING ) ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2380:3: otherlv_0= 'WebVideo url ' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleWebVideo5611); 

                	newLeafNode(otherlv_0, grammarAccess.getWebVideoAccess().getWebVideoUrlKeyword_0());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2384:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2385:1: (lv_url_1_0= RULE_STRING )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2385:1: (lv_url_1_0= RULE_STRING )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2386:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWebVideo5628); 

            			newLeafNode(lv_url_1_0, grammarAccess.getWebVideoAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWebVideoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebVideo"


    // $ANTLR start "entryRuleCamera"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2410:1: entryRuleCamera returns [EObject current=null] : iv_ruleCamera= ruleCamera EOF ;
    public final EObject entryRuleCamera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamera = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2411:2: (iv_ruleCamera= ruleCamera EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2412:2: iv_ruleCamera= ruleCamera EOF
            {
             newCompositeNode(grammarAccess.getCameraRule()); 
            pushFollow(FOLLOW_ruleCamera_in_entryRuleCamera5669);
            iv_ruleCamera=ruleCamera();

            state._fsp--;

             current =iv_ruleCamera; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCamera5679); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCamera"


    // $ANTLR start "ruleCamera"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2419:1: ruleCamera returns [EObject current=null] : (this_SecurityCam_0= ruleSecurityCam | this_HighwayCam_1= ruleHighwayCam ) ;
    public final EObject ruleCamera() throws RecognitionException {
        EObject current = null;

        EObject this_SecurityCam_0 = null;

        EObject this_HighwayCam_1 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2422:28: ( (this_SecurityCam_0= ruleSecurityCam | this_HighwayCam_1= ruleHighwayCam ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2423:1: (this_SecurityCam_0= ruleSecurityCam | this_HighwayCam_1= ruleHighwayCam )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2423:1: (this_SecurityCam_0= ruleSecurityCam | this_HighwayCam_1= ruleHighwayCam )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            else if ( (LA40_0==50) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2424:5: this_SecurityCam_0= ruleSecurityCam
                    {
                     
                            newCompositeNode(grammarAccess.getCameraAccess().getSecurityCamParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSecurityCam_in_ruleCamera5726);
                    this_SecurityCam_0=ruleSecurityCam();

                    state._fsp--;

                     
                            current = this_SecurityCam_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2434:5: this_HighwayCam_1= ruleHighwayCam
                    {
                     
                            newCompositeNode(grammarAccess.getCameraAccess().getHighwayCamParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHighwayCam_in_ruleCamera5753);
                    this_HighwayCam_1=ruleHighwayCam();

                    state._fsp--;

                     
                            current = this_HighwayCam_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCamera"


    // $ANTLR start "entryRuleHighwayCam"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2450:1: entryRuleHighwayCam returns [EObject current=null] : iv_ruleHighwayCam= ruleHighwayCam EOF ;
    public final EObject entryRuleHighwayCam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighwayCam = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2451:2: (iv_ruleHighwayCam= ruleHighwayCam EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2452:2: iv_ruleHighwayCam= ruleHighwayCam EOF
            {
             newCompositeNode(grammarAccess.getHighwayCamRule()); 
            pushFollow(FOLLOW_ruleHighwayCam_in_entryRuleHighwayCam5788);
            iv_ruleHighwayCam=ruleHighwayCam();

            state._fsp--;

             current =iv_ruleHighwayCam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighwayCam5798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighwayCam"


    // $ANTLR start "ruleHighwayCam"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2459:1: ruleHighwayCam returns [EObject current=null] : (otherlv_0= 'HighwayCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) ;
    public final EObject ruleHighwayCam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_metadata_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2462:28: ( (otherlv_0= 'HighwayCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2463:1: (otherlv_0= 'HighwayCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2463:1: (otherlv_0= 'HighwayCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2463:3: otherlv_0= 'HighwayCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleHighwayCam5835); 

                	newLeafNode(otherlv_0, grammarAccess.getHighwayCamAccess().getHighwayCamKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleHighwayCam5847); 

                	newLeafNode(otherlv_1, grammarAccess.getHighwayCamAccess().getMetadataInfoKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2471:1: ( (lv_metadata_2_0= ruleMetadata ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==22||LA41_0==24||LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2472:1: (lv_metadata_2_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2472:1: (lv_metadata_2_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2473:3: lv_metadata_2_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHighwayCamAccess().getMetadataMetadataParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleHighwayCam5868);
            	    lv_metadata_2_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHighwayCamRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_2_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleHighwayCam5881); 

                	newLeafNode(otherlv_3, grammarAccess.getHighwayCamAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleHighwayCam5893); 

                	newLeafNode(otherlv_4, grammarAccess.getHighwayCamAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighwayCam"


    // $ANTLR start "entryRuleSecurityCam"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2505:1: entryRuleSecurityCam returns [EObject current=null] : iv_ruleSecurityCam= ruleSecurityCam EOF ;
    public final EObject entryRuleSecurityCam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityCam = null;


        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2506:2: (iv_ruleSecurityCam= ruleSecurityCam EOF )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2507:2: iv_ruleSecurityCam= ruleSecurityCam EOF
            {
             newCompositeNode(grammarAccess.getSecurityCamRule()); 
            pushFollow(FOLLOW_ruleSecurityCam_in_entryRuleSecurityCam5929);
            iv_ruleSecurityCam=ruleSecurityCam();

            state._fsp--;

             current =iv_ruleSecurityCam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityCam5939); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecurityCam"


    // $ANTLR start "ruleSecurityCam"
    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2514:1: ruleSecurityCam returns [EObject current=null] : (otherlv_0= 'SecurityCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) ;
    public final EObject ruleSecurityCam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_metadata_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2517:28: ( (otherlv_0= 'SecurityCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' ) )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2518:1: (otherlv_0= 'SecurityCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            {
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2518:1: (otherlv_0= 'SecurityCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}' )
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2518:3: otherlv_0= 'SecurityCam {' otherlv_1= 'metadataInfo {' ( (lv_metadata_2_0= ruleMetadata ) )+ otherlv_3= '}' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleSecurityCam5976); 

                	newLeafNode(otherlv_0, grammarAccess.getSecurityCamAccess().getSecurityCamKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSecurityCam5988); 

                	newLeafNode(otherlv_1, grammarAccess.getSecurityCamAccess().getMetadataInfoKeyword_1());
                
            // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2526:1: ( (lv_metadata_2_0= ruleMetadata ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==22||LA42_0==24||LA42_0==28) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2527:1: (lv_metadata_2_0= ruleMetadata )
            	    {
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2527:1: (lv_metadata_2_0= ruleMetadata )
            	    // ../com.polimi.ase.concretesyntax.xtext.smartcity/src-gen/com/polimi/ase/concretesyntax/xtext/parser/antlr/internal/InternalSmartCity.g:2528:3: lv_metadata_2_0= ruleMetadata
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityCamAccess().getMetadataMetadataParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadata_in_ruleSecurityCam6009);
            	    lv_metadata_2_0=ruleMetadata();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityCamRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metadata",
            	            		lv_metadata_2_0, 
            	            		"Metadata");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSecurityCam6022); 

                	newLeafNode(otherlv_3, grammarAccess.getSecurityCamAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSecurityCam6034); 

                	newLeafNode(otherlv_4, grammarAccess.getSecurityCamAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecurityCam"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSmartCity_in_entryRuleSmartCity75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartCity85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvider_in_ruleSmartCity131 = new BitSet(new long[]{0x00000000003F0802L});
    public static final BitSet FOLLOW_ruleDataSource_in_ruleSmartCity153 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleProvider_in_entryRuleProvider190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvider200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewsSite_in_ruleProvider247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighway_in_ruleProvider274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicTransport_in_ruleProvider301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvince_in_ruleProvider328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCounty_in_ruleProvider355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMunicipality_in_ruleProvider382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewsSite_in_entryRuleNewsSite417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewsSite427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNewsSite464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewsSite481 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNewsSite498 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNewsSite510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewsSite530 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleNewsSite543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewsSite563 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleNewsSite577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighway_in_entryRuleHighway613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighway623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHighway660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHighway677 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHighway694 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHighway706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHighway726 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleHighway739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHighway759 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleHighway773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicTransport_in_entryRulePublicTransport809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicTransport819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePublicTransport856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePublicTransport873 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePublicTransport890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePublicTransport902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePublicTransport922 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_rulePublicTransport935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePublicTransport955 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_rulePublicTransport969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvince_in_entryRuleProvince1005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvince1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProvince1052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvince1069 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProvince1086 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProvince1098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvince1118 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleProvince1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvince1151 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleProvince1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCounty_in_entryRuleCounty1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCounty1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCounty1248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCounty1265 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCounty1282 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCounty1294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCounty1314 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleCounty1327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCounty1347 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleCounty1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMunicipality_in_entryRuleMunicipality1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMunicipality1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMunicipality1444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMunicipality1461 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMunicipality1478 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMunicipality1490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMunicipality1510 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleMunicipality1523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMunicipality1543 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleMunicipality1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataSource_in_entryRuleDataSource1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataSource1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDataSource1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataSource1657 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataSource1674 = new BitSet(new long[]{0x000FE3F540000000L});
    public static final BitSet FOLLOW_ruleData_in_ruleDataSource1695 = new BitSet(new long[]{0x000FE3F540008000L});
    public static final BitSet FOLLOW_15_in_ruleDataSource1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_ruleMetadata1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateFreq_in_ruleMetadata1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIssuedDate_in_ruleMetadata1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIssuedDate_in_entryRuleIssuedDate1890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIssuedDate1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleIssuedDate1937 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIssuedDate1949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIssuedDate1966 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIssuedDate1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLocation2066 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLocation2078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLocation2095 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLocation2112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLocation2129 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLocation2146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLocation2163 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLocation2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateFreq_in_entryRuleUpdateFreq2216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateFreq2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUpdateFreq2263 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUpdateFreq2275 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUpdateFreq2292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUpdateFreq2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData2345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleData2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleData2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleData2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_ruleData2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePost_in_ruleData2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleData2528 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleData2540 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleData2561 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleData2574 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleData2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSocialNetworkCheckins_in_ruleNumber2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellphoneDensity_in_ruleNumber2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSocialNetworkCheckins_in_entryRuleSocialNetworkCheckins2742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSocialNetworkCheckins2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSocialNetworkCheckins2789 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSocialNetworkCheckins2801 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSocialNetworkCheckins2818 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSocialNetworkCheckins2835 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleSocialNetworkCheckins2856 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleSocialNetworkCheckins2869 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSocialNetworkCheckins2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellphoneDensity_in_entryRuleCellphoneDensity2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellphoneDensity2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCellphoneDensity2964 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCellphoneDensity2976 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCellphoneDensity2993 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCellphoneDensity3010 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleCellphoneDensity3031 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleCellphoneDensity3044 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCellphoneDensity3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText3092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeteoData_in_ruleText3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrafficSensor_in_ruleText3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransportSchedule_in_ruleText3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlert_in_ruleText3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleText3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph3292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleParagraph3339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParagraph3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeteoData_in_entryRuleMeteoData3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeteoData3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMeteoData3444 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMeteoData3456 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleMeteoData3477 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleMeteoData3490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMeteoData3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrafficSensor_in_entryRuleTrafficSensor3538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrafficSensor3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTrafficSensor3585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTrafficSensor3597 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleTrafficSensor3618 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleTrafficSensor3631 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTrafficSensor3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransportSchedule_in_entryRuleTransportSchedule3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransportSchedule3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTransportSchedule3726 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTransportSchedule3738 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleTransportSchedule3759 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleTransportSchedule3772 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransportSchedule3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlert_in_entryRuleAlert3820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlert3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicAlert_in_ruleAlert3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicAlert_in_entryRulePublicAlert3910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicAlert3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePublicAlert3957 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePublicAlert3969 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_rulePublicAlert3990 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_rulePublicAlert4003 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePublicAlert4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePost_in_entryRulePost4051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePost4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwitter_in_rulePost4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacebook_in_rulePost4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlog_in_rulePost4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstagram_in_rulePost4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwitter_in_entryRuleTwitter4224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTwitter4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTwitter4271 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleTwitter4283 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleTwitter4304 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_15_in_ruleTwitter4317 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTwitter4329 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_ruleImage_in_ruleTwitter4350 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTwitter4363 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleTwitter4375 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_ruleWebVideo_in_ruleTwitter4396 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTwitter4409 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTwitter4421 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleTwitter4442 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleTwitter4455 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTwitter4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlog_in_entryRuleBlog4503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlog4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBlog4550 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleBlog4562 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleBlog4583 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlog4596 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleBlog4608 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_ruleImage_in_ruleBlog4629 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlog4642 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleBlog4654 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_ruleWebVideo_in_ruleBlog4675 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlog4688 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBlog4700 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleBlog4721 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleBlog4734 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlog4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacebook_in_entryRuleFacebook4782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacebook4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFacebook4829 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleFacebook4841 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleFacebook4862 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_15_in_ruleFacebook4875 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleFacebook4887 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_ruleImage_in_ruleFacebook4908 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFacebook4921 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleFacebook4933 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_ruleWebVideo_in_ruleFacebook4954 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFacebook4967 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFacebook4979 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleFacebook5000 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleFacebook5013 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFacebook5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstagram_in_entryRuleInstagram5061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstagram5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInstagram5108 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleInstagram5120 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleInstagram5141 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstagram5154 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleInstagram5166 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_ruleImage_in_ruleInstagram5187 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstagram5200 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleInstagram5212 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_ruleWebVideo_in_ruleInstagram5233 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstagram5246 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInstagram5258 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleInstagram5279 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleInstagram5292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstagram5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage5340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleImage5387 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_entryRuleVideo5445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideo5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCamera_in_ruleVideo5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebVideo_in_ruleVideo5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebVideo_in_entryRuleWebVideo5564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebVideo5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleWebVideo5611 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWebVideo5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCamera_in_entryRuleCamera5669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCamera5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityCam_in_ruleCamera5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighwayCam_in_ruleCamera5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighwayCam_in_entryRuleHighwayCam5788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighwayCam5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleHighwayCam5835 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleHighwayCam5847 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleHighwayCam5868 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleHighwayCam5881 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHighwayCam5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityCam_in_entryRuleSecurityCam5929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityCam5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSecurityCam5976 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSecurityCam5988 = new BitSet(new long[]{0x0000000011400000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleSecurityCam6009 = new BitSet(new long[]{0x0000000011408000L});
    public static final BitSet FOLLOW_15_in_ruleSecurityCam6022 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSecurityCam6034 = new BitSet(new long[]{0x0000000000000002L});

}