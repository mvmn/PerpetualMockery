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


    // $ANTLR start "entryRuleCollectionAccess"
    // InternalDsl.g:469:1: entryRuleCollectionAccess : ruleCollectionAccess EOF ;
    public final void entryRuleCollectionAccess() throws RecognitionException {
        try {
            // InternalDsl.g:470:1: ( ruleCollectionAccess EOF )
            // InternalDsl.g:471:1: ruleCollectionAccess EOF
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
    // InternalDsl.g:478:1: ruleCollectionAccess : ( ( rule__CollectionAccess__Group__0 ) ) ;
    public final void ruleCollectionAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:482:2: ( ( ( rule__CollectionAccess__Group__0 ) ) )
            // InternalDsl.g:483:2: ( ( rule__CollectionAccess__Group__0 ) )
            {
            // InternalDsl.g:483:2: ( ( rule__CollectionAccess__Group__0 ) )
            // InternalDsl.g:484:3: ( rule__CollectionAccess__Group__0 )
            {
             before(grammarAccess.getCollectionAccessAccess().getGroup()); 
            // InternalDsl.g:485:3: ( rule__CollectionAccess__Group__0 )
            // InternalDsl.g:485:4: rule__CollectionAccess__Group__0
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


    // $ANTLR start "entryRulePropertyAccess"
    // InternalDsl.g:494:1: entryRulePropertyAccess : rulePropertyAccess EOF ;
    public final void entryRulePropertyAccess() throws RecognitionException {
        try {
            // InternalDsl.g:495:1: ( rulePropertyAccess EOF )
            // InternalDsl.g:496:1: rulePropertyAccess EOF
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
    // InternalDsl.g:503:1: rulePropertyAccess : ( ( rule__PropertyAccess__NameAssignment ) ) ;
    public final void rulePropertyAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:507:2: ( ( ( rule__PropertyAccess__NameAssignment ) ) )
            // InternalDsl.g:508:2: ( ( rule__PropertyAccess__NameAssignment ) )
            {
            // InternalDsl.g:508:2: ( ( rule__PropertyAccess__NameAssignment ) )
            // InternalDsl.g:509:3: ( rule__PropertyAccess__NameAssignment )
            {
             before(grammarAccess.getPropertyAccessAccess().getNameAssignment()); 
            // InternalDsl.g:510:3: ( rule__PropertyAccess__NameAssignment )
            // InternalDsl.g:510:4: rule__PropertyAccess__NameAssignment
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalDsl.g:519:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalDsl.g:520:1: ( ruleFunctionCall EOF )
            // InternalDsl.g:521:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalDsl.g:528:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:532:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalDsl.g:533:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalDsl.g:533:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalDsl.g:534:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalDsl.g:535:3: ( rule__FunctionCall__Group__0 )
            // InternalDsl.g:535:4: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePropertyRef"
    // InternalDsl.g:544:1: entryRulePropertyRef : rulePropertyRef EOF ;
    public final void entryRulePropertyRef() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDsl.g:548:1: ( rulePropertyRef EOF )
            // InternalDsl.g:549:1: rulePropertyRef EOF
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
    // InternalDsl.g:559:1: rulePropertyRef : ( ( rule__PropertyRef__Group__0 ) ) ;
    public final void rulePropertyRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:564:2: ( ( ( rule__PropertyRef__Group__0 ) ) )
            // InternalDsl.g:565:2: ( ( rule__PropertyRef__Group__0 ) )
            {
            // InternalDsl.g:565:2: ( ( rule__PropertyRef__Group__0 ) )
            // InternalDsl.g:566:3: ( rule__PropertyRef__Group__0 )
            {
             before(grammarAccess.getPropertyRefAccess().getGroup()); 
            // InternalDsl.g:567:3: ( rule__PropertyRef__Group__0 )
            // InternalDsl.g:567:4: rule__PropertyRef__Group__0
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
    // InternalDsl.g:577:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDsl.g:578:1: ( ruleConstant EOF )
            // InternalDsl.g:579:1: ruleConstant EOF
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
    // InternalDsl.g:586:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:590:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalDsl.g:591:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalDsl.g:591:2: ( ( rule__Constant__Alternatives ) )
            // InternalDsl.g:592:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalDsl.g:593:3: ( rule__Constant__Alternatives )
            // InternalDsl.g:593:4: rule__Constant__Alternatives
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
    // InternalDsl.g:602:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDsl.g:603:1: ( ruleEntity EOF )
            // InternalDsl.g:604:1: ruleEntity EOF
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
    // InternalDsl.g:611:1: ruleEntity : ( ( rule__Entity__NameAssignment ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:615:2: ( ( ( rule__Entity__NameAssignment ) ) )
            // InternalDsl.g:616:2: ( ( rule__Entity__NameAssignment ) )
            {
            // InternalDsl.g:616:2: ( ( rule__Entity__NameAssignment ) )
            // InternalDsl.g:617:3: ( rule__Entity__NameAssignment )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment()); 
            // InternalDsl.g:618:3: ( rule__Entity__NameAssignment )
            // InternalDsl.g:618:4: rule__Entity__NameAssignment
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
    // InternalDsl.g:627:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:631:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalDsl.g:632:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalDsl.g:632:2: ( ( rule__Operator__Alternatives ) )
            // InternalDsl.g:633:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalDsl.g:634:3: ( rule__Operator__Alternatives )
            // InternalDsl.g:634:4: rule__Operator__Alternatives
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
    // InternalDsl.g:643:1: ruleListOperation : ( ( rule__ListOperation__Alternatives ) ) ;
    public final void ruleListOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:647:1: ( ( ( rule__ListOperation__Alternatives ) ) )
            // InternalDsl.g:648:2: ( ( rule__ListOperation__Alternatives ) )
            {
            // InternalDsl.g:648:2: ( ( rule__ListOperation__Alternatives ) )
            // InternalDsl.g:649:3: ( rule__ListOperation__Alternatives )
            {
             before(grammarAccess.getListOperationAccess().getAlternatives()); 
            // InternalDsl.g:650:3: ( rule__ListOperation__Alternatives )
            // InternalDsl.g:650:4: rule__ListOperation__Alternatives
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
    // InternalDsl.g:658:1: rule__Rule__Alternatives_2 : ( ( ( rule__Rule__Group_2_0__0 ) ) | ( ( rule__Rule__Group_2_1__0 ) ) );
    public final void rule__Rule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:662:1: ( ( ( rule__Rule__Group_2_0__0 ) ) | ( ( rule__Rule__Group_2_1__0 ) ) )
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
                    // InternalDsl.g:663:2: ( ( rule__Rule__Group_2_0__0 ) )
                    {
                    // InternalDsl.g:663:2: ( ( rule__Rule__Group_2_0__0 ) )
                    // InternalDsl.g:664:3: ( rule__Rule__Group_2_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2_0()); 
                    // InternalDsl.g:665:3: ( rule__Rule__Group_2_0__0 )
                    // InternalDsl.g:665:4: rule__Rule__Group_2_0__0
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
                    // InternalDsl.g:669:2: ( ( rule__Rule__Group_2_1__0 ) )
                    {
                    // InternalDsl.g:669:2: ( ( rule__Rule__Group_2_1__0 ) )
                    // InternalDsl.g:670:3: ( rule__Rule__Group_2_1__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2_1()); 
                    // InternalDsl.g:671:3: ( rule__Rule__Group_2_1__0 )
                    // InternalDsl.g:671:4: rule__Rule__Group_2_1__0
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
    // InternalDsl.g:679:1: rule__OptionalNegationCondition__Alternatives : ( ( ruleBracketedCondition ) | ( ( rule__OptionalNegationCondition__Group_1__0 ) ) );
    public final void rule__OptionalNegationCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:683:1: ( ( ruleBracketedCondition ) | ( ( rule__OptionalNegationCondition__Group_1__0 ) ) )
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
                    // InternalDsl.g:684:2: ( ruleBracketedCondition )
                    {
                    // InternalDsl.g:684:2: ( ruleBracketedCondition )
                    // InternalDsl.g:685:3: ruleBracketedCondition
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
                    // InternalDsl.g:690:2: ( ( rule__OptionalNegationCondition__Group_1__0 ) )
                    {
                    // InternalDsl.g:690:2: ( ( rule__OptionalNegationCondition__Group_1__0 ) )
                    // InternalDsl.g:691:3: ( rule__OptionalNegationCondition__Group_1__0 )
                    {
                     before(grammarAccess.getOptionalNegationConditionAccess().getGroup_1()); 
                    // InternalDsl.g:692:3: ( rule__OptionalNegationCondition__Group_1__0 )
                    // InternalDsl.g:692:4: rule__OptionalNegationCondition__Group_1__0
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
    // InternalDsl.g:700:1: rule__BracketedCondition__Alternatives : ( ( ( rule__BracketedCondition__ExpressionAssignment_0 ) ) | ( ( rule__BracketedCondition__Group_1__0 ) ) );
    public final void rule__BracketedCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( ( ( rule__BracketedCondition__ExpressionAssignment_0 ) ) | ( ( rule__BracketedCondition__Group_1__0 ) ) )
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
                    // InternalDsl.g:705:2: ( ( rule__BracketedCondition__ExpressionAssignment_0 ) )
                    {
                    // InternalDsl.g:705:2: ( ( rule__BracketedCondition__ExpressionAssignment_0 ) )
                    // InternalDsl.g:706:3: ( rule__BracketedCondition__ExpressionAssignment_0 )
                    {
                     before(grammarAccess.getBracketedConditionAccess().getExpressionAssignment_0()); 
                    // InternalDsl.g:707:3: ( rule__BracketedCondition__ExpressionAssignment_0 )
                    // InternalDsl.g:707:4: rule__BracketedCondition__ExpressionAssignment_0
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
                    // InternalDsl.g:711:2: ( ( rule__BracketedCondition__Group_1__0 ) )
                    {
                    // InternalDsl.g:711:2: ( ( rule__BracketedCondition__Group_1__0 ) )
                    // InternalDsl.g:712:3: ( rule__BracketedCondition__Group_1__0 )
                    {
                     before(grammarAccess.getBracketedConditionAccess().getGroup_1()); 
                    // InternalDsl.g:713:3: ( rule__BracketedCondition__Group_1__0 )
                    // InternalDsl.g:713:4: rule__BracketedCondition__Group_1__0
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
    // InternalDsl.g:721:1: rule__Operand__Alternatives : ( ( ( rule__Operand__RefAssignment_0 ) ) | ( ( rule__Operand__ConstAssignment_1 ) ) | ( ( rule__Operand__ListElementRefAssignment_2 ) ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:725:1: ( ( ( rule__Operand__RefAssignment_0 ) ) | ( ( rule__Operand__ConstAssignment_1 ) ) | ( ( rule__Operand__ListElementRefAssignment_2 ) ) )
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
                    // InternalDsl.g:726:2: ( ( rule__Operand__RefAssignment_0 ) )
                    {
                    // InternalDsl.g:726:2: ( ( rule__Operand__RefAssignment_0 ) )
                    // InternalDsl.g:727:3: ( rule__Operand__RefAssignment_0 )
                    {
                     before(grammarAccess.getOperandAccess().getRefAssignment_0()); 
                    // InternalDsl.g:728:3: ( rule__Operand__RefAssignment_0 )
                    // InternalDsl.g:728:4: rule__Operand__RefAssignment_0
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
                    // InternalDsl.g:732:2: ( ( rule__Operand__ConstAssignment_1 ) )
                    {
                    // InternalDsl.g:732:2: ( ( rule__Operand__ConstAssignment_1 ) )
                    // InternalDsl.g:733:3: ( rule__Operand__ConstAssignment_1 )
                    {
                     before(grammarAccess.getOperandAccess().getConstAssignment_1()); 
                    // InternalDsl.g:734:3: ( rule__Operand__ConstAssignment_1 )
                    // InternalDsl.g:734:4: rule__Operand__ConstAssignment_1
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
                    // InternalDsl.g:738:2: ( ( rule__Operand__ListElementRefAssignment_2 ) )
                    {
                    // InternalDsl.g:738:2: ( ( rule__Operand__ListElementRefAssignment_2 ) )
                    // InternalDsl.g:739:3: ( rule__Operand__ListElementRefAssignment_2 )
                    {
                     before(grammarAccess.getOperandAccess().getListElementRefAssignment_2()); 
                    // InternalDsl.g:740:3: ( rule__Operand__ListElementRefAssignment_2 )
                    // InternalDsl.g:740:4: rule__Operand__ListElementRefAssignment_2
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
    // InternalDsl.g:748:1: rule__CollectionAccess__Alternatives_1 : ( ( ( rule__CollectionAccess__KeyAssignment_1_0 ) ) | ( ( rule__CollectionAccess__IndexAssignment_1_1 ) ) );
    public final void rule__CollectionAccess__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:752:1: ( ( ( rule__CollectionAccess__KeyAssignment_1_0 ) ) | ( ( rule__CollectionAccess__IndexAssignment_1_1 ) ) )
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
                    // InternalDsl.g:753:2: ( ( rule__CollectionAccess__KeyAssignment_1_0 ) )
                    {
                    // InternalDsl.g:753:2: ( ( rule__CollectionAccess__KeyAssignment_1_0 ) )
                    // InternalDsl.g:754:3: ( rule__CollectionAccess__KeyAssignment_1_0 )
                    {
                     before(grammarAccess.getCollectionAccessAccess().getKeyAssignment_1_0()); 
                    // InternalDsl.g:755:3: ( rule__CollectionAccess__KeyAssignment_1_0 )
                    // InternalDsl.g:755:4: rule__CollectionAccess__KeyAssignment_1_0
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
                    // InternalDsl.g:759:2: ( ( rule__CollectionAccess__IndexAssignment_1_1 ) )
                    {
                    // InternalDsl.g:759:2: ( ( rule__CollectionAccess__IndexAssignment_1_1 ) )
                    // InternalDsl.g:760:3: ( rule__CollectionAccess__IndexAssignment_1_1 )
                    {
                     before(grammarAccess.getCollectionAccessAccess().getIndexAssignment_1_1()); 
                    // InternalDsl.g:761:3: ( rule__CollectionAccess__IndexAssignment_1_1 )
                    // InternalDsl.g:761:4: rule__CollectionAccess__IndexAssignment_1_1
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
    // InternalDsl.g:769:1: rule__PropertyRef__Alternatives_0 : ( ( ( rule__PropertyRef__Group_0_0__0 ) ) | ( ( rule__PropertyRef__Group_0_1__0 ) ) | ( ( rule__PropertyRef__CollectionAccessAssignment_0_2 ) ) | ( ( rule__PropertyRef__ListFuncAssignment_0_3 ) ) );
    public final void rule__PropertyRef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( ( ( rule__PropertyRef__Group_0_0__0 ) ) | ( ( rule__PropertyRef__Group_0_1__0 ) ) | ( ( rule__PropertyRef__CollectionAccessAssignment_0_2 ) ) | ( ( rule__PropertyRef__ListFuncAssignment_0_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==EOF||(LA6_4>=12 && LA6_4<=18)||(LA6_4>=23 && LA6_4<=24)||LA6_4==30||(LA6_4>=32 && LA6_4<=33)||(LA6_4>=36 && LA6_4<=38)||LA6_4==40||LA6_4==42) ) {
                        alt6=1;
                    }
                    else if ( (LA6_4==35) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:774:2: ( ( rule__PropertyRef__Group_0_0__0 ) )
                    {
                    // InternalDsl.g:774:2: ( ( rule__PropertyRef__Group_0_0__0 ) )
                    // InternalDsl.g:775:3: ( rule__PropertyRef__Group_0_0__0 )
                    {
                     before(grammarAccess.getPropertyRefAccess().getGroup_0_0()); 
                    // InternalDsl.g:776:3: ( rule__PropertyRef__Group_0_0__0 )
                    // InternalDsl.g:776:4: rule__PropertyRef__Group_0_0__0
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
                    // InternalDsl.g:780:2: ( ( rule__PropertyRef__Group_0_1__0 ) )
                    {
                    // InternalDsl.g:780:2: ( ( rule__PropertyRef__Group_0_1__0 ) )
                    // InternalDsl.g:781:3: ( rule__PropertyRef__Group_0_1__0 )
                    {
                     before(grammarAccess.getPropertyRefAccess().getGroup_0_1()); 
                    // InternalDsl.g:782:3: ( rule__PropertyRef__Group_0_1__0 )
                    // InternalDsl.g:782:4: rule__PropertyRef__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRef__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyRefAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:786:2: ( ( rule__PropertyRef__CollectionAccessAssignment_0_2 ) )
                    {
                    // InternalDsl.g:786:2: ( ( rule__PropertyRef__CollectionAccessAssignment_0_2 ) )
                    // InternalDsl.g:787:3: ( rule__PropertyRef__CollectionAccessAssignment_0_2 )
                    {
                     before(grammarAccess.getPropertyRefAccess().getCollectionAccessAssignment_0_2()); 
                    // InternalDsl.g:788:3: ( rule__PropertyRef__CollectionAccessAssignment_0_2 )
                    // InternalDsl.g:788:4: rule__PropertyRef__CollectionAccessAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRef__CollectionAccessAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyRefAccess().getCollectionAccessAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:792:2: ( ( rule__PropertyRef__ListFuncAssignment_0_3 ) )
                    {
                    // InternalDsl.g:792:2: ( ( rule__PropertyRef__ListFuncAssignment_0_3 ) )
                    // InternalDsl.g:793:3: ( rule__PropertyRef__ListFuncAssignment_0_3 )
                    {
                     before(grammarAccess.getPropertyRefAccess().getListFuncAssignment_0_3()); 
                    // InternalDsl.g:794:3: ( rule__PropertyRef__ListFuncAssignment_0_3 )
                    // InternalDsl.g:794:4: rule__PropertyRef__ListFuncAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRef__ListFuncAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyRefAccess().getListFuncAssignment_0_3()); 

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
    // InternalDsl.g:802:1: rule__Constant__Alternatives : ( ( ( rule__Constant__StrValAssignment_0 ) ) | ( ( rule__Constant__IntValAssignment_1 ) ) | ( ( rule__Constant__FloatValAssignment_2 ) ) | ( ( rule__Constant__BoolValAssignment_3 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:806:1: ( ( ( rule__Constant__StrValAssignment_0 ) ) | ( ( rule__Constant__IntValAssignment_1 ) ) | ( ( rule__Constant__FloatValAssignment_2 ) ) | ( ( rule__Constant__BoolValAssignment_3 ) ) )
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
                    // InternalDsl.g:807:2: ( ( rule__Constant__StrValAssignment_0 ) )
                    {
                    // InternalDsl.g:807:2: ( ( rule__Constant__StrValAssignment_0 ) )
                    // InternalDsl.g:808:3: ( rule__Constant__StrValAssignment_0 )
                    {
                     before(grammarAccess.getConstantAccess().getStrValAssignment_0()); 
                    // InternalDsl.g:809:3: ( rule__Constant__StrValAssignment_0 )
                    // InternalDsl.g:809:4: rule__Constant__StrValAssignment_0
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
                    // InternalDsl.g:813:2: ( ( rule__Constant__IntValAssignment_1 ) )
                    {
                    // InternalDsl.g:813:2: ( ( rule__Constant__IntValAssignment_1 ) )
                    // InternalDsl.g:814:3: ( rule__Constant__IntValAssignment_1 )
                    {
                     before(grammarAccess.getConstantAccess().getIntValAssignment_1()); 
                    // InternalDsl.g:815:3: ( rule__Constant__IntValAssignment_1 )
                    // InternalDsl.g:815:4: rule__Constant__IntValAssignment_1
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
                    // InternalDsl.g:819:2: ( ( rule__Constant__FloatValAssignment_2 ) )
                    {
                    // InternalDsl.g:819:2: ( ( rule__Constant__FloatValAssignment_2 ) )
                    // InternalDsl.g:820:3: ( rule__Constant__FloatValAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getFloatValAssignment_2()); 
                    // InternalDsl.g:821:3: ( rule__Constant__FloatValAssignment_2 )
                    // InternalDsl.g:821:4: rule__Constant__FloatValAssignment_2
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
                    // InternalDsl.g:825:2: ( ( rule__Constant__BoolValAssignment_3 ) )
                    {
                    // InternalDsl.g:825:2: ( ( rule__Constant__BoolValAssignment_3 ) )
                    // InternalDsl.g:826:3: ( rule__Constant__BoolValAssignment_3 )
                    {
                     before(grammarAccess.getConstantAccess().getBoolValAssignment_3()); 
                    // InternalDsl.g:827:3: ( rule__Constant__BoolValAssignment_3 )
                    // InternalDsl.g:827:4: rule__Constant__BoolValAssignment_3
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
    // InternalDsl.g:835:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:839:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~=' ) ) )
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
                    // InternalDsl.g:840:2: ( ( '=' ) )
                    {
                    // InternalDsl.g:840:2: ( ( '=' ) )
                    // InternalDsl.g:841:3: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:842:3: ( '=' )
                    // InternalDsl.g:842:4: '='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:846:2: ( ( '!=' ) )
                    {
                    // InternalDsl.g:846:2: ( ( '!=' ) )
                    // InternalDsl.g:847:3: ( '!=' )
                    {
                     before(grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:848:3: ( '!=' )
                    // InternalDsl.g:848:4: '!='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getNEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:852:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:852:2: ( ( '>' ) )
                    // InternalDsl.g:853:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:854:3: ( '>' )
                    // InternalDsl.g:854:4: '>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:858:2: ( ( '>=' ) )
                    {
                    // InternalDsl.g:858:2: ( ( '>=' ) )
                    // InternalDsl.g:859:3: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:860:3: ( '>=' )
                    // InternalDsl.g:860:4: '>='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEQEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:864:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:864:2: ( ( '<' ) )
                    // InternalDsl.g:865:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:866:3: ( '<' )
                    // InternalDsl.g:866:4: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:870:2: ( ( '<=' ) )
                    {
                    // InternalDsl.g:870:2: ( ( '<=' ) )
                    // InternalDsl.g:871:3: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:872:3: ( '<=' )
                    // InternalDsl.g:872:4: '<='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEQEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:876:2: ( ( '~=' ) )
                    {
                    // InternalDsl.g:876:2: ( ( '~=' ) )
                    // InternalDsl.g:877:3: ( '~=' )
                    {
                     before(grammarAccess.getOperatorAccess().getREGEXEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:878:3: ( '~=' )
                    // InternalDsl.g:878:4: '~='
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
    // InternalDsl.g:886:1: rule__ListOperation__Alternatives : ( ( ( 'where' ) ) | ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__ListOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:890:1: ( ( ( 'where' ) ) | ( ( 'all' ) ) | ( ( 'any' ) ) )
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
                    // InternalDsl.g:891:2: ( ( 'where' ) )
                    {
                    // InternalDsl.g:891:2: ( ( 'where' ) )
                    // InternalDsl.g:892:3: ( 'where' )
                    {
                     before(grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0()); 
                    // InternalDsl.g:893:3: ( 'where' )
                    // InternalDsl.g:893:4: 'where'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getListOperationAccess().getFILTEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:897:2: ( ( 'all' ) )
                    {
                    // InternalDsl.g:897:2: ( ( 'all' ) )
                    // InternalDsl.g:898:3: ( 'all' )
                    {
                     before(grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:899:3: ( 'all' )
                    // InternalDsl.g:899:4: 'all'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getListOperationAccess().getALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:903:2: ( ( 'any' ) )
                    {
                    // InternalDsl.g:903:2: ( ( 'any' ) )
                    // InternalDsl.g:904:3: ( 'any' )
                    {
                     before(grammarAccess.getListOperationAccess().getANYEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:905:3: ( 'any' )
                    // InternalDsl.g:905:4: 'any'
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
    // InternalDsl.g:913:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:917:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalDsl.g:918:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalDsl.g:925:1: rule__Rule__Group__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:929:1: ( ( 'if' ) )
            // InternalDsl.g:930:1: ( 'if' )
            {
            // InternalDsl.g:930:1: ( 'if' )
            // InternalDsl.g:931:2: 'if'
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
    // InternalDsl.g:940:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:944:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalDsl.g:945:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalDsl.g:952:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionsAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:956:1: ( ( ( rule__Rule__ConditionsAssignment_1 ) ) )
            // InternalDsl.g:957:1: ( ( rule__Rule__ConditionsAssignment_1 ) )
            {
            // InternalDsl.g:957:1: ( ( rule__Rule__ConditionsAssignment_1 ) )
            // InternalDsl.g:958:2: ( rule__Rule__ConditionsAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_1()); 
            // InternalDsl.g:959:2: ( rule__Rule__ConditionsAssignment_1 )
            // InternalDsl.g:959:3: rule__Rule__ConditionsAssignment_1
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
    // InternalDsl.g:967:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:971:1: ( rule__Rule__Group__2__Impl )
            // InternalDsl.g:972:2: rule__Rule__Group__2__Impl
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
    // InternalDsl.g:978:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Alternatives_2 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:982:1: ( ( ( rule__Rule__Alternatives_2 )? ) )
            // InternalDsl.g:983:1: ( ( rule__Rule__Alternatives_2 )? )
            {
            // InternalDsl.g:983:1: ( ( rule__Rule__Alternatives_2 )? )
            // InternalDsl.g:984:2: ( rule__Rule__Alternatives_2 )?
            {
             before(grammarAccess.getRuleAccess().getAlternatives_2()); 
            // InternalDsl.g:985:2: ( rule__Rule__Alternatives_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:985:3: rule__Rule__Alternatives_2
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
    // InternalDsl.g:994:1: rule__Rule__Group_2_0__0 : rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1 ;
    public final void rule__Rule__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:998:1: ( rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1 )
            // InternalDsl.g:999:2: rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1
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
    // InternalDsl.g:1006:1: rule__Rule__Group_2_0__0__Impl : ( 'proxy' ) ;
    public final void rule__Rule__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1010:1: ( ( 'proxy' ) )
            // InternalDsl.g:1011:1: ( 'proxy' )
            {
            // InternalDsl.g:1011:1: ( 'proxy' )
            // InternalDsl.g:1012:2: 'proxy'
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
    // InternalDsl.g:1021:1: rule__Rule__Group_2_0__1 : rule__Rule__Group_2_0__1__Impl ;
    public final void rule__Rule__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1025:1: ( rule__Rule__Group_2_0__1__Impl )
            // InternalDsl.g:1026:2: rule__Rule__Group_2_0__1__Impl
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
    // InternalDsl.g:1032:1: rule__Rule__Group_2_0__1__Impl : ( ( rule__Rule__ProxyAssignment_2_0_1 ) ) ;
    public final void rule__Rule__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1036:1: ( ( ( rule__Rule__ProxyAssignment_2_0_1 ) ) )
            // InternalDsl.g:1037:1: ( ( rule__Rule__ProxyAssignment_2_0_1 ) )
            {
            // InternalDsl.g:1037:1: ( ( rule__Rule__ProxyAssignment_2_0_1 ) )
            // InternalDsl.g:1038:2: ( rule__Rule__ProxyAssignment_2_0_1 )
            {
             before(grammarAccess.getRuleAccess().getProxyAssignment_2_0_1()); 
            // InternalDsl.g:1039:2: ( rule__Rule__ProxyAssignment_2_0_1 )
            // InternalDsl.g:1039:3: rule__Rule__ProxyAssignment_2_0_1
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
    // InternalDsl.g:1048:1: rule__Rule__Group_2_1__0 : rule__Rule__Group_2_1__0__Impl rule__Rule__Group_2_1__1 ;
    public final void rule__Rule__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1052:1: ( rule__Rule__Group_2_1__0__Impl rule__Rule__Group_2_1__1 )
            // InternalDsl.g:1053:2: rule__Rule__Group_2_1__0__Impl rule__Rule__Group_2_1__1
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
    // InternalDsl.g:1060:1: rule__Rule__Group_2_1__0__Impl : ( 'respond' ) ;
    public final void rule__Rule__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1064:1: ( ( 'respond' ) )
            // InternalDsl.g:1065:1: ( 'respond' )
            {
            // InternalDsl.g:1065:1: ( 'respond' )
            // InternalDsl.g:1066:2: 'respond'
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
    // InternalDsl.g:1075:1: rule__Rule__Group_2_1__1 : rule__Rule__Group_2_1__1__Impl rule__Rule__Group_2_1__2 ;
    public final void rule__Rule__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1079:1: ( rule__Rule__Group_2_1__1__Impl rule__Rule__Group_2_1__2 )
            // InternalDsl.g:1080:2: rule__Rule__Group_2_1__1__Impl rule__Rule__Group_2_1__2
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
    // InternalDsl.g:1087:1: rule__Rule__Group_2_1__1__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1091:1: ( ( 'with' ) )
            // InternalDsl.g:1092:1: ( 'with' )
            {
            // InternalDsl.g:1092:1: ( 'with' )
            // InternalDsl.g:1093:2: 'with'
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
    // InternalDsl.g:1102:1: rule__Rule__Group_2_1__2 : rule__Rule__Group_2_1__2__Impl ;
    public final void rule__Rule__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1106:1: ( rule__Rule__Group_2_1__2__Impl )
            // InternalDsl.g:1107:2: rule__Rule__Group_2_1__2__Impl
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
    // InternalDsl.g:1113:1: rule__Rule__Group_2_1__2__Impl : ( ( rule__Rule__ResponseAssignment_2_1_2 ) ) ;
    public final void rule__Rule__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1117:1: ( ( ( rule__Rule__ResponseAssignment_2_1_2 ) ) )
            // InternalDsl.g:1118:1: ( ( rule__Rule__ResponseAssignment_2_1_2 ) )
            {
            // InternalDsl.g:1118:1: ( ( rule__Rule__ResponseAssignment_2_1_2 ) )
            // InternalDsl.g:1119:2: ( rule__Rule__ResponseAssignment_2_1_2 )
            {
             before(grammarAccess.getRuleAccess().getResponseAssignment_2_1_2()); 
            // InternalDsl.g:1120:2: ( rule__Rule__ResponseAssignment_2_1_2 )
            // InternalDsl.g:1120:3: rule__Rule__ResponseAssignment_2_1_2
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
    // InternalDsl.g:1129:1: rule__ProxyConf__Group__0 : rule__ProxyConf__Group__0__Impl rule__ProxyConf__Group__1 ;
    public final void rule__ProxyConf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1133:1: ( rule__ProxyConf__Group__0__Impl rule__ProxyConf__Group__1 )
            // InternalDsl.g:1134:2: rule__ProxyConf__Group__0__Impl rule__ProxyConf__Group__1
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
    // InternalDsl.g:1141:1: rule__ProxyConf__Group__0__Impl : ( 'url' ) ;
    public final void rule__ProxyConf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1145:1: ( ( 'url' ) )
            // InternalDsl.g:1146:1: ( 'url' )
            {
            // InternalDsl.g:1146:1: ( 'url' )
            // InternalDsl.g:1147:2: 'url'
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
    // InternalDsl.g:1156:1: rule__ProxyConf__Group__1 : rule__ProxyConf__Group__1__Impl ;
    public final void rule__ProxyConf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1160:1: ( rule__ProxyConf__Group__1__Impl )
            // InternalDsl.g:1161:2: rule__ProxyConf__Group__1__Impl
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
    // InternalDsl.g:1167:1: rule__ProxyConf__Group__1__Impl : ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) ) ;
    public final void rule__ProxyConf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1171:1: ( ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) ) )
            // InternalDsl.g:1172:1: ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) )
            {
            // InternalDsl.g:1172:1: ( ( rule__ProxyConf__ProxyUrlAssignment_1 ) )
            // InternalDsl.g:1173:2: ( rule__ProxyConf__ProxyUrlAssignment_1 )
            {
             before(grammarAccess.getProxyConfAccess().getProxyUrlAssignment_1()); 
            // InternalDsl.g:1174:2: ( rule__ProxyConf__ProxyUrlAssignment_1 )
            // InternalDsl.g:1174:3: rule__ProxyConf__ProxyUrlAssignment_1
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
    // InternalDsl.g:1183:1: rule__ResponseConf__Group_0__0 : rule__ResponseConf__Group_0__0__Impl rule__ResponseConf__Group_0__1 ;
    public final void rule__ResponseConf__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1187:1: ( rule__ResponseConf__Group_0__0__Impl rule__ResponseConf__Group_0__1 )
            // InternalDsl.g:1188:2: rule__ResponseConf__Group_0__0__Impl rule__ResponseConf__Group_0__1
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
    // InternalDsl.g:1195:1: rule__ResponseConf__Group_0__0__Impl : ( 'status' ) ;
    public final void rule__ResponseConf__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1199:1: ( ( 'status' ) )
            // InternalDsl.g:1200:1: ( 'status' )
            {
            // InternalDsl.g:1200:1: ( 'status' )
            // InternalDsl.g:1201:2: 'status'
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
    // InternalDsl.g:1210:1: rule__ResponseConf__Group_0__1 : rule__ResponseConf__Group_0__1__Impl ;
    public final void rule__ResponseConf__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1214:1: ( rule__ResponseConf__Group_0__1__Impl )
            // InternalDsl.g:1215:2: rule__ResponseConf__Group_0__1__Impl
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
    // InternalDsl.g:1221:1: rule__ResponseConf__Group_0__1__Impl : ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) ) ;
    public final void rule__ResponseConf__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1225:1: ( ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) ) )
            // InternalDsl.g:1226:1: ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) )
            {
            // InternalDsl.g:1226:1: ( ( rule__ResponseConf__HttpStatusAssignment_0_1 ) )
            // InternalDsl.g:1227:2: ( rule__ResponseConf__HttpStatusAssignment_0_1 )
            {
             before(grammarAccess.getResponseConfAccess().getHttpStatusAssignment_0_1()); 
            // InternalDsl.g:1228:2: ( rule__ResponseConf__HttpStatusAssignment_0_1 )
            // InternalDsl.g:1228:3: rule__ResponseConf__HttpStatusAssignment_0_1
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
    // InternalDsl.g:1237:1: rule__ResponseConf__Group_1__0 : rule__ResponseConf__Group_1__0__Impl rule__ResponseConf__Group_1__1 ;
    public final void rule__ResponseConf__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1241:1: ( rule__ResponseConf__Group_1__0__Impl rule__ResponseConf__Group_1__1 )
            // InternalDsl.g:1242:2: rule__ResponseConf__Group_1__0__Impl rule__ResponseConf__Group_1__1
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
    // InternalDsl.g:1249:1: rule__ResponseConf__Group_1__0__Impl : ( 'content' ) ;
    public final void rule__ResponseConf__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1253:1: ( ( 'content' ) )
            // InternalDsl.g:1254:1: ( 'content' )
            {
            // InternalDsl.g:1254:1: ( 'content' )
            // InternalDsl.g:1255:2: 'content'
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
    // InternalDsl.g:1264:1: rule__ResponseConf__Group_1__1 : rule__ResponseConf__Group_1__1__Impl ;
    public final void rule__ResponseConf__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1268:1: ( rule__ResponseConf__Group_1__1__Impl )
            // InternalDsl.g:1269:2: rule__ResponseConf__Group_1__1__Impl
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
    // InternalDsl.g:1275:1: rule__ResponseConf__Group_1__1__Impl : ( ( rule__ResponseConf__ContentAssignment_1_1 ) ) ;
    public final void rule__ResponseConf__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( ( ( rule__ResponseConf__ContentAssignment_1_1 ) ) )
            // InternalDsl.g:1280:1: ( ( rule__ResponseConf__ContentAssignment_1_1 ) )
            {
            // InternalDsl.g:1280:1: ( ( rule__ResponseConf__ContentAssignment_1_1 ) )
            // InternalDsl.g:1281:2: ( rule__ResponseConf__ContentAssignment_1_1 )
            {
             before(grammarAccess.getResponseConfAccess().getContentAssignment_1_1()); 
            // InternalDsl.g:1282:2: ( rule__ResponseConf__ContentAssignment_1_1 )
            // InternalDsl.g:1282:3: rule__ResponseConf__ContentAssignment_1_1
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
    // InternalDsl.g:1291:1: rule__ResponseConf__Group_2__0 : rule__ResponseConf__Group_2__0__Impl rule__ResponseConf__Group_2__1 ;
    public final void rule__ResponseConf__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1295:1: ( rule__ResponseConf__Group_2__0__Impl rule__ResponseConf__Group_2__1 )
            // InternalDsl.g:1296:2: rule__ResponseConf__Group_2__0__Impl rule__ResponseConf__Group_2__1
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
    // InternalDsl.g:1303:1: rule__ResponseConf__Group_2__0__Impl : ( 'headers' ) ;
    public final void rule__ResponseConf__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1307:1: ( ( 'headers' ) )
            // InternalDsl.g:1308:1: ( 'headers' )
            {
            // InternalDsl.g:1308:1: ( 'headers' )
            // InternalDsl.g:1309:2: 'headers'
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
    // InternalDsl.g:1318:1: rule__ResponseConf__Group_2__1 : rule__ResponseConf__Group_2__1__Impl ;
    public final void rule__ResponseConf__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1322:1: ( rule__ResponseConf__Group_2__1__Impl )
            // InternalDsl.g:1323:2: rule__ResponseConf__Group_2__1__Impl
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
    // InternalDsl.g:1329:1: rule__ResponseConf__Group_2__1__Impl : ( ( rule__ResponseConf__HeadersAssignment_2_1 )? ) ;
    public final void rule__ResponseConf__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1333:1: ( ( ( rule__ResponseConf__HeadersAssignment_2_1 )? ) )
            // InternalDsl.g:1334:1: ( ( rule__ResponseConf__HeadersAssignment_2_1 )? )
            {
            // InternalDsl.g:1334:1: ( ( rule__ResponseConf__HeadersAssignment_2_1 )? )
            // InternalDsl.g:1335:2: ( rule__ResponseConf__HeadersAssignment_2_1 )?
            {
             before(grammarAccess.getResponseConfAccess().getHeadersAssignment_2_1()); 
            // InternalDsl.g:1336:2: ( rule__ResponseConf__HeadersAssignment_2_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1336:3: rule__ResponseConf__HeadersAssignment_2_1
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
    // InternalDsl.g:1345:1: rule__Headers__Group__0 : rule__Headers__Group__0__Impl rule__Headers__Group__1 ;
    public final void rule__Headers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1349:1: ( rule__Headers__Group__0__Impl rule__Headers__Group__1 )
            // InternalDsl.g:1350:2: rule__Headers__Group__0__Impl rule__Headers__Group__1
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
    // InternalDsl.g:1357:1: rule__Headers__Group__0__Impl : ( ( rule__Headers__HeadersAssignment_0 ) ) ;
    public final void rule__Headers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1361:1: ( ( ( rule__Headers__HeadersAssignment_0 ) ) )
            // InternalDsl.g:1362:1: ( ( rule__Headers__HeadersAssignment_0 ) )
            {
            // InternalDsl.g:1362:1: ( ( rule__Headers__HeadersAssignment_0 ) )
            // InternalDsl.g:1363:2: ( rule__Headers__HeadersAssignment_0 )
            {
             before(grammarAccess.getHeadersAccess().getHeadersAssignment_0()); 
            // InternalDsl.g:1364:2: ( rule__Headers__HeadersAssignment_0 )
            // InternalDsl.g:1364:3: rule__Headers__HeadersAssignment_0
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
    // InternalDsl.g:1372:1: rule__Headers__Group__1 : rule__Headers__Group__1__Impl ;
    public final void rule__Headers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1376:1: ( rule__Headers__Group__1__Impl )
            // InternalDsl.g:1377:2: rule__Headers__Group__1__Impl
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
    // InternalDsl.g:1383:1: rule__Headers__Group__1__Impl : ( ( rule__Headers__Group_1__0 )* ) ;
    public final void rule__Headers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( ( ( rule__Headers__Group_1__0 )* ) )
            // InternalDsl.g:1388:1: ( ( rule__Headers__Group_1__0 )* )
            {
            // InternalDsl.g:1388:1: ( ( rule__Headers__Group_1__0 )* )
            // InternalDsl.g:1389:2: ( rule__Headers__Group_1__0 )*
            {
             before(grammarAccess.getHeadersAccess().getGroup_1()); 
            // InternalDsl.g:1390:2: ( rule__Headers__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1390:3: rule__Headers__Group_1__0
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
    // InternalDsl.g:1399:1: rule__Headers__Group_1__0 : rule__Headers__Group_1__0__Impl rule__Headers__Group_1__1 ;
    public final void rule__Headers__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1403:1: ( rule__Headers__Group_1__0__Impl rule__Headers__Group_1__1 )
            // InternalDsl.g:1404:2: rule__Headers__Group_1__0__Impl rule__Headers__Group_1__1
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
    // InternalDsl.g:1411:1: rule__Headers__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Headers__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1415:1: ( ( ',' ) )
            // InternalDsl.g:1416:1: ( ',' )
            {
            // InternalDsl.g:1416:1: ( ',' )
            // InternalDsl.g:1417:2: ','
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
    // InternalDsl.g:1426:1: rule__Headers__Group_1__1 : rule__Headers__Group_1__1__Impl ;
    public final void rule__Headers__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1430:1: ( rule__Headers__Group_1__1__Impl )
            // InternalDsl.g:1431:2: rule__Headers__Group_1__1__Impl
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
    // InternalDsl.g:1437:1: rule__Headers__Group_1__1__Impl : ( ( rule__Headers__HeadersAssignment_1_1 ) ) ;
    public final void rule__Headers__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1441:1: ( ( ( rule__Headers__HeadersAssignment_1_1 ) ) )
            // InternalDsl.g:1442:1: ( ( rule__Headers__HeadersAssignment_1_1 ) )
            {
            // InternalDsl.g:1442:1: ( ( rule__Headers__HeadersAssignment_1_1 ) )
            // InternalDsl.g:1443:2: ( rule__Headers__HeadersAssignment_1_1 )
            {
             before(grammarAccess.getHeadersAccess().getHeadersAssignment_1_1()); 
            // InternalDsl.g:1444:2: ( rule__Headers__HeadersAssignment_1_1 )
            // InternalDsl.g:1444:3: rule__Headers__HeadersAssignment_1_1
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
    // InternalDsl.g:1453:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1457:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalDsl.g:1458:2: rule__Header__Group__0__Impl rule__Header__Group__1
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
    // InternalDsl.g:1465:1: rule__Header__Group__0__Impl : ( ( rule__Header__HeaderNameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1469:1: ( ( ( rule__Header__HeaderNameAssignment_0 ) ) )
            // InternalDsl.g:1470:1: ( ( rule__Header__HeaderNameAssignment_0 ) )
            {
            // InternalDsl.g:1470:1: ( ( rule__Header__HeaderNameAssignment_0 ) )
            // InternalDsl.g:1471:2: ( rule__Header__HeaderNameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getHeaderNameAssignment_0()); 
            // InternalDsl.g:1472:2: ( rule__Header__HeaderNameAssignment_0 )
            // InternalDsl.g:1472:3: rule__Header__HeaderNameAssignment_0
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
    // InternalDsl.g:1480:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1484:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalDsl.g:1485:2: rule__Header__Group__1__Impl rule__Header__Group__2
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
    // InternalDsl.g:1492:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1496:1: ( ( ':' ) )
            // InternalDsl.g:1497:1: ( ':' )
            {
            // InternalDsl.g:1497:1: ( ':' )
            // InternalDsl.g:1498:2: ':'
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
    // InternalDsl.g:1507:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1511:1: ( rule__Header__Group__2__Impl )
            // InternalDsl.g:1512:2: rule__Header__Group__2__Impl
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
    // InternalDsl.g:1518:1: rule__Header__Group__2__Impl : ( ( rule__Header__HeaderValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( ( ( rule__Header__HeaderValueAssignment_2 ) ) )
            // InternalDsl.g:1523:1: ( ( rule__Header__HeaderValueAssignment_2 ) )
            {
            // InternalDsl.g:1523:1: ( ( rule__Header__HeaderValueAssignment_2 ) )
            // InternalDsl.g:1524:2: ( rule__Header__HeaderValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getHeaderValueAssignment_2()); 
            // InternalDsl.g:1525:2: ( rule__Header__HeaderValueAssignment_2 )
            // InternalDsl.g:1525:3: rule__Header__HeaderValueAssignment_2
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
    // InternalDsl.g:1534:1: rule__OrCondition__Group__0 : rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 ;
    public final void rule__OrCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1538:1: ( rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 )
            // InternalDsl.g:1539:2: rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1
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
    // InternalDsl.g:1546:1: rule__OrCondition__Group__0__Impl : ( ruleAndCondition ) ;
    public final void rule__OrCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1550:1: ( ( ruleAndCondition ) )
            // InternalDsl.g:1551:1: ( ruleAndCondition )
            {
            // InternalDsl.g:1551:1: ( ruleAndCondition )
            // InternalDsl.g:1552:2: ruleAndCondition
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
    // InternalDsl.g:1561:1: rule__OrCondition__Group__1 : rule__OrCondition__Group__1__Impl ;
    public final void rule__OrCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1565:1: ( rule__OrCondition__Group__1__Impl )
            // InternalDsl.g:1566:2: rule__OrCondition__Group__1__Impl
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
    // InternalDsl.g:1572:1: rule__OrCondition__Group__1__Impl : ( ( rule__OrCondition__Group_1__0 )* ) ;
    public final void rule__OrCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( ( ( rule__OrCondition__Group_1__0 )* ) )
            // InternalDsl.g:1577:1: ( ( rule__OrCondition__Group_1__0 )* )
            {
            // InternalDsl.g:1577:1: ( ( rule__OrCondition__Group_1__0 )* )
            // InternalDsl.g:1578:2: ( rule__OrCondition__Group_1__0 )*
            {
             before(grammarAccess.getOrConditionAccess().getGroup_1()); 
            // InternalDsl.g:1579:2: ( rule__OrCondition__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1579:3: rule__OrCondition__Group_1__0
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
    // InternalDsl.g:1588:1: rule__OrCondition__Group_1__0 : rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 ;
    public final void rule__OrCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1592:1: ( rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 )
            // InternalDsl.g:1593:2: rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1
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
    // InternalDsl.g:1600:1: rule__OrCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__OrCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1604:1: ( ( () ) )
            // InternalDsl.g:1605:1: ( () )
            {
            // InternalDsl.g:1605:1: ( () )
            // InternalDsl.g:1606:2: ()
            {
             before(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0()); 
            // InternalDsl.g:1607:2: ()
            // InternalDsl.g:1607:3: 
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
    // InternalDsl.g:1615:1: rule__OrCondition__Group_1__1 : rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 ;
    public final void rule__OrCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1619:1: ( rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 )
            // InternalDsl.g:1620:2: rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2
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
    // InternalDsl.g:1627:1: rule__OrCondition__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1631:1: ( ( 'or' ) )
            // InternalDsl.g:1632:1: ( 'or' )
            {
            // InternalDsl.g:1632:1: ( 'or' )
            // InternalDsl.g:1633:2: 'or'
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
    // InternalDsl.g:1642:1: rule__OrCondition__Group_1__2 : rule__OrCondition__Group_1__2__Impl ;
    public final void rule__OrCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1646:1: ( rule__OrCondition__Group_1__2__Impl )
            // InternalDsl.g:1647:2: rule__OrCondition__Group_1__2__Impl
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
    // InternalDsl.g:1653:1: rule__OrCondition__Group_1__2__Impl : ( ( rule__OrCondition__RightAssignment_1_2 ) ) ;
    public final void rule__OrCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1657:1: ( ( ( rule__OrCondition__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1658:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1658:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            // InternalDsl.g:1659:2: ( rule__OrCondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrConditionAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1660:2: ( rule__OrCondition__RightAssignment_1_2 )
            // InternalDsl.g:1660:3: rule__OrCondition__RightAssignment_1_2
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
    // InternalDsl.g:1669:1: rule__AndCondition__Group__0 : rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 ;
    public final void rule__AndCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1673:1: ( rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 )
            // InternalDsl.g:1674:2: rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1
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
    // InternalDsl.g:1681:1: rule__AndCondition__Group__0__Impl : ( ruleOptionalNegationCondition ) ;
    public final void rule__AndCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1685:1: ( ( ruleOptionalNegationCondition ) )
            // InternalDsl.g:1686:1: ( ruleOptionalNegationCondition )
            {
            // InternalDsl.g:1686:1: ( ruleOptionalNegationCondition )
            // InternalDsl.g:1687:2: ruleOptionalNegationCondition
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
    // InternalDsl.g:1696:1: rule__AndCondition__Group__1 : rule__AndCondition__Group__1__Impl ;
    public final void rule__AndCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1700:1: ( rule__AndCondition__Group__1__Impl )
            // InternalDsl.g:1701:2: rule__AndCondition__Group__1__Impl
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
    // InternalDsl.g:1707:1: rule__AndCondition__Group__1__Impl : ( ( rule__AndCondition__Group_1__0 )* ) ;
    public final void rule__AndCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1711:1: ( ( ( rule__AndCondition__Group_1__0 )* ) )
            // InternalDsl.g:1712:1: ( ( rule__AndCondition__Group_1__0 )* )
            {
            // InternalDsl.g:1712:1: ( ( rule__AndCondition__Group_1__0 )* )
            // InternalDsl.g:1713:2: ( rule__AndCondition__Group_1__0 )*
            {
             before(grammarAccess.getAndConditionAccess().getGroup_1()); 
            // InternalDsl.g:1714:2: ( rule__AndCondition__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1714:3: rule__AndCondition__Group_1__0
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
    // InternalDsl.g:1723:1: rule__AndCondition__Group_1__0 : rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 ;
    public final void rule__AndCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1727:1: ( rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 )
            // InternalDsl.g:1728:2: rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1
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
    // InternalDsl.g:1735:1: rule__AndCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__AndCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1739:1: ( ( () ) )
            // InternalDsl.g:1740:1: ( () )
            {
            // InternalDsl.g:1740:1: ( () )
            // InternalDsl.g:1741:2: ()
            {
             before(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0()); 
            // InternalDsl.g:1742:2: ()
            // InternalDsl.g:1742:3: 
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
    // InternalDsl.g:1750:1: rule__AndCondition__Group_1__1 : rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 ;
    public final void rule__AndCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1754:1: ( rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 )
            // InternalDsl.g:1755:2: rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2
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
    // InternalDsl.g:1762:1: rule__AndCondition__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1766:1: ( ( 'and' ) )
            // InternalDsl.g:1767:1: ( 'and' )
            {
            // InternalDsl.g:1767:1: ( 'and' )
            // InternalDsl.g:1768:2: 'and'
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
    // InternalDsl.g:1777:1: rule__AndCondition__Group_1__2 : rule__AndCondition__Group_1__2__Impl ;
    public final void rule__AndCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1781:1: ( rule__AndCondition__Group_1__2__Impl )
            // InternalDsl.g:1782:2: rule__AndCondition__Group_1__2__Impl
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
    // InternalDsl.g:1788:1: rule__AndCondition__Group_1__2__Impl : ( ( rule__AndCondition__RightAssignment_1_2 ) ) ;
    public final void rule__AndCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1792:1: ( ( ( rule__AndCondition__RightAssignment_1_2 ) ) )
            // InternalDsl.g:1793:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:1793:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            // InternalDsl.g:1794:2: ( rule__AndCondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndConditionAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:1795:2: ( rule__AndCondition__RightAssignment_1_2 )
            // InternalDsl.g:1795:3: rule__AndCondition__RightAssignment_1_2
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
    // InternalDsl.g:1804:1: rule__OptionalNegationCondition__Group_1__0 : rule__OptionalNegationCondition__Group_1__0__Impl rule__OptionalNegationCondition__Group_1__1 ;
    public final void rule__OptionalNegationCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1808:1: ( rule__OptionalNegationCondition__Group_1__0__Impl rule__OptionalNegationCondition__Group_1__1 )
            // InternalDsl.g:1809:2: rule__OptionalNegationCondition__Group_1__0__Impl rule__OptionalNegationCondition__Group_1__1
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
    // InternalDsl.g:1816:1: rule__OptionalNegationCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__OptionalNegationCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1820:1: ( ( () ) )
            // InternalDsl.g:1821:1: ( () )
            {
            // InternalDsl.g:1821:1: ( () )
            // InternalDsl.g:1822:2: ()
            {
             before(grammarAccess.getOptionalNegationConditionAccess().getNegationAction_1_0()); 
            // InternalDsl.g:1823:2: ()
            // InternalDsl.g:1823:3: 
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
    // InternalDsl.g:1831:1: rule__OptionalNegationCondition__Group_1__1 : rule__OptionalNegationCondition__Group_1__1__Impl rule__OptionalNegationCondition__Group_1__2 ;
    public final void rule__OptionalNegationCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1835:1: ( rule__OptionalNegationCondition__Group_1__1__Impl rule__OptionalNegationCondition__Group_1__2 )
            // InternalDsl.g:1836:2: rule__OptionalNegationCondition__Group_1__1__Impl rule__OptionalNegationCondition__Group_1__2
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
    // InternalDsl.g:1843:1: rule__OptionalNegationCondition__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__OptionalNegationCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1847:1: ( ( 'not' ) )
            // InternalDsl.g:1848:1: ( 'not' )
            {
            // InternalDsl.g:1848:1: ( 'not' )
            // InternalDsl.g:1849:2: 'not'
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
    // InternalDsl.g:1858:1: rule__OptionalNegationCondition__Group_1__2 : rule__OptionalNegationCondition__Group_1__2__Impl ;
    public final void rule__OptionalNegationCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1862:1: ( rule__OptionalNegationCondition__Group_1__2__Impl )
            // InternalDsl.g:1863:2: rule__OptionalNegationCondition__Group_1__2__Impl
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
    // InternalDsl.g:1869:1: rule__OptionalNegationCondition__Group_1__2__Impl : ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) ) ;
    public final void rule__OptionalNegationCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1873:1: ( ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) ) )
            // InternalDsl.g:1874:1: ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) )
            {
            // InternalDsl.g:1874:1: ( ( rule__OptionalNegationCondition__NegatedAssignment_1_2 ) )
            // InternalDsl.g:1875:2: ( rule__OptionalNegationCondition__NegatedAssignment_1_2 )
            {
             before(grammarAccess.getOptionalNegationConditionAccess().getNegatedAssignment_1_2()); 
            // InternalDsl.g:1876:2: ( rule__OptionalNegationCondition__NegatedAssignment_1_2 )
            // InternalDsl.g:1876:3: rule__OptionalNegationCondition__NegatedAssignment_1_2
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
    // InternalDsl.g:1885:1: rule__BracketedCondition__Group_1__0 : rule__BracketedCondition__Group_1__0__Impl rule__BracketedCondition__Group_1__1 ;
    public final void rule__BracketedCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1889:1: ( rule__BracketedCondition__Group_1__0__Impl rule__BracketedCondition__Group_1__1 )
            // InternalDsl.g:1890:2: rule__BracketedCondition__Group_1__0__Impl rule__BracketedCondition__Group_1__1
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
    // InternalDsl.g:1897:1: rule__BracketedCondition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BracketedCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1901:1: ( ( '(' ) )
            // InternalDsl.g:1902:1: ( '(' )
            {
            // InternalDsl.g:1902:1: ( '(' )
            // InternalDsl.g:1903:2: '('
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
    // InternalDsl.g:1912:1: rule__BracketedCondition__Group_1__1 : rule__BracketedCondition__Group_1__1__Impl rule__BracketedCondition__Group_1__2 ;
    public final void rule__BracketedCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1916:1: ( rule__BracketedCondition__Group_1__1__Impl rule__BracketedCondition__Group_1__2 )
            // InternalDsl.g:1917:2: rule__BracketedCondition__Group_1__1__Impl rule__BracketedCondition__Group_1__2
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
    // InternalDsl.g:1924:1: rule__BracketedCondition__Group_1__1__Impl : ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) ) ;
    public final void rule__BracketedCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1928:1: ( ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) ) )
            // InternalDsl.g:1929:1: ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) )
            {
            // InternalDsl.g:1929:1: ( ( rule__BracketedCondition__ConditionAssignment_1_1 ) )
            // InternalDsl.g:1930:2: ( rule__BracketedCondition__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getBracketedConditionAccess().getConditionAssignment_1_1()); 
            // InternalDsl.g:1931:2: ( rule__BracketedCondition__ConditionAssignment_1_1 )
            // InternalDsl.g:1931:3: rule__BracketedCondition__ConditionAssignment_1_1
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
    // InternalDsl.g:1939:1: rule__BracketedCondition__Group_1__2 : rule__BracketedCondition__Group_1__2__Impl ;
    public final void rule__BracketedCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1943:1: ( rule__BracketedCondition__Group_1__2__Impl )
            // InternalDsl.g:1944:2: rule__BracketedCondition__Group_1__2__Impl
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
    // InternalDsl.g:1950:1: rule__BracketedCondition__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BracketedCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1954:1: ( ( ')' ) )
            // InternalDsl.g:1955:1: ( ')' )
            {
            // InternalDsl.g:1955:1: ( ')' )
            // InternalDsl.g:1956:2: ')'
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
    // InternalDsl.g:1966:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1970:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalDsl.g:1971:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalDsl.g:1978:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1982:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalDsl.g:1983:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalDsl.g:1983:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalDsl.g:1984:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalDsl.g:1985:2: ( rule__Expression__LeftAssignment_0 )
            // InternalDsl.g:1985:3: rule__Expression__LeftAssignment_0
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
    // InternalDsl.g:1993:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1997:1: ( rule__Expression__Group__1__Impl )
            // InternalDsl.g:1998:2: rule__Expression__Group__1__Impl
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
    // InternalDsl.g:2004:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalDsl.g:2009:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalDsl.g:2009:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalDsl.g:2010:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalDsl.g:2011:2: ( rule__Expression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=12 && LA15_0<=18)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:2011:3: rule__Expression__Group_1__0
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
    // InternalDsl.g:2020:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2024:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalDsl.g:2025:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalDsl.g:2032:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OpAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2036:1: ( ( ( rule__Expression__OpAssignment_1_0 ) ) )
            // InternalDsl.g:2037:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            {
            // InternalDsl.g:2037:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            // InternalDsl.g:2038:2: ( rule__Expression__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 
            // InternalDsl.g:2039:2: ( rule__Expression__OpAssignment_1_0 )
            // InternalDsl.g:2039:3: rule__Expression__OpAssignment_1_0
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
    // InternalDsl.g:2047:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2051:1: ( rule__Expression__Group_1__1__Impl )
            // InternalDsl.g:2052:2: rule__Expression__Group_1__1__Impl
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
    // InternalDsl.g:2058:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalDsl.g:2063:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalDsl.g:2063:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalDsl.g:2064:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalDsl.g:2065:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalDsl.g:2065:3: rule__Expression__RightAssignment_1_1
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
    // InternalDsl.g:2074:1: rule__ListFunction__Group__0 : rule__ListFunction__Group__0__Impl rule__ListFunction__Group__1 ;
    public final void rule__ListFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2078:1: ( rule__ListFunction__Group__0__Impl rule__ListFunction__Group__1 )
            // InternalDsl.g:2079:2: rule__ListFunction__Group__0__Impl rule__ListFunction__Group__1
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
    // InternalDsl.g:2086:1: rule__ListFunction__Group__0__Impl : ( '{' ) ;
    public final void rule__ListFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2090:1: ( ( '{' ) )
            // InternalDsl.g:2091:1: ( '{' )
            {
            // InternalDsl.g:2091:1: ( '{' )
            // InternalDsl.g:2092:2: '{'
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
    // InternalDsl.g:2101:1: rule__ListFunction__Group__1 : rule__ListFunction__Group__1__Impl rule__ListFunction__Group__2 ;
    public final void rule__ListFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2105:1: ( rule__ListFunction__Group__1__Impl rule__ListFunction__Group__2 )
            // InternalDsl.g:2106:2: rule__ListFunction__Group__1__Impl rule__ListFunction__Group__2
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
    // InternalDsl.g:2113:1: rule__ListFunction__Group__1__Impl : ( ( rule__ListFunction__OpAssignment_1 ) ) ;
    public final void rule__ListFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2117:1: ( ( ( rule__ListFunction__OpAssignment_1 ) ) )
            // InternalDsl.g:2118:1: ( ( rule__ListFunction__OpAssignment_1 ) )
            {
            // InternalDsl.g:2118:1: ( ( rule__ListFunction__OpAssignment_1 ) )
            // InternalDsl.g:2119:2: ( rule__ListFunction__OpAssignment_1 )
            {
             before(grammarAccess.getListFunctionAccess().getOpAssignment_1()); 
            // InternalDsl.g:2120:2: ( rule__ListFunction__OpAssignment_1 )
            // InternalDsl.g:2120:3: rule__ListFunction__OpAssignment_1
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
    // InternalDsl.g:2128:1: rule__ListFunction__Group__2 : rule__ListFunction__Group__2__Impl rule__ListFunction__Group__3 ;
    public final void rule__ListFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2132:1: ( rule__ListFunction__Group__2__Impl rule__ListFunction__Group__3 )
            // InternalDsl.g:2133:2: rule__ListFunction__Group__2__Impl rule__ListFunction__Group__3
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
    // InternalDsl.g:2140:1: rule__ListFunction__Group__2__Impl : ( ( rule__ListFunction__AliasAssignment_2 ) ) ;
    public final void rule__ListFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2144:1: ( ( ( rule__ListFunction__AliasAssignment_2 ) ) )
            // InternalDsl.g:2145:1: ( ( rule__ListFunction__AliasAssignment_2 ) )
            {
            // InternalDsl.g:2145:1: ( ( rule__ListFunction__AliasAssignment_2 ) )
            // InternalDsl.g:2146:2: ( rule__ListFunction__AliasAssignment_2 )
            {
             before(grammarAccess.getListFunctionAccess().getAliasAssignment_2()); 
            // InternalDsl.g:2147:2: ( rule__ListFunction__AliasAssignment_2 )
            // InternalDsl.g:2147:3: rule__ListFunction__AliasAssignment_2
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
    // InternalDsl.g:2155:1: rule__ListFunction__Group__3 : rule__ListFunction__Group__3__Impl rule__ListFunction__Group__4 ;
    public final void rule__ListFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2159:1: ( rule__ListFunction__Group__3__Impl rule__ListFunction__Group__4 )
            // InternalDsl.g:2160:2: rule__ListFunction__Group__3__Impl rule__ListFunction__Group__4
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
    // InternalDsl.g:2167:1: rule__ListFunction__Group__3__Impl : ( ( rule__ListFunction__SeparatorAssignment_3 ) ) ;
    public final void rule__ListFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2171:1: ( ( ( rule__ListFunction__SeparatorAssignment_3 ) ) )
            // InternalDsl.g:2172:1: ( ( rule__ListFunction__SeparatorAssignment_3 ) )
            {
            // InternalDsl.g:2172:1: ( ( rule__ListFunction__SeparatorAssignment_3 ) )
            // InternalDsl.g:2173:2: ( rule__ListFunction__SeparatorAssignment_3 )
            {
             before(grammarAccess.getListFunctionAccess().getSeparatorAssignment_3()); 
            // InternalDsl.g:2174:2: ( rule__ListFunction__SeparatorAssignment_3 )
            // InternalDsl.g:2174:3: rule__ListFunction__SeparatorAssignment_3
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
    // InternalDsl.g:2182:1: rule__ListFunction__Group__4 : rule__ListFunction__Group__4__Impl rule__ListFunction__Group__5 ;
    public final void rule__ListFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2186:1: ( rule__ListFunction__Group__4__Impl rule__ListFunction__Group__5 )
            // InternalDsl.g:2187:2: rule__ListFunction__Group__4__Impl rule__ListFunction__Group__5
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
    // InternalDsl.g:2194:1: rule__ListFunction__Group__4__Impl : ( ( rule__ListFunction__ConditionAssignment_4 ) ) ;
    public final void rule__ListFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2198:1: ( ( ( rule__ListFunction__ConditionAssignment_4 ) ) )
            // InternalDsl.g:2199:1: ( ( rule__ListFunction__ConditionAssignment_4 ) )
            {
            // InternalDsl.g:2199:1: ( ( rule__ListFunction__ConditionAssignment_4 ) )
            // InternalDsl.g:2200:2: ( rule__ListFunction__ConditionAssignment_4 )
            {
             before(grammarAccess.getListFunctionAccess().getConditionAssignment_4()); 
            // InternalDsl.g:2201:2: ( rule__ListFunction__ConditionAssignment_4 )
            // InternalDsl.g:2201:3: rule__ListFunction__ConditionAssignment_4
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
    // InternalDsl.g:2209:1: rule__ListFunction__Group__5 : rule__ListFunction__Group__5__Impl ;
    public final void rule__ListFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2213:1: ( rule__ListFunction__Group__5__Impl )
            // InternalDsl.g:2214:2: rule__ListFunction__Group__5__Impl
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
    // InternalDsl.g:2220:1: rule__ListFunction__Group__5__Impl : ( '}' ) ;
    public final void rule__ListFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2224:1: ( ( '}' ) )
            // InternalDsl.g:2225:1: ( '}' )
            {
            // InternalDsl.g:2225:1: ( '}' )
            // InternalDsl.g:2226:2: '}'
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
    // InternalDsl.g:2236:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2240:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDsl.g:2241:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalDsl.g:2248:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__NameAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2252:1: ( ( ( rule__Reference__NameAssignment_0 ) ) )
            // InternalDsl.g:2253:1: ( ( rule__Reference__NameAssignment_0 ) )
            {
            // InternalDsl.g:2253:1: ( ( rule__Reference__NameAssignment_0 ) )
            // InternalDsl.g:2254:2: ( rule__Reference__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_0()); 
            // InternalDsl.g:2255:2: ( rule__Reference__NameAssignment_0 )
            // InternalDsl.g:2255:3: rule__Reference__NameAssignment_0
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
    // InternalDsl.g:2263:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2267:1: ( rule__Reference__Group__1__Impl )
            // InternalDsl.g:2268:2: rule__Reference__Group__1__Impl
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
    // InternalDsl.g:2274:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__PropAssignment_1 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2278:1: ( ( ( rule__Reference__PropAssignment_1 )? ) )
            // InternalDsl.g:2279:1: ( ( rule__Reference__PropAssignment_1 )? )
            {
            // InternalDsl.g:2279:1: ( ( rule__Reference__PropAssignment_1 )? )
            // InternalDsl.g:2280:2: ( rule__Reference__PropAssignment_1 )?
            {
             before(grammarAccess.getReferenceAccess().getPropAssignment_1()); 
            // InternalDsl.g:2281:2: ( rule__Reference__PropAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37||LA16_0==40||LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:2281:3: rule__Reference__PropAssignment_1
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
    // InternalDsl.g:2290:1: rule__ListElementReference__Group__0 : rule__ListElementReference__Group__0__Impl rule__ListElementReference__Group__1 ;
    public final void rule__ListElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2294:1: ( rule__ListElementReference__Group__0__Impl rule__ListElementReference__Group__1 )
            // InternalDsl.g:2295:2: rule__ListElementReference__Group__0__Impl rule__ListElementReference__Group__1
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
    // InternalDsl.g:2302:1: rule__ListElementReference__Group__0__Impl : ( '$' ) ;
    public final void rule__ListElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2306:1: ( ( '$' ) )
            // InternalDsl.g:2307:1: ( '$' )
            {
            // InternalDsl.g:2307:1: ( '$' )
            // InternalDsl.g:2308:2: '$'
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
    // InternalDsl.g:2317:1: rule__ListElementReference__Group__1 : rule__ListElementReference__Group__1__Impl rule__ListElementReference__Group__2 ;
    public final void rule__ListElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2321:1: ( rule__ListElementReference__Group__1__Impl rule__ListElementReference__Group__2 )
            // InternalDsl.g:2322:2: rule__ListElementReference__Group__1__Impl rule__ListElementReference__Group__2
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
    // InternalDsl.g:2329:1: rule__ListElementReference__Group__1__Impl : ( ( rule__ListElementReference__NameAssignment_1 ) ) ;
    public final void rule__ListElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2333:1: ( ( ( rule__ListElementReference__NameAssignment_1 ) ) )
            // InternalDsl.g:2334:1: ( ( rule__ListElementReference__NameAssignment_1 ) )
            {
            // InternalDsl.g:2334:1: ( ( rule__ListElementReference__NameAssignment_1 ) )
            // InternalDsl.g:2335:2: ( rule__ListElementReference__NameAssignment_1 )
            {
             before(grammarAccess.getListElementReferenceAccess().getNameAssignment_1()); 
            // InternalDsl.g:2336:2: ( rule__ListElementReference__NameAssignment_1 )
            // InternalDsl.g:2336:3: rule__ListElementReference__NameAssignment_1
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
    // InternalDsl.g:2344:1: rule__ListElementReference__Group__2 : rule__ListElementReference__Group__2__Impl ;
    public final void rule__ListElementReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2348:1: ( rule__ListElementReference__Group__2__Impl )
            // InternalDsl.g:2349:2: rule__ListElementReference__Group__2__Impl
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
    // InternalDsl.g:2355:1: rule__ListElementReference__Group__2__Impl : ( ( rule__ListElementReference__PropAssignment_2 )? ) ;
    public final void rule__ListElementReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2359:1: ( ( ( rule__ListElementReference__PropAssignment_2 )? ) )
            // InternalDsl.g:2360:1: ( ( rule__ListElementReference__PropAssignment_2 )? )
            {
            // InternalDsl.g:2360:1: ( ( rule__ListElementReference__PropAssignment_2 )? )
            // InternalDsl.g:2361:2: ( rule__ListElementReference__PropAssignment_2 )?
            {
             before(grammarAccess.getListElementReferenceAccess().getPropAssignment_2()); 
            // InternalDsl.g:2362:2: ( rule__ListElementReference__PropAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37||LA17_0==40||LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:2362:3: rule__ListElementReference__PropAssignment_2
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
    // InternalDsl.g:2371:1: rule__CollectionAccess__Group__0 : rule__CollectionAccess__Group__0__Impl rule__CollectionAccess__Group__1 ;
    public final void rule__CollectionAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2375:1: ( rule__CollectionAccess__Group__0__Impl rule__CollectionAccess__Group__1 )
            // InternalDsl.g:2376:2: rule__CollectionAccess__Group__0__Impl rule__CollectionAccess__Group__1
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
    // InternalDsl.g:2383:1: rule__CollectionAccess__Group__0__Impl : ( '[' ) ;
    public final void rule__CollectionAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2387:1: ( ( '[' ) )
            // InternalDsl.g:2388:1: ( '[' )
            {
            // InternalDsl.g:2388:1: ( '[' )
            // InternalDsl.g:2389:2: '['
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
    // InternalDsl.g:2398:1: rule__CollectionAccess__Group__1 : rule__CollectionAccess__Group__1__Impl rule__CollectionAccess__Group__2 ;
    public final void rule__CollectionAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2402:1: ( rule__CollectionAccess__Group__1__Impl rule__CollectionAccess__Group__2 )
            // InternalDsl.g:2403:2: rule__CollectionAccess__Group__1__Impl rule__CollectionAccess__Group__2
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
    // InternalDsl.g:2410:1: rule__CollectionAccess__Group__1__Impl : ( ( rule__CollectionAccess__Alternatives_1 ) ) ;
    public final void rule__CollectionAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2414:1: ( ( ( rule__CollectionAccess__Alternatives_1 ) ) )
            // InternalDsl.g:2415:1: ( ( rule__CollectionAccess__Alternatives_1 ) )
            {
            // InternalDsl.g:2415:1: ( ( rule__CollectionAccess__Alternatives_1 ) )
            // InternalDsl.g:2416:2: ( rule__CollectionAccess__Alternatives_1 )
            {
             before(grammarAccess.getCollectionAccessAccess().getAlternatives_1()); 
            // InternalDsl.g:2417:2: ( rule__CollectionAccess__Alternatives_1 )
            // InternalDsl.g:2417:3: rule__CollectionAccess__Alternatives_1
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
    // InternalDsl.g:2425:1: rule__CollectionAccess__Group__2 : rule__CollectionAccess__Group__2__Impl ;
    public final void rule__CollectionAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2429:1: ( rule__CollectionAccess__Group__2__Impl )
            // InternalDsl.g:2430:2: rule__CollectionAccess__Group__2__Impl
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
    // InternalDsl.g:2436:1: rule__CollectionAccess__Group__2__Impl : ( ']' ) ;
    public final void rule__CollectionAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2440:1: ( ( ']' ) )
            // InternalDsl.g:2441:1: ( ']' )
            {
            // InternalDsl.g:2441:1: ( ']' )
            // InternalDsl.g:2442:2: ']'
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


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalDsl.g:2452:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2456:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalDsl.g:2457:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

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
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalDsl.g:2464:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2468:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // InternalDsl.g:2469:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // InternalDsl.g:2469:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // InternalDsl.g:2470:2: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // InternalDsl.g:2471:2: ( rule__FunctionCall__NameAssignment_0 )
            // InternalDsl.g:2471:3: rule__FunctionCall__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalDsl.g:2479:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2483:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalDsl.g:2484:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__2();

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
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalDsl.g:2491:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2495:1: ( ( '(' ) )
            // InternalDsl.g:2496:1: ( '(' )
            {
            // InternalDsl.g:2496:1: ( '(' )
            // InternalDsl.g:2497:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalDsl.g:2506:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2510:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalDsl.g:2511:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3();

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
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalDsl.g:2518:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__FunctionParametersAssignment_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2522:1: ( ( ( rule__FunctionCall__FunctionParametersAssignment_2 )? ) )
            // InternalDsl.g:2523:1: ( ( rule__FunctionCall__FunctionParametersAssignment_2 )? )
            {
            // InternalDsl.g:2523:1: ( ( rule__FunctionCall__FunctionParametersAssignment_2 )? )
            // InternalDsl.g:2524:2: ( rule__FunctionCall__FunctionParametersAssignment_2 )?
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionParametersAssignment_2()); 
            // InternalDsl.g:2525:2: ( rule__FunctionCall__FunctionParametersAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_BOOLEAN)||LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:2525:3: rule__FunctionCall__FunctionParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__FunctionParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getFunctionParametersAssignment_2()); 

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
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalDsl.g:2533:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2537:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // InternalDsl.g:2538:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4();

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
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalDsl.g:2545:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__Group_3__0 )* ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2549:1: ( ( ( rule__FunctionCall__Group_3__0 )* ) )
            // InternalDsl.g:2550:1: ( ( rule__FunctionCall__Group_3__0 )* )
            {
            // InternalDsl.g:2550:1: ( ( rule__FunctionCall__Group_3__0 )* )
            // InternalDsl.g:2551:2: ( rule__FunctionCall__Group_3__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_3()); 
            // InternalDsl.g:2552:2: ( rule__FunctionCall__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2552:3: rule__FunctionCall__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FunctionCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group__4"
    // InternalDsl.g:2560:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2564:1: ( rule__FunctionCall__Group__4__Impl )
            // InternalDsl.g:2565:2: rule__FunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // InternalDsl.g:2571:1: rule__FunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2575:1: ( ( ')' ) )
            // InternalDsl.g:2576:1: ( ')' )
            {
            // InternalDsl.g:2576:1: ( ')' )
            // InternalDsl.g:2577:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__0"
    // InternalDsl.g:2587:1: rule__FunctionCall__Group_3__0 : rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 ;
    public final void rule__FunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2591:1: ( rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 )
            // InternalDsl.g:2592:2: rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__FunctionCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1();

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
    // $ANTLR end "rule__FunctionCall__Group_3__0"


    // $ANTLR start "rule__FunctionCall__Group_3__0__Impl"
    // InternalDsl.g:2599:1: rule__FunctionCall__Group_3__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2603:1: ( ( ',' ) )
            // InternalDsl.g:2604:1: ( ',' )
            {
            // InternalDsl.g:2604:1: ( ',' )
            // InternalDsl.g:2605:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__1"
    // InternalDsl.g:2614:1: rule__FunctionCall__Group_3__1 : rule__FunctionCall__Group_3__1__Impl ;
    public final void rule__FunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2618:1: ( rule__FunctionCall__Group_3__1__Impl )
            // InternalDsl.g:2619:2: rule__FunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_3__1"


    // $ANTLR start "rule__FunctionCall__Group_3__1__Impl"
    // InternalDsl.g:2625:1: rule__FunctionCall__Group_3__1__Impl : ( ( rule__FunctionCall__FunctionParametersAssignment_3_1 ) ) ;
    public final void rule__FunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2629:1: ( ( ( rule__FunctionCall__FunctionParametersAssignment_3_1 ) ) )
            // InternalDsl.g:2630:1: ( ( rule__FunctionCall__FunctionParametersAssignment_3_1 ) )
            {
            // InternalDsl.g:2630:1: ( ( rule__FunctionCall__FunctionParametersAssignment_3_1 ) )
            // InternalDsl.g:2631:2: ( rule__FunctionCall__FunctionParametersAssignment_3_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionParametersAssignment_3_1()); 
            // InternalDsl.g:2632:2: ( rule__FunctionCall__FunctionParametersAssignment_3_1 )
            // InternalDsl.g:2632:3: rule__FunctionCall__FunctionParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__FunctionParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getFunctionParametersAssignment_3_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__PropertyRef__Group__0"
    // InternalDsl.g:2641:1: rule__PropertyRef__Group__0 : rule__PropertyRef__Group__0__Impl rule__PropertyRef__Group__1 ;
    public final void rule__PropertyRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2645:1: ( rule__PropertyRef__Group__0__Impl rule__PropertyRef__Group__1 )
            // InternalDsl.g:2646:2: rule__PropertyRef__Group__0__Impl rule__PropertyRef__Group__1
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
    // InternalDsl.g:2653:1: rule__PropertyRef__Group__0__Impl : ( ( rule__PropertyRef__Alternatives_0 ) ) ;
    public final void rule__PropertyRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2657:1: ( ( ( rule__PropertyRef__Alternatives_0 ) ) )
            // InternalDsl.g:2658:1: ( ( rule__PropertyRef__Alternatives_0 ) )
            {
            // InternalDsl.g:2658:1: ( ( rule__PropertyRef__Alternatives_0 ) )
            // InternalDsl.g:2659:2: ( rule__PropertyRef__Alternatives_0 )
            {
             before(grammarAccess.getPropertyRefAccess().getAlternatives_0()); 
            // InternalDsl.g:2660:2: ( rule__PropertyRef__Alternatives_0 )
            // InternalDsl.g:2660:3: rule__PropertyRef__Alternatives_0
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
    // InternalDsl.g:2668:1: rule__PropertyRef__Group__1 : rule__PropertyRef__Group__1__Impl ;
    public final void rule__PropertyRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2672:1: ( rule__PropertyRef__Group__1__Impl )
            // InternalDsl.g:2673:2: rule__PropertyRef__Group__1__Impl
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
    // InternalDsl.g:2679:1: rule__PropertyRef__Group__1__Impl : ( ( rule__PropertyRef__SubProperyAssignment_1 )? ) ;
    public final void rule__PropertyRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2683:1: ( ( ( rule__PropertyRef__SubProperyAssignment_1 )? ) )
            // InternalDsl.g:2684:1: ( ( rule__PropertyRef__SubProperyAssignment_1 )? )
            {
            // InternalDsl.g:2684:1: ( ( rule__PropertyRef__SubProperyAssignment_1 )? )
            // InternalDsl.g:2685:2: ( rule__PropertyRef__SubProperyAssignment_1 )?
            {
             before(grammarAccess.getPropertyRefAccess().getSubProperyAssignment_1()); 
            // InternalDsl.g:2686:2: ( rule__PropertyRef__SubProperyAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37||LA20_0==40||LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:2686:3: rule__PropertyRef__SubProperyAssignment_1
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
    // InternalDsl.g:2695:1: rule__PropertyRef__Group_0_0__0 : rule__PropertyRef__Group_0_0__0__Impl rule__PropertyRef__Group_0_0__1 ;
    public final void rule__PropertyRef__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2699:1: ( rule__PropertyRef__Group_0_0__0__Impl rule__PropertyRef__Group_0_0__1 )
            // InternalDsl.g:2700:2: rule__PropertyRef__Group_0_0__0__Impl rule__PropertyRef__Group_0_0__1
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
    // InternalDsl.g:2707:1: rule__PropertyRef__Group_0_0__0__Impl : ( '.' ) ;
    public final void rule__PropertyRef__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2711:1: ( ( '.' ) )
            // InternalDsl.g:2712:1: ( '.' )
            {
            // InternalDsl.g:2712:1: ( '.' )
            // InternalDsl.g:2713:2: '.'
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
    // InternalDsl.g:2722:1: rule__PropertyRef__Group_0_0__1 : rule__PropertyRef__Group_0_0__1__Impl ;
    public final void rule__PropertyRef__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2726:1: ( rule__PropertyRef__Group_0_0__1__Impl )
            // InternalDsl.g:2727:2: rule__PropertyRef__Group_0_0__1__Impl
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
    // InternalDsl.g:2733:1: rule__PropertyRef__Group_0_0__1__Impl : ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) ) ;
    public final void rule__PropertyRef__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2737:1: ( ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) ) )
            // InternalDsl.g:2738:1: ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) )
            {
            // InternalDsl.g:2738:1: ( ( rule__PropertyRef__PropAccessAssignment_0_0_1 ) )
            // InternalDsl.g:2739:2: ( rule__PropertyRef__PropAccessAssignment_0_0_1 )
            {
             before(grammarAccess.getPropertyRefAccess().getPropAccessAssignment_0_0_1()); 
            // InternalDsl.g:2740:2: ( rule__PropertyRef__PropAccessAssignment_0_0_1 )
            // InternalDsl.g:2740:3: rule__PropertyRef__PropAccessAssignment_0_0_1
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


    // $ANTLR start "rule__PropertyRef__Group_0_1__0"
    // InternalDsl.g:2749:1: rule__PropertyRef__Group_0_1__0 : rule__PropertyRef__Group_0_1__0__Impl rule__PropertyRef__Group_0_1__1 ;
    public final void rule__PropertyRef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2753:1: ( rule__PropertyRef__Group_0_1__0__Impl rule__PropertyRef__Group_0_1__1 )
            // InternalDsl.g:2754:2: rule__PropertyRef__Group_0_1__0__Impl rule__PropertyRef__Group_0_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PropertyRef__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRef__Group_0_1__1();

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
    // $ANTLR end "rule__PropertyRef__Group_0_1__0"


    // $ANTLR start "rule__PropertyRef__Group_0_1__0__Impl"
    // InternalDsl.g:2761:1: rule__PropertyRef__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__PropertyRef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2765:1: ( ( '.' ) )
            // InternalDsl.g:2766:1: ( '.' )
            {
            // InternalDsl.g:2766:1: ( '.' )
            // InternalDsl.g:2767:2: '.'
            {
             before(grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPropertyRefAccess().getFullStopKeyword_0_1_0()); 

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
    // $ANTLR end "rule__PropertyRef__Group_0_1__0__Impl"


    // $ANTLR start "rule__PropertyRef__Group_0_1__1"
    // InternalDsl.g:2776:1: rule__PropertyRef__Group_0_1__1 : rule__PropertyRef__Group_0_1__1__Impl ;
    public final void rule__PropertyRef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2780:1: ( rule__PropertyRef__Group_0_1__1__Impl )
            // InternalDsl.g:2781:2: rule__PropertyRef__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRef__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__PropertyRef__Group_0_1__1"


    // $ANTLR start "rule__PropertyRef__Group_0_1__1__Impl"
    // InternalDsl.g:2787:1: rule__PropertyRef__Group_0_1__1__Impl : ( ( rule__PropertyRef__FunctionCallAssignment_0_1_1 ) ) ;
    public final void rule__PropertyRef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2791:1: ( ( ( rule__PropertyRef__FunctionCallAssignment_0_1_1 ) ) )
            // InternalDsl.g:2792:1: ( ( rule__PropertyRef__FunctionCallAssignment_0_1_1 ) )
            {
            // InternalDsl.g:2792:1: ( ( rule__PropertyRef__FunctionCallAssignment_0_1_1 ) )
            // InternalDsl.g:2793:2: ( rule__PropertyRef__FunctionCallAssignment_0_1_1 )
            {
             before(grammarAccess.getPropertyRefAccess().getFunctionCallAssignment_0_1_1()); 
            // InternalDsl.g:2794:2: ( rule__PropertyRef__FunctionCallAssignment_0_1_1 )
            // InternalDsl.g:2794:3: rule__PropertyRef__FunctionCallAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRef__FunctionCallAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRefAccess().getFunctionCallAssignment_0_1_1()); 

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
    // $ANTLR end "rule__PropertyRef__Group_0_1__1__Impl"


    // $ANTLR start "rule__ResponseConf__UnorderedGroup"
    // InternalDsl.g:2803:1: rule__ResponseConf__UnorderedGroup : ( rule__ResponseConf__UnorderedGroup__0 )? ;
    public final void rule__ResponseConf__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getResponseConfAccess().getUnorderedGroup());
        	
        try {
            // InternalDsl.g:2808:1: ( ( rule__ResponseConf__UnorderedGroup__0 )? )
            // InternalDsl.g:2809:2: ( rule__ResponseConf__UnorderedGroup__0 )?
            {
            // InternalDsl.g:2809:2: ( rule__ResponseConf__UnorderedGroup__0 )?
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
                    // InternalDsl.g:2809:2: rule__ResponseConf__UnorderedGroup__0
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
    // InternalDsl.g:2817:1: rule__ResponseConf__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) ) ;
    public final void rule__ResponseConf__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDsl.g:2822:1: ( ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) ) )
            // InternalDsl.g:2823:3: ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) )
            {
            // InternalDsl.g:2823:3: ( ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                alt22=2;
            }
            else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                alt22=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2824:3: ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) )
                    {
                    // InternalDsl.g:2824:3: ({...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) ) )
                    // InternalDsl.g:2825:4: {...}? => ( ( ( rule__ResponseConf__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ResponseConf__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalDsl.g:2825:106: ( ( ( rule__ResponseConf__Group_0__0 ) ) )
                    // InternalDsl.g:2826:5: ( ( rule__ResponseConf__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDsl.g:2832:5: ( ( rule__ResponseConf__Group_0__0 ) )
                    // InternalDsl.g:2833:6: ( rule__ResponseConf__Group_0__0 )
                    {
                     before(grammarAccess.getResponseConfAccess().getGroup_0()); 
                    // InternalDsl.g:2834:6: ( rule__ResponseConf__Group_0__0 )
                    // InternalDsl.g:2834:7: rule__ResponseConf__Group_0__0
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
                    // InternalDsl.g:2839:3: ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) )
                    {
                    // InternalDsl.g:2839:3: ({...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) ) )
                    // InternalDsl.g:2840:4: {...}? => ( ( ( rule__ResponseConf__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ResponseConf__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalDsl.g:2840:106: ( ( ( rule__ResponseConf__Group_1__0 ) ) )
                    // InternalDsl.g:2841:5: ( ( rule__ResponseConf__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDsl.g:2847:5: ( ( rule__ResponseConf__Group_1__0 ) )
                    // InternalDsl.g:2848:6: ( rule__ResponseConf__Group_1__0 )
                    {
                     before(grammarAccess.getResponseConfAccess().getGroup_1()); 
                    // InternalDsl.g:2849:6: ( rule__ResponseConf__Group_1__0 )
                    // InternalDsl.g:2849:7: rule__ResponseConf__Group_1__0
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
                    // InternalDsl.g:2854:3: ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) )
                    {
                    // InternalDsl.g:2854:3: ({...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) ) )
                    // InternalDsl.g:2855:4: {...}? => ( ( ( rule__ResponseConf__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ResponseConf__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalDsl.g:2855:106: ( ( ( rule__ResponseConf__Group_2__0 ) ) )
                    // InternalDsl.g:2856:5: ( ( rule__ResponseConf__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDsl.g:2862:5: ( ( rule__ResponseConf__Group_2__0 ) )
                    // InternalDsl.g:2863:6: ( rule__ResponseConf__Group_2__0 )
                    {
                     before(grammarAccess.getResponseConfAccess().getGroup_2()); 
                    // InternalDsl.g:2864:6: ( rule__ResponseConf__Group_2__0 )
                    // InternalDsl.g:2864:7: rule__ResponseConf__Group_2__0
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
    // InternalDsl.g:2877:1: rule__ResponseConf__UnorderedGroup__0 : rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__1 )? ;
    public final void rule__ResponseConf__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2881:1: ( rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__1 )? )
            // InternalDsl.g:2882:2: rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_29);
            rule__ResponseConf__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDsl.g:2883:2: ( rule__ResponseConf__UnorderedGroup__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2883:2: rule__ResponseConf__UnorderedGroup__1
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
    // InternalDsl.g:2889:1: rule__ResponseConf__UnorderedGroup__1 : rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__2 )? ;
    public final void rule__ResponseConf__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2893:1: ( rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__2 )? )
            // InternalDsl.g:2894:2: rule__ResponseConf__UnorderedGroup__Impl ( rule__ResponseConf__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_29);
            rule__ResponseConf__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDsl.g:2895:2: ( rule__ResponseConf__UnorderedGroup__2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getResponseConfAccess().getUnorderedGroup(), 2) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2895:2: rule__ResponseConf__UnorderedGroup__2
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
    // InternalDsl.g:2901:1: rule__ResponseConf__UnorderedGroup__2 : rule__ResponseConf__UnorderedGroup__Impl ;
    public final void rule__ResponseConf__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2905:1: ( rule__ResponseConf__UnorderedGroup__Impl )
            // InternalDsl.g:2906:2: rule__ResponseConf__UnorderedGroup__Impl
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
    // InternalDsl.g:2913:1: rule__Rule__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2917:1: ( ( ruleCondition ) )
            // InternalDsl.g:2918:2: ( ruleCondition )
            {
            // InternalDsl.g:2918:2: ( ruleCondition )
            // InternalDsl.g:2919:3: ruleCondition
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
    // InternalDsl.g:2928:1: rule__Rule__ProxyAssignment_2_0_1 : ( ruleProxyConf ) ;
    public final void rule__Rule__ProxyAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2932:1: ( ( ruleProxyConf ) )
            // InternalDsl.g:2933:2: ( ruleProxyConf )
            {
            // InternalDsl.g:2933:2: ( ruleProxyConf )
            // InternalDsl.g:2934:3: ruleProxyConf
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
    // InternalDsl.g:2943:1: rule__Rule__ResponseAssignment_2_1_2 : ( ruleResponseConf ) ;
    public final void rule__Rule__ResponseAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2947:1: ( ( ruleResponseConf ) )
            // InternalDsl.g:2948:2: ( ruleResponseConf )
            {
            // InternalDsl.g:2948:2: ( ruleResponseConf )
            // InternalDsl.g:2949:3: ruleResponseConf
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
    // InternalDsl.g:2958:1: rule__ProxyConf__ProxyUrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ProxyConf__ProxyUrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2962:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2963:2: ( RULE_STRING )
            {
            // InternalDsl.g:2963:2: ( RULE_STRING )
            // InternalDsl.g:2964:3: RULE_STRING
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
    // InternalDsl.g:2973:1: rule__ResponseConf__HttpStatusAssignment_0_1 : ( RULE_INTEGER ) ;
    public final void rule__ResponseConf__HttpStatusAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2977:1: ( ( RULE_INTEGER ) )
            // InternalDsl.g:2978:2: ( RULE_INTEGER )
            {
            // InternalDsl.g:2978:2: ( RULE_INTEGER )
            // InternalDsl.g:2979:3: RULE_INTEGER
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
    // InternalDsl.g:2988:1: rule__ResponseConf__ContentAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ResponseConf__ContentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2992:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2993:2: ( RULE_STRING )
            {
            // InternalDsl.g:2993:2: ( RULE_STRING )
            // InternalDsl.g:2994:3: RULE_STRING
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
    // InternalDsl.g:3003:1: rule__ResponseConf__HeadersAssignment_2_1 : ( ruleHeaders ) ;
    public final void rule__ResponseConf__HeadersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3007:1: ( ( ruleHeaders ) )
            // InternalDsl.g:3008:2: ( ruleHeaders )
            {
            // InternalDsl.g:3008:2: ( ruleHeaders )
            // InternalDsl.g:3009:3: ruleHeaders
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
    // InternalDsl.g:3018:1: rule__Headers__HeadersAssignment_0 : ( ruleHeader ) ;
    public final void rule__Headers__HeadersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3022:1: ( ( ruleHeader ) )
            // InternalDsl.g:3023:2: ( ruleHeader )
            {
            // InternalDsl.g:3023:2: ( ruleHeader )
            // InternalDsl.g:3024:3: ruleHeader
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
    // InternalDsl.g:3033:1: rule__Headers__HeadersAssignment_1_1 : ( ruleHeader ) ;
    public final void rule__Headers__HeadersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3037:1: ( ( ruleHeader ) )
            // InternalDsl.g:3038:2: ( ruleHeader )
            {
            // InternalDsl.g:3038:2: ( ruleHeader )
            // InternalDsl.g:3039:3: ruleHeader
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
    // InternalDsl.g:3048:1: rule__Header__HeaderNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__HeaderNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3052:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3053:2: ( RULE_STRING )
            {
            // InternalDsl.g:3053:2: ( RULE_STRING )
            // InternalDsl.g:3054:3: RULE_STRING
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
    // InternalDsl.g:3063:1: rule__Header__HeaderValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__HeaderValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3067:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3068:2: ( RULE_STRING )
            {
            // InternalDsl.g:3068:2: ( RULE_STRING )
            // InternalDsl.g:3069:3: RULE_STRING
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
    // InternalDsl.g:3078:1: rule__OrCondition__RightAssignment_1_2 : ( ruleAndCondition ) ;
    public final void rule__OrCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3082:1: ( ( ruleAndCondition ) )
            // InternalDsl.g:3083:2: ( ruleAndCondition )
            {
            // InternalDsl.g:3083:2: ( ruleAndCondition )
            // InternalDsl.g:3084:3: ruleAndCondition
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
    // InternalDsl.g:3093:1: rule__AndCondition__RightAssignment_1_2 : ( ruleOptionalNegationCondition ) ;
    public final void rule__AndCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3097:1: ( ( ruleOptionalNegationCondition ) )
            // InternalDsl.g:3098:2: ( ruleOptionalNegationCondition )
            {
            // InternalDsl.g:3098:2: ( ruleOptionalNegationCondition )
            // InternalDsl.g:3099:3: ruleOptionalNegationCondition
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
    // InternalDsl.g:3108:1: rule__OptionalNegationCondition__NegatedAssignment_1_2 : ( ruleBracketedCondition ) ;
    public final void rule__OptionalNegationCondition__NegatedAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3112:1: ( ( ruleBracketedCondition ) )
            // InternalDsl.g:3113:2: ( ruleBracketedCondition )
            {
            // InternalDsl.g:3113:2: ( ruleBracketedCondition )
            // InternalDsl.g:3114:3: ruleBracketedCondition
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
    // InternalDsl.g:3123:1: rule__BracketedCondition__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__BracketedCondition__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3127:1: ( ( ruleExpression ) )
            // InternalDsl.g:3128:2: ( ruleExpression )
            {
            // InternalDsl.g:3128:2: ( ruleExpression )
            // InternalDsl.g:3129:3: ruleExpression
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
    // InternalDsl.g:3138:1: rule__BracketedCondition__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__BracketedCondition__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3142:1: ( ( ruleCondition ) )
            // InternalDsl.g:3143:2: ( ruleCondition )
            {
            // InternalDsl.g:3143:2: ( ruleCondition )
            // InternalDsl.g:3144:3: ruleCondition
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
    // InternalDsl.g:3153:1: rule__Expression__LeftAssignment_0 : ( ruleOperand ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3157:1: ( ( ruleOperand ) )
            // InternalDsl.g:3158:2: ( ruleOperand )
            {
            // InternalDsl.g:3158:2: ( ruleOperand )
            // InternalDsl.g:3159:3: ruleOperand
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
    // InternalDsl.g:3168:1: rule__Expression__OpAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__Expression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3172:1: ( ( ruleOperator ) )
            // InternalDsl.g:3173:2: ( ruleOperator )
            {
            // InternalDsl.g:3173:2: ( ruleOperator )
            // InternalDsl.g:3174:3: ruleOperator
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
    // InternalDsl.g:3183:1: rule__Expression__RightAssignment_1_1 : ( ruleOperand ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3187:1: ( ( ruleOperand ) )
            // InternalDsl.g:3188:2: ( ruleOperand )
            {
            // InternalDsl.g:3188:2: ( ruleOperand )
            // InternalDsl.g:3189:3: ruleOperand
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
    // InternalDsl.g:3198:1: rule__Operand__RefAssignment_0 : ( ruleReference ) ;
    public final void rule__Operand__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3202:1: ( ( ruleReference ) )
            // InternalDsl.g:3203:2: ( ruleReference )
            {
            // InternalDsl.g:3203:2: ( ruleReference )
            // InternalDsl.g:3204:3: ruleReference
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
    // InternalDsl.g:3213:1: rule__Operand__ConstAssignment_1 : ( ruleConstant ) ;
    public final void rule__Operand__ConstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3217:1: ( ( ruleConstant ) )
            // InternalDsl.g:3218:2: ( ruleConstant )
            {
            // InternalDsl.g:3218:2: ( ruleConstant )
            // InternalDsl.g:3219:3: ruleConstant
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
    // InternalDsl.g:3228:1: rule__Operand__ListElementRefAssignment_2 : ( ruleListElementReference ) ;
    public final void rule__Operand__ListElementRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3232:1: ( ( ruleListElementReference ) )
            // InternalDsl.g:3233:2: ( ruleListElementReference )
            {
            // InternalDsl.g:3233:2: ( ruleListElementReference )
            // InternalDsl.g:3234:3: ruleListElementReference
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
    // InternalDsl.g:3243:1: rule__ListFunction__OpAssignment_1 : ( ruleListOperation ) ;
    public final void rule__ListFunction__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3247:1: ( ( ruleListOperation ) )
            // InternalDsl.g:3248:2: ( ruleListOperation )
            {
            // InternalDsl.g:3248:2: ( ruleListOperation )
            // InternalDsl.g:3249:3: ruleListOperation
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
    // InternalDsl.g:3258:1: rule__ListFunction__AliasAssignment_2 : ( ruleListElementAlias ) ;
    public final void rule__ListFunction__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3262:1: ( ( ruleListElementAlias ) )
            // InternalDsl.g:3263:2: ( ruleListElementAlias )
            {
            // InternalDsl.g:3263:2: ( ruleListElementAlias )
            // InternalDsl.g:3264:3: ruleListElementAlias
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
    // InternalDsl.g:3273:1: rule__ListFunction__SeparatorAssignment_3 : ( ( ':' ) ) ;
    public final void rule__ListFunction__SeparatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3277:1: ( ( ( ':' ) ) )
            // InternalDsl.g:3278:2: ( ( ':' ) )
            {
            // InternalDsl.g:3278:2: ( ( ':' ) )
            // InternalDsl.g:3279:3: ( ':' )
            {
             before(grammarAccess.getListFunctionAccess().getSeparatorColonKeyword_3_0()); 
            // InternalDsl.g:3280:3: ( ':' )
            // InternalDsl.g:3281:4: ':'
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
    // InternalDsl.g:3292:1: rule__ListFunction__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__ListFunction__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3296:1: ( ( ruleCondition ) )
            // InternalDsl.g:3297:2: ( ruleCondition )
            {
            // InternalDsl.g:3297:2: ( ruleCondition )
            // InternalDsl.g:3298:3: ruleCondition
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
    // InternalDsl.g:3307:1: rule__ListElementAlias__NameAssignment : ( RULE_ID ) ;
    public final void rule__ListElementAlias__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3311:1: ( ( RULE_ID ) )
            // InternalDsl.g:3312:2: ( RULE_ID )
            {
            // InternalDsl.g:3312:2: ( RULE_ID )
            // InternalDsl.g:3313:3: RULE_ID
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
    // InternalDsl.g:3322:1: rule__Reference__NameAssignment_0 : ( ruleEntity ) ;
    public final void rule__Reference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3326:1: ( ( ruleEntity ) )
            // InternalDsl.g:3327:2: ( ruleEntity )
            {
            // InternalDsl.g:3327:2: ( ruleEntity )
            // InternalDsl.g:3328:3: ruleEntity
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
    // InternalDsl.g:3337:1: rule__Reference__PropAssignment_1 : ( rulePropertyRef ) ;
    public final void rule__Reference__PropAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3341:1: ( ( rulePropertyRef ) )
            // InternalDsl.g:3342:2: ( rulePropertyRef )
            {
            // InternalDsl.g:3342:2: ( rulePropertyRef )
            // InternalDsl.g:3343:3: rulePropertyRef
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
    // InternalDsl.g:3352:1: rule__ListElementReference__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListElementReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3356:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:3357:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:3357:2: ( ( RULE_ID ) )
            // InternalDsl.g:3358:3: ( RULE_ID )
            {
             before(grammarAccess.getListElementReferenceAccess().getNameListElementAliasCrossReference_1_0()); 
            // InternalDsl.g:3359:3: ( RULE_ID )
            // InternalDsl.g:3360:4: RULE_ID
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
    // InternalDsl.g:3371:1: rule__ListElementReference__PropAssignment_2 : ( rulePropertyRef ) ;
    public final void rule__ListElementReference__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3375:1: ( ( rulePropertyRef ) )
            // InternalDsl.g:3376:2: ( rulePropertyRef )
            {
            // InternalDsl.g:3376:2: ( rulePropertyRef )
            // InternalDsl.g:3377:3: rulePropertyRef
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


    // $ANTLR start "rule__CollectionAccess__KeyAssignment_1_0"
    // InternalDsl.g:3386:1: rule__CollectionAccess__KeyAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__CollectionAccess__KeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3390:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3391:2: ( RULE_STRING )
            {
            // InternalDsl.g:3391:2: ( RULE_STRING )
            // InternalDsl.g:3392:3: RULE_STRING
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
    // InternalDsl.g:3401:1: rule__CollectionAccess__IndexAssignment_1_1 : ( RULE_INTEGER ) ;
    public final void rule__CollectionAccess__IndexAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3405:1: ( ( RULE_INTEGER ) )
            // InternalDsl.g:3406:2: ( RULE_INTEGER )
            {
            // InternalDsl.g:3406:2: ( RULE_INTEGER )
            // InternalDsl.g:3407:3: RULE_INTEGER
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


    // $ANTLR start "rule__PropertyAccess__NameAssignment"
    // InternalDsl.g:3416:1: rule__PropertyAccess__NameAssignment : ( RULE_ID ) ;
    public final void rule__PropertyAccess__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3420:1: ( ( RULE_ID ) )
            // InternalDsl.g:3421:2: ( RULE_ID )
            {
            // InternalDsl.g:3421:2: ( RULE_ID )
            // InternalDsl.g:3422:3: RULE_ID
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


    // $ANTLR start "rule__FunctionCall__NameAssignment_0"
    // InternalDsl.g:3431:1: rule__FunctionCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3435:1: ( ( RULE_ID ) )
            // InternalDsl.g:3436:2: ( RULE_ID )
            {
            // InternalDsl.g:3436:2: ( RULE_ID )
            // InternalDsl.g:3437:3: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionCall__NameAssignment_0"


    // $ANTLR start "rule__FunctionCall__FunctionParametersAssignment_2"
    // InternalDsl.g:3446:1: rule__FunctionCall__FunctionParametersAssignment_2 : ( ruleOperand ) ;
    public final void rule__FunctionCall__FunctionParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3450:1: ( ( ruleOperand ) )
            // InternalDsl.g:3451:2: ( ruleOperand )
            {
            // InternalDsl.g:3451:2: ( ruleOperand )
            // InternalDsl.g:3452:3: ruleOperand
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionParametersOperandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getFunctionParametersOperandParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FunctionCall__FunctionParametersAssignment_2"


    // $ANTLR start "rule__FunctionCall__FunctionParametersAssignment_3_1"
    // InternalDsl.g:3461:1: rule__FunctionCall__FunctionParametersAssignment_3_1 : ( ruleOperand ) ;
    public final void rule__FunctionCall__FunctionParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3465:1: ( ( ruleOperand ) )
            // InternalDsl.g:3466:2: ( ruleOperand )
            {
            // InternalDsl.g:3466:2: ( ruleOperand )
            // InternalDsl.g:3467:3: ruleOperand
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionParametersOperandParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getFunctionParametersOperandParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FunctionCall__FunctionParametersAssignment_3_1"


    // $ANTLR start "rule__PropertyRef__PropAccessAssignment_0_0_1"
    // InternalDsl.g:3476:1: rule__PropertyRef__PropAccessAssignment_0_0_1 : ( rulePropertyAccess ) ;
    public final void rule__PropertyRef__PropAccessAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3480:1: ( ( rulePropertyAccess ) )
            // InternalDsl.g:3481:2: ( rulePropertyAccess )
            {
            // InternalDsl.g:3481:2: ( rulePropertyAccess )
            // InternalDsl.g:3482:3: rulePropertyAccess
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


    // $ANTLR start "rule__PropertyRef__FunctionCallAssignment_0_1_1"
    // InternalDsl.g:3491:1: rule__PropertyRef__FunctionCallAssignment_0_1_1 : ( ruleFunctionCall ) ;
    public final void rule__PropertyRef__FunctionCallAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3495:1: ( ( ruleFunctionCall ) )
            // InternalDsl.g:3496:2: ( ruleFunctionCall )
            {
            // InternalDsl.g:3496:2: ( ruleFunctionCall )
            // InternalDsl.g:3497:3: ruleFunctionCall
            {
             before(grammarAccess.getPropertyRefAccess().getFunctionCallFunctionCallParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getPropertyRefAccess().getFunctionCallFunctionCallParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__PropertyRef__FunctionCallAssignment_0_1_1"


    // $ANTLR start "rule__PropertyRef__CollectionAccessAssignment_0_2"
    // InternalDsl.g:3506:1: rule__PropertyRef__CollectionAccessAssignment_0_2 : ( ruleCollectionAccess ) ;
    public final void rule__PropertyRef__CollectionAccessAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3510:1: ( ( ruleCollectionAccess ) )
            // InternalDsl.g:3511:2: ( ruleCollectionAccess )
            {
            // InternalDsl.g:3511:2: ( ruleCollectionAccess )
            // InternalDsl.g:3512:3: ruleCollectionAccess
            {
             before(grammarAccess.getPropertyRefAccess().getCollectionAccessCollectionAccessParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionAccess();

            state._fsp--;

             after(grammarAccess.getPropertyRefAccess().getCollectionAccessCollectionAccessParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__PropertyRef__CollectionAccessAssignment_0_2"


    // $ANTLR start "rule__PropertyRef__ListFuncAssignment_0_3"
    // InternalDsl.g:3521:1: rule__PropertyRef__ListFuncAssignment_0_3 : ( ruleListFunction ) ;
    public final void rule__PropertyRef__ListFuncAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3525:1: ( ( ruleListFunction ) )
            // InternalDsl.g:3526:2: ( ruleListFunction )
            {
            // InternalDsl.g:3526:2: ( ruleListFunction )
            // InternalDsl.g:3527:3: ruleListFunction
            {
             before(grammarAccess.getPropertyRefAccess().getListFuncListFunctionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListFunction();

            state._fsp--;

             after(grammarAccess.getPropertyRefAccess().getListFuncListFunctionParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__PropertyRef__ListFuncAssignment_0_3"


    // $ANTLR start "rule__PropertyRef__SubProperyAssignment_1"
    // InternalDsl.g:3536:1: rule__PropertyRef__SubProperyAssignment_1 : ( rulePropertyRef ) ;
    public final void rule__PropertyRef__SubProperyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3540:1: ( ( rulePropertyRef ) )
            // InternalDsl.g:3541:2: ( rulePropertyRef )
            {
            // InternalDsl.g:3541:2: ( rulePropertyRef )
            // InternalDsl.g:3542:3: rulePropertyRef
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
    // InternalDsl.g:3551:1: rule__Constant__StrValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Constant__StrValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3555:1: ( ( RULE_STRING ) )
            // InternalDsl.g:3556:2: ( RULE_STRING )
            {
            // InternalDsl.g:3556:2: ( RULE_STRING )
            // InternalDsl.g:3557:3: RULE_STRING
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
    // InternalDsl.g:3566:1: rule__Constant__IntValAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__Constant__IntValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3570:1: ( ( RULE_INTEGER ) )
            // InternalDsl.g:3571:2: ( RULE_INTEGER )
            {
            // InternalDsl.g:3571:2: ( RULE_INTEGER )
            // InternalDsl.g:3572:3: RULE_INTEGER
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
    // InternalDsl.g:3581:1: rule__Constant__FloatValAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__Constant__FloatValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3585:1: ( ( RULE_FLOAT ) )
            // InternalDsl.g:3586:2: ( RULE_FLOAT )
            {
            // InternalDsl.g:3586:2: ( RULE_FLOAT )
            // InternalDsl.g:3587:3: RULE_FLOAT
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
    // InternalDsl.g:3596:1: rule__Constant__BoolValAssignment_3 : ( RULE_BOOLEAN ) ;
    public final void rule__Constant__BoolValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3600:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:3601:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:3601:2: ( RULE_BOOLEAN )
            // InternalDsl.g:3602:3: RULE_BOOLEAN
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
    // InternalDsl.g:3611:1: rule__Entity__NameAssignment : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3615:1: ( ( RULE_ID ) )
            // InternalDsl.g:3616:2: ( RULE_ID )
            {
            // InternalDsl.g:3616:2: ( RULE_ID )
            // InternalDsl.g:3617:3: RULE_ID
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000090400001F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000038000002L});

}
