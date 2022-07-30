package x.mvmn.permock.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import x.mvmn.permock.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INTEGER", "RULE_ID", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'if'", "'proxy'", "'respond'", "'with'", "'url'", "'status'", "'content'", "'headers'", "','", "':'", "'or'", "'and'", "'not'", "'('", "')'", "'{'", "'}'", "'$'", "'['", "']'", "'.'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'~='", "'where'", "'all'", "'any'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_FLOAT=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Rule";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRule"
    // InternalDsl.g:65:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDsl.g:65:45: (iv_ruleRule= ruleRule EOF )
            // InternalDsl.g:66:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDsl.g:72:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) ( (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) ) | (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_proxy_3_0 = null;

        EObject lv_response_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) ( (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) ) | (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) ) )? ) )
            // InternalDsl.g:79:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) ( (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) ) | (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) ) )? )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) ( (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) ) | (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) ) )? )
            // InternalDsl.g:80:3: otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) ( (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) ) | (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_conditions_1_0= ruleCondition ) )
            // InternalDsl.g:85:4: (lv_conditions_1_0= ruleCondition )
            {
            // InternalDsl.g:85:4: (lv_conditions_1_0= ruleCondition )
            // InternalDsl.g:86:5: lv_conditions_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_conditions_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"x.mvmn.permock.dsl.Dsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:103:3: ( (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) ) | (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) ) )?
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:104:4: (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) )
                    {
                    // InternalDsl.g:104:4: (otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) ) )
                    // InternalDsl.g:105:5: otherlv_2= 'proxy' ( (lv_proxy_3_0= ruleProxyConf ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getProxyKeyword_2_0_0());
                    				
                    // InternalDsl.g:109:5: ( (lv_proxy_3_0= ruleProxyConf ) )
                    // InternalDsl.g:110:6: (lv_proxy_3_0= ruleProxyConf )
                    {
                    // InternalDsl.g:110:6: (lv_proxy_3_0= ruleProxyConf )
                    // InternalDsl.g:111:7: lv_proxy_3_0= ruleProxyConf
                    {

                    							newCompositeNode(grammarAccess.getRuleAccess().getProxyProxyConfParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_proxy_3_0=ruleProxyConf();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    							}
                    							set(
                    								current,
                    								"proxy",
                    								lv_proxy_3_0,
                    								"x.mvmn.permock.dsl.Dsl.ProxyConf");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:130:4: (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) )
                    {
                    // InternalDsl.g:130:4: (otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) ) )
                    // InternalDsl.g:131:5: otherlv_4= 'respond' otherlv_5= 'with' ( (lv_response_6_0= ruleResponseConf ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRespondKeyword_2_1_0());
                    				
                    otherlv_5=(Token)match(input,15,FOLLOW_7); 

                    					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getWithKeyword_2_1_1());
                    				
                    // InternalDsl.g:139:5: ( (lv_response_6_0= ruleResponseConf ) )
                    // InternalDsl.g:140:6: (lv_response_6_0= ruleResponseConf )
                    {
                    // InternalDsl.g:140:6: (lv_response_6_0= ruleResponseConf )
                    // InternalDsl.g:141:7: lv_response_6_0= ruleResponseConf
                    {

                    							newCompositeNode(grammarAccess.getRuleAccess().getResponseResponseConfParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_response_6_0=ruleResponseConf();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    							}
                    							set(
                    								current,
                    								"response",
                    								lv_response_6_0,
                    								"x.mvmn.permock.dsl.Dsl.ResponseConf");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleProxyConf"
    // InternalDsl.g:164:1: entryRuleProxyConf returns [EObject current=null] : iv_ruleProxyConf= ruleProxyConf EOF ;
    public final EObject entryRuleProxyConf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxyConf = null;


        try {
            // InternalDsl.g:164:50: (iv_ruleProxyConf= ruleProxyConf EOF )
            // InternalDsl.g:165:2: iv_ruleProxyConf= ruleProxyConf EOF
            {
             newCompositeNode(grammarAccess.getProxyConfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProxyConf=ruleProxyConf();

            state._fsp--;

             current =iv_ruleProxyConf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProxyConf"


    // $ANTLR start "ruleProxyConf"
    // InternalDsl.g:171:1: ruleProxyConf returns [EObject current=null] : (otherlv_0= 'url' ( (lv_proxyUrl_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleProxyConf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_proxyUrl_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:177:2: ( (otherlv_0= 'url' ( (lv_proxyUrl_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:178:2: (otherlv_0= 'url' ( (lv_proxyUrl_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:178:2: (otherlv_0= 'url' ( (lv_proxyUrl_1_0= RULE_STRING ) ) )
            // InternalDsl.g:179:3: otherlv_0= 'url' ( (lv_proxyUrl_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProxyConfAccess().getUrlKeyword_0());
            		
            // InternalDsl.g:183:3: ( (lv_proxyUrl_1_0= RULE_STRING ) )
            // InternalDsl.g:184:4: (lv_proxyUrl_1_0= RULE_STRING )
            {
            // InternalDsl.g:184:4: (lv_proxyUrl_1_0= RULE_STRING )
            // InternalDsl.g:185:5: lv_proxyUrl_1_0= RULE_STRING
            {
            lv_proxyUrl_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_proxyUrl_1_0, grammarAccess.getProxyConfAccess().getProxyUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProxyConfRule());
            					}
            					setWithLastConsumed(
            						current,
            						"proxyUrl",
            						lv_proxyUrl_1_0,
            						"x.mvmn.permock.dsl.Dsl.STRING");
            				

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
    // $ANTLR end "ruleProxyConf"


    // $ANTLR start "entryRuleResponseConf"
    // InternalDsl.g:205:1: entryRuleResponseConf returns [EObject current=null] : iv_ruleResponseConf= ruleResponseConf EOF ;
    public final EObject entryRuleResponseConf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseConf = null;


        try {
            // InternalDsl.g:205:53: (iv_ruleResponseConf= ruleResponseConf EOF )
            // InternalDsl.g:206:2: iv_ruleResponseConf= ruleResponseConf EOF
            {
             newCompositeNode(grammarAccess.getResponseConfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponseConf=ruleResponseConf();

            state._fsp--;

             current =iv_ruleResponseConf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResponseConf"


    // $ANTLR start "ruleResponseConf"
    // InternalDsl.g:212:1: ruleResponseConf returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* ) ) ) ;
    public final EObject ruleResponseConf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_httpStatus_2_0=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;
        Token otherlv_5=null;
        EObject lv_headers_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:218:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* ) ) ) )
            // InternalDsl.g:219:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* ) ) )
            {
            // InternalDsl.g:219:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* ) ) )
            // InternalDsl.g:220:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* ) )
            {
            // InternalDsl.g:220:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* ) )
            // InternalDsl.g:221:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getResponseConfAccess().getUnorderedGroup());
            			
            // InternalDsl.g:224:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )* )
            // InternalDsl.g:225:5: ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )*
            {
            // InternalDsl.g:225:5: ( ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) ) )*
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:226:3: ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) )
            	    {
            	    // InternalDsl.g:226:3: ({...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) ) )
            	    // InternalDsl.g:227:4: {...}? => ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleResponseConf", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDsl.g:227:106: ( ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) ) )
            	    // InternalDsl.g:228:5: ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDsl.g:231:8: ({...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) ) )
            	    // InternalDsl.g:231:9: {...}? => (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResponseConf", "true");
            	    }
            	    // InternalDsl.g:231:18: (otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) ) )
            	    // InternalDsl.g:231:19: otherlv_1= 'status' ( (lv_httpStatus_2_0= RULE_INTEGER ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_9); 

            	    								newLeafNode(otherlv_1, grammarAccess.getResponseConfAccess().getStatusKeyword_0_0());
            	    							
            	    // InternalDsl.g:235:8: ( (lv_httpStatus_2_0= RULE_INTEGER ) )
            	    // InternalDsl.g:236:9: (lv_httpStatus_2_0= RULE_INTEGER )
            	    {
            	    // InternalDsl.g:236:9: (lv_httpStatus_2_0= RULE_INTEGER )
            	    // InternalDsl.g:237:10: lv_httpStatus_2_0= RULE_INTEGER
            	    {
            	    lv_httpStatus_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_10); 

            	    										newLeafNode(lv_httpStatus_2_0, grammarAccess.getResponseConfAccess().getHttpStatusINTEGERTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getResponseConfRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"httpStatus",
            	    											lv_httpStatus_2_0,
            	    											"x.mvmn.permock.dsl.Dsl.INTEGER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResponseConfAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:259:3: ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDsl.g:259:3: ({...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDsl.g:260:4: {...}? => ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleResponseConf", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDsl.g:260:106: ( ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) ) )
            	    // InternalDsl.g:261:5: ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDsl.g:264:8: ({...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) ) )
            	    // InternalDsl.g:264:9: {...}? => (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResponseConf", "true");
            	    }
            	    // InternalDsl.g:264:18: (otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) ) )
            	    // InternalDsl.g:264:19: otherlv_3= 'content' ( (lv_content_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getResponseConfAccess().getContentKeyword_1_0());
            	    							
            	    // InternalDsl.g:268:8: ( (lv_content_4_0= RULE_STRING ) )
            	    // InternalDsl.g:269:9: (lv_content_4_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:269:9: (lv_content_4_0= RULE_STRING )
            	    // InternalDsl.g:270:10: lv_content_4_0= RULE_STRING
            	    {
            	    lv_content_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    										newLeafNode(lv_content_4_0, grammarAccess.getResponseConfAccess().getContentSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getResponseConfRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"content",
            	    											lv_content_4_0,
            	    											"x.mvmn.permock.dsl.Dsl.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResponseConfAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:292:3: ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) )
            	    {
            	    // InternalDsl.g:292:3: ({...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) ) )
            	    // InternalDsl.g:293:4: {...}? => ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleResponseConf", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDsl.g:293:106: ( ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) ) )
            	    // InternalDsl.g:294:5: ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDsl.g:297:8: ({...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? ) )
            	    // InternalDsl.g:297:9: {...}? => (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResponseConf", "true");
            	    }
            	    // InternalDsl.g:297:18: (otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )? )
            	    // InternalDsl.g:297:19: otherlv_5= 'headers' ( (lv_headers_6_0= ruleHeaders ) )?
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_11); 

            	    								newLeafNode(otherlv_5, grammarAccess.getResponseConfAccess().getHeadersKeyword_2_0());
            	    							
            	    // InternalDsl.g:301:8: ( (lv_headers_6_0= ruleHeaders ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==RULE_STRING) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalDsl.g:302:9: (lv_headers_6_0= ruleHeaders )
            	            {
            	            // InternalDsl.g:302:9: (lv_headers_6_0= ruleHeaders )
            	            // InternalDsl.g:303:10: lv_headers_6_0= ruleHeaders
            	            {

            	            										newCompositeNode(grammarAccess.getResponseConfAccess().getHeadersHeadersParserRuleCall_2_1_0());
            	            									
            	            pushFollow(FOLLOW_10);
            	            lv_headers_6_0=ruleHeaders();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getResponseConfRule());
            	            										}
            	            										set(
            	            											current,
            	            											"headers",
            	            											lv_headers_6_0,
            	            											"x.mvmn.permock.dsl.Dsl.Headers");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResponseConfAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getResponseConfAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleResponseConf"


    // $ANTLR start "entryRuleHeaders"
    // InternalDsl.g:336:1: entryRuleHeaders returns [EObject current=null] : iv_ruleHeaders= ruleHeaders EOF ;
    public final EObject entryRuleHeaders() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaders = null;


        try {
            // InternalDsl.g:336:48: (iv_ruleHeaders= ruleHeaders EOF )
            // InternalDsl.g:337:2: iv_ruleHeaders= ruleHeaders EOF
            {
             newCompositeNode(grammarAccess.getHeadersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaders=ruleHeaders();

            state._fsp--;

             current =iv_ruleHeaders; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeaders"


    // $ANTLR start "ruleHeaders"
    // InternalDsl.g:343:1: ruleHeaders returns [EObject current=null] : ( ( (lv_headers_0_0= ruleHeader ) ) (otherlv_1= ',' ( (lv_headers_2_0= ruleHeader ) ) )* ) ;
    public final EObject ruleHeaders() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_headers_0_0 = null;

        EObject lv_headers_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:349:2: ( ( ( (lv_headers_0_0= ruleHeader ) ) (otherlv_1= ',' ( (lv_headers_2_0= ruleHeader ) ) )* ) )
            // InternalDsl.g:350:2: ( ( (lv_headers_0_0= ruleHeader ) ) (otherlv_1= ',' ( (lv_headers_2_0= ruleHeader ) ) )* )
            {
            // InternalDsl.g:350:2: ( ( (lv_headers_0_0= ruleHeader ) ) (otherlv_1= ',' ( (lv_headers_2_0= ruleHeader ) ) )* )
            // InternalDsl.g:351:3: ( (lv_headers_0_0= ruleHeader ) ) (otherlv_1= ',' ( (lv_headers_2_0= ruleHeader ) ) )*
            {
            // InternalDsl.g:351:3: ( (lv_headers_0_0= ruleHeader ) )
            // InternalDsl.g:352:4: (lv_headers_0_0= ruleHeader )
            {
            // InternalDsl.g:352:4: (lv_headers_0_0= ruleHeader )
            // InternalDsl.g:353:5: lv_headers_0_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_headers_0_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadersRule());
            					}
            					add(
            						current,
            						"headers",
            						lv_headers_0_0,
            						"x.mvmn.permock.dsl.Dsl.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:370:3: (otherlv_1= ',' ( (lv_headers_2_0= ruleHeader ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:371:4: otherlv_1= ',' ( (lv_headers_2_0= ruleHeader ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getHeadersAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalDsl.g:375:4: ( (lv_headers_2_0= ruleHeader ) )
            	    // InternalDsl.g:376:5: (lv_headers_2_0= ruleHeader )
            	    {
            	    // InternalDsl.g:376:5: (lv_headers_2_0= ruleHeader )
            	    // InternalDsl.g:377:6: lv_headers_2_0= ruleHeader
            	    {

            	    						newCompositeNode(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_headers_2_0=ruleHeader();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHeadersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"headers",
            	    							lv_headers_2_0,
            	    							"x.mvmn.permock.dsl.Dsl.Header");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleHeaders"


    // $ANTLR start "entryRuleHeader"
    // InternalDsl.g:399:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalDsl.g:399:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalDsl.g:400:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalDsl.g:406:1: ruleHeader returns [EObject current=null] : ( ( (lv_headerName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_headerValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_headerName_0_0=null;
        Token otherlv_1=null;
        Token lv_headerValue_2_0=null;


        	enterRule();

        try {
            // InternalDsl.g:412:2: ( ( ( (lv_headerName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_headerValue_2_0= RULE_STRING ) ) ) )
            // InternalDsl.g:413:2: ( ( (lv_headerName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_headerValue_2_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:413:2: ( ( (lv_headerName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_headerValue_2_0= RULE_STRING ) ) )
            // InternalDsl.g:414:3: ( (lv_headerName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_headerValue_2_0= RULE_STRING ) )
            {
            // InternalDsl.g:414:3: ( (lv_headerName_0_0= RULE_STRING ) )
            // InternalDsl.g:415:4: (lv_headerName_0_0= RULE_STRING )
            {
            // InternalDsl.g:415:4: (lv_headerName_0_0= RULE_STRING )
            // InternalDsl.g:416:5: lv_headerName_0_0= RULE_STRING
            {
            lv_headerName_0_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_headerName_0_0, grammarAccess.getHeaderAccess().getHeaderNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"headerName",
            						lv_headerName_0_0,
            						"x.mvmn.permock.dsl.Dsl.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
            		
            // InternalDsl.g:436:3: ( (lv_headerValue_2_0= RULE_STRING ) )
            // InternalDsl.g:437:4: (lv_headerValue_2_0= RULE_STRING )
            {
            // InternalDsl.g:437:4: (lv_headerValue_2_0= RULE_STRING )
            // InternalDsl.g:438:5: lv_headerValue_2_0= RULE_STRING
            {
            lv_headerValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_headerValue_2_0, grammarAccess.getHeaderAccess().getHeaderValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"headerValue",
            						lv_headerValue_2_0,
            						"x.mvmn.permock.dsl.Dsl.STRING");
            				

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleCondition"
    // InternalDsl.g:458:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDsl.g:458:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalDsl.g:459:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDsl.g:465:1: ruleCondition returns [EObject current=null] : this_OrCondition_0= ruleOrCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_OrCondition_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:471:2: (this_OrCondition_0= ruleOrCondition )
            // InternalDsl.g:472:2: this_OrCondition_0= ruleOrCondition
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrCondition_0=ruleOrCondition();

            state._fsp--;


            		current = this_OrCondition_0;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrCondition"
    // InternalDsl.g:483:1: entryRuleOrCondition returns [EObject current=null] : iv_ruleOrCondition= ruleOrCondition EOF ;
    public final EObject entryRuleOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCondition = null;


        try {
            // InternalDsl.g:483:52: (iv_ruleOrCondition= ruleOrCondition EOF )
            // InternalDsl.g:484:2: iv_ruleOrCondition= ruleOrCondition EOF
            {
             newCompositeNode(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrCondition=ruleOrCondition();

            state._fsp--;

             current =iv_ruleOrCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // InternalDsl.g:490:1: ruleOrCondition returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndCondition ) ) )* ) ;
    public final EObject ruleOrCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:496:2: ( (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndCondition ) ) )* ) )
            // InternalDsl.g:497:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            {
            // InternalDsl.g:497:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            // InternalDsl.g:498:3: this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndCondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_AndCondition_0=ruleAndCondition();

            state._fsp--;


            			current = this_AndCondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:506:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndCondition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:507:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndCondition ) )
            	    {
            	    // InternalDsl.g:507:4: ()
            	    // InternalDsl.g:508:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalDsl.g:518:4: ( (lv_right_3_0= ruleAndCondition ) )
            	    // InternalDsl.g:519:5: (lv_right_3_0= ruleAndCondition )
            	    {
            	    // InternalDsl.g:519:5: (lv_right_3_0= ruleAndCondition )
            	    // InternalDsl.g:520:6: lv_right_3_0= ruleAndCondition
            	    {

            	    						newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleAndCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"x.mvmn.permock.dsl.Dsl.AndCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // InternalDsl.g:542:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // InternalDsl.g:542:53: (iv_ruleAndCondition= ruleAndCondition EOF )
            // InternalDsl.g:543:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
             newCompositeNode(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;

             current =iv_ruleAndCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalDsl.g:549:1: ruleAndCondition returns [EObject current=null] : (this_OptionalNegationCondition_0= ruleOptionalNegationCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleOptionalNegationCondition ) ) )* ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OptionalNegationCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:555:2: ( (this_OptionalNegationCondition_0= ruleOptionalNegationCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleOptionalNegationCondition ) ) )* ) )
            // InternalDsl.g:556:2: (this_OptionalNegationCondition_0= ruleOptionalNegationCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleOptionalNegationCondition ) ) )* )
            {
            // InternalDsl.g:556:2: (this_OptionalNegationCondition_0= ruleOptionalNegationCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleOptionalNegationCondition ) ) )* )
            // InternalDsl.g:557:3: this_OptionalNegationCondition_0= ruleOptionalNegationCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleOptionalNegationCondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndConditionAccess().getOptionalNegationConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_OptionalNegationCondition_0=ruleOptionalNegationCondition();

            state._fsp--;


            			current = this_OptionalNegationCondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:565:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleOptionalNegationCondition ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:566:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleOptionalNegationCondition ) )
            	    {
            	    // InternalDsl.g:566:4: ()
            	    // InternalDsl.g:567:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getAndKeyword_1_1());
            	    			
            	    // InternalDsl.g:577:4: ( (lv_right_3_0= ruleOptionalNegationCondition ) )
            	    // InternalDsl.g:578:5: (lv_right_3_0= ruleOptionalNegationCondition )
            	    {
            	    // InternalDsl.g:578:5: (lv_right_3_0= ruleOptionalNegationCondition )
            	    // InternalDsl.g:579:6: lv_right_3_0= ruleOptionalNegationCondition
            	    {

            	    						newCompositeNode(grammarAccess.getAndConditionAccess().getRightOptionalNegationConditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=ruleOptionalNegationCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"x.mvmn.permock.dsl.Dsl.OptionalNegationCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleOptionalNegationCondition"
    // InternalDsl.g:601:1: entryRuleOptionalNegationCondition returns [EObject current=null] : iv_ruleOptionalNegationCondition= ruleOptionalNegationCondition EOF ;
    public final EObject entryRuleOptionalNegationCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalNegationCondition = null;


        try {
            // InternalDsl.g:601:66: (iv_ruleOptionalNegationCondition= ruleOptionalNegationCondition EOF )
            // InternalDsl.g:602:2: iv_ruleOptionalNegationCondition= ruleOptionalNegationCondition EOF
            {
             newCompositeNode(grammarAccess.getOptionalNegationConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalNegationCondition=ruleOptionalNegationCondition();

            state._fsp--;

             current =iv_ruleOptionalNegationCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptionalNegationCondition"


    // $ANTLR start "ruleOptionalNegationCondition"
    // InternalDsl.g:608:1: ruleOptionalNegationCondition returns [EObject current=null] : (this_BracketedCondition_0= ruleBracketedCondition | ( () otherlv_2= 'not' ( (lv_negated_3_0= ruleBracketedCondition ) ) ) ) ;
    public final EObject ruleOptionalNegationCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BracketedCondition_0 = null;

        EObject lv_negated_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:614:2: ( (this_BracketedCondition_0= ruleBracketedCondition | ( () otherlv_2= 'not' ( (lv_negated_3_0= ruleBracketedCondition ) ) ) ) )
            // InternalDsl.g:615:2: (this_BracketedCondition_0= ruleBracketedCondition | ( () otherlv_2= 'not' ( (lv_negated_3_0= ruleBracketedCondition ) ) ) )
            {
            // InternalDsl.g:615:2: (this_BracketedCondition_0= ruleBracketedCondition | ( () otherlv_2= 'not' ( (lv_negated_3_0= ruleBracketedCondition ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_BOOLEAN)||LA7_0==25||LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:616:3: this_BracketedCondition_0= ruleBracketedCondition
                    {

                    			newCompositeNode(grammarAccess.getOptionalNegationConditionAccess().getBracketedConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BracketedCondition_0=ruleBracketedCondition();

                    state._fsp--;


                    			current = this_BracketedCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:625:3: ( () otherlv_2= 'not' ( (lv_negated_3_0= ruleBracketedCondition ) ) )
                    {
                    // InternalDsl.g:625:3: ( () otherlv_2= 'not' ( (lv_negated_3_0= ruleBracketedCondition ) ) )
                    // InternalDsl.g:626:4: () otherlv_2= 'not' ( (lv_negated_3_0= ruleBracketedCondition ) )
                    {
                    // InternalDsl.g:626:4: ()
                    // InternalDsl.g:627:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOptionalNegationConditionAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getOptionalNegationConditionAccess().getNotKeyword_1_1());
                    			
                    // InternalDsl.g:637:4: ( (lv_negated_3_0= ruleBracketedCondition ) )
                    // InternalDsl.g:638:5: (lv_negated_3_0= ruleBracketedCondition )
                    {
                    // InternalDsl.g:638:5: (lv_negated_3_0= ruleBracketedCondition )
                    // InternalDsl.g:639:6: lv_negated_3_0= ruleBracketedCondition
                    {

                    						newCompositeNode(grammarAccess.getOptionalNegationConditionAccess().getNegatedBracketedConditionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_negated_3_0=ruleBracketedCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionalNegationConditionRule());
                    						}
                    						set(
                    							current,
                    							"negated",
                    							lv_negated_3_0,
                    							"x.mvmn.permock.dsl.Dsl.BracketedCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleOptionalNegationCondition"


    // $ANTLR start "entryRuleBracketedCondition"
    // InternalDsl.g:661:1: entryRuleBracketedCondition returns [EObject current=null] : iv_ruleBracketedCondition= ruleBracketedCondition EOF ;
    public final EObject entryRuleBracketedCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketedCondition = null;


        try {
            // InternalDsl.g:661:59: (iv_ruleBracketedCondition= ruleBracketedCondition EOF )
            // InternalDsl.g:662:2: iv_ruleBracketedCondition= ruleBracketedCondition EOF
            {
             newCompositeNode(grammarAccess.getBracketedConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBracketedCondition=ruleBracketedCondition();

            state._fsp--;

             current =iv_ruleBracketedCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBracketedCondition"


    // $ANTLR start "ruleBracketedCondition"
    // InternalDsl.g:668:1: ruleBracketedCondition returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleBracketedCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_0_0 = null;

        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:674:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ) )
            // InternalDsl.g:675:2: ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) )
            {
            // InternalDsl.g:675:2: ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_BOOLEAN)||LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:676:3: ( (lv_expression_0_0= ruleExpression ) )
                    {
                    // InternalDsl.g:676:3: ( (lv_expression_0_0= ruleExpression ) )
                    // InternalDsl.g:677:4: (lv_expression_0_0= ruleExpression )
                    {
                    // InternalDsl.g:677:4: (lv_expression_0_0= ruleExpression )
                    // InternalDsl.g:678:5: lv_expression_0_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getBracketedConditionAccess().getExpressionExpressionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_0_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBracketedConditionRule());
                    					}
                    					set(
                    						current,
                    						"expression",
                    						lv_expression_0_0,
                    						"x.mvmn.permock.dsl.Dsl.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:696:3: (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' )
                    {
                    // InternalDsl.g:696:3: (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' )
                    // InternalDsl.g:697:4: otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBracketedConditionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDsl.g:701:4: ( (lv_condition_2_0= ruleCondition ) )
                    // InternalDsl.g:702:5: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalDsl.g:702:5: (lv_condition_2_0= ruleCondition )
                    // InternalDsl.g:703:6: lv_condition_2_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getBracketedConditionAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBracketedConditionRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"x.mvmn.permock.dsl.Dsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getBracketedConditionAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleBracketedCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalDsl.g:729:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDsl.g:729:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDsl.g:730:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDsl.g:736:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleOperand ) ) ( ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleOperand ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:742:2: ( ( ( (lv_left_0_0= ruleOperand ) ) ( ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleOperand ) ) )? ) )
            // InternalDsl.g:743:2: ( ( (lv_left_0_0= ruleOperand ) ) ( ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleOperand ) ) )? )
            {
            // InternalDsl.g:743:2: ( ( (lv_left_0_0= ruleOperand ) ) ( ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleOperand ) ) )? )
            // InternalDsl.g:744:3: ( (lv_left_0_0= ruleOperand ) ) ( ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleOperand ) ) )?
            {
            // InternalDsl.g:744:3: ( (lv_left_0_0= ruleOperand ) )
            // InternalDsl.g:745:4: (lv_left_0_0= ruleOperand )
            {
            // InternalDsl.g:745:4: (lv_left_0_0= ruleOperand )
            // InternalDsl.g:746:5: lv_left_0_0= ruleOperand
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftOperandParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_left_0_0=ruleOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"x.mvmn.permock.dsl.Dsl.Operand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:763:3: ( ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleOperand ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=33 && LA9_0<=39)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:764:4: ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleOperand ) )
                    {
                    // InternalDsl.g:764:4: ( (lv_op_1_0= ruleOperator ) )
                    // InternalDsl.g:765:5: (lv_op_1_0= ruleOperator )
                    {
                    // InternalDsl.g:765:5: (lv_op_1_0= ruleOperator )
                    // InternalDsl.g:766:6: lv_op_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_op_1_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"x.mvmn.permock.dsl.Dsl.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:783:4: ( (lv_right_2_0= ruleOperand ) )
                    // InternalDsl.g:784:5: (lv_right_2_0= ruleOperand )
                    {
                    // InternalDsl.g:784:5: (lv_right_2_0= ruleOperand )
                    // InternalDsl.g:785:6: lv_right_2_0= ruleOperand
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRightOperandParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleOperand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"x.mvmn.permock.dsl.Dsl.Operand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalDsl.g:807:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalDsl.g:807:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalDsl.g:808:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalDsl.g:814:1: ruleOperand returns [EObject current=null] : ( ( (lv_ref_0_0= ruleReference ) ) | ( (lv_const_1_0= ruleConstant ) ) | ( (lv_listElementRef_2_0= ruleListElementReference ) ) ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;

        EObject lv_const_1_0 = null;

        EObject lv_listElementRef_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:820:2: ( ( ( (lv_ref_0_0= ruleReference ) ) | ( (lv_const_1_0= ruleConstant ) ) | ( (lv_listElementRef_2_0= ruleListElementReference ) ) ) )
            // InternalDsl.g:821:2: ( ( (lv_ref_0_0= ruleReference ) ) | ( (lv_const_1_0= ruleConstant ) ) | ( (lv_listElementRef_2_0= ruleListElementReference ) ) )
            {
            // InternalDsl.g:821:2: ( ( (lv_ref_0_0= ruleReference ) ) | ( (lv_const_1_0= ruleConstant ) ) | ( (lv_listElementRef_2_0= ruleListElementReference ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
            case RULE_INTEGER:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDsl.g:822:3: ( (lv_ref_0_0= ruleReference ) )
                    {
                    // InternalDsl.g:822:3: ( (lv_ref_0_0= ruleReference ) )
                    // InternalDsl.g:823:4: (lv_ref_0_0= ruleReference )
                    {
                    // InternalDsl.g:823:4: (lv_ref_0_0= ruleReference )
                    // InternalDsl.g:824:5: lv_ref_0_0= ruleReference
                    {

                    					newCompositeNode(grammarAccess.getOperandAccess().getRefReferenceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ref_0_0=ruleReference();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperandRule());
                    					}
                    					set(
                    						current,
                    						"ref",
                    						lv_ref_0_0,
                    						"x.mvmn.permock.dsl.Dsl.Reference");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:842:3: ( (lv_const_1_0= ruleConstant ) )
                    {
                    // InternalDsl.g:842:3: ( (lv_const_1_0= ruleConstant ) )
                    // InternalDsl.g:843:4: (lv_const_1_0= ruleConstant )
                    {
                    // InternalDsl.g:843:4: (lv_const_1_0= ruleConstant )
                    // InternalDsl.g:844:5: lv_const_1_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getOperandAccess().getConstConstantParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_const_1_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperandRule());
                    					}
                    					set(
                    						current,
                    						"const",
                    						lv_const_1_0,
                    						"x.mvmn.permock.dsl.Dsl.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:862:3: ( (lv_listElementRef_2_0= ruleListElementReference ) )
                    {
                    // InternalDsl.g:862:3: ( (lv_listElementRef_2_0= ruleListElementReference ) )
                    // InternalDsl.g:863:4: (lv_listElementRef_2_0= ruleListElementReference )
                    {
                    // InternalDsl.g:863:4: (lv_listElementRef_2_0= ruleListElementReference )
                    // InternalDsl.g:864:5: lv_listElementRef_2_0= ruleListElementReference
                    {

                    					newCompositeNode(grammarAccess.getOperandAccess().getListElementRefListElementReferenceParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_listElementRef_2_0=ruleListElementReference();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperandRule());
                    					}
                    					set(
                    						current,
                    						"listElementRef",
                    						lv_listElementRef_2_0,
                    						"x.mvmn.permock.dsl.Dsl.ListElementReference");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleListFunction"
    // InternalDsl.g:885:1: entryRuleListFunction returns [EObject current=null] : iv_ruleListFunction= ruleListFunction EOF ;
    public final EObject entryRuleListFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListFunction = null;


        try {
            // InternalDsl.g:885:53: (iv_ruleListFunction= ruleListFunction EOF )
            // InternalDsl.g:886:2: iv_ruleListFunction= ruleListFunction EOF
            {
             newCompositeNode(grammarAccess.getListFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListFunction=ruleListFunction();

            state._fsp--;

             current =iv_ruleListFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListFunction"


    // $ANTLR start "ruleListFunction"
    // InternalDsl.g:892:1: ruleListFunction returns [EObject current=null] : (otherlv_0= '{' ( (lv_op_1_0= ruleListOperation ) ) ( (lv_alias_2_0= ruleListElementAlias ) ) ( (lv_separator_3_0= ':' ) ) ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= '}' ) ;
    public final EObject ruleListFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_separator_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_op_1_0 = null;

        EObject lv_alias_2_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:898:2: ( (otherlv_0= '{' ( (lv_op_1_0= ruleListOperation ) ) ( (lv_alias_2_0= ruleListElementAlias ) ) ( (lv_separator_3_0= ':' ) ) ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= '}' ) )
            // InternalDsl.g:899:2: (otherlv_0= '{' ( (lv_op_1_0= ruleListOperation ) ) ( (lv_alias_2_0= ruleListElementAlias ) ) ( (lv_separator_3_0= ':' ) ) ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:899:2: (otherlv_0= '{' ( (lv_op_1_0= ruleListOperation ) ) ( (lv_alias_2_0= ruleListElementAlias ) ) ( (lv_separator_3_0= ':' ) ) ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= '}' )
            // InternalDsl.g:900:3: otherlv_0= '{' ( (lv_op_1_0= ruleListOperation ) ) ( (lv_alias_2_0= ruleListElementAlias ) ) ( (lv_separator_3_0= ':' ) ) ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDsl.g:904:3: ( (lv_op_1_0= ruleListOperation ) )
            // InternalDsl.g:905:4: (lv_op_1_0= ruleListOperation )
            {
            // InternalDsl.g:905:4: (lv_op_1_0= ruleListOperation )
            // InternalDsl.g:906:5: lv_op_1_0= ruleListOperation
            {

            					newCompositeNode(grammarAccess.getListFunctionAccess().getOpListOperationEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_op_1_0=ruleListOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListFunctionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"x.mvmn.permock.dsl.Dsl.ListOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:923:3: ( (lv_alias_2_0= ruleListElementAlias ) )
            // InternalDsl.g:924:4: (lv_alias_2_0= ruleListElementAlias )
            {
            // InternalDsl.g:924:4: (lv_alias_2_0= ruleListElementAlias )
            // InternalDsl.g:925:5: lv_alias_2_0= ruleListElementAlias
            {

            					newCompositeNode(grammarAccess.getListFunctionAccess().getAliasListElementAliasParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_alias_2_0=ruleListElementAlias();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListFunctionRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_2_0,
            						"x.mvmn.permock.dsl.Dsl.ListElementAlias");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:942:3: ( (lv_separator_3_0= ':' ) )
            // InternalDsl.g:943:4: (lv_separator_3_0= ':' )
            {
            // InternalDsl.g:943:4: (lv_separator_3_0= ':' )
            // InternalDsl.g:944:5: lv_separator_3_0= ':'
            {
            lv_separator_3_0=(Token)match(input,21,FOLLOW_3); 

            					newLeafNode(lv_separator_3_0, grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListFunctionRule());
            					}
            					setWithLastConsumed(current, "separator", lv_separator_3_0, ":");
            				

            }


            }

            // InternalDsl.g:956:3: ( (lv_condition_4_0= ruleCondition ) )
            // InternalDsl.g:957:4: (lv_condition_4_0= ruleCondition )
            {
            // InternalDsl.g:957:4: (lv_condition_4_0= ruleCondition )
            // InternalDsl.g:958:5: lv_condition_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getListFunctionAccess().getConditionConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_condition_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListFunctionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"x.mvmn.permock.dsl.Dsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getListFunctionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleListFunction"


    // $ANTLR start "entryRuleListElementAlias"
    // InternalDsl.g:983:1: entryRuleListElementAlias returns [EObject current=null] : iv_ruleListElementAlias= ruleListElementAlias EOF ;
    public final EObject entryRuleListElementAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElementAlias = null;


        try {
            // InternalDsl.g:983:57: (iv_ruleListElementAlias= ruleListElementAlias EOF )
            // InternalDsl.g:984:2: iv_ruleListElementAlias= ruleListElementAlias EOF
            {
             newCompositeNode(grammarAccess.getListElementAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListElementAlias=ruleListElementAlias();

            state._fsp--;

             current =iv_ruleListElementAlias; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListElementAlias"


    // $ANTLR start "ruleListElementAlias"
    // InternalDsl.g:990:1: ruleListElementAlias returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleListElementAlias() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:996:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:997:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:997:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:998:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:998:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:999:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getListElementAliasAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getListElementAliasRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"x.mvmn.permock.dsl.Dsl.ID");
            			

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
    // $ANTLR end "ruleListElementAlias"


    // $ANTLR start "entryRuleReference"
    // InternalDsl.g:1018:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:1020:2: (iv_ruleReference= ruleReference EOF )
            // InternalDsl.g:1021:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDsl.g:1030:1: ruleReference returns [EObject current=null] : ( ( (lv_name_0_0= ruleEntity ) ) ( (lv_prop_1_0= rulePropertyRef ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_prop_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:1037:2: ( ( ( (lv_name_0_0= ruleEntity ) ) ( (lv_prop_1_0= rulePropertyRef ) )? ) )
            // InternalDsl.g:1038:2: ( ( (lv_name_0_0= ruleEntity ) ) ( (lv_prop_1_0= rulePropertyRef ) )? )
            {
            // InternalDsl.g:1038:2: ( ( (lv_name_0_0= ruleEntity ) ) ( (lv_prop_1_0= rulePropertyRef ) )? )
            // InternalDsl.g:1039:3: ( (lv_name_0_0= ruleEntity ) ) ( (lv_prop_1_0= rulePropertyRef ) )?
            {
            // InternalDsl.g:1039:3: ( (lv_name_0_0= ruleEntity ) )
            // InternalDsl.g:1040:4: (lv_name_0_0= ruleEntity )
            {
            // InternalDsl.g:1040:4: (lv_name_0_0= ruleEntity )
            // InternalDsl.g:1041:5: lv_name_0_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEntityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_0_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"x.mvmn.permock.dsl.Dsl.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1058:3: ( (lv_prop_1_0= rulePropertyRef ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27||LA11_0==30||LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1059:4: (lv_prop_1_0= rulePropertyRef )
                    {
                    // InternalDsl.g:1059:4: (lv_prop_1_0= rulePropertyRef )
                    // InternalDsl.g:1060:5: lv_prop_1_0= rulePropertyRef
                    {

                    					newCompositeNode(grammarAccess.getReferenceAccess().getPropPropertyRefParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_prop_1_0=rulePropertyRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReferenceRule());
                    					}
                    					set(
                    						current,
                    						"prop",
                    						lv_prop_1_0,
                    						"x.mvmn.permock.dsl.Dsl.PropertyRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleListElementReference"
    // InternalDsl.g:1084:1: entryRuleListElementReference returns [EObject current=null] : iv_ruleListElementReference= ruleListElementReference EOF ;
    public final EObject entryRuleListElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElementReference = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:1086:2: (iv_ruleListElementReference= ruleListElementReference EOF )
            // InternalDsl.g:1087:2: iv_ruleListElementReference= ruleListElementReference EOF
            {
             newCompositeNode(grammarAccess.getListElementReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListElementReference=ruleListElementReference();

            state._fsp--;

             current =iv_ruleListElementReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleListElementReference"


    // $ANTLR start "ruleListElementReference"
    // InternalDsl.g:1096:1: ruleListElementReference returns [EObject current=null] : (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ( (lv_prop_2_0= rulePropertyRef ) )? ) ;
    public final EObject ruleListElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_prop_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:1103:2: ( (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ( (lv_prop_2_0= rulePropertyRef ) )? ) )
            // InternalDsl.g:1104:2: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ( (lv_prop_2_0= rulePropertyRef ) )? )
            {
            // InternalDsl.g:1104:2: (otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ( (lv_prop_2_0= rulePropertyRef ) )? )
            // InternalDsl.g:1105:3: otherlv_0= '$' ( (otherlv_1= RULE_ID ) ) ( (lv_prop_2_0= rulePropertyRef ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getListElementReferenceAccess().getDollarSignKeyword_0());
            		
            // InternalDsl.g:1109:3: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:1110:4: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:1110:4: (otherlv_1= RULE_ID )
            // InternalDsl.g:1111:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListElementReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getListElementReferenceAccess().getNameListElementAliasCrossReference_1_0());
            				

            }


            }

            // InternalDsl.g:1122:3: ( (lv_prop_2_0= rulePropertyRef ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27||LA12_0==30||LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1123:4: (lv_prop_2_0= rulePropertyRef )
                    {
                    // InternalDsl.g:1123:4: (lv_prop_2_0= rulePropertyRef )
                    // InternalDsl.g:1124:5: lv_prop_2_0= rulePropertyRef
                    {

                    					newCompositeNode(grammarAccess.getListElementReferenceAccess().getPropPropertyRefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_prop_2_0=rulePropertyRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListElementReferenceRule());
                    					}
                    					set(
                    						current,
                    						"prop",
                    						lv_prop_2_0,
                    						"x.mvmn.permock.dsl.Dsl.PropertyRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleListElementReference"


    // $ANTLR start "entryRuleCollectionAccess"
    // InternalDsl.g:1148:1: entryRuleCollectionAccess returns [EObject current=null] : iv_ruleCollectionAccess= ruleCollectionAccess EOF ;
    public final EObject entryRuleCollectionAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionAccess = null;


        try {
            // InternalDsl.g:1148:57: (iv_ruleCollectionAccess= ruleCollectionAccess EOF )
            // InternalDsl.g:1149:2: iv_ruleCollectionAccess= ruleCollectionAccess EOF
            {
             newCompositeNode(grammarAccess.getCollectionAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionAccess=ruleCollectionAccess();

            state._fsp--;

             current =iv_ruleCollectionAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCollectionAccess"


    // $ANTLR start "ruleCollectionAccess"
    // InternalDsl.g:1155:1: ruleCollectionAccess returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_key_1_0= RULE_STRING ) ) | ( (lv_index_2_0= RULE_INTEGER ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleCollectionAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1161:2: ( (otherlv_0= '[' ( ( (lv_key_1_0= RULE_STRING ) ) | ( (lv_index_2_0= RULE_INTEGER ) ) ) otherlv_3= ']' ) )
            // InternalDsl.g:1162:2: (otherlv_0= '[' ( ( (lv_key_1_0= RULE_STRING ) ) | ( (lv_index_2_0= RULE_INTEGER ) ) ) otherlv_3= ']' )
            {
            // InternalDsl.g:1162:2: (otherlv_0= '[' ( ( (lv_key_1_0= RULE_STRING ) ) | ( (lv_index_2_0= RULE_INTEGER ) ) ) otherlv_3= ']' )
            // InternalDsl.g:1163:3: otherlv_0= '[' ( ( (lv_key_1_0= RULE_STRING ) ) | ( (lv_index_2_0= RULE_INTEGER ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionAccessAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDsl.g:1167:3: ( ( (lv_key_1_0= RULE_STRING ) ) | ( (lv_index_2_0= RULE_INTEGER ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INTEGER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1168:4: ( (lv_key_1_0= RULE_STRING ) )
                    {
                    // InternalDsl.g:1168:4: ( (lv_key_1_0= RULE_STRING ) )
                    // InternalDsl.g:1169:5: (lv_key_1_0= RULE_STRING )
                    {
                    // InternalDsl.g:1169:5: (lv_key_1_0= RULE_STRING )
                    // InternalDsl.g:1170:6: lv_key_1_0= RULE_STRING
                    {
                    lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_key_1_0, grammarAccess.getCollectionAccessAccess().getKeySTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionAccessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_1_0,
                    							"x.mvmn.permock.dsl.Dsl.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1187:4: ( (lv_index_2_0= RULE_INTEGER ) )
                    {
                    // InternalDsl.g:1187:4: ( (lv_index_2_0= RULE_INTEGER ) )
                    // InternalDsl.g:1188:5: (lv_index_2_0= RULE_INTEGER )
                    {
                    // InternalDsl.g:1188:5: (lv_index_2_0= RULE_INTEGER )
                    // InternalDsl.g:1189:6: lv_index_2_0= RULE_INTEGER
                    {
                    lv_index_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_25); 

                    						newLeafNode(lv_index_2_0, grammarAccess.getCollectionAccessAccess().getIndexINTEGERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionAccessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"x.mvmn.permock.dsl.Dsl.INTEGER");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionAccessAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleCollectionAccess"


    // $ANTLR start "entryRulePropertyAccess"
    // InternalDsl.g:1214:1: entryRulePropertyAccess returns [EObject current=null] : iv_rulePropertyAccess= rulePropertyAccess EOF ;
    public final EObject entryRulePropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAccess = null;


        try {
            // InternalDsl.g:1214:55: (iv_rulePropertyAccess= rulePropertyAccess EOF )
            // InternalDsl.g:1215:2: iv_rulePropertyAccess= rulePropertyAccess EOF
            {
             newCompositeNode(grammarAccess.getPropertyAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyAccess=rulePropertyAccess();

            state._fsp--;

             current =iv_rulePropertyAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyAccess"


    // $ANTLR start "rulePropertyAccess"
    // InternalDsl.g:1221:1: rulePropertyAccess returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePropertyAccess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1227:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:1228:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:1228:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1229:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1229:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1230:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccessAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPropertyAccessRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"x.mvmn.permock.dsl.Dsl.ID");
            			

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
    // $ANTLR end "rulePropertyAccess"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalDsl.g:1249:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalDsl.g:1249:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalDsl.g:1250:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalDsl.g:1256:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_functionParameters_2_0= ruleOperand ) )? (otherlv_3= ',' ( (lv_functionParameters_4_0= ruleOperand ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_functionParameters_2_0 = null;

        EObject lv_functionParameters_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1262:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_functionParameters_2_0= ruleOperand ) )? (otherlv_3= ',' ( (lv_functionParameters_4_0= ruleOperand ) ) )* otherlv_5= ')' ) )
            // InternalDsl.g:1263:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_functionParameters_2_0= ruleOperand ) )? (otherlv_3= ',' ( (lv_functionParameters_4_0= ruleOperand ) ) )* otherlv_5= ')' )
            {
            // InternalDsl.g:1263:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_functionParameters_2_0= ruleOperand ) )? (otherlv_3= ',' ( (lv_functionParameters_4_0= ruleOperand ) ) )* otherlv_5= ')' )
            // InternalDsl.g:1264:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_functionParameters_2_0= ruleOperand ) )? (otherlv_3= ',' ( (lv_functionParameters_4_0= ruleOperand ) ) )* otherlv_5= ')'
            {
            // InternalDsl.g:1264:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1265:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1265:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1266:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"x.mvmn.permock.dsl.Dsl.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:1286:3: ( (lv_functionParameters_2_0= ruleOperand ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_BOOLEAN)||LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1287:4: (lv_functionParameters_2_0= ruleOperand )
                    {
                    // InternalDsl.g:1287:4: (lv_functionParameters_2_0= ruleOperand )
                    // InternalDsl.g:1288:5: lv_functionParameters_2_0= ruleOperand
                    {

                    					newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionParametersOperandParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_functionParameters_2_0=ruleOperand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    					}
                    					add(
                    						current,
                    						"functionParameters",
                    						lv_functionParameters_2_0,
                    						"x.mvmn.permock.dsl.Dsl.Operand");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1305:3: (otherlv_3= ',' ( (lv_functionParameters_4_0= ruleOperand ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1306:4: otherlv_3= ',' ( (lv_functionParameters_4_0= ruleOperand ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:1310:4: ( (lv_functionParameters_4_0= ruleOperand ) )
            	    // InternalDsl.g:1311:5: (lv_functionParameters_4_0= ruleOperand )
            	    {
            	    // InternalDsl.g:1311:5: (lv_functionParameters_4_0= ruleOperand )
            	    // InternalDsl.g:1312:6: lv_functionParameters_4_0= ruleOperand
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionParametersOperandParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_functionParameters_4_0=ruleOperand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"functionParameters",
            	    							lv_functionParameters_4_0,
            	    							"x.mvmn.permock.dsl.Dsl.Operand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePropertyRef"
    // InternalDsl.g:1338:1: entryRulePropertyRef returns [EObject current=null] : iv_rulePropertyRef= rulePropertyRef EOF ;
    public final EObject entryRulePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRef = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:1340:2: (iv_rulePropertyRef= rulePropertyRef EOF )
            // InternalDsl.g:1341:2: iv_rulePropertyRef= rulePropertyRef EOF
            {
             newCompositeNode(grammarAccess.getPropertyRefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyRef=rulePropertyRef();

            state._fsp--;

             current =iv_rulePropertyRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePropertyRef"


    // $ANTLR start "rulePropertyRef"
    // InternalDsl.g:1350:1: rulePropertyRef returns [EObject current=null] : ( ( (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) ) | (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) ) | ( (lv_collectionAccess_4_0= ruleCollectionAccess ) ) | ( (lv_listFunc_5_0= ruleListFunction ) ) ) ( (lv_subPropery_6_0= rulePropertyRef ) )? ) ;
    public final EObject rulePropertyRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_propAccess_1_0 = null;

        EObject lv_functionCall_3_0 = null;

        EObject lv_collectionAccess_4_0 = null;

        EObject lv_listFunc_5_0 = null;

        EObject lv_subPropery_6_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:1357:2: ( ( ( (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) ) | (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) ) | ( (lv_collectionAccess_4_0= ruleCollectionAccess ) ) | ( (lv_listFunc_5_0= ruleListFunction ) ) ) ( (lv_subPropery_6_0= rulePropertyRef ) )? ) )
            // InternalDsl.g:1358:2: ( ( (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) ) | (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) ) | ( (lv_collectionAccess_4_0= ruleCollectionAccess ) ) | ( (lv_listFunc_5_0= ruleListFunction ) ) ) ( (lv_subPropery_6_0= rulePropertyRef ) )? )
            {
            // InternalDsl.g:1358:2: ( ( (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) ) | (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) ) | ( (lv_collectionAccess_4_0= ruleCollectionAccess ) ) | ( (lv_listFunc_5_0= ruleListFunction ) ) ) ( (lv_subPropery_6_0= rulePropertyRef ) )? )
            // InternalDsl.g:1359:3: ( (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) ) | (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) ) | ( (lv_collectionAccess_4_0= ruleCollectionAccess ) ) | ( (lv_listFunc_5_0= ruleListFunction ) ) ) ( (lv_subPropery_6_0= rulePropertyRef ) )?
            {
            // InternalDsl.g:1359:3: ( (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) ) | (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) ) | ( (lv_collectionAccess_4_0= ruleCollectionAccess ) ) | ( (lv_listFunc_5_0= ruleListFunction ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    int LA16_4 = input.LA(3);

                    if ( (LA16_4==EOF||(LA16_4>=13 && LA16_4<=14)||LA16_4==20||(LA16_4>=22 && LA16_4<=23)||(LA16_4>=26 && LA16_4<=28)||LA16_4==30||(LA16_4>=32 && LA16_4<=39)) ) {
                        alt16=1;
                    }
                    else if ( (LA16_4==25) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case 27:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1360:4: (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) )
                    {
                    // InternalDsl.g:1360:4: (otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) ) )
                    // InternalDsl.g:1361:5: otherlv_0= '.' ( (lv_propAccess_1_0= rulePropertyAccess ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_21); 

                    					newLeafNode(otherlv_0, grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_0_0());
                    				
                    // InternalDsl.g:1365:5: ( (lv_propAccess_1_0= rulePropertyAccess ) )
                    // InternalDsl.g:1366:6: (lv_propAccess_1_0= rulePropertyAccess )
                    {
                    // InternalDsl.g:1366:6: (lv_propAccess_1_0= rulePropertyAccess )
                    // InternalDsl.g:1367:7: lv_propAccess_1_0= rulePropertyAccess
                    {

                    							newCompositeNode(grammarAccess.getPropertyRefAccess().getPropAccessPropertyAccessParserRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_propAccess_1_0=rulePropertyAccess();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPropertyRefRule());
                    							}
                    							set(
                    								current,
                    								"propAccess",
                    								lv_propAccess_1_0,
                    								"x.mvmn.permock.dsl.Dsl.PropertyAccess");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1386:4: (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) )
                    {
                    // InternalDsl.g:1386:4: (otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) ) )
                    // InternalDsl.g:1387:5: otherlv_2= '.' ( (lv_functionCall_3_0= ruleFunctionCall ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_21); 

                    					newLeafNode(otherlv_2, grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_1_0());
                    				
                    // InternalDsl.g:1391:5: ( (lv_functionCall_3_0= ruleFunctionCall ) )
                    // InternalDsl.g:1392:6: (lv_functionCall_3_0= ruleFunctionCall )
                    {
                    // InternalDsl.g:1392:6: (lv_functionCall_3_0= ruleFunctionCall )
                    // InternalDsl.g:1393:7: lv_functionCall_3_0= ruleFunctionCall
                    {

                    							newCompositeNode(grammarAccess.getPropertyRefAccess().getFunctionCallFunctionCallParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_functionCall_3_0=ruleFunctionCall();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPropertyRefRule());
                    							}
                    							set(
                    								current,
                    								"functionCall",
                    								lv_functionCall_3_0,
                    								"x.mvmn.permock.dsl.Dsl.FunctionCall");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1412:4: ( (lv_collectionAccess_4_0= ruleCollectionAccess ) )
                    {
                    // InternalDsl.g:1412:4: ( (lv_collectionAccess_4_0= ruleCollectionAccess ) )
                    // InternalDsl.g:1413:5: (lv_collectionAccess_4_0= ruleCollectionAccess )
                    {
                    // InternalDsl.g:1413:5: (lv_collectionAccess_4_0= ruleCollectionAccess )
                    // InternalDsl.g:1414:6: lv_collectionAccess_4_0= ruleCollectionAccess
                    {

                    						newCompositeNode(grammarAccess.getPropertyRefAccess().getCollectionAccessCollectionAccessParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_collectionAccess_4_0=ruleCollectionAccess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRefRule());
                    						}
                    						set(
                    							current,
                    							"collectionAccess",
                    							lv_collectionAccess_4_0,
                    							"x.mvmn.permock.dsl.Dsl.CollectionAccess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1432:4: ( (lv_listFunc_5_0= ruleListFunction ) )
                    {
                    // InternalDsl.g:1432:4: ( (lv_listFunc_5_0= ruleListFunction ) )
                    // InternalDsl.g:1433:5: (lv_listFunc_5_0= ruleListFunction )
                    {
                    // InternalDsl.g:1433:5: (lv_listFunc_5_0= ruleListFunction )
                    // InternalDsl.g:1434:6: lv_listFunc_5_0= ruleListFunction
                    {

                    						newCompositeNode(grammarAccess.getPropertyRefAccess().getListFuncListFunctionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_listFunc_5_0=ruleListFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRefRule());
                    						}
                    						set(
                    							current,
                    							"listFunc",
                    							lv_listFunc_5_0,
                    							"x.mvmn.permock.dsl.Dsl.ListFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1452:3: ( (lv_subPropery_6_0= rulePropertyRef ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27||LA17_0==30||LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1453:4: (lv_subPropery_6_0= rulePropertyRef )
                    {
                    // InternalDsl.g:1453:4: (lv_subPropery_6_0= rulePropertyRef )
                    // InternalDsl.g:1454:5: lv_subPropery_6_0= rulePropertyRef
                    {

                    					newCompositeNode(grammarAccess.getPropertyRefAccess().getSubProperyPropertyRefParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subPropery_6_0=rulePropertyRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRefRule());
                    					}
                    					set(
                    						current,
                    						"subPropery",
                    						lv_subPropery_6_0,
                    						"x.mvmn.permock.dsl.Dsl.PropertyRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePropertyRef"


    // $ANTLR start "entryRuleConstant"
    // InternalDsl.g:1478:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDsl.g:1478:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDsl.g:1479:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDsl.g:1485:1: ruleConstant returns [EObject current=null] : ( ( (lv_strVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INTEGER ) ) | ( (lv_floatVal_2_0= RULE_FLOAT ) ) | ( (lv_boolVal_3_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_strVal_0_0=null;
        Token lv_intVal_1_0=null;
        Token lv_floatVal_2_0=null;
        Token lv_boolVal_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1491:2: ( ( ( (lv_strVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INTEGER ) ) | ( (lv_floatVal_2_0= RULE_FLOAT ) ) | ( (lv_boolVal_3_0= RULE_BOOLEAN ) ) ) )
            // InternalDsl.g:1492:2: ( ( (lv_strVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INTEGER ) ) | ( (lv_floatVal_2_0= RULE_FLOAT ) ) | ( (lv_boolVal_3_0= RULE_BOOLEAN ) ) )
            {
            // InternalDsl.g:1492:2: ( ( (lv_strVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INTEGER ) ) | ( (lv_floatVal_2_0= RULE_FLOAT ) ) | ( (lv_boolVal_3_0= RULE_BOOLEAN ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case RULE_INTEGER:
                {
                alt18=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt18=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1493:3: ( (lv_strVal_0_0= RULE_STRING ) )
                    {
                    // InternalDsl.g:1493:3: ( (lv_strVal_0_0= RULE_STRING ) )
                    // InternalDsl.g:1494:4: (lv_strVal_0_0= RULE_STRING )
                    {
                    // InternalDsl.g:1494:4: (lv_strVal_0_0= RULE_STRING )
                    // InternalDsl.g:1495:5: lv_strVal_0_0= RULE_STRING
                    {
                    lv_strVal_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_strVal_0_0, grammarAccess.getConstantAccess().getStrValSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"strVal",
                    						lv_strVal_0_0,
                    						"x.mvmn.permock.dsl.Dsl.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1512:3: ( (lv_intVal_1_0= RULE_INTEGER ) )
                    {
                    // InternalDsl.g:1512:3: ( (lv_intVal_1_0= RULE_INTEGER ) )
                    // InternalDsl.g:1513:4: (lv_intVal_1_0= RULE_INTEGER )
                    {
                    // InternalDsl.g:1513:4: (lv_intVal_1_0= RULE_INTEGER )
                    // InternalDsl.g:1514:5: lv_intVal_1_0= RULE_INTEGER
                    {
                    lv_intVal_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    					newLeafNode(lv_intVal_1_0, grammarAccess.getConstantAccess().getIntValINTEGERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intVal",
                    						lv_intVal_1_0,
                    						"x.mvmn.permock.dsl.Dsl.INTEGER");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1531:3: ( (lv_floatVal_2_0= RULE_FLOAT ) )
                    {
                    // InternalDsl.g:1531:3: ( (lv_floatVal_2_0= RULE_FLOAT ) )
                    // InternalDsl.g:1532:4: (lv_floatVal_2_0= RULE_FLOAT )
                    {
                    // InternalDsl.g:1532:4: (lv_floatVal_2_0= RULE_FLOAT )
                    // InternalDsl.g:1533:5: lv_floatVal_2_0= RULE_FLOAT
                    {
                    lv_floatVal_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    					newLeafNode(lv_floatVal_2_0, grammarAccess.getConstantAccess().getFloatValFLOATTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"floatVal",
                    						lv_floatVal_2_0,
                    						"x.mvmn.permock.dsl.Dsl.FLOAT");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1550:3: ( (lv_boolVal_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalDsl.g:1550:3: ( (lv_boolVal_3_0= RULE_BOOLEAN ) )
                    // InternalDsl.g:1551:4: (lv_boolVal_3_0= RULE_BOOLEAN )
                    {
                    // InternalDsl.g:1551:4: (lv_boolVal_3_0= RULE_BOOLEAN )
                    // InternalDsl.g:1552:5: lv_boolVal_3_0= RULE_BOOLEAN
                    {
                    lv_boolVal_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_boolVal_3_0, grammarAccess.getConstantAccess().getBoolValBOOLEANTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"boolVal",
                    						lv_boolVal_3_0,
                    						"x.mvmn.permock.dsl.Dsl.BOOLEAN");
                    				

                    }


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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:1572:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDsl.g:1572:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDsl.g:1573:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:1579:1: ruleEntity returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1585:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:1586:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:1586:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1587:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1587:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1588:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"x.mvmn.permock.dsl.Dsl.ID");
            			

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "ruleOperator"
    // InternalDsl.g:1607:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalDsl.g:1613:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~=' ) ) )
            // InternalDsl.g:1614:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~=' ) )
            {
            // InternalDsl.g:1614:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~=' ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            case 37:
                {
                alt19=5;
                }
                break;
            case 38:
                {
                alt19=6;
                }
                break;
            case 39:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1615:3: (enumLiteral_0= '=' )
                    {
                    // InternalDsl.g:1615:3: (enumLiteral_0= '=' )
                    // InternalDsl.g:1616:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1623:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDsl.g:1623:3: (enumLiteral_1= '!=' )
                    // InternalDsl.g:1624:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1631:3: (enumLiteral_2= '>' )
                    {
                    // InternalDsl.g:1631:3: (enumLiteral_2= '>' )
                    // InternalDsl.g:1632:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1639:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDsl.g:1639:3: (enumLiteral_3= '>=' )
                    // InternalDsl.g:1640:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1647:3: (enumLiteral_4= '<' )
                    {
                    // InternalDsl.g:1647:3: (enumLiteral_4= '<' )
                    // InternalDsl.g:1648:4: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1655:3: (enumLiteral_5= '<=' )
                    {
                    // InternalDsl.g:1655:3: (enumLiteral_5= '<=' )
                    // InternalDsl.g:1656:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1663:3: (enumLiteral_6= '~=' )
                    {
                    // InternalDsl.g:1663:3: (enumLiteral_6= '~=' )
                    // InternalDsl.g:1664:4: enumLiteral_6= '~='
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getREGEXEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getREGEXEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleListOperation"
    // InternalDsl.g:1674:1: ruleListOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'where' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'any' ) ) ;
    public final Enumerator ruleListOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1680:2: ( ( (enumLiteral_0= 'where' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'any' ) ) )
            // InternalDsl.g:1681:2: ( (enumLiteral_0= 'where' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'any' ) )
            {
            // InternalDsl.g:1681:2: ( (enumLiteral_0= 'where' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'any' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 41:
                {
                alt20=2;
                }
                break;
            case 42:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1682:3: (enumLiteral_0= 'where' )
                    {
                    // InternalDsl.g:1682:3: (enumLiteral_0= 'where' )
                    // InternalDsl.g:1683:4: enumLiteral_0= 'where'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1690:3: (enumLiteral_1= 'all' )
                    {
                    // InternalDsl.g:1690:3: (enumLiteral_1= 'all' )
                    // InternalDsl.g:1691:4: enumLiteral_1= 'all'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1698:3: (enumLiteral_2= 'any' )
                    {
                    // InternalDsl.g:1698:3: (enumLiteral_2= 'any' )
                    // InternalDsl.g:1699:4: enumLiteral_2= 'any'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getListOperationAccess().getANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getListOperationAccess().getANYEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleListOperation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000230001F0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000220001F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000FE00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000200001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000148000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000241001F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004100000L});

}
