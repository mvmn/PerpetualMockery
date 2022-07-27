package x.mvmn.permock.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import x.mvmn.permock.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INTEGER", "RULE_ID", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'~='", "'where'", "'all'", "'any'", "'if'", "'proxy'", "'respond'", "'with'", "'url'", "'status'", "'content'", "'headers'", "','", "':'", "'or'", "'and'", "'not'", "'('", "')'", "'{'", "'}'", "'$'", "'['", "']'", "'.'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRule"
    // InternalDsl.g:53:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleRule EOF )
            // InternalDsl.g:55:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDsl.g:62:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Rule__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Rule__Group__0 )
            // InternalDsl.g:69:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleProxyConf"
    // InternalDsl.g:78:1: entryRuleProxyConf : ruleProxyConf EOF ;
    public final void entryRuleProxyConf() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleProxyConf EOF )
            // InternalDsl.g:80:1: ruleProxyConf EOF
            {
             before(grammarAccess.getProxyConfRule()); 
            pushFollow(FOLLOW_1);
            ruleProxyConf();

            state._fsp--;

             after(grammarAccess.getProxyConfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProxyConf"


    // $ANTLR start "ruleProxyConf"
    // InternalDsl.g:87:1: ruleProxyConf : ( ( rule__ProxyConf__Group__0 ) ) ;
    public final void ruleProxyConf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__ProxyConf__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__ProxyConf__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__ProxyConf__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__ProxyConf__Group__0 )
            {
             before(grammarAccess.getProxyConfAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__ProxyConf__Group__0 )
            // InternalDsl.g:94:4: rule__ProxyConf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProxyConf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProxyConfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProxyConf"


    // $ANTLR start "entryRuleResponseConf"
    // InternalDsl.g:103:1: entryRuleResponseConf : ruleResponseConf EOF ;
    public final void entryRuleResponseConf() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleResponseConf EOF )
            // InternalDsl.g:105:1: ruleResponseConf EOF
            {
             before(grammarAccess.getResponseConfRule()); 
            pushFollow(FOLLOW_1);
            ruleResponseConf();

            state._fsp--;

             after(grammarAccess.getResponseConfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponseConf"


    // $ANTLR start "ruleResponseConf"
    // InternalDsl.g:112:1: ruleResponseConf : ( ( rule__ResponseConf__UnorderedGroup ) ) ;
    public final void ruleResponseConf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__ResponseConf__UnorderedGroup ) ) )
            // InternalDsl.g:117:2: ( ( rule__ResponseConf__UnorderedGroup ) )
            {
            // InternalDsl.g:117:2: ( ( rule__ResponseConf__UnorderedGroup ) )
            // InternalDsl.g:118:3: ( rule__ResponseConf__UnorderedGroup )
            {
             before(grammarAccess.getResponseConfAccess().getUnorderedGroup()); 
            // InternalDsl.g:119:3: ( rule__ResponseConf__UnorderedGroup )
            // InternalDsl.g:119:4: rule__ResponseConf__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__ResponseConf__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getResponseConfAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponseConf"


    // $ANTLR start "entryRuleHeaders"
    // InternalDsl.g:128:1: entryRuleHeaders : ruleHeaders EOF ;
    public final void entryRuleHeaders() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleHeaders EOF )
            // InternalDsl.g:130:1: ruleHeaders EOF
            {
             before(grammarAccess.getHeadersRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaders();

            state._fsp--;

             after(grammarAccess.getHeadersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeaders"


    // $ANTLR start "ruleHeaders"
    // InternalDsl.g:137:1: ruleHeaders : ( ( rule__Headers__Group__0 ) ) ;
    public final void ruleHeaders() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Headers__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Headers__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Headers__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Headers__Group__0 )
            {
             before(grammarAccess.getHeadersAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Headers__Group__0 )
            // InternalDsl.g:144:4: rule__Headers__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Headers__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeaders"


    // $ANTLR start "entryRuleHeader"
    // InternalDsl.g:153:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleHeader EOF )
            // InternalDsl.g:155:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalDsl.g:162:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Header__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Header__Group__0 )
            // InternalDsl.g:169:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleCondition"
    // InternalDsl.g:178:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleCondition EOF )
            // InternalDsl.g:180:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDsl.g:187:1: ruleCondition : ( ruleOrCondition ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ruleOrCondition ) )
            // InternalDsl.g:192:2: ( ruleOrCondition )
            {
            // InternalDsl.g:192:2: ( ruleOrCondition )
            // InternalDsl.g:193:3: ruleOrCondition
            {
             before(grammarAccess.getConditionAccess().getOrConditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOrConditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrCondition"
    // InternalDsl.g:203:1: entryRuleOrCondition : ruleOrCondition EOF ;
    public final void entryRuleOrCondition() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleOrCondition EOF )
            // InternalDsl.g:205:1: ruleOrCondition EOF
            {
             before(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // InternalDsl.g:212:1: ruleOrCondition : ( ( rule__OrCondition__Group__0 ) ) ;
    public final void ruleOrCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__OrCondition__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__OrCondition__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__OrCondition__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__OrCondition__Group__0 )
            {
             before(grammarAccess.getOrConditionAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__OrCondition__Group__0 )
            // InternalDsl.g:219:4: rule__OrCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // InternalDsl.g:228:1: entryRuleAndCondition : ruleAndCondition EOF ;
    public final void entryRuleAndCondition() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleAndCondition EOF )
            // InternalDsl.g:230:1: ruleAndCondition EOF
            {
             before(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalDsl.g:237:1: ruleAndCondition : ( ( rule__AndCondition__Group__0 ) ) ;
    public final void ruleAndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__AndCondition__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__AndCondition__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__AndCondition__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__AndCondition__Group__0 )
            {
             before(grammarAccess.getAndConditionAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__AndCondition__Group__0 )
            // InternalDsl.g:244:4: rule__AndCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleOptionalNegationCondition"
    // InternalDsl.g:253:1: entryRuleOptionalNegationCondition : ruleOptionalNegationCondition EOF ;
    public final void entryRuleOptionalNegationCondition() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleOptionalNegationCondition EOF )
            // InternalDsl.g:255:1: ruleOptionalNegationCondition EOF
            {
             before(grammarAccess.getOptionalNegationConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionalNegationCondition();

            state._fsp--;

             after(grammarAccess.getOptionalNegationConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalNegationCondition"


    // $ANTLR start "ruleOptionalNegationCondition"
    // InternalDsl.g:262:1: ruleOptionalNegationCondition : ( ( rule__OptionalNegationCondition__Alternatives ) ) ;
    public final void ruleOptionalNegationCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__OptionalNegationCondition__Alternatives ) ) )
            // InternalDsl.g:267:2: ( ( rule__OptionalNegationCondition__Alternatives ) )
            {
            // InternalDsl.g:267:2: ( ( rule__OptionalNegationCondition__Alternatives ) )
            // InternalDsl.g:268:3: ( rule__OptionalNegationCondition__Alternatives )
            {
             before(grammarAccess.getOptionalNegationConditionAccess().getAlternatives()); 
            // InternalDsl.g:269:3: ( rule__OptionalNegationCondition__Alternatives )
            // InternalDsl.g:269:4: rule__OptionalNegationCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OptionalNegationCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionalNegationConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalNegationCondition"


    // $ANTLR start "entryRuleBracketedCondition"
    // InternalDsl.g:278:1: entryRuleBracketedCondition : ruleBracketedCondition EOF ;
    public final void entryRuleBracketedCondition() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleBracketedCondition EOF )
            // InternalDsl.g:280:1: ruleBracketedCondition EOF
            {
             before(grammarAccess.getBracketedConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleBracketedCondition();

            state._fsp--;

             after(grammarAccess.getBracketedConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBracketedCondition"


    // $ANTLR start "ruleBracketedCondition"
    // InternalDsl.g:287:1: ruleBracketedCondition : ( ( rule__BracketedCondition__Alternatives ) ) ;
    public final void ruleBracketedCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__BracketedCondition__Alternatives ) ) )
            // InternalDsl.g:292:2: ( ( rule__BracketedCondition__Alternatives ) )
            {
            // InternalDsl.g:292:2: ( ( rule__BracketedCondition__Alternatives ) )
            // InternalDsl.g:293:3: ( rule__BracketedCondition__Alternatives )
            {
             before(grammarAccess.getBracketedConditionAccess().getAlternatives()); 
            // InternalDsl.g:294:3: ( rule__BracketedCondition__Alternatives )
            // InternalDsl.g:294:4: rule__BracketedCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BracketedCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBracketedConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracketedCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalDsl.g:303:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleExpression EOF )
            // InternalDsl.g:305:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDsl.g:312:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Expression__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Expression__Group__0 )
            // InternalDsl.g:319:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalDsl.g:328:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleOperand EOF )
            // InternalDsl.g:330:1: ruleOperand EOF
            {
             before(grammarAccess.getOperandRule()); 
            pushFollow(FOLLOW_1);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getOperandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalDsl.g:337:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalDsl.g:342:2: ( ( rule__Operand__Alternatives ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Operand__Alternatives ) )
            // InternalDsl.g:343:3: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // InternalDsl.g:344:3: ( rule__Operand__Alternatives )
            // InternalDsl.g:344:4: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleListFunction"
    // InternalDsl.g:353:1: entryRuleListFunction : ruleListFunction EOF ;
    public final void entryRuleListFunction() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleListFunction EOF )
            // InternalDsl.g:355:1: ruleListFunction EOF
            {
             before(grammarAccess.getListFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleListFunction();

            state._fsp--;

             after(grammarAccess.getListFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListFunction"


    // $ANTLR start "ruleListFunction"
    // InternalDsl.g:362:1: ruleListFunction : ( ( rule__ListFunction__Group__0 ) ) ;
    public final void ruleListFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__ListFunction__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__ListFunction__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__ListFunction__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__ListFunction__Group__0 )
            {
             before(grammarAccess.getListFunctionAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__ListFunction__Group__0 )
            // InternalDsl.g:369:4: rule__ListFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListFunction"


    // $ANTLR start "entryRuleListElementAlias"
    // InternalDsl.g:378:1: entryRuleListElementAlias : ruleListElementAlias EOF ;
    public final void entryRuleListElementAlias() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleListElementAlias EOF )
            // InternalDsl.g:380:1: ruleListElementAlias EOF
            {
             before(grammarAccess.getListElementAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleListElementAlias();

            state._fsp--;

             after(grammarAccess.getListElementAliasRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListElementAlias"


    // $ANTLR start "ruleListElementAlias"
    // InternalDsl.g:387:1: ruleListElementAlias : ( ( rule__ListElementAlias__NameAssignment ) ) ;
    public final void ruleListElementAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__ListElementAlias__NameAssignment ) ) )
            // InternalDsl.g:392:2: ( ( rule__ListElementAlias__NameAssignment ) )
            {
            // InternalDsl.g:392:2: ( ( rule__ListElementAlias__NameAssignment ) )
            // InternalDsl.g:393:3: ( rule__ListElementAlias__NameAssignment )
            {
             before(grammarAccess.getListElementAliasAccess().getNameAssignment()); 
            // InternalDsl.g:394:3: ( rule__ListElementAlias__NameAssignment )
            // InternalDsl.g:394:4: rule__ListElementAlias__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ListElementAlias__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListElementAliasAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListElementAlias"


    // $ANTLR start "entryRuleReference"
    // InternalDsl.g:403:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:407:1: ( ruleReference EOF )
            // InternalDsl.g:408:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDsl.g:418:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:423:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalDsl.g:424:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalDsl.g:424:2: ( ( rule__Reference__Group__0 ) )
            // InternalDsl.g:425:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalDsl.g:426:3: ( rule__Reference__Group__0 )
            // InternalDsl.g:426:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleListElementReference"
    // InternalDsl.g:436:1: entryRuleListElementReference : ruleListElementReference EOF ;
    public final void entryRuleListElementReference() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:440:1: ( ruleListElementReference EOF )
            // InternalDsl.g:441:1: ruleListElementReference EOF
            {
             before(grammarAccess.getListElementReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleListElementReference();

            state._fsp--;

             after(grammarAccess.getListElementReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleListElementReference"


    // $ANTLR start "ruleListElementReference"
    // InternalDsl.g:451:1: ruleListElementReference : ( ( rule__ListElementReference__Group__0 ) ) ;
    public final void ruleListElementReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:456:2: ( ( ( rule__ListElementReference__Group__0 ) ) )
            // InternalDsl.g:457:2: ( ( rule__ListElementReference__Group__0 ) )
            {
            // InternalDsl.g:457:2: ( ( rule__ListElementReference__Group__0 ) )
            // InternalDsl.g:458:3: ( rule__ListElementReference__Group__0 )
            {
             before(grammarAccess.getListElementReferenceAccess().getGroup()); 
            // InternalDsl.g:459:3: ( rule__ListElementReference__Group__0 )
            // InternalDsl.g:459:4: rule__ListElementReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListElementReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListElementReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleListElementReference"


    // $ANTLR start "entryRulePropertyAccess"
    // InternalDsl.g:469:1: entryRulePropertyAccess : rulePropertyAccess EOF ;
    public final void entryRulePropertyAccess() throws RecognitionException {
        try {
            // InternalDsl.g:470:1: ( rulePropertyAccess EOF )
            // InternalDsl.g:471:1: rulePropertyAccess EOF
            {
             before(grammarAccess.getPropertyAccessRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyAccess();

            state._fsp--;

             after(grammarAccess.getPropertyAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyAccess"


    // $ANTLR start "rulePropertyAccess"
    // InternalDsl.g:478:1: rulePropertyAccess : ( ( rule__PropertyAccess__NameAssignment ) ) ;
    public final void rulePropertyAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:482:2: ( ( ( rule__PropertyAccess__NameAssignment ) ) )
            // InternalDsl.g:483:2: ( ( rule__PropertyAccess__NameAssignment ) )
            {
            // InternalDsl.g:483:2: ( ( rule__PropertyAccess__NameAssignment ) )
            // InternalDsl.g:484:3: ( rule__PropertyAccess__NameAssignment )
            {
             before(grammarAccess.getPropertyAccessAccess().getNameAssignment()); 
            // InternalDsl.g:485:3: ( rule__PropertyAccess__NameAssignment )
            // InternalDsl.g:485:4: rule__PropertyAccess__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAccess__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccessAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyAccess"


    // $ANTLR start "entryRuleCollectionAccess"
    // InternalDsl.g:494:1: entryRuleCollectionAccess : ruleCollectionAccess EOF ;
    public final void entryRuleCollectionAccess() throws RecognitionException {
        try {
            // InternalDsl.g:495:1: ( ruleCollectionAccess EOF )
            // InternalDsl.g:496:1: ruleCollectionAccess EOF
            {
             before(grammarAccess.getCollectionAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionAccess();

            state._fsp--;

             after(grammarAccess.getCollectionAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionAccess"


    // $ANTLR start "ruleCollectionAccess"
    // InternalDsl.g:503:1: ruleCollectionAccess : ( ( rule__CollectionAccess__Group__0 ) ) ;
    public final void ruleCollectionAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:507:2: ( ( ( rule__CollectionAccess__Group__0 ) ) )
            // InternalDsl.g:508:2: ( ( rule__CollectionAccess__Group__0 ) )
            {
            // InternalDsl.g:508:2: ( ( rule__CollectionAccess__Group__0 ) )
            // InternalDsl.g:509:3: ( rule__CollectionAccess__Group__0 )
            {
             before(grammarAccess.getCollectionAccessAccess().getGroup()); 
            // InternalDsl.g:510:3: ( rule__CollectionAccess__Group__0 )
            // InternalDsl.g:510:4: rule__CollectionAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionAccess"


    // $ANTLR start "entryRulePropertyRef"
    // InternalDsl.g:519:1: entryRulePropertyRef : rulePropertyRef EOF ;
    public final void entryRulePropertyRef() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:523:1: ( rulePropertyRef EOF )
            // InternalDsl.g:524:1: rulePropertyRef EOF
            {
             before(grammarAccess.getPropertyRefRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyRef();

            state._fsp--;

             after(grammarAccess.getPropertyRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulePropertyRef"


    // $ANTLR start "rulePropertyRef"
    // InternalDsl.g:534:1: rulePropertyRef : ( ( rule__PropertyRef__Group__0 ) ) ;
    public final void rulePropertyRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:539:2: ( ( ( rule__PropertyRef__Group__0 ) ) )
            // InternalDsl.g:540:2: ( ( rule__PropertyRef__Group__0 ) )
            {
            // InternalDsl.g:540:2: ( ( rule__PropertyRef__Group__0 ) )
            // InternalDsl.g:541:3: ( rule__PropertyRef__Group__0 )
            {
             before(grammarAccess.getPropertyRefAccess().getGroup()); 
            // InternalDsl.g:542:3: ( rule__PropertyRef__Group__0 )
            // InternalDsl.g:542:4: rule__PropertyRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulePropertyRef"


    // $ANTLR start "entryRuleConstant"
    // InternalDsl.g:552:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDsl.g:553:1: ( ruleConstant EOF )
            // InternalDsl.g:554:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDsl.g:561:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:565:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalDsl.g:566:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalDsl.g:566:2: ( ( rule__Constant__Alternatives ) )
            // InternalDsl.g:567:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalDsl.g:568:3: ( rule__Constant__Alternatives )
            // InternalDsl.g:568:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:577:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDsl.g:578:1: ( ruleEntity EOF )
            // InternalDsl.g:579:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:586:1: ruleEntity : ( ( rule__Entity__NameAssignment ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:590:2: ( ( ( rule__Entity__NameAssignment ) ) )
            // InternalDsl.g:591:2: ( ( rule__Entity__NameAssignment ) )
            {
            // InternalDsl.g:591:2: ( ( rule__Entity__NameAssignment ) )
            // InternalDsl.g:592:3: ( rule__Entity__NameAssignment )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment()); 
            // InternalDsl.g:593:3: ( rule__Entity__NameAssignment )
            // InternalDsl.g:593:4: rule__Entity__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "ruleOperator"
    // InternalDsl.g:602:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:606:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalDsl.g:607:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalDsl.g:607:2: ( ( rule__Operator__Alternatives ) )
            // InternalDsl.g:608:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalDsl.g:609:3: ( rule__Operator__Alternatives )
            // InternalDsl.g:609:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleListOperation"
    // InternalDsl.g:618:1: ruleListOperation : ( ( rule__ListOperation__Alternatives ) ) ;
    public final void ruleListOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( ( ( rule__ListOperation__Alternatives ) ) )
            // InternalDsl.g:623:2: ( ( rule__ListOperation__Alternatives ) )
            {
            // InternalDsl.g:623:2: ( ( rule__ListOperation__Alternatives ) )
            // InternalDsl.g:624:3: ( rule__ListOperation__Alternatives )
            {
             before(grammarAccess.getListOperationAccess().getAlternatives()); 
            // InternalDsl.g:625:3: ( rule__ListOperation__Alternatives )
            // InternalDsl.g:625:4: rule__ListOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOperation"


    // $ANTLR start "rule__Rule__Alternatives_2"
    // InternalDsl.g:633:1: rule__Rule__Alternatives_2 : ( ( ( rule__Rule__Group_2_0__0 ) ) | ( ( rule__Rule__Group_2_1__0 ) ) );
    public final void rule__Rule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:637:1: ( ( ( rule__Rule__Group_2_0__0 ) ) | ( ( rule__Rule__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:638:2: ( ( rule__Rule__Group_2_0__0 ) )
                    {
                    // InternalDsl.g:638:2: ( ( rule__Rule__Group_2_0__0 ) )
                    // InternalDsl.g:639:3: ( rule__Rule__Group_2_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2_0()); 
                    // InternalDsl.g:640:3: ( rule__Rule__Group_2_0__0 )
                    // InternalDsl.g:640:4: rule__Rule__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:644:2: ( ( rule__Rule__Group_2_1__0 ) )
                    {
                    // InternalDsl.g:644:2: ( ( rule__Rule__Group_2_1__0 ) )
                    // InternalDsl.g:645:3: ( rule__Rule__Group_2_1__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2_1()); 
                    // InternalDsl.g:646:3: ( rule__Rule__Group_2_1__0 )
                    // InternalDsl.g:646:4: rule__Rule__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_2"


    // $ANTLR start "rule__OptionalNegationCondition__Alternatives"
    // InternalDsl.g:654:1: rule__OptionalNegationCondition__Alternatives : ( ( ruleBracketedCondition ) | ( ( rule__OptionalNegationCondition__Group_1__0 ) ) );
    public final void rule__OptionalNegationCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:658:1: ( ( ruleBracketedCondition ) | ( ( rule__OptionalNegationCondition__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_BOOLEAN)||LA2_0==35||LA2_0==39) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:659:2: ( ruleBracketedCondition )
                    {
                    // InternalDsl.g:659:2: ( ruleBracketedCondition )
                    // InternalDsl.g:660:3: ruleBracketedCondition
                    {
                     before(grammarAccess.getOptionalNegationConditionAccess().getBracketedConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBracketedCondition();

                    state._fsp--;

                     after(grammarAccess.getOptionalNegationConditionAccess().getBracketedConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:665:2: ( ( rule__OptionalNegationCondition__Group_1__0 ) )
                    {
                    // InternalDsl.g:665:2: ( ( rule__OptionalNegationCondition__Group_1__0 ) )
                    // InternalDsl.g:666:3: ( rule__OptionalNegationCondition__Group_1__0 )
                    {
                     before(grammarAccess.getOptionalNegationConditionAccess().getGroup_1()); 
                    // InternalDsl.g:667:3: ( rule__OptionalNegationCondition__Group_1__0 )
                    // InternalDsl.g:667:4: rule__OptionalNegationCondition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OptionalNegationCondition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalNegationConditionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__Alternatives"


    // $ANTLR start "rule__BracketedCondition__Alternatives"
    // InternalDsl.g:675:1: rule__BracketedCondition__Alternatives : ( ( ( rule__BracketedCondition__ExpressionAssignment_0 ) ) | ( ( rule__BracketedCondition__Group_1__0 ) ) );
    public final void rule__BracketedCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:679:1: ( ( ( rule__BracketedCondition__ExpressionAssignment_0 ) ) | ( ( rule__BracketedCondition__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_BOOLEAN)||LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:680:2: ( ( rule__BracketedCondition__ExpressionAssignment_0 ) )
                    {
                    // InternalDsl.g:680:2: ( ( rule__BracketedCondition__ExpressionAssignment_0 ) )
                    // InternalDsl.g:681:3: ( rule__BracketedCondition__ExpressionAssignment_0 )
                    {
                     before(grammarAccess.getBracketedConditionAccess().getExpressionAssignment_0()); 
                    // InternalDsl.g:682:3: ( rule__BracketedCondition__ExpressionAssignment_0 )
                    // InternalDsl.g:682:4: rule__BracketedCondition__ExpressionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BracketedCondition__ExpressionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBracketedConditionAccess().getExpressionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:686:2: ( ( rule__BracketedCondition__Group_1__0 ) )
                    {
                    // InternalDsl.g:686:2: ( ( rule__BracketedCondition__Group_1__0 ) )
                    // InternalDsl.g:687:3: ( rule__BracketedCondition__Group_1__0 )
                    {
                     before(grammarAccess.getBracketedConditionAccess().getGroup_1()); 
                    // InternalDsl.g:688:3: ( rule__BracketedCondition__Group_1__0 )
                    // InternalDsl.g:688:4: rule__BracketedCondition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BracketedCondition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBracketedConditionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalDsl.g:696:1: rule__Operand__Alternatives : ( ( ( rule__Operand__RefAssignment_0 ) ) | ( ( rule__Operand__ConstAssignment_1 ) ) | ( ( rule__Operand__ListElementRefAssignment_2 ) ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:700:1: ( ( ( rule__Operand__RefAssignment_0 ) ) | ( ( rule__Operand__ConstAssignment_1 ) ) | ( ( rule__Operand__ListElementRefAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
            case RULE_INTEGER:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:701:2: ( ( rule__Operand__RefAssignment_0 ) )
                    {
                    // InternalDsl.g:701:2: ( ( rule__Operand__RefAssignment_0 ) )
                    // InternalDsl.g:702:3: ( rule__Operand__RefAssignment_0 )
                    {
                     before(grammarAccess.getOperandAccess().getRefAssignment_0()); 
                    // InternalDsl.g:703:3: ( rule__Operand__RefAssignment_0 )
                    // InternalDsl.g:703:4: rule__Operand__RefAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operand__RefAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperandAccess().getRefAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:707:2: ( ( rule__Operand__ConstAssignment_1 ) )
                    {
                    // InternalDsl.g:707:2: ( ( rule__Operand__ConstAssignment_1 ) )
                    // InternalDsl.g:708:3: ( rule__Operand__ConstAssignment_1 )
                    {
                     before(grammarAccess.getOperandAccess().getConstAssignment_1()); 
                    // InternalDsl.g:709:3: ( rule__Operand__ConstAssignment_1 )
                    // InternalDsl.g:709:4: rule__Operand__ConstAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operand__ConstAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperandAccess().getConstAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:713:2: ( ( rule__Operand__ListElementRefAssignment_2 ) )
                    {
                    // InternalDsl.g:713:2: ( ( rule__Operand__ListElementRefAssignment_2 ) )
                    // InternalDsl.g:714:3: ( rule__Operand__ListElementRefAssignment_2 )
                    {
                     before(grammarAccess.getOperandAccess().getListElementRefAssignment_2()); 
                    // InternalDsl.g:715:3: ( rule__Operand__ListElementRefAssignment_2 )
                    // InternalDsl.g:715:4: rule__Operand__ListElementRefAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operand__ListElementRefAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperandAccess().getListElementRefAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__CollectionAccess__Alternatives_1"
    // InternalDsl.g:723:1: rule__CollectionAccess__Alternatives_1 : ( ( ( rule__CollectionAccess__KeyAssignment_1_0 ) ) | ( ( rule__CollectionAccess__IndexAssignment_1_1 ) ) );
    public final void rule__CollectionAccess__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:727:1: ( ( ( rule__CollectionAccess__KeyAssignment_1_0 ) ) | ( ( rule__CollectionAccess__IndexAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INTEGER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:728:2: ( ( rule__CollectionAccess__KeyAssignment_1_0 ) )
                    {
                    // InternalDsl.g:728:2: ( ( rule__CollectionAccess__KeyAssignment_1_0 ) )
                    // InternalDsl.g:729:3: ( rule__CollectionAccess__KeyAssignment_1_0 )
                    {
                     before(grammarAccess.getCollectionAccessAccess().getKeyAssignment_1_0()); 
                    // InternalDsl.g:730:3: ( rule__CollectionAccess__KeyAssignment_1_0 )
                    // InternalDsl.g:730:4: rule__CollectionAccess__KeyAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionAccess__KeyAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionAccessAccess().getKeyAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:734:2: ( ( rule__CollectionAccess__IndexAssignment_1_1 ) )
                    {
                    // InternalDsl.g:734:2: ( ( rule__CollectionAccess__IndexAssignment_1_1 ) )
                    // InternalDsl.g:735:3: ( rule__CollectionAccess__IndexAssignment_1_1 )
                    {
                     before(grammarAccess.getCollectionAccessAccess().getIndexAssignment_1_1()); 
                    // InternalDsl.g:736:3: ( rule__CollectionAccess__IndexAssignment_1_1 )
                    // InternalDsl.g:736:4: rule__CollectionAccess__IndexAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionAccess__IndexAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectionAccessAccess().getIndexAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__Alternatives_1"


    // $ANTLR start "rule__PropertyRef__Alternatives_0"
    // InternalDsl.g:744:1: rule__PropertyRef__Alternatives_0 : ( ( ( rule__PropertyRef__Group_0_0__0 ) ) | ( ( rule__PropertyRef__CollectionAccessAssignment_0_1 ) ) | ( ( rule__PropertyRef__ListFuncAssignment_0_2 ) ) );
    public final void rule__PropertyRef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:748:1: ( ( ( rule__PropertyRef__Group_0_0__0 ) ) | ( ( rule__PropertyRef__CollectionAccessAssignment_0_1 ) ) | ( ( rule__PropertyRef__ListFuncAssignment_0_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt6=1;
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:749:2: ( ( rule__PropertyRef__Group_0_0__0 ) )
                    {
                    // InternalDsl.g:749:2: ( ( rule__PropertyRef__Group_0_0__0 ) )
                    // InternalDsl.g:750:3: ( rule__PropertyRef__Group_0_0__0 )
                    {
                     before(grammarAccess.getPropertyRefAccess().getGroup_0_0()); 
                    // InternalDsl.g:751:3: ( rule__PropertyRef__Group_0_0__0 )
                    // InternalDsl.g:751:4: rule__PropertyRef__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRef__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyRefAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:755:2: ( ( rule__PropertyRef__CollectionAccessAssignment_0_1 ) )
                    {
                    // InternalDsl.g:755:2: ( ( rule__PropertyRef__CollectionAccessAssignment_0_1 ) )
                    // InternalDsl.g:756:3: ( rule__PropertyRef__CollectionAccessAssignment_0_1 )
                    {
                     before(grammarAccess.getPropertyRefAccess().getCollectionAccessAssignment_0_1()); 
                    // InternalDsl.g:757:3: ( rule__PropertyRef__CollectionAccessAssignment_0_1 )
                    // InternalDsl.g:757:4: rule__PropertyRef__CollectionAccessAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRef__CollectionAccessAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyRefAccess().getCollectionAccessAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:761:2: ( ( rule__PropertyRef__ListFuncAssignment_0_2 ) )
                    {
                    // InternalDsl.g:761:2: ( ( rule__PropertyRef__ListFuncAssignment_0_2 ) )
                    // InternalDsl.g:762:3: ( rule__PropertyRef__ListFuncAssignment_0_2 )
                    {
                     before(grammarAccess.getPropertyRefAccess().getListFuncAssignment_0_2()); 
                    // InternalDsl.g:763:3: ( rule__PropertyRef__ListFuncAssignment_0_2 )
                    // InternalDsl.g:763:4: rule__PropertyRef__ListFuncAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRef__ListFuncAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyRefAccess().getListFuncAssignment_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Alternatives_0"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalDsl.g:771:1: rule__Constant__Alternatives : ( ( ( rule__Constant__StrValAssignment_0 ) ) | ( ( rule__Constant__IntValAssignment_1 ) ) | ( ( rule__Constant__FloatValAssignment_2 ) ) | ( ( rule__Constant__BoolValAssignment_3 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:775:1: ( ( ( rule__Constant__StrValAssignment_0 ) ) | ( ( rule__Constant__IntValAssignment_1 ) ) | ( ( rule__Constant__FloatValAssignment_2 ) ) | ( ( rule__Constant__BoolValAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INTEGER:
                {
                alt7=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt7=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:776:2: ( ( rule__Constant__StrValAssignment_0 ) )
                    {
                    // InternalDsl.g:776:2: ( ( rule__Constant__StrValAssignment_0 ) )
                    // InternalDsl.g:777:3: ( rule__Constant__StrValAssignment_0 )
                    {
                     before(grammarAccess.getConstantAccess().getStrValAssignment_0()); 
                    // InternalDsl.g:778:3: ( rule__Constant__StrValAssignment_0 )
                    // InternalDsl.g:778:4: rule__Constant__StrValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__StrValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getStrValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:782:2: ( ( rule__Constant__IntValAssignment_1 ) )
                    {
                    // InternalDsl.g:782:2: ( ( rule__Constant__IntValAssignment_1 ) )
                    // InternalDsl.g:783:3: ( rule__Constant__IntValAssignment_1 )
                    {
                     before(grammarAccess.getConstantAccess().getIntValAssignment_1()); 
                    // InternalDsl.g:784:3: ( rule__Constant__IntValAssignment_1 )
                    // InternalDsl.g:784:4: rule__Constant__IntValAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__IntValAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getIntValAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:788:2: ( ( rule__Constant__FloatValAssignment_2 ) )
                    {
                    // InternalDsl.g:788:2: ( ( rule__Constant__FloatValAssignment_2 ) )
                    // InternalDsl.g:789:3: ( rule__Constant__FloatValAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getFloatValAssignment_2()); 
                    // InternalDsl.g:790:3: ( rule__Constant__FloatValAssignment_2 )
                    // InternalDsl.g:790:4: rule__Constant__FloatValAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__FloatValAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getFloatValAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:794:2: ( ( rule__Constant__BoolValAssignment_3 ) )
                    {
                    // InternalDsl.g:794:2: ( ( rule__Constant__BoolValAssignment_3 ) )
                    // InternalDsl.g:795:3: ( rule__Constant__BoolValAssignment_3 )
                    {
                     before(grammarAccess.getConstantAccess().getBoolValAssignment_3()); 
                    // InternalDsl.g:796:3: ( rule__Constant__BoolValAssignment_3 )
                    // InternalDsl.g:796:4: rule__Constant__BoolValAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BoolValAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getBoolValAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalDsl.g:804:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:808:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~=' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            case 18:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:809:2: ( ( '=' ) )
                    {
                    // InternalDsl.g:809:2: ( ( '=' ) )
                    // InternalDsl.g:810:3: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:811:3: ( '=' )
                    // InternalDsl.g:811:4: '='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:815:2: ( ( '!=' ) )
                    {
                    // InternalDsl.g:815:2: ( ( '!=' ) )
                    // InternalDsl.g:816:3: ( '!=' )
                    {
                     before(grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:817:3: ( '!=' )
                    // InternalDsl.g:817:4: '!='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:821:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:821:2: ( ( '>' ) )
                    // InternalDsl.g:822:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:823:3: ( '>' )
                    // InternalDsl.g:823:4: '>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:827:2: ( ( '>=' ) )
                    {
                    // InternalDsl.g:827:2: ( ( '>=' ) )
                    // InternalDsl.g:828:3: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:829:3: ( '>=' )
                    // InternalDsl.g:829:4: '>='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:833:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:833:2: ( ( '<' ) )
                    // InternalDsl.g:834:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:835:3: ( '<' )
                    // InternalDsl.g:835:4: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:839:2: ( ( '<=' ) )
                    {
                    // InternalDsl.g:839:2: ( ( '<=' ) )
                    // InternalDsl.g:840:3: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:841:3: ( '<=' )
                    // InternalDsl.g:841:4: '<='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:845:2: ( ( '~=' ) )
                    {
                    // InternalDsl.g:845:2: ( ( '~=' ) )
                    // InternalDsl.g:846:3: ( '~=' )
                    {
                     before(grammarAccess.getOperatorAccess().getREGEXEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:847:3: ( '~=' )
                    // InternalDsl.g:847:4: '~='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getREGEXEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__ListOperation__Alternatives"
    // InternalDsl.g:855:1: rule__ListOperation__Alternatives : ( ( ( 'where' ) ) | ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__ListOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:859:1: ( ( ( 'where' ) ) | ( ( 'all' ) ) | ( ( 'any' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:860:2: ( ( 'where' ) )
                    {
                    // InternalDsl.g:860:2: ( ( 'where' ) )
                    // InternalDsl.g:861:3: ( 'where' )
                    {
                     before(grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0()); 
                    // InternalDsl.g:862:3: ( 'where' )
                    // InternalDsl.g:862:4: 'where'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:866:2: ( ( 'all' ) )
                    {
                    // InternalDsl.g:866:2: ( ( 'all' ) )
                    // InternalDsl.g:867:3: ( 'all' )
                    {
                     before(grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:868:3: ( 'all' )
                    // InternalDsl.g:868:4: 'all'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:872:2: ( ( 'any' ) )
                    {
                    // InternalDsl.g:872:2: ( ( 'any' ) )
                    // InternalDsl.g:873:3: ( 'any' )
                    {
                     before(grammarAccess.getListOperationAccess().getANYEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:874:3: ( 'any' )
                    // InternalDsl.g:874:4: 'any'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getListOperationAccess().getANYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOperation__Alternatives"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalDsl.g:882:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:886:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDsl.g:887:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalDsl.g:894:1: rule__Rule__Group__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:898:1: ( ( 'if' ) )
            // InternalDsl.g:899:1: ( 'if' )
            {
            // InternalDsl.g:899:1: ( 'if' )
            // InternalDsl.g:900:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalDsl.g:909:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDsl.g:914:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalDsl.g:921:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionsAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:925:1: ( ( ( rule__Rule__ConditionsAssignment_1 ) ) )
            // InternalDsl.g:926:1: ( ( rule__Rule__ConditionsAssignment_1 ) )
            {
            // InternalDsl.g:926:1: ( ( rule__Rule__ConditionsAssignment_1 ) )
            // InternalDsl.g:927:2: ( rule__Rule__ConditionsAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_1()); 
            // InternalDsl.g:928:2: ( rule__Rule__ConditionsAssignment_1 )
            // InternalDsl.g:928:3: rule__Rule__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalDsl.g:936:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:940:1: ( rule__Rule__Group__2__Impl )
            // InternalDsl.g:941:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalDsl.g:947:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Alternatives_2 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:951:1: ( ( ( rule__Rule__Alternatives_2 )? ) )
            // InternalDsl.g:952:1: ( ( rule__Rule__Alternatives_2 )? )
            {
            // InternalDsl.g:952:1: ( ( rule__Rule__Alternatives_2 )? )
            // InternalDsl.g:953:2: ( rule__Rule__Alternatives_2 )?
            {
             before(grammarAccess.getRuleAccess().getAlternatives_2()); 
            // InternalDsl.g:954:2: ( rule__Rule__Alternatives_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:954:3: rule__Rule__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group_2_0__0"
    // InternalDsl.g:963:1: rule__Rule__Group_2_0__0 : rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1 ;
    public final void rule__Rule__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1 )
            // InternalDsl.g:968:2: rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__0"


    // $ANTLR start "rule__Rule__Group_2_0__0__Impl"
    // InternalDsl.g:975:1: rule__Rule__Group_2_0__0__Impl : ( 'proxy' ) ;
    public final void rule__Rule__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:979:1: ( ( 'proxy' ) )
            // InternalDsl.g:980:1: ( 'proxy' )
            {
            // InternalDsl.g:980:1: ( 'proxy' )
            // InternalDsl.g:981:2: 'proxy'
            {
             before(grammarAccess.getRuleAccess().getProxyKeyword_2_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getProxyKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_0__1"
    // InternalDsl.g:990:1: rule__Rule__Group_2_0__1 : rule__Rule__Group_2_0__1__Impl ;
    public final void rule__Rule__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:994:1: ( rule__Rule__Group_2_0__1__Impl )
            // InternalDsl.g:995:2: rule__Rule__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__1"


    // $ANTLR start "rule__Rule__Group_2_0__1__Impl"
    // InternalDsl.g:1001:1: rule__Rule__Group_2_0__1__Impl : ( ( rule__Rule__ProxyAssignment_2_0_1 ) ) ;
    public final void rule__Rule__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1005:1: ( ( ( rule__Rule__ProxyAssignment_2_0_1 ) ) )
            // InternalDsl.g:1006:1: ( ( rule__Rule__ProxyAssignment_2_0_1 ) )
            {
            // InternalDsl.g:1006:1: ( ( rule__Rule__ProxyAssignment_2_0_1 ) )
            // InternalDsl.g:1007:2: ( rule__Rule__ProxyAssignment_2_0_1 )
            {
             before(grammarAccess.getRuleAccess().getProxyAssignment_2_0_1()); 
            // InternalDsl.g:1008:2: ( rule__Rule__ProxyAssignment_2_0_1 )
            // InternalDsl.g:1008:3: rule__Rule__ProxyAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ProxyAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getProxyAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_2_1__0"
    // InternalDsl.g:1017:1: rule__Rule__Group_2_1__0 : rule__Rule__Group_2_1__0__Impl rule__Rule__Group_2_1__1 ;
    public final void rule__Rule__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1021:1: ( rule__Rule__Group_2_1__0__Impl rule__Rule__Group_2_1__1 )
            // InternalDsl.g:1022:2: rule__Rule__Group_2_1__0__Impl rule__Rule__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_1__0"


    // $ANTLR start "rule__Rule__Group_2_1__0__Impl"
    // InternalDsl.g:1029:1: rule__Rule__Group_2_1__0__Impl : ( 'respond' ) ;
    public final void rule__Rule__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1033:1: ( ( 'respond' ) )
            // InternalDsl.g:1034:1: ( 'respond' )
            {
            // InternalDsl.g:1034:1: ( 'respond' )
            // InternalDsl.g:1035:2: 'respond'
            {
             before(grammarAccess.getRuleAccess().getRespondKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRespondKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_1__1"
    // InternalDsl.g:1044:1: rule__Rule__Group_2_1__1 : rule__Rule__Group_2_1__1__Impl rule__Rule__Group_2_1__2 ;
    public final void rule__Rule__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( rule__Rule__Group_2_1__1__Impl rule__Rule__Group_2_1__2 )
            // InternalDsl.g:1049:2: rule__Rule__Group_2_1__1__Impl rule__Rule__Group_2_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_1__1"


    // $ANTLR start "rule__Rule__Group_2_1__1__Impl"
    // InternalDsl.g:1056:1: rule__Rule__Group_2_1__1__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1060:1: ( ( 'with' ) )
            // InternalDsl.g:1061:1: ( 'with' )
            {
            // InternalDsl.g:1061:1: ( 'with' )
            // InternalDsl.g:1062:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_2_1__2"
    // InternalDsl.g:1071:1: rule__Rule__Group_2_1__2 : rule__Rule__Group_2_1__2__Impl ;
    public final void rule__Rule__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( rule__Rule__Group_2_1__2__Impl )
            // InternalDsl.g:1076:2: rule__Rule__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_1__2"


    // $ANTLR start "rule__Rule__Group_2_1__2__Impl"
    // InternalDsl.g:1082:1: rule__Rule__Group_2_1__2__Impl : ( ( rule__Rule__ResponseAssignment_2_1_2 ) ) ;
    public final void rule__Rule__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1086:1: ( ( ( rule__Rule__ResponseAssignment_2_1_2 ) ) )
            // InternalDsl.g:1087:1: ( ( rule__Rule__ResponseAssignment_2_1_2 ) )
            {
            // InternalDsl.g:1087:1: ( ( rule__Rule__ResponseAssignment_2_1_2 ) )
            // InternalDsl.g:1088:2: ( rule__Rule__ResponseAssignment_2_1_2 )
            {
             before(grammarAccess.getRuleAccess().getResponseAssignment_2_1_2()); 
            // InternalDsl.g:1089:2: ( rule__Rule__ResponseAssignment_2_1_2 )
            // InternalDsl.g:1089:3: rule__Rule__ResponseAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResponseAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResponseAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_1__2__Impl"


    // $ANTLR start "rule__ProxyConf__Group__0"
    // InternalDsl.g:1098:1: rule__ProxyConf__Group__0 : rule__ProxyConf__Group__0__Impl rule__ProxyConf__Group__1 ;
    public final void rule__ProxyConf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1102:1: ( rule__ProxyConf__Group__0__Impl rule__ProxyConf__Group__1 )
            // InternalDsl.g:1103:2: rule__ProxyConf__Group__0__Impl rule__ProxyConf__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ProxyConf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxyConf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyConf__Group__0"


    // $ANTLR start "rule__ProxyConf__Group__0__Impl"
    // InternalDsl.g:1110:1: rule__ProxyConf__Group__0__Impl : ( 'url' ) ;
    public final void rule__ProxyConf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1114:1: ( ( 'url' ) )
            // InternalDsl.g:1115:1: ( 'url' )
            {
            // InternalDsl.g:1115:1: ( 'url' )
            // InternalDsl.g:1116:2: 'url'
            {
             before(grammarAccess.getProxyConfAccess().getUrlKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProxyConfAccess().getUrlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyConf__Group__0__Impl"


    // $ANTLR start "rule__ProxyConf__Group__1"
    // InternalDsl.g:1125:1: rule__ProxyConf__Group__1 : rule__ProxyConf__Group__1__Impl ;
    public final void rule__ProxyConf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( rule__ProxyConf__Group__1__Impl )
            // InternalDsl.g:1130:2: rule__ProxyConf__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxyConf__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyConf__Group__1"


    // $ANTLR start "rule__ProxyConf__Group__1__Impl"
    // InternalDsl.g:1136:1: rule__ProxyConf__Group__1__Impl : ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) ) ;
    public final void rule__ProxyConf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1140:1: ( ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) ) )
            // InternalDsl.g:1141:1: ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) )
            {
            // InternalDsl.g:1141:1: ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) )
            // InternalDsl.g:1142:2: ( rule__ProxyConf__ProxyUrlAssignment_1 )
            {
             before(grammarAccess.getProxyConfAccess().getProxyUrlAssignment_1()); 
            // InternalDsl.g:1143:2: ( rule__ProxyConf__ProxyUrlAssignment_1 )
            // InternalDsl.g:1143:3: rule__ProxyConf__ProxyUrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxyConf__ProxyUrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProxyConfAccess().getProxyUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyConf__Group__1__Impl"


    // $ANTLR start "rule__ResponseConf__Group_0__0"
    // InternalDsl.g:1152:1: rule__ResponseConf__Group_0__0 : rule__ResponseConf__Group_0__0__Impl rule__ResponseConf__Group_0__1 ;
    public final void rule__ResponseConf__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1156:1: ( rule__ResponseConf__Group_0__0__Impl rule__ResponseConf__Group_0__1 )
            // InternalDsl.g:1157:2: rule__ResponseConf__Group_0__0__Impl rule__ResponseConf__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ResponseConf__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseConf__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_0__0"


    // $ANTLR start "rule__ResponseConf__Group_0__0__Impl"
    // InternalDsl.g:1164:1: rule__ResponseConf__Group_0__0__Impl : ( 'status' ) ;
    public final void rule__ResponseConf__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1168:1: ( ( 'status' ) )
            // InternalDsl.g:1169:1: ( 'status' )
            {
            // InternalDsl.g:1169:1: ( 'status' )
            // InternalDsl.g:1170:2: 'status'
            {
             before(grammarAccess.getResponseConfAccess().getStatusKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getResponseConfAccess().getStatusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_0__0__Impl"


    // $ANTLR start "rule__ResponseConf__Group_0__1"
    // InternalDsl.g:1179:1: rule__ResponseConf__Group_0__1 : rule__ResponseConf__Group_0__1__Impl ;
    public final void rule__ResponseConf__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( rule__ResponseConf__Group_0__1__Impl )
            // InternalDsl.g:1184:2: rule__ResponseConf__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResponseConf__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_0__1"


    // $ANTLR start "rule__ResponseConf__Group_0__1__Impl"
    // InternalDsl.g:1190:1: rule__ResponseConf__Group_0__1__Impl : ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) ) ;
    public final void rule__ResponseConf__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1194:1: ( ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) ) )
            // InternalDsl.g:1195:1: ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) )
            {
            // InternalDsl.g:1195:1: ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) )
            // InternalDsl.g:1196:2: ( rule__ResponseConf__HttpStatusAssignment_0_1 )
            {
             before(grammarAccess.getResponseConfAccess().getHttpStatusAssignment_0_1()); 
            // InternalDsl.g:1197:2: ( rule__ResponseConf__HttpStatusAssignment_0_1 )
            // InternalDsl.g:1197:3: rule__ResponseConf__HttpStatusAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ResponseConf__HttpStatusAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseConfAccess().getHttpStatusAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_0__1__Impl"


    // $ANTLR start "rule__ResponseConf__Group_1__0"
    // InternalDsl.g:1206:1: rule__ResponseConf__Group_1__0 : rule__ResponseConf__Group_1__0__Impl rule__ResponseConf__Group_1__1 ;
    public final void rule__ResponseConf__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( rule__ResponseConf__Group_1__0__Impl rule__ResponseConf__Group_1__1 )
            // InternalDsl.g:1211:2: rule__ResponseConf__Group_1__0__Impl rule__ResponseConf__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ResponseConf__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseConf__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_1__0"


    // $ANTLR start "rule__ResponseConf__Group_1__0__Impl"
    // InternalDsl.g:1218:1: rule__ResponseConf__Group_1__0__Impl : ( 'content' ) ;
    public final void rule__ResponseConf__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1222:1: ( ( 'content' ) )
            // InternalDsl.g:1223:1: ( 'content' )
            {
            // InternalDsl.g:1223:1: ( 'content' )
            // InternalDsl.g:1224:2: 'content'
            {
             before(grammarAccess.getResponseConfAccess().getContentKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getResponseConfAccess().getContentKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_1__0__Impl"


    // $ANTLR start "rule__ResponseConf__Group_1__1"
    // InternalDsl.g:1233:1: rule__ResponseConf__Group_1__1 : rule__ResponseConf__Group_1__1__Impl ;
    public final void rule__ResponseConf__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1237:1: ( rule__ResponseConf__Group_1__1__Impl )
            // InternalDsl.g:1238:2: rule__ResponseConf__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResponseConf__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_1__1"


    // $ANTLR start "rule__ResponseConf__Group_1__1__Impl"
    // InternalDsl.g:1244:1: rule__ResponseConf__Group_1__1__Impl : ( ( rule__ResponseConf__ContentAssignment_1_1 ) ) ;
    public final void rule__ResponseConf__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1248:1: ( ( ( rule__ResponseConf__ContentAssignment_1_1 ) ) )
            // InternalDsl.g:1249:1: ( ( rule__ResponseConf__ContentAssignment_1_1 ) )
            {
            // InternalDsl.g:1249:1: ( ( rule__ResponseConf__ContentAssignment_1_1 ) )
            // InternalDsl.g:1250:2: ( rule__ResponseConf__ContentAssignment_1_1 )
            {
             before(grammarAccess.getResponseConfAccess().getContentAssignment_1_1()); 
            // InternalDsl.g:1251:2: ( rule__ResponseConf__ContentAssignment_1_1 )
            // InternalDsl.g:1251:3: rule__ResponseConf__ContentAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ResponseConf__ContentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseConfAccess().getContentAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_1__1__Impl"


    // $ANTLR start "rule__ResponseConf__Group_2__0"
    // InternalDsl.g:1260:1: rule__ResponseConf__Group_2__0 : rule__ResponseConf__Group_2__0__Impl rule__ResponseConf__Group_2__1 ;
    public final void rule__ResponseConf__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( rule__ResponseConf__Group_2__0__Impl rule__ResponseConf__Group_2__1 )
            // InternalDsl.g:1265:2: rule__ResponseConf__Group_2__0__Impl rule__ResponseConf__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ResponseConf__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseConf__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_2__0"


    // $ANTLR start "rule__ResponseConf__Group_2__0__Impl"
    // InternalDsl.g:1272:1: rule__ResponseConf__Group_2__0__Impl : ( 'headers' ) ;
    public final void rule__ResponseConf__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1276:1: ( ( 'headers' ) )
            // InternalDsl.g:1277:1: ( 'headers' )
            {
            // InternalDsl.g:1277:1: ( 'headers' )
            // InternalDsl.g:1278:2: 'headers'
            {
             before(grammarAccess.getResponseConfAccess().getHeadersKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getResponseConfAccess().getHeadersKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_2__0__Impl"


    // $ANTLR start "rule__ResponseConf__Group_2__1"
    // InternalDsl.g:1287:1: rule__ResponseConf__Group_2__1 : rule__ResponseConf__Group_2__1__Impl ;
    public final void rule__ResponseConf__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1291:1: ( rule__ResponseConf__Group_2__1__Impl )
            // InternalDsl.g:1292:2: rule__ResponseConf__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResponseConf__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_2__1"


    // $ANTLR start "rule__ResponseConf__Group_2__1__Impl"
    // InternalDsl.g:1298:1: rule__ResponseConf__Group_2__1__Impl : ( ( rule__ResponseConf__HeadersAssignment_2_1 )? ) ;
    public final void rule__ResponseConf__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1302:1: ( ( ( rule__ResponseConf__HeadersAssignment_2_1 )? ) )
            // InternalDsl.g:1303:1: ( ( rule__ResponseConf__HeadersAssignment_2_1 )? )
            {
            // InternalDsl.g:1303:1: ( ( rule__ResponseConf__HeadersAssignment_2_1 )? )
            // InternalDsl.g:1304:2: ( rule__ResponseConf__HeadersAssignment_2_1 )?
            {
             before(grammarAccess.getResponseConfAccess().getHeadersAssignment_2_1()); 
            // InternalDsl.g:1305:2: ( rule__ResponseConf__HeadersAssignment_2_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1305:3: rule__ResponseConf__HeadersAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseConf__HeadersAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseConfAccess().getHeadersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__Group_2__1__Impl"


    // $ANTLR start "rule__Headers__Group__0"
    // InternalDsl.g:1314:1: rule__Headers__Group__0 : rule__Headers__Group__0__Impl rule__Headers__Group__1 ;
    public final void rule__Headers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( rule__Headers__Group__0__Impl rule__Headers__Group__1 )
            // InternalDsl.g:1319:2: rule__Headers__Group__0__Impl rule__Headers__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Headers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Headers__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group__0"


    // $ANTLR start "rule__Headers__Group__0__Impl"
    // InternalDsl.g:1326:1: rule__Headers__Group__0__Impl : ( ( rule__Headers__HeadersAssignment_0 ) ) ;
    public final void rule__Headers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1330:1: ( ( ( rule__Headers__HeadersAssignment_0 ) ) )
            // InternalDsl.g:1331:1: ( ( rule__Headers__HeadersAssignment_0 ) )
            {
            // InternalDsl.g:1331:1: ( ( rule__Headers__HeadersAssignment_0 ) )
            // InternalDsl.g:1332:2: ( rule__Headers__HeadersAssignment_0 )
            {
             before(grammarAccess.getHeadersAccess().getHeadersAssignment_0()); 
            // InternalDsl.g:1333:2: ( rule__Headers__HeadersAssignment_0 )
            // InternalDsl.g:1333:3: rule__Headers__HeadersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Headers__HeadersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeadersAccess().getHeadersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group__0__Impl"


    // $ANTLR start "rule__Headers__Group__1"
    // InternalDsl.g:1341:1: rule__Headers__Group__1 : rule__Headers__Group__1__Impl ;
    public final void rule__Headers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1345:1: ( rule__Headers__Group__1__Impl )
            // InternalDsl.g:1346:2: rule__Headers__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Headers__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group__1"


    // $ANTLR start "rule__Headers__Group__1__Impl"
    // InternalDsl.g:1352:1: rule__Headers__Group__1__Impl : ( ( rule__Headers__Group_1__0 )* ) ;
    public final void rule__Headers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1356:1: ( ( ( rule__Headers__Group_1__0 )* ) )
            // InternalDsl.g:1357:1: ( ( rule__Headers__Group_1__0 )* )
            {
            // InternalDsl.g:1357:1: ( ( rule__Headers__Group_1__0 )* )
            // InternalDsl.g:1358:2: ( rule__Headers__Group_1__0 )*
            {
             before(grammarAccess.getHeadersAccess().getGroup_1()); 
            // InternalDsl.g:1359:2: ( rule__Headers__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1359:3: rule__Headers__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Headers__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getHeadersAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group__1__Impl"


    // $ANTLR start "rule__Headers__Group_1__0"
    // InternalDsl.g:1368:1: rule__Headers__Group_1__0 : rule__Headers__Group_1__0__Impl rule__Headers__Group_1__1 ;
    public final void rule__Headers__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( rule__Headers__Group_1__0__Impl rule__Headers__Group_1__1 )
            // InternalDsl.g:1373:2: rule__Headers__Group_1__0__Impl rule__Headers__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Headers__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Headers__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group_1__0"


    // $ANTLR start "rule__Headers__Group_1__0__Impl"
    // InternalDsl.g:1380:1: rule__Headers__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Headers__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1384:1: ( ( ',' ) )
            // InternalDsl.g:1385:1: ( ',' )
            {
            // InternalDsl.g:1385:1: ( ',' )
            // InternalDsl.g:1386:2: ','
            {
             before(grammarAccess.getHeadersAccess().getCommaKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHeadersAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group_1__0__Impl"


    // $ANTLR start "rule__Headers__Group_1__1"
    // InternalDsl.g:1395:1: rule__Headers__Group_1__1 : rule__Headers__Group_1__1__Impl ;
    public final void rule__Headers__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( rule__Headers__Group_1__1__Impl )
            // InternalDsl.g:1400:2: rule__Headers__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Headers__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group_1__1"


    // $ANTLR start "rule__Headers__Group_1__1__Impl"
    // InternalDsl.g:1406:1: rule__Headers__Group_1__1__Impl : ( ( rule__Headers__HeadersAssignment_1_1 ) ) ;
    public final void rule__Headers__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1410:1: ( ( ( rule__Headers__HeadersAssignment_1_1 ) ) )
            // InternalDsl.g:1411:1: ( ( rule__Headers__HeadersAssignment_1_1 ) )
            {
            // InternalDsl.g:1411:1: ( ( rule__Headers__HeadersAssignment_1_1 ) )
            // InternalDsl.g:1412:2: ( rule__Headers__HeadersAssignment_1_1 )
            {
             before(grammarAccess.getHeadersAccess().getHeadersAssignment_1_1()); 
            // InternalDsl.g:1413:2: ( rule__Headers__HeadersAssignment_1_1 )
            // InternalDsl.g:1413:3: rule__Headers__HeadersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Headers__HeadersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadersAccess().getHeadersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__Group_1__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalDsl.g:1422:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1426:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalDsl.g:1427:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalDsl.g:1434:1: rule__Header__Group__0__Impl : ( ( rule__Header__HeaderNameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1438:1: ( ( ( rule__Header__HeaderNameAssignment_0 ) ) )
            // InternalDsl.g:1439:1: ( ( rule__Header__HeaderNameAssignment_0 ) )
            {
            // InternalDsl.g:1439:1: ( ( rule__Header__HeaderNameAssignment_0 ) )
            // InternalDsl.g:1440:2: ( rule__Header__HeaderNameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getHeaderNameAssignment_0()); 
            // InternalDsl.g:1441:2: ( rule__Header__HeaderNameAssignment_0 )
            // InternalDsl.g:1441:3: rule__Header__HeaderNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Header__HeaderNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getHeaderNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalDsl.g:1449:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1453:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalDsl.g:1454:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalDsl.g:1461:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1465:1: ( ( ':' ) )
            // InternalDsl.g:1466:1: ( ':' )
            {
            // InternalDsl.g:1466:1: ( ':' )
            // InternalDsl.g:1467:2: ':'
            {
             before(grammarAccess.getHeaderAccess().getColonKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalDsl.g:1476:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1480:1: ( rule__Header__Group__2__Impl )
            // InternalDsl.g:1481:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalDsl.g:1487:1: rule__Header__Group__2__Impl : ( ( rule__Header__HeaderValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1491:1: ( ( ( rule__Header__HeaderValueAssignment_2 ) ) )
            // InternalDsl.g:1492:1: ( ( rule__Header__HeaderValueAssignment_2 ) )
            {
            // InternalDsl.g:1492:1: ( ( rule__Header__HeaderValueAssignment_2 ) )
            // InternalDsl.g:1493:2: ( rule__Header__HeaderValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getHeaderValueAssignment_2()); 
            // InternalDsl.g:1494:2: ( rule__Header__HeaderValueAssignment_2 )
            // InternalDsl.g:1494:3: rule__Header__HeaderValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header__HeaderValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getHeaderValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__OrCondition__Group__0"
    // InternalDsl.g:1503:1: rule__OrCondition__Group__0 : rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 ;
    public final void rule__OrCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 )
            // InternalDsl.g:1508:2: rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OrCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__0"


    // $ANTLR start "rule__OrCondition__Group__0__Impl"
    // InternalDsl.g:1515:1: rule__OrCondition__Group__0__Impl : ( ruleAndCondition ) ;
    public final void rule__OrCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1519:1: ( ( ruleAndCondition ) )
            // InternalDsl.g:1520:1: ( ruleAndCondition )
            {
            // InternalDsl.g:1520:1: ( ruleAndCondition )
            // InternalDsl.g:1521:2: ruleAndCondition
            {
             before(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__0__Impl"


    // $ANTLR start "rule__OrCondition__Group__1"
    // InternalDsl.g:1530:1: rule__OrCondition__Group__1 : rule__OrCondition__Group__1__Impl ;
    public final void rule__OrCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1534:1: ( rule__OrCondition__Group__1__Impl )
            // InternalDsl.g:1535:2: rule__OrCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__1"


    // $ANTLR start "rule__OrCondition__Group__1__Impl"
    // InternalDsl.g:1541:1: rule__OrCondition__Group__1__Impl : ( ( rule__OrCondition__Group_1__0 )* ) ;
    public final void rule__OrCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1545:1: ( ( ( rule__OrCondition__Group_1__0 )* ) )
            // InternalDsl.g:1546:1: ( ( rule__OrCondition__Group_1__0 )* )
            {
            // InternalDsl.g:1546:1: ( ( rule__OrCondition__Group_1__0 )* )
            // InternalDsl.g:1547:2: ( rule__OrCondition__Group_1__0 )*
            {
             before(grammarAccess.getOrConditionAccess().getGroup_1()); 
            // InternalDsl.g:1548:2: ( rule__OrCondition__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1548:3: rule__OrCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OrCondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOrConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__1__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__0"
    // InternalDsl.g:1557:1: rule__OrCondition__Group_1__0 : rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 ;
    public final void rule__OrCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1561:1: ( rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 )
            // InternalDsl.g:1562:2: rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__OrCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__0"


    // $ANTLR start "rule__OrCondition__Group_1__0__Impl"
    // InternalDsl.g:1569:1: rule__OrCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__OrCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1573:1: ( ( () ) )
            // InternalDsl.g:1574:1: ( () )
            {
            // InternalDsl.g:1574:1: ( () )
            // InternalDsl.g:1575:2: ()
            {
             before(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0()); 
            // InternalDsl.g:1576:2: ()
            // InternalDsl.g:1576:3: 
            {
            }

             after(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__0__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__1"
    // InternalDsl.g:1584:1: rule__OrCondition__Group_1__1 : rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 ;
    public final void rule__OrCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 )
            // InternalDsl.g:1589:2: rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__OrCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__1"


    // $ANTLR start "rule__OrCondition__Group_1__1__Impl"
    // InternalDsl.g:1596:1: rule__OrCondition__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1600:1: ( ( 'or' ) )
            // InternalDsl.g:1601:1: ( 'or' )
            {
            // InternalDsl.g:1601:1: ( 'or' )
            // InternalDsl.g:1602:2: 'or'
            {
             before(grammarAccess.getOrConditionAccess().getOrKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOrConditionAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__1__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__2"
    // InternalDsl.g:1611:1: rule__OrCondition__Group_1__2 : rule__OrCondition__Group_1__2__Impl ;
    public final void rule__OrCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( rule__OrCondition__Group_1__2__Impl )
            // InternalDsl.g:1616:2: rule__OrCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__2"


    // $ANTLR start "rule__OrCondition__Group_1__2__Impl"
    // InternalDsl.g:1622:1: rule__OrCondition__Group_1__2__Impl : ( ( rule__OrCondition__RightAssignment_1_2 ) ) ;
    public final void rule__OrCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1626:1: ( ( ( rule__OrCondition__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1627:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1627:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            // InternalDsl.g:1628:2: ( rule__OrCondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrConditionAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1629:2: ( rule__OrCondition__RightAssignment_1_2 )
            // InternalDsl.g:1629:3: rule__OrCondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrConditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__2__Impl"


    // $ANTLR start "rule__AndCondition__Group__0"
    // InternalDsl.g:1638:1: rule__AndCondition__Group__0 : rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 ;
    public final void rule__AndCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1642:1: ( rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 )
            // InternalDsl.g:1643:2: rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AndCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__0"


    // $ANTLR start "rule__AndCondition__Group__0__Impl"
    // InternalDsl.g:1650:1: rule__AndCondition__Group__0__Impl : ( ruleOptionalNegationCondition ) ;
    public final void rule__AndCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1654:1: ( ( ruleOptionalNegationCondition ) )
            // InternalDsl.g:1655:1: ( ruleOptionalNegationCondition )
            {
            // InternalDsl.g:1655:1: ( ruleOptionalNegationCondition )
            // InternalDsl.g:1656:2: ruleOptionalNegationCondition
            {
             before(grammarAccess.getAndConditionAccess().getOptionalNegationConditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalNegationCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionAccess().getOptionalNegationConditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__0__Impl"


    // $ANTLR start "rule__AndCondition__Group__1"
    // InternalDsl.g:1665:1: rule__AndCondition__Group__1 : rule__AndCondition__Group__1__Impl ;
    public final void rule__AndCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( rule__AndCondition__Group__1__Impl )
            // InternalDsl.g:1670:2: rule__AndCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__1"


    // $ANTLR start "rule__AndCondition__Group__1__Impl"
    // InternalDsl.g:1676:1: rule__AndCondition__Group__1__Impl : ( ( rule__AndCondition__Group_1__0 )* ) ;
    public final void rule__AndCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1680:1: ( ( ( rule__AndCondition__Group_1__0 )* ) )
            // InternalDsl.g:1681:1: ( ( rule__AndCondition__Group_1__0 )* )
            {
            // InternalDsl.g:1681:1: ( ( rule__AndCondition__Group_1__0 )* )
            // InternalDsl.g:1682:2: ( rule__AndCondition__Group_1__0 )*
            {
             before(grammarAccess.getAndConditionAccess().getGroup_1()); 
            // InternalDsl.g:1683:2: ( rule__AndCondition__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1683:3: rule__AndCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AndCondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAndConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__1__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__0"
    // InternalDsl.g:1692:1: rule__AndCondition__Group_1__0 : rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 ;
    public final void rule__AndCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1696:1: ( rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 )
            // InternalDsl.g:1697:2: rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__AndCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__0"


    // $ANTLR start "rule__AndCondition__Group_1__0__Impl"
    // InternalDsl.g:1704:1: rule__AndCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__AndCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1708:1: ( ( () ) )
            // InternalDsl.g:1709:1: ( () )
            {
            // InternalDsl.g:1709:1: ( () )
            // InternalDsl.g:1710:2: ()
            {
             before(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0()); 
            // InternalDsl.g:1711:2: ()
            // InternalDsl.g:1711:3: 
            {
            }

             after(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__0__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__1"
    // InternalDsl.g:1719:1: rule__AndCondition__Group_1__1 : rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 ;
    public final void rule__AndCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 )
            // InternalDsl.g:1724:2: rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__AndCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__1"


    // $ANTLR start "rule__AndCondition__Group_1__1__Impl"
    // InternalDsl.g:1731:1: rule__AndCondition__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1735:1: ( ( 'and' ) )
            // InternalDsl.g:1736:1: ( 'and' )
            {
            // InternalDsl.g:1736:1: ( 'and' )
            // InternalDsl.g:1737:2: 'and'
            {
             before(grammarAccess.getAndConditionAccess().getAndKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAndConditionAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__1__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__2"
    // InternalDsl.g:1746:1: rule__AndCondition__Group_1__2 : rule__AndCondition__Group_1__2__Impl ;
    public final void rule__AndCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1750:1: ( rule__AndCondition__Group_1__2__Impl )
            // InternalDsl.g:1751:2: rule__AndCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__2"


    // $ANTLR start "rule__AndCondition__Group_1__2__Impl"
    // InternalDsl.g:1757:1: rule__AndCondition__Group_1__2__Impl : ( ( rule__AndCondition__RightAssignment_1_2 ) ) ;
    public final void rule__AndCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1761:1: ( ( ( rule__AndCondition__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1762:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1762:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            // InternalDsl.g:1763:2: ( rule__AndCondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndConditionAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1764:2: ( rule__AndCondition__RightAssignment_1_2 )
            // InternalDsl.g:1764:3: rule__AndCondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndConditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__2__Impl"


    // $ANTLR start "rule__OptionalNegationCondition__Group_1__0"
    // InternalDsl.g:1773:1: rule__OptionalNegationCondition__Group_1__0 : rule__OptionalNegationCondition__Group_1__0__Impl rule__OptionalNegationCondition__Group_1__1 ;
    public final void rule__OptionalNegationCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1777:1: ( rule__OptionalNegationCondition__Group_1__0__Impl rule__OptionalNegationCondition__Group_1__1 )
            // InternalDsl.g:1778:2: rule__OptionalNegationCondition__Group_1__0__Impl rule__OptionalNegationCondition__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OptionalNegationCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalNegationCondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__Group_1__0"


    // $ANTLR start "rule__OptionalNegationCondition__Group_1__0__Impl"
    // InternalDsl.g:1785:1: rule__OptionalNegationCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__OptionalNegationCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1789:1: ( ( () ) )
            // InternalDsl.g:1790:1: ( () )
            {
            // InternalDsl.g:1790:1: ( () )
            // InternalDsl.g:1791:2: ()
            {
             before(grammarAccess.getOptionalNegationConditionAccess().getNegationAction_1_0()); 
            // InternalDsl.g:1792:2: ()
            // InternalDsl.g:1792:3: 
            {
            }

             after(grammarAccess.getOptionalNegationConditionAccess().getNegationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__Group_1__0__Impl"


    // $ANTLR start "rule__OptionalNegationCondition__Group_1__1"
    // InternalDsl.g:1800:1: rule__OptionalNegationCondition__Group_1__1 : rule__OptionalNegationCondition__Group_1__1__Impl rule__OptionalNegationCondition__Group_1__2 ;
    public final void rule__OptionalNegationCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( rule__OptionalNegationCondition__Group_1__1__Impl rule__OptionalNegationCondition__Group_1__2 )
            // InternalDsl.g:1805:2: rule__OptionalNegationCondition__Group_1__1__Impl rule__OptionalNegationCondition__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__OptionalNegationCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalNegationCondition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__Group_1__1"


    // $ANTLR start "rule__OptionalNegationCondition__Group_1__1__Impl"
    // InternalDsl.g:1812:1: rule__OptionalNegationCondition__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__OptionalNegationCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1816:1: ( ( 'not' ) )
            // InternalDsl.g:1817:1: ( 'not' )
            {
            // InternalDsl.g:1817:1: ( 'not' )
            // InternalDsl.g:1818:2: 'not'
            {
             before(grammarAccess.getOptionalNegationConditionAccess().getNotKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOptionalNegationConditionAccess().getNotKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__Group_1__1__Impl"


    // $ANTLR start "rule__OptionalNegationCondition__Group_1__2"
    // InternalDsl.g:1827:1: rule__OptionalNegationCondition__Group_1__2 : rule__OptionalNegationCondition__Group_1__2__Impl ;
    public final void rule__OptionalNegationCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1831:1: ( rule__OptionalNegationCondition__Group_1__2__Impl )
            // InternalDsl.g:1832:2: rule__OptionalNegationCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalNegationCondition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__Group_1__2"


    // $ANTLR start "rule__OptionalNegationCondition__Group_1__2__Impl"
    // InternalDsl.g:1838:1: rule__OptionalNegationCondition__Group_1__2__Impl : ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) ) ;
    public final void rule__OptionalNegationCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1842:1: ( ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) ) )
            // InternalDsl.g:1843:1: ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) )
            {
            // InternalDsl.g:1843:1: ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) )
            // InternalDsl.g:1844:2: ( rule__OptionalNegationCondition__NegatedAssignment_1_2 )
            {
             before(grammarAccess.getOptionalNegationConditionAccess().getNegatedAssignment_1_2()); 
            // InternalDsl.g:1845:2: ( rule__OptionalNegationCondition__NegatedAssignment_1_2 )
            // InternalDsl.g:1845:3: rule__OptionalNegationCondition__NegatedAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OptionalNegationCondition__NegatedAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionalNegationConditionAccess().getNegatedAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__Group_1__2__Impl"


    // $ANTLR start "rule__BracketedCondition__Group_1__0"
    // InternalDsl.g:1854:1: rule__BracketedCondition__Group_1__0 : rule__BracketedCondition__Group_1__0__Impl rule__BracketedCondition__Group_1__1 ;
    public final void rule__BracketedCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( rule__BracketedCondition__Group_1__0__Impl rule__BracketedCondition__Group_1__1 )
            // InternalDsl.g:1859:2: rule__BracketedCondition__Group_1__0__Impl rule__BracketedCondition__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BracketedCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BracketedCondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__Group_1__0"


    // $ANTLR start "rule__BracketedCondition__Group_1__0__Impl"
    // InternalDsl.g:1866:1: rule__BracketedCondition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BracketedCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1870:1: ( ( '(' ) )
            // InternalDsl.g:1871:1: ( '(' )
            {
            // InternalDsl.g:1871:1: ( '(' )
            // InternalDsl.g:1872:2: '('
            {
             before(grammarAccess.getBracketedConditionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBracketedConditionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__Group_1__0__Impl"


    // $ANTLR start "rule__BracketedCondition__Group_1__1"
    // InternalDsl.g:1881:1: rule__BracketedCondition__Group_1__1 : rule__BracketedCondition__Group_1__1__Impl rule__BracketedCondition__Group_1__2 ;
    public final void rule__BracketedCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1885:1: ( rule__BracketedCondition__Group_1__1__Impl rule__BracketedCondition__Group_1__2 )
            // InternalDsl.g:1886:2: rule__BracketedCondition__Group_1__1__Impl rule__BracketedCondition__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__BracketedCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BracketedCondition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__Group_1__1"


    // $ANTLR start "rule__BracketedCondition__Group_1__1__Impl"
    // InternalDsl.g:1893:1: rule__BracketedCondition__Group_1__1__Impl : ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) ) ;
    public final void rule__BracketedCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1897:1: ( ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) ) )
            // InternalDsl.g:1898:1: ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) )
            {
            // InternalDsl.g:1898:1: ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) )
            // InternalDsl.g:1899:2: ( rule__BracketedCondition__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getBracketedConditionAccess().getConditionAssignment_1_1()); 
            // InternalDsl.g:1900:2: ( rule__BracketedCondition__ConditionAssignment_1_1 )
            // InternalDsl.g:1900:3: rule__BracketedCondition__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BracketedCondition__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketedConditionAccess().getConditionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__Group_1__1__Impl"


    // $ANTLR start "rule__BracketedCondition__Group_1__2"
    // InternalDsl.g:1908:1: rule__BracketedCondition__Group_1__2 : rule__BracketedCondition__Group_1__2__Impl ;
    public final void rule__BracketedCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1912:1: ( rule__BracketedCondition__Group_1__2__Impl )
            // InternalDsl.g:1913:2: rule__BracketedCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BracketedCondition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__Group_1__2"


    // $ANTLR start "rule__BracketedCondition__Group_1__2__Impl"
    // InternalDsl.g:1919:1: rule__BracketedCondition__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BracketedCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1923:1: ( ( ')' ) )
            // InternalDsl.g:1924:1: ( ')' )
            {
            // InternalDsl.g:1924:1: ( ')' )
            // InternalDsl.g:1925:2: ')'
            {
             before(grammarAccess.getBracketedConditionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBracketedConditionAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__Group_1__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalDsl.g:1935:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1939:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalDsl.g:1940:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalDsl.g:1947:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1951:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalDsl.g:1952:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalDsl.g:1952:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalDsl.g:1953:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalDsl.g:1954:2: ( rule__Expression__LeftAssignment_0 )
            // InternalDsl.g:1954:3: rule__Expression__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalDsl.g:1962:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1966:1: ( rule__Expression__Group__1__Impl )
            // InternalDsl.g:1967:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalDsl.g:1973:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1977:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalDsl.g:1978:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalDsl.g:1978:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalDsl.g:1979:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalDsl.g:1980:2: ( rule__Expression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=12 && LA15_0<=18)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1980:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalDsl.g:1989:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1993:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalDsl.g:1994:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalDsl.g:2001:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OpAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2005:1: ( ( ( rule__Expression__OpAssignment_1_0 ) ) )
            // InternalDsl.g:2006:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            {
            // InternalDsl.g:2006:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            // InternalDsl.g:2007:2: ( rule__Expression__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 
            // InternalDsl.g:2008:2: ( rule__Expression__OpAssignment_1_0 )
            // InternalDsl.g:2008:3: rule__Expression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalDsl.g:2016:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2020:1: ( rule__Expression__Group_1__1__Impl )
            // InternalDsl.g:2021:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalDsl.g:2027:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2031:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalDsl.g:2032:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalDsl.g:2032:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalDsl.g:2033:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalDsl.g:2034:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalDsl.g:2034:3: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__ListFunction__Group__0"
    // InternalDsl.g:2043:1: rule__ListFunction__Group__0 : rule__ListFunction__Group__0__Impl rule__ListFunction__Group__1 ;
    public final void rule__ListFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2047:1: ( rule__ListFunction__Group__0__Impl rule__ListFunction__Group__1 )
            // InternalDsl.g:2048:2: rule__ListFunction__Group__0__Impl rule__ListFunction__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ListFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__0"


    // $ANTLR start "rule__ListFunction__Group__0__Impl"
    // InternalDsl.g:2055:1: rule__ListFunction__Group__0__Impl : ( '{' ) ;
    public final void rule__ListFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2059:1: ( ( '{' ) )
            // InternalDsl.g:2060:1: ( '{' )
            {
            // InternalDsl.g:2060:1: ( '{' )
            // InternalDsl.g:2061:2: '{'
            {
             before(grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getListFunctionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__0__Impl"


    // $ANTLR start "rule__ListFunction__Group__1"
    // InternalDsl.g:2070:1: rule__ListFunction__Group__1 : rule__ListFunction__Group__1__Impl rule__ListFunction__Group__2 ;
    public final void rule__ListFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2074:1: ( rule__ListFunction__Group__1__Impl rule__ListFunction__Group__2 )
            // InternalDsl.g:2075:2: rule__ListFunction__Group__1__Impl rule__ListFunction__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ListFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__1"


    // $ANTLR start "rule__ListFunction__Group__1__Impl"
    // InternalDsl.g:2082:1: rule__ListFunction__Group__1__Impl : ( ( rule__ListFunction__OpAssignment_1 ) ) ;
    public final void rule__ListFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2086:1: ( ( ( rule__ListFunction__OpAssignment_1 ) ) )
            // InternalDsl.g:2087:1: ( ( rule__ListFunction__OpAssignment_1 ) )
            {
            // InternalDsl.g:2087:1: ( ( rule__ListFunction__OpAssignment_1 ) )
            // InternalDsl.g:2088:2: ( rule__ListFunction__OpAssignment_1 )
            {
             before(grammarAccess.getListFunctionAccess().getOpAssignment_1()); 
            // InternalDsl.g:2089:2: ( rule__ListFunction__OpAssignment_1 )
            // InternalDsl.g:2089:3: rule__ListFunction__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListFunction__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListFunctionAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__1__Impl"


    // $ANTLR start "rule__ListFunction__Group__2"
    // InternalDsl.g:2097:1: rule__ListFunction__Group__2 : rule__ListFunction__Group__2__Impl rule__ListFunction__Group__3 ;
    public final void rule__ListFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2101:1: ( rule__ListFunction__Group__2__Impl rule__ListFunction__Group__3 )
            // InternalDsl.g:2102:2: rule__ListFunction__Group__2__Impl rule__ListFunction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ListFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__2"


    // $ANTLR start "rule__ListFunction__Group__2__Impl"
    // InternalDsl.g:2109:1: rule__ListFunction__Group__2__Impl : ( ( rule__ListFunction__AliasAssignment_2 ) ) ;
    public final void rule__ListFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2113:1: ( ( ( rule__ListFunction__AliasAssignment_2 ) ) )
            // InternalDsl.g:2114:1: ( ( rule__ListFunction__AliasAssignment_2 ) )
            {
            // InternalDsl.g:2114:1: ( ( rule__ListFunction__AliasAssignment_2 ) )
            // InternalDsl.g:2115:2: ( rule__ListFunction__AliasAssignment_2 )
            {
             before(grammarAccess.getListFunctionAccess().getAliasAssignment_2()); 
            // InternalDsl.g:2116:2: ( rule__ListFunction__AliasAssignment_2 )
            // InternalDsl.g:2116:3: rule__ListFunction__AliasAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListFunction__AliasAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListFunctionAccess().getAliasAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__2__Impl"


    // $ANTLR start "rule__ListFunction__Group__3"
    // InternalDsl.g:2124:1: rule__ListFunction__Group__3 : rule__ListFunction__Group__3__Impl rule__ListFunction__Group__4 ;
    public final void rule__ListFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2128:1: ( rule__ListFunction__Group__3__Impl rule__ListFunction__Group__4 )
            // InternalDsl.g:2129:2: rule__ListFunction__Group__3__Impl rule__ListFunction__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ListFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__3"


    // $ANTLR start "rule__ListFunction__Group__3__Impl"
    // InternalDsl.g:2136:1: rule__ListFunction__Group__3__Impl : ( ( rule__ListFunction__SeparatorAssignment_3 ) ) ;
    public final void rule__ListFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2140:1: ( ( ( rule__ListFunction__SeparatorAssignment_3 ) ) )
            // InternalDsl.g:2141:1: ( ( rule__ListFunction__SeparatorAssignment_3 ) )
            {
            // InternalDsl.g:2141:1: ( ( rule__ListFunction__SeparatorAssignment_3 ) )
            // InternalDsl.g:2142:2: ( rule__ListFunction__SeparatorAssignment_3 )
            {
             before(grammarAccess.getListFunctionAccess().getSeparatorAssignment_3()); 
            // InternalDsl.g:2143:2: ( rule__ListFunction__SeparatorAssignment_3 )
            // InternalDsl.g:2143:3: rule__ListFunction__SeparatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ListFunction__SeparatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getListFunctionAccess().getSeparatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__3__Impl"


    // $ANTLR start "rule__ListFunction__Group__4"
    // InternalDsl.g:2151:1: rule__ListFunction__Group__4 : rule__ListFunction__Group__4__Impl rule__ListFunction__Group__5 ;
    public final void rule__ListFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2155:1: ( rule__ListFunction__Group__4__Impl rule__ListFunction__Group__5 )
            // InternalDsl.g:2156:2: rule__ListFunction__Group__4__Impl rule__ListFunction__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ListFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__4"


    // $ANTLR start "rule__ListFunction__Group__4__Impl"
    // InternalDsl.g:2163:1: rule__ListFunction__Group__4__Impl : ( ( rule__ListFunction__ConditionAssignment_4 ) ) ;
    public final void rule__ListFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2167:1: ( ( ( rule__ListFunction__ConditionAssignment_4 ) ) )
            // InternalDsl.g:2168:1: ( ( rule__ListFunction__ConditionAssignment_4 ) )
            {
            // InternalDsl.g:2168:1: ( ( rule__ListFunction__ConditionAssignment_4 ) )
            // InternalDsl.g:2169:2: ( rule__ListFunction__ConditionAssignment_4 )
            {
             before(grammarAccess.getListFunctionAccess().getConditionAssignment_4()); 
            // InternalDsl.g:2170:2: ( rule__ListFunction__ConditionAssignment_4 )
            // InternalDsl.g:2170:3: rule__ListFunction__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ListFunction__ConditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getListFunctionAccess().getConditionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__4__Impl"


    // $ANTLR start "rule__ListFunction__Group__5"
    // InternalDsl.g:2178:1: rule__ListFunction__Group__5 : rule__ListFunction__Group__5__Impl ;
    public final void rule__ListFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2182:1: ( rule__ListFunction__Group__5__Impl )
            // InternalDsl.g:2183:2: rule__ListFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__5"


    // $ANTLR start "rule__ListFunction__Group__5__Impl"
    // InternalDsl.g:2189:1: rule__ListFunction__Group__5__Impl : ( '}' ) ;
    public final void rule__ListFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2193:1: ( ( '}' ) )
            // InternalDsl.g:2194:1: ( '}' )
            {
            // InternalDsl.g:2194:1: ( '}' )
            // InternalDsl.g:2195:2: '}'
            {
             before(grammarAccess.getListFunctionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getListFunctionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalDsl.g:2205:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2209:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDsl.g:2210:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalDsl.g:2217:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__NameAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2221:1: ( ( ( rule__Reference__NameAssignment_0 ) ) )
            // InternalDsl.g:2222:1: ( ( rule__Reference__NameAssignment_0 ) )
            {
            // InternalDsl.g:2222:1: ( ( rule__Reference__NameAssignment_0 ) )
            // InternalDsl.g:2223:2: ( rule__Reference__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_0()); 
            // InternalDsl.g:2224:2: ( rule__Reference__NameAssignment_0 )
            // InternalDsl.g:2224:3: rule__Reference__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalDsl.g:2232:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2236:1: ( rule__Reference__Group__1__Impl )
            // InternalDsl.g:2237:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalDsl.g:2243:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__PropAssignment_1 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2247:1: ( ( ( rule__Reference__PropAssignment_1 )? ) )
            // InternalDsl.g:2248:1: ( ( rule__Reference__PropAssignment_1 )? )
            {
            // InternalDsl.g:2248:1: ( ( rule__Reference__PropAssignment_1 )? )
            // InternalDsl.g:2249:2: ( rule__Reference__PropAssignment_1 )?
            {
             before(grammarAccess.getReferenceAccess().getPropAssignment_1()); 
            // InternalDsl.g:2250:2: ( rule__Reference__PropAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37||LA16_0==40||LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:2250:3: rule__Reference__PropAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__PropAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getPropAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__ListElementReference__Group__0"
    // InternalDsl.g:2259:1: rule__ListElementReference__Group__0 : rule__ListElementReference__Group__0__Impl rule__ListElementReference__Group__1 ;
    public final void rule__ListElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2263:1: ( rule__ListElementReference__Group__0__Impl rule__ListElementReference__Group__1 )
            // InternalDsl.g:2264:2: rule__ListElementReference__Group__0__Impl rule__ListElementReference__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ListElementReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListElementReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__Group__0"


    // $ANTLR start "rule__ListElementReference__Group__0__Impl"
    // InternalDsl.g:2271:1: rule__ListElementReference__Group__0__Impl : ( '$' ) ;
    public final void rule__ListElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2275:1: ( ( '$' ) )
            // InternalDsl.g:2276:1: ( '$' )
            {
            // InternalDsl.g:2276:1: ( '$' )
            // InternalDsl.g:2277:2: '$'
            {
             before(grammarAccess.getListElementReferenceAccess().getDollarSignKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getListElementReferenceAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__Group__0__Impl"


    // $ANTLR start "rule__ListElementReference__Group__1"
    // InternalDsl.g:2286:1: rule__ListElementReference__Group__1 : rule__ListElementReference__Group__1__Impl rule__ListElementReference__Group__2 ;
    public final void rule__ListElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2290:1: ( rule__ListElementReference__Group__1__Impl rule__ListElementReference__Group__2 )
            // InternalDsl.g:2291:2: rule__ListElementReference__Group__1__Impl rule__ListElementReference__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ListElementReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListElementReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__Group__1"


    // $ANTLR start "rule__ListElementReference__Group__1__Impl"
    // InternalDsl.g:2298:1: rule__ListElementReference__Group__1__Impl : ( ( rule__ListElementReference__NameAssignment_1 ) ) ;
    public final void rule__ListElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2302:1: ( ( ( rule__ListElementReference__NameAssignment_1 ) ) )
            // InternalDsl.g:2303:1: ( ( rule__ListElementReference__NameAssignment_1 ) )
            {
            // InternalDsl.g:2303:1: ( ( rule__ListElementReference__NameAssignment_1 ) )
            // InternalDsl.g:2304:2: ( rule__ListElementReference__NameAssignment_1 )
            {
             before(grammarAccess.getListElementReferenceAccess().getNameAssignment_1()); 
            // InternalDsl.g:2305:2: ( rule__ListElementReference__NameAssignment_1 )
            // InternalDsl.g:2305:3: rule__ListElementReference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListElementReference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListElementReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__Group__1__Impl"


    // $ANTLR start "rule__ListElementReference__Group__2"
    // InternalDsl.g:2313:1: rule__ListElementReference__Group__2 : rule__ListElementReference__Group__2__Impl ;
    public final void rule__ListElementReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2317:1: ( rule__ListElementReference__Group__2__Impl )
            // InternalDsl.g:2318:2: rule__ListElementReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListElementReference__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__Group__2"


    // $ANTLR start "rule__ListElementReference__Group__2__Impl"
    // InternalDsl.g:2324:1: rule__ListElementReference__Group__2__Impl : ( ( rule__ListElementReference__PropAssignment_2 )? ) ;
    public final void rule__ListElementReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2328:1: ( ( ( rule__ListElementReference__PropAssignment_2 )? ) )
            // InternalDsl.g:2329:1: ( ( rule__ListElementReference__PropAssignment_2 )? )
            {
            // InternalDsl.g:2329:1: ( ( rule__ListElementReference__PropAssignment_2 )? )
            // InternalDsl.g:2330:2: ( rule__ListElementReference__PropAssignment_2 )?
            {
             before(grammarAccess.getListElementReferenceAccess().getPropAssignment_2()); 
            // InternalDsl.g:2331:2: ( rule__ListElementReference__PropAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37||LA17_0==40||LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:2331:3: rule__ListElementReference__PropAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListElementReference__PropAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListElementReferenceAccess().getPropAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__Group__2__Impl"


    // $ANTLR start "rule__CollectionAccess__Group__0"
    // InternalDsl.g:2340:1: rule__CollectionAccess__Group__0 : rule__CollectionAccess__Group__0__Impl rule__CollectionAccess__Group__1 ;
    public final void rule__CollectionAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( rule__CollectionAccess__Group__0__Impl rule__CollectionAccess__Group__1 )
            // InternalDsl.g:2345:2: rule__CollectionAccess__Group__0__Impl rule__CollectionAccess__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__CollectionAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__Group__0"


    // $ANTLR start "rule__CollectionAccess__Group__0__Impl"
    // InternalDsl.g:2352:1: rule__CollectionAccess__Group__0__Impl : ( '[' ) ;
    public final void rule__CollectionAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2356:1: ( ( '[' ) )
            // InternalDsl.g:2357:1: ( '[' )
            {
            // InternalDsl.g:2357:1: ( '[' )
            // InternalDsl.g:2358:2: '['
            {
             before(grammarAccess.getCollectionAccessAccess().getLeftSquareBracketKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCollectionAccessAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__Group__0__Impl"


    // $ANTLR start "rule__CollectionAccess__Group__1"
    // InternalDsl.g:2367:1: rule__CollectionAccess__Group__1 : rule__CollectionAccess__Group__1__Impl rule__CollectionAccess__Group__2 ;
    public final void rule__CollectionAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2371:1: ( rule__CollectionAccess__Group__1__Impl rule__CollectionAccess__Group__2 )
            // InternalDsl.g:2372:2: rule__CollectionAccess__Group__1__Impl rule__CollectionAccess__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__CollectionAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__Group__1"


    // $ANTLR start "rule__CollectionAccess__Group__1__Impl"
    // InternalDsl.g:2379:1: rule__CollectionAccess__Group__1__Impl : ( ( rule__CollectionAccess__Alternatives_1 ) ) ;
    public final void rule__CollectionAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2383:1: ( ( ( rule__CollectionAccess__Alternatives_1 ) ) )
            // InternalDsl.g:2384:1: ( ( rule__CollectionAccess__Alternatives_1 ) )
            {
            // InternalDsl.g:2384:1: ( ( rule__CollectionAccess__Alternatives_1 ) )
            // InternalDsl.g:2385:2: ( rule__CollectionAccess__Alternatives_1 )
            {
             before(grammarAccess.getCollectionAccessAccess().getAlternatives_1()); 
            // InternalDsl.g:2386:2: ( rule__CollectionAccess__Alternatives_1 )
            // InternalDsl.g:2386:3: rule__CollectionAccess__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectionAccess__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccessAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__Group__1__Impl"


    // $ANTLR start "rule__CollectionAccess__Group__2"
    // InternalDsl.g:2394:1: rule__CollectionAccess__Group__2 : rule__CollectionAccess__Group__2__Impl ;
    public final void rule__CollectionAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( rule__CollectionAccess__Group__2__Impl )
            // InternalDsl.g:2399:2: rule__CollectionAccess__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionAccess__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__Group__2"


    // $ANTLR start "rule__CollectionAccess__Group__2__Impl"
    // InternalDsl.g:2405:1: rule__CollectionAccess__Group__2__Impl : ( ']' ) ;
    public final void rule__CollectionAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2409:1: ( ( ']' ) )
            // InternalDsl.g:2410:1: ( ']' )
            {
            // InternalDsl.g:2410:1: ( ']' )
            // InternalDsl.g:2411:2: ']'
            {
             before(grammarAccess.getCollectionAccessAccess().getRightSquareBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCollectionAccessAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__Group__2__Impl"


    // $ANTLR start "rule__PropertyRef__Group__0"
    // InternalDsl.g:2421:1: rule__PropertyRef__Group__0 : rule__PropertyRef__Group__0__Impl rule__PropertyRef__Group__1 ;
    public final void rule__PropertyRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( rule__PropertyRef__Group__0__Impl rule__PropertyRef__Group__1 )
            // InternalDsl.g:2426:2: rule__PropertyRef__Group__0__Impl rule__PropertyRef__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__PropertyRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group__0"


    // $ANTLR start "rule__PropertyRef__Group__0__Impl"
    // InternalDsl.g:2433:1: rule__PropertyRef__Group__0__Impl : ( ( rule__PropertyRef__Alternatives_0 ) ) ;
    public final void rule__PropertyRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2437:1: ( ( ( rule__PropertyRef__Alternatives_0 ) ) )
            // InternalDsl.g:2438:1: ( ( rule__PropertyRef__Alternatives_0 ) )
            {
            // InternalDsl.g:2438:1: ( ( rule__PropertyRef__Alternatives_0 ) )
            // InternalDsl.g:2439:2: ( rule__PropertyRef__Alternatives_0 )
            {
             before(grammarAccess.getPropertyRefAccess().getAlternatives_0()); 
            // InternalDsl.g:2440:2: ( rule__PropertyRef__Alternatives_0 )
            // InternalDsl.g:2440:3: rule__PropertyRef__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRef__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRefAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group__0__Impl"


    // $ANTLR start "rule__PropertyRef__Group__1"
    // InternalDsl.g:2448:1: rule__PropertyRef__Group__1 : rule__PropertyRef__Group__1__Impl ;
    public final void rule__PropertyRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2452:1: ( rule__PropertyRef__Group__1__Impl )
            // InternalDsl.g:2453:2: rule__PropertyRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group__1"


    // $ANTLR start "rule__PropertyRef__Group__1__Impl"
    // InternalDsl.g:2459:1: rule__PropertyRef__Group__1__Impl : ( ( rule__PropertyRef__SubProperyAssignment_1 )? ) ;
    public final void rule__PropertyRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2463:1: ( ( ( rule__PropertyRef__SubProperyAssignment_1 )? ) )
            // InternalDsl.g:2464:1: ( ( rule__PropertyRef__SubProperyAssignment_1 )? )
            {
            // InternalDsl.g:2464:1: ( ( rule__PropertyRef__SubProperyAssignment_1 )? )
            // InternalDsl.g:2465:2: ( rule__PropertyRef__SubProperyAssignment_1 )?
            {
             before(grammarAccess.getPropertyRefAccess().getSubProperyAssignment_1()); 
            // InternalDsl.g:2466:2: ( rule__PropertyRef__SubProperyAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37||LA18_0==40||LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:2466:3: rule__PropertyRef__SubProperyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRef__SubProperyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyRefAccess().getSubProperyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group__1__Impl"


    // $ANTLR start "rule__PropertyRef__Group_0_0__0"
    // InternalDsl.g:2475:1: rule__PropertyRef__Group_0_0__0 : rule__PropertyRef__Group_0_0__0__Impl rule__PropertyRef__Group_0_0__1 ;
    public final void rule__PropertyRef__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( rule__PropertyRef__Group_0_0__0__Impl rule__PropertyRef__Group_0_0__1 )
            // InternalDsl.g:2480:2: rule__PropertyRef__Group_0_0__0__Impl rule__PropertyRef__Group_0_0__1
            {
            pushFollow(FOLLOW_22);
            rule__PropertyRef__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRef__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group_0_0__0"


    // $ANTLR start "rule__PropertyRef__Group_0_0__0__Impl"
    // InternalDsl.g:2487:1: rule__PropertyRef__Group_0_0__0__Impl : ( '.' ) ;
    public final void rule__PropertyRef__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2491:1: ( ( '.' ) )
            // InternalDsl.g:2492:1: ( '.' )
            {
            // InternalDsl.g:2492:1: ( '.' )
            // InternalDsl.g:2493:2: '.'
            {
             before(grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group_0_0__0__Impl"


    // $ANTLR start "rule__PropertyRef__Group_0_0__1"
    // InternalDsl.g:2502:1: rule__PropertyRef__Group_0_0__1 : rule__PropertyRef__Group_0_0__1__Impl ;
    public final void rule__PropertyRef__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2506:1: ( rule__PropertyRef__Group_0_0__1__Impl )
            // InternalDsl.g:2507:2: rule__PropertyRef__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRef__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group_0_0__1"


    // $ANTLR start "rule__PropertyRef__Group_0_0__1__Impl"
    // InternalDsl.g:2513:1: rule__PropertyRef__Group_0_0__1__Impl : ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) ) ;
    public final void rule__PropertyRef__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2517:1: ( ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) ) )
            // InternalDsl.g:2518:1: ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) )
            {
            // InternalDsl.g:2518:1: ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) )
            // InternalDsl.g:2519:2: ( rule__PropertyRef__PropAccessAssignment_0_0_1 )
            {
             before(grammarAccess.getPropertyRefAccess().getPropAccessAssignment_0_0_1()); 
            // InternalDsl.g:2520:2: ( rule__PropertyRef__PropAccessAssignment_0_0_1 )
            // InternalDsl.g:2520:3: rule__PropertyRef__PropAccessAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRef__PropAccessAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRefAccess().getPropAccessAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__Group_0_0__1__Impl"


    // $ANTLR start "rule__ResponseConf__UnorderedGroup"
    // InternalDsl.g:2529:1: rule__ResponseConf__UnorderedGroup : ( rule__ResponseConf__UnorderedGroup__0 )? ;
    public final void rule__ResponseConf__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getResponseConfAccess().getUnorderedGroup());
        	
        try {
            // InternalDsl.g:2534:1: ( ( rule__ResponseConf__UnorderedGroup__0 )? )
            // InternalDsl.g:2535:2: ( rule__ResponseConf__UnorderedGroup__0 )?
            {
            // InternalDsl.g:2535:2: ( rule__ResponseConf__UnorderedGroup__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:2535:2: rule__ResponseConf__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseConf__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getResponseConfAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__UnorderedGroup"


    // $ANTLR start "rule__ResponseConf__UnorderedGroup__Impl"
    // InternalDsl.g:2543:1: rule__ResponseConf__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) ) ;
    public final void rule__ResponseConf__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDsl.g:2548:1: ( ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) ) )
            // InternalDsl.g:2549:3: ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) )
            {
            // InternalDsl.g:2549:3: ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                alt20=2;
            }
            else if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                alt20=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:2550:3: ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) )
                    {
                    // InternalDsl.g:2550:3: ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) )
                    // InternalDsl.g:2551:4: {...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ResponseConf__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalDsl.g:2551:106: ( ( ( rule__ResponseConf__Group_0__0 ) ) )
                    // InternalDsl.g:2552:5: ( ( rule__ResponseConf__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDsl.g:2558:5: ( ( rule__ResponseConf__Group_0__0 ) )
                    // InternalDsl.g:2559:6: ( rule__ResponseConf__Group_0__0 )
                    {
                     before(grammarAccess.getResponseConfAccess().getGroup_0()); 
                    // InternalDsl.g:2560:6: ( rule__ResponseConf__Group_0__0 )
                    // InternalDsl.g:2560:7: rule__ResponseConf__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseConf__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseConfAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2565:3: ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) )
                    {
                    // InternalDsl.g:2565:3: ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) )
                    // InternalDsl.g:2566:4: {...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ResponseConf__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalDsl.g:2566:106: ( ( ( rule__ResponseConf__Group_1__0 ) ) )
                    // InternalDsl.g:2567:5: ( ( rule__ResponseConf__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDsl.g:2573:5: ( ( rule__ResponseConf__Group_1__0 ) )
                    // InternalDsl.g:2574:6: ( rule__ResponseConf__Group_1__0 )
                    {
                     before(grammarAccess.getResponseConfAccess().getGroup_1()); 
                    // InternalDsl.g:2575:6: ( rule__ResponseConf__Group_1__0 )
                    // InternalDsl.g:2575:7: rule__ResponseConf__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseConf__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseConfAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2580:3: ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) )
                    {
                    // InternalDsl.g:2580:3: ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) )
                    // InternalDsl.g:2581:4: {...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ResponseConf__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalDsl.g:2581:106: ( ( ( rule__ResponseConf__Group_2__0 ) ) )
                    // InternalDsl.g:2582:5: ( ( rule__ResponseConf__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDsl.g:2588:5: ( ( rule__ResponseConf__Group_2__0 ) )
                    // InternalDsl.g:2589:6: ( rule__ResponseConf__Group_2__0 )
                    {
                     before(grammarAccess.getResponseConfAccess().getGroup_2()); 
                    // InternalDsl.g:2590:6: ( rule__ResponseConf__Group_2__0 )
                    // InternalDsl.g:2590:7: rule__ResponseConf__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseConf__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseConfAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResponseConfAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__UnorderedGroup__Impl"


    // $ANTLR start "rule__ResponseConf__UnorderedGroup__0"
    // InternalDsl.g:2603:1: rule__ResponseConf__UnorderedGroup__0 : rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__1 )? ;
    public final void rule__ResponseConf__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2607:1: ( rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__1 )? )
            // InternalDsl.g:2608:2: rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_27);
            rule__ResponseConf__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDsl.g:2609:2: ( rule__ResponseConf__UnorderedGroup__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2609:2: rule__ResponseConf__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseConf__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__UnorderedGroup__0"


    // $ANTLR start "rule__ResponseConf__UnorderedGroup__1"
    // InternalDsl.g:2615:1: rule__ResponseConf__UnorderedGroup__1 : rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__2 )? ;
    public final void rule__ResponseConf__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2619:1: ( rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__2 )? )
            // InternalDsl.g:2620:2: rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_27);
            rule__ResponseConf__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDsl.g:2621:2: ( rule__ResponseConf__UnorderedGroup__2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2621:2: rule__ResponseConf__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseConf__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__UnorderedGroup__1"


    // $ANTLR start "rule__ResponseConf__UnorderedGroup__2"
    // InternalDsl.g:2627:1: rule__ResponseConf__UnorderedGroup__2 : rule__ResponseConf__UnorderedGroup__Impl ;
    public final void rule__ResponseConf__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2631:1: ( rule__ResponseConf__UnorderedGroup__Impl )
            // InternalDsl.g:2632:2: rule__ResponseConf__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResponseConf__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__UnorderedGroup__2"


    // $ANTLR start "rule__Rule__ConditionsAssignment_1"
    // InternalDsl.g:2639:1: rule__Rule__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2643:1: ( ( ruleCondition ) )
            // InternalDsl.g:2644:2: ( ruleCondition )
            {
            // InternalDsl.g:2644:2: ( ruleCondition )
            // InternalDsl.g:2645:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionsAssignment_1"


    // $ANTLR start "rule__Rule__ProxyAssignment_2_0_1"
    // InternalDsl.g:2654:1: rule__Rule__ProxyAssignment_2_0_1 : ( ruleProxyConf ) ;
    public final void rule__Rule__ProxyAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2658:1: ( ( ruleProxyConf ) )
            // InternalDsl.g:2659:2: ( ruleProxyConf )
            {
            // InternalDsl.g:2659:2: ( ruleProxyConf )
            // InternalDsl.g:2660:3: ruleProxyConf
            {
             before(grammarAccess.getRuleAccess().getProxyProxyConfParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProxyConf();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getProxyProxyConfParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ProxyAssignment_2_0_1"


    // $ANTLR start "rule__Rule__ResponseAssignment_2_1_2"
    // InternalDsl.g:2669:1: rule__Rule__ResponseAssignment_2_1_2 : ( ruleResponseConf ) ;
    public final void rule__Rule__ResponseAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2673:1: ( ( ruleResponseConf ) )
            // InternalDsl.g:2674:2: ( ruleResponseConf )
            {
            // InternalDsl.g:2674:2: ( ruleResponseConf )
            // InternalDsl.g:2675:3: ruleResponseConf
            {
             before(grammarAccess.getRuleAccess().getResponseResponseConfParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResponseConf();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResponseResponseConfParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ResponseAssignment_2_1_2"


    // $ANTLR start "rule__ProxyConf__ProxyUrlAssignment_1"
    // InternalDsl.g:2684:1: rule__ProxyConf__ProxyUrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ProxyConf__ProxyUrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2688:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2689:2: ( RULE_STRING )
            {
            // InternalDsl.g:2689:2: ( RULE_STRING )
            // InternalDsl.g:2690:3: RULE_STRING
            {
             before(grammarAccess.getProxyConfAccess().getProxyUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProxyConfAccess().getProxyUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxyConf__ProxyUrlAssignment_1"


    // $ANTLR start "rule__ResponseConf__HttpStatusAssignment_0_1"
    // InternalDsl.g:2699:1: rule__ResponseConf__HttpStatusAssignment_0_1 : ( RULE_INTEGER ) ;
    public final void rule__ResponseConf__HttpStatusAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2703:1: ( ( RULE_INTEGER ) )
            // InternalDsl.g:2704:2: ( RULE_INTEGER )
            {
            // InternalDsl.g:2704:2: ( RULE_INTEGER )
            // InternalDsl.g:2705:3: RULE_INTEGER
            {
             before(grammarAccess.getResponseConfAccess().getHttpStatusINTEGERTerminalRuleCall_0_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getResponseConfAccess().getHttpStatusINTEGERTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__HttpStatusAssignment_0_1"


    // $ANTLR start "rule__ResponseConf__ContentAssignment_1_1"
    // InternalDsl.g:2714:1: rule__ResponseConf__ContentAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ResponseConf__ContentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2718:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2719:2: ( RULE_STRING )
            {
            // InternalDsl.g:2719:2: ( RULE_STRING )
            // InternalDsl.g:2720:3: RULE_STRING
            {
             before(grammarAccess.getResponseConfAccess().getContentSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResponseConfAccess().getContentSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__ContentAssignment_1_1"


    // $ANTLR start "rule__ResponseConf__HeadersAssignment_2_1"
    // InternalDsl.g:2729:1: rule__ResponseConf__HeadersAssignment_2_1 : ( ruleHeaders ) ;
    public final void rule__ResponseConf__HeadersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2733:1: ( ( ruleHeaders ) )
            // InternalDsl.g:2734:2: ( ruleHeaders )
            {
            // InternalDsl.g:2734:2: ( ruleHeaders )
            // InternalDsl.g:2735:3: ruleHeaders
            {
             before(grammarAccess.getResponseConfAccess().getHeadersHeadersParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHeaders();

            state._fsp--;

             after(grammarAccess.getResponseConfAccess().getHeadersHeadersParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseConf__HeadersAssignment_2_1"


    // $ANTLR start "rule__Headers__HeadersAssignment_0"
    // InternalDsl.g:2744:1: rule__Headers__HeadersAssignment_0 : ( ruleHeader ) ;
    public final void rule__Headers__HeadersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2748:1: ( ( ruleHeader ) )
            // InternalDsl.g:2749:2: ( ruleHeader )
            {
            // InternalDsl.g:2749:2: ( ruleHeader )
            // InternalDsl.g:2750:3: ruleHeader
            {
             before(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__HeadersAssignment_0"


    // $ANTLR start "rule__Headers__HeadersAssignment_1_1"
    // InternalDsl.g:2759:1: rule__Headers__HeadersAssignment_1_1 : ( ruleHeader ) ;
    public final void rule__Headers__HeadersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2763:1: ( ( ruleHeader ) )
            // InternalDsl.g:2764:2: ( ruleHeader )
            {
            // InternalDsl.g:2764:2: ( ruleHeader )
            // InternalDsl.g:2765:3: ruleHeader
            {
             before(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeadersAccess().getHeadersHeaderParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Headers__HeadersAssignment_1_1"


    // $ANTLR start "rule__Header__HeaderNameAssignment_0"
    // InternalDsl.g:2774:1: rule__Header__HeaderNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__HeaderNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2778:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2779:2: ( RULE_STRING )
            {
            // InternalDsl.g:2779:2: ( RULE_STRING )
            // InternalDsl.g:2780:3: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getHeaderNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__HeaderNameAssignment_0"


    // $ANTLR start "rule__Header__HeaderValueAssignment_2"
    // InternalDsl.g:2789:1: rule__Header__HeaderValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__HeaderValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2793:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2794:2: ( RULE_STRING )
            {
            // InternalDsl.g:2794:2: ( RULE_STRING )
            // InternalDsl.g:2795:3: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getHeaderValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__HeaderValueAssignment_2"


    // $ANTLR start "rule__OrCondition__RightAssignment_1_2"
    // InternalDsl.g:2804:1: rule__OrCondition__RightAssignment_1_2 : ( ruleAndCondition ) ;
    public final void rule__OrCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2808:1: ( ( ruleAndCondition ) )
            // InternalDsl.g:2809:2: ( ruleAndCondition )
            {
            // InternalDsl.g:2809:2: ( ruleAndCondition )
            // InternalDsl.g:2810:3: ruleAndCondition
            {
             before(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndCondition();

            state._fsp--;

             after(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__RightAssignment_1_2"


    // $ANTLR start "rule__AndCondition__RightAssignment_1_2"
    // InternalDsl.g:2819:1: rule__AndCondition__RightAssignment_1_2 : ( ruleOptionalNegationCondition ) ;
    public final void rule__AndCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2823:1: ( ( ruleOptionalNegationCondition ) )
            // InternalDsl.g:2824:2: ( ruleOptionalNegationCondition )
            {
            // InternalDsl.g:2824:2: ( ruleOptionalNegationCondition )
            // InternalDsl.g:2825:3: ruleOptionalNegationCondition
            {
             before(grammarAccess.getAndConditionAccess().getRightOptionalNegationConditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalNegationCondition();

            state._fsp--;

             after(grammarAccess.getAndConditionAccess().getRightOptionalNegationConditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__RightAssignment_1_2"


    // $ANTLR start "rule__OptionalNegationCondition__NegatedAssignment_1_2"
    // InternalDsl.g:2834:1: rule__OptionalNegationCondition__NegatedAssignment_1_2 : ( ruleBracketedCondition ) ;
    public final void rule__OptionalNegationCondition__NegatedAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2838:1: ( ( ruleBracketedCondition ) )
            // InternalDsl.g:2839:2: ( ruleBracketedCondition )
            {
            // InternalDsl.g:2839:2: ( ruleBracketedCondition )
            // InternalDsl.g:2840:3: ruleBracketedCondition
            {
             before(grammarAccess.getOptionalNegationConditionAccess().getNegatedBracketedConditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracketedCondition();

            state._fsp--;

             after(grammarAccess.getOptionalNegationConditionAccess().getNegatedBracketedConditionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalNegationCondition__NegatedAssignment_1_2"


    // $ANTLR start "rule__BracketedCondition__ExpressionAssignment_0"
    // InternalDsl.g:2849:1: rule__BracketedCondition__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__BracketedCondition__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2853:1: ( ( ruleExpression ) )
            // InternalDsl.g:2854:2: ( ruleExpression )
            {
            // InternalDsl.g:2854:2: ( ruleExpression )
            // InternalDsl.g:2855:3: ruleExpression
            {
             before(grammarAccess.getBracketedConditionAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBracketedConditionAccess().getExpressionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__ExpressionAssignment_0"


    // $ANTLR start "rule__BracketedCondition__ConditionAssignment_1_1"
    // InternalDsl.g:2864:1: rule__BracketedCondition__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__BracketedCondition__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2868:1: ( ( ruleCondition ) )
            // InternalDsl.g:2869:2: ( ruleCondition )
            {
            // InternalDsl.g:2869:2: ( ruleCondition )
            // InternalDsl.g:2870:3: ruleCondition
            {
             before(grammarAccess.getBracketedConditionAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getBracketedConditionAccess().getConditionConditionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketedCondition__ConditionAssignment_1_1"


    // $ANTLR start "rule__Expression__LeftAssignment_0"
    // InternalDsl.g:2879:1: rule__Expression__LeftAssignment_0 : ( ruleOperand ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2883:1: ( ( ruleOperand ) )
            // InternalDsl.g:2884:2: ( ruleOperand )
            {
            // InternalDsl.g:2884:2: ( ruleOperand )
            // InternalDsl.g:2885:3: ruleOperand
            {
             before(grammarAccess.getExpressionAccess().getLeftOperandParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftOperandParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__LeftAssignment_0"


    // $ANTLR start "rule__Expression__OpAssignment_1_0"
    // InternalDsl.g:2894:1: rule__Expression__OpAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__Expression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2898:1: ( ( ruleOperator ) )
            // InternalDsl.g:2899:2: ( ruleOperator )
            {
            // InternalDsl.g:2899:2: ( ruleOperator )
            // InternalDsl.g:2900:3: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOpOperatorEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOpOperatorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OpAssignment_1_0"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalDsl.g:2909:1: rule__Expression__RightAssignment_1_1 : ( ruleOperand ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2913:1: ( ( ruleOperand ) )
            // InternalDsl.g:2914:2: ( ruleOperand )
            {
            // InternalDsl.g:2914:2: ( ruleOperand )
            // InternalDsl.g:2915:3: ruleOperand
            {
             before(grammarAccess.getExpressionAccess().getRightOperandParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightOperandParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__Operand__RefAssignment_0"
    // InternalDsl.g:2924:1: rule__Operand__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__Operand__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2928:1: ( ( ruleReference ) )
            // InternalDsl.g:2929:2: ( ruleReference )
            {
            // InternalDsl.g:2929:2: ( ruleReference )
            // InternalDsl.g:2930:3: ruleReference
            {
             before(grammarAccess.getOperandAccess().getRefReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getOperandAccess().getRefReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__RefAssignment_0"


    // $ANTLR start "rule__Operand__ConstAssignment_1"
    // InternalDsl.g:2939:1: rule__Operand__ConstAssignment_1 : ( ruleConstant ) ;
    public final void rule__Operand__ConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2943:1: ( ( ruleConstant ) )
            // InternalDsl.g:2944:2: ( ruleConstant )
            {
            // InternalDsl.g:2944:2: ( ruleConstant )
            // InternalDsl.g:2945:3: ruleConstant
            {
             before(grammarAccess.getOperandAccess().getConstConstantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getOperandAccess().getConstConstantParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__ConstAssignment_1"


    // $ANTLR start "rule__Operand__ListElementRefAssignment_2"
    // InternalDsl.g:2954:1: rule__Operand__ListElementRefAssignment_2 : ( ruleListElementReference ) ;
    public final void rule__Operand__ListElementRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2958:1: ( ( ruleListElementReference ) )
            // InternalDsl.g:2959:2: ( ruleListElementReference )
            {
            // InternalDsl.g:2959:2: ( ruleListElementReference )
            // InternalDsl.g:2960:3: ruleListElementReference
            {
             before(grammarAccess.getOperandAccess().getListElementRefListElementReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListElementReference();

            state._fsp--;

             after(grammarAccess.getOperandAccess().getListElementRefListElementReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__ListElementRefAssignment_2"


    // $ANTLR start "rule__ListFunction__OpAssignment_1"
    // InternalDsl.g:2969:1: rule__ListFunction__OpAssignment_1 : ( ruleListOperation ) ;
    public final void rule__ListFunction__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2973:1: ( ( ruleListOperation ) )
            // InternalDsl.g:2974:2: ( ruleListOperation )
            {
            // InternalDsl.g:2974:2: ( ruleListOperation )
            // InternalDsl.g:2975:3: ruleListOperation
            {
             before(grammarAccess.getListFunctionAccess().getOpListOperationEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListOperation();

            state._fsp--;

             after(grammarAccess.getListFunctionAccess().getOpListOperationEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__OpAssignment_1"


    // $ANTLR start "rule__ListFunction__AliasAssignment_2"
    // InternalDsl.g:2984:1: rule__ListFunction__AliasAssignment_2 : ( ruleListElementAlias ) ;
    public final void rule__ListFunction__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2988:1: ( ( ruleListElementAlias ) )
            // InternalDsl.g:2989:2: ( ruleListElementAlias )
            {
            // InternalDsl.g:2989:2: ( ruleListElementAlias )
            // InternalDsl.g:2990:3: ruleListElementAlias
            {
             before(grammarAccess.getListFunctionAccess().getAliasListElementAliasParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListElementAlias();

            state._fsp--;

             after(grammarAccess.getListFunctionAccess().getAliasListElementAliasParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__AliasAssignment_2"


    // $ANTLR start "rule__ListFunction__SeparatorAssignment_3"
    // InternalDsl.g:2999:1: rule__ListFunction__SeparatorAssignment_3 : ( ( ':' ) ) ;
    public final void rule__ListFunction__SeparatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3003:1: ( ( ( ':' ) ) )
            // InternalDsl.g:3004:2: ( ( ':' ) )
            {
            // InternalDsl.g:3004:2: ( ( ':' ) )
            // InternalDsl.g:3005:3: ( ':' )
            {
             before(grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0()); 
            // InternalDsl.g:3006:3: ( ':' )
            // InternalDsl.g:3007:4: ':'
            {
             before(grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0()); 

            }

             after(grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__SeparatorAssignment_3"


    // $ANTLR start "rule__ListFunction__ConditionAssignment_4"
    // InternalDsl.g:3018:1: rule__ListFunction__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__ListFunction__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3022:1: ( ( ruleCondition ) )
            // InternalDsl.g:3023:2: ( ruleCondition )
            {
            // InternalDsl.g:3023:2: ( ruleCondition )
            // InternalDsl.g:3024:3: ruleCondition
            {
             before(grammarAccess.getListFunctionAccess().getConditionConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getListFunctionAccess().getConditionConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFunction__ConditionAssignment_4"


    // $ANTLR start "rule__ListElementAlias__NameAssignment"
    // InternalDsl.g:3033:1: rule__ListElementAlias__NameAssignment : ( RULE_ID ) ;
    public final void rule__ListElementAlias__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3037:1: ( ( RULE_ID ) )
            // InternalDsl.g:3038:2: ( RULE_ID )
            {
            // InternalDsl.g:3038:2: ( RULE_ID )
            // InternalDsl.g:3039:3: RULE_ID
            {
             before(grammarAccess.getListElementAliasAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListElementAliasAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementAlias__NameAssignment"


    // $ANTLR start "rule__Reference__NameAssignment_0"
    // InternalDsl.g:3048:1: rule__Reference__NameAssignment_0 : ( ruleEntity ) ;
    public final void rule__Reference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3052:1: ( ( ruleEntity ) )
            // InternalDsl.g:3053:2: ( ruleEntity )
            {
            // InternalDsl.g:3053:2: ( ruleEntity )
            // InternalDsl.g:3054:3: ruleEntity
            {
             before(grammarAccess.getReferenceAccess().getNameEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEntityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_0"


    // $ANTLR start "rule__Reference__PropAssignment_1"
    // InternalDsl.g:3063:1: rule__Reference__PropAssignment_1 : ( rulePropertyRef ) ;
    public final void rule__Reference__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3067:1: ( ( rulePropertyRef ) )
            // InternalDsl.g:3068:2: ( rulePropertyRef )
            {
            // InternalDsl.g:3068:2: ( rulePropertyRef )
            // InternalDsl.g:3069:3: rulePropertyRef
            {
             before(grammarAccess.getReferenceAccess().getPropPropertyRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyRef();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getPropPropertyRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__PropAssignment_1"


    // $ANTLR start "rule__ListElementReference__NameAssignment_1"
    // InternalDsl.g:3078:1: rule__ListElementReference__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListElementReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3082:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:3083:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:3083:2: ( ( RULE_ID ) )
            // InternalDsl.g:3084:3: ( RULE_ID )
            {
             before(grammarAccess.getListElementReferenceAccess().getNameListElementAliasCrossReference_1_0()); 
            // InternalDsl.g:3085:3: ( RULE_ID )
            // InternalDsl.g:3086:4: RULE_ID
            {
             before(grammarAccess.getListElementReferenceAccess().getNameListElementAliasIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListElementReferenceAccess().getNameListElementAliasIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getListElementReferenceAccess().getNameListElementAliasCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__NameAssignment_1"


    // $ANTLR start "rule__ListElementReference__PropAssignment_2"
    // InternalDsl.g:3097:1: rule__ListElementReference__PropAssignment_2 : ( rulePropertyRef ) ;
    public final void rule__ListElementReference__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3101:1: ( ( rulePropertyRef ) )
            // InternalDsl.g:3102:2: ( rulePropertyRef )
            {
            // InternalDsl.g:3102:2: ( rulePropertyRef )
            // InternalDsl.g:3103:3: rulePropertyRef
            {
             before(grammarAccess.getListElementReferenceAccess().getPropPropertyRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyRef();

            state._fsp--;

             after(grammarAccess.getListElementReferenceAccess().getPropPropertyRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementReference__PropAssignment_2"


    // $ANTLR start "rule__PropertyAccess__NameAssignment"
    // InternalDsl.g:3112:1: rule__PropertyAccess__NameAssignment : ( RULE_ID ) ;
    public final void rule__PropertyAccess__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3116:1: ( ( RULE_ID ) )
            // InternalDsl.g:3117:2: ( RULE_ID )
            {
            // InternalDsl.g:3117:2: ( RULE_ID )
            // InternalDsl.g:3118:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccessAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccessAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAccess__NameAssignment"


    // $ANTLR start "rule__CollectionAccess__KeyAssignment_1_0"
    // InternalDsl.g:3127:1: rule__CollectionAccess__KeyAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__CollectionAccess__KeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3131:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3132:2: ( RULE_STRING )
            {
            // InternalDsl.g:3132:2: ( RULE_STRING )
            // InternalDsl.g:3133:3: RULE_STRING
            {
             before(grammarAccess.getCollectionAccessAccess().getKeySTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCollectionAccessAccess().getKeySTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__KeyAssignment_1_0"


    // $ANTLR start "rule__CollectionAccess__IndexAssignment_1_1"
    // InternalDsl.g:3142:1: rule__CollectionAccess__IndexAssignment_1_1 : ( RULE_INTEGER ) ;
    public final void rule__CollectionAccess__IndexAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3146:1: ( ( RULE_INTEGER ) )
            // InternalDsl.g:3147:2: ( RULE_INTEGER )
            {
            // InternalDsl.g:3147:2: ( RULE_INTEGER )
            // InternalDsl.g:3148:3: RULE_INTEGER
            {
             before(grammarAccess.getCollectionAccessAccess().getIndexINTEGERTerminalRuleCall_1_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getCollectionAccessAccess().getIndexINTEGERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionAccess__IndexAssignment_1_1"


    // $ANTLR start "rule__PropertyRef__PropAccessAssignment_0_0_1"
    // InternalDsl.g:3157:1: rule__PropertyRef__PropAccessAssignment_0_0_1 : ( rulePropertyAccess ) ;
    public final void rule__PropertyRef__PropAccessAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3161:1: ( ( rulePropertyAccess ) )
            // InternalDsl.g:3162:2: ( rulePropertyAccess )
            {
            // InternalDsl.g:3162:2: ( rulePropertyAccess )
            // InternalDsl.g:3163:3: rulePropertyAccess
            {
             before(grammarAccess.getPropertyRefAccess().getPropAccessPropertyAccessParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyAccess();

            state._fsp--;

             after(grammarAccess.getPropertyRefAccess().getPropAccessPropertyAccessParserRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__PropAccessAssignment_0_0_1"


    // $ANTLR start "rule__PropertyRef__CollectionAccessAssignment_0_1"
    // InternalDsl.g:3172:1: rule__PropertyRef__CollectionAccessAssignment_0_1 : ( ruleCollectionAccess ) ;
    public final void rule__PropertyRef__CollectionAccessAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3176:1: ( ( ruleCollectionAccess ) )
            // InternalDsl.g:3177:2: ( ruleCollectionAccess )
            {
            // InternalDsl.g:3177:2: ( ruleCollectionAccess )
            // InternalDsl.g:3178:3: ruleCollectionAccess
            {
             before(grammarAccess.getPropertyRefAccess().getCollectionAccessCollectionAccessParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionAccess();

            state._fsp--;

             after(grammarAccess.getPropertyRefAccess().getCollectionAccessCollectionAccessParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__CollectionAccessAssignment_0_1"


    // $ANTLR start "rule__PropertyRef__ListFuncAssignment_0_2"
    // InternalDsl.g:3187:1: rule__PropertyRef__ListFuncAssignment_0_2 : ( ruleListFunction ) ;
    public final void rule__PropertyRef__ListFuncAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3191:1: ( ( ruleListFunction ) )
            // InternalDsl.g:3192:2: ( ruleListFunction )
            {
            // InternalDsl.g:3192:2: ( ruleListFunction )
            // InternalDsl.g:3193:3: ruleListFunction
            {
             before(grammarAccess.getPropertyRefAccess().getListFuncListFunctionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListFunction();

            state._fsp--;

             after(grammarAccess.getPropertyRefAccess().getListFuncListFunctionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__ListFuncAssignment_0_2"


    // $ANTLR start "rule__PropertyRef__SubProperyAssignment_1"
    // InternalDsl.g:3202:1: rule__PropertyRef__SubProperyAssignment_1 : ( rulePropertyRef ) ;
    public final void rule__PropertyRef__SubProperyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3206:1: ( ( rulePropertyRef ) )
            // InternalDsl.g:3207:2: ( rulePropertyRef )
            {
            // InternalDsl.g:3207:2: ( rulePropertyRef )
            // InternalDsl.g:3208:3: rulePropertyRef
            {
             before(grammarAccess.getPropertyRefAccess().getSubProperyPropertyRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyRef();

            state._fsp--;

             after(grammarAccess.getPropertyRefAccess().getSubProperyPropertyRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRef__SubProperyAssignment_1"


    // $ANTLR start "rule__Constant__StrValAssignment_0"
    // InternalDsl.g:3217:1: rule__Constant__StrValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Constant__StrValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3221:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3222:2: ( RULE_STRING )
            {
            // InternalDsl.g:3222:2: ( RULE_STRING )
            // InternalDsl.g:3223:3: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getStrValSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getStrValSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__StrValAssignment_0"


    // $ANTLR start "rule__Constant__IntValAssignment_1"
    // InternalDsl.g:3232:1: rule__Constant__IntValAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__Constant__IntValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3236:1: ( ( RULE_INTEGER ) )
            // InternalDsl.g:3237:2: ( RULE_INTEGER )
            {
            // InternalDsl.g:3237:2: ( RULE_INTEGER )
            // InternalDsl.g:3238:3: RULE_INTEGER
            {
             before(grammarAccess.getConstantAccess().getIntValINTEGERTerminalRuleCall_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getIntValINTEGERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__IntValAssignment_1"


    // $ANTLR start "rule__Constant__FloatValAssignment_2"
    // InternalDsl.g:3247:1: rule__Constant__FloatValAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__Constant__FloatValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3251:1: ( ( RULE_FLOAT ) )
            // InternalDsl.g:3252:2: ( RULE_FLOAT )
            {
            // InternalDsl.g:3252:2: ( RULE_FLOAT )
            // InternalDsl.g:3253:3: RULE_FLOAT
            {
             before(grammarAccess.getConstantAccess().getFloatValFLOATTerminalRuleCall_2_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getFloatValFLOATTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__FloatValAssignment_2"


    // $ANTLR start "rule__Constant__BoolValAssignment_3"
    // InternalDsl.g:3262:1: rule__Constant__BoolValAssignment_3 : ( RULE_BOOLEAN ) ;
    public final void rule__Constant__BoolValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3266:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:3267:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:3267:2: ( RULE_BOOLEAN )
            // InternalDsl.g:3268:3: RULE_BOOLEAN
            {
             before(grammarAccess.getConstantAccess().getBoolValBOOLEANTerminalRuleCall_3_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getBoolValBOOLEANTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__BoolValAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment"
    // InternalDsl.g:3277:1: rule__Entity__NameAssignment : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3281:1: ( ( RULE_ID ) )
            // InternalDsl.g:3282:2: ( RULE_ID )
            {
            // InternalDsl.g:3282:2: ( RULE_ID )
            // InternalDsl.g:3283:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008C000001F0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000088000001F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000080000001F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000052000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000038000002L});

}
