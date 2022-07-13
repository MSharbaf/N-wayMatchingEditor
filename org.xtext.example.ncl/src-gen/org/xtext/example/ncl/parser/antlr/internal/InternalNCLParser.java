package org.xtext.example.ncl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.ncl.services.NCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'rule'", "'}'", "'import'", "':'", "'::*'", "'matchHomo'", "'extends'", "','", "'compareModels'", "'not'", "'or'", "'and'", "'isValid'", "'('", "'>'", "'<'", "'='", "'<>'", "'!'", "'>='", "'=<'", "'IN'", "'NotIN'", "')'", "'isEqual'", "'isTrue'", "'isFalse'", "'isEmpty'", "'isContain'", "'isEquivalent'", "'::'", "'.'", "'matchHete'", "'with'", "'->'", "'-'", "'not2'", "'*'", "'/'", "'+'", "'<='", "'and2'", "'implies'", "'implies2'", "'or2'", "'xor'", "'xor2'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'['", "']'", "'in'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'|?'", "'|1'", "'?'", "'&&'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_ESCAPED_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=10;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=9;
    public static final int T__95=95;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=12;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalNCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNCLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private NCLGrammarAccess grammarAccess;

        public InternalNCLParser(TokenStream input, NCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TopLevelCP";
       	}

       	@Override
       	protected NCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTopLevelCP"
    // InternalNCL.g:70:1: entryRuleTopLevelCP returns [EObject current=null] : iv_ruleTopLevelCP= ruleTopLevelCP EOF ;
    public final EObject entryRuleTopLevelCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelCP = null;


        try {
            // InternalNCL.g:70:51: (iv_ruleTopLevelCP= ruleTopLevelCP EOF )
            // InternalNCL.g:71:2: iv_ruleTopLevelCP= ruleTopLevelCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTopLevelCP=ruleTopLevelCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTopLevelCP"


    // $ANTLR start "ruleTopLevelCP"
    // InternalNCL.g:77:1: ruleTopLevelCP returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'rule' ruleUnrestrictedName ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) ) )* (otherlv_7= 'rule' ruleUnrestrictedName ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleTopLevelCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedImports_3_0 = null;

        EObject lv_ownedHomocoms_6_0 = null;

        EObject lv_ownedHetecoms_9_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:83:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'rule' ruleUnrestrictedName ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) ) )* (otherlv_7= 'rule' ruleUnrestrictedName ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) ) )* otherlv_10= '}' ) )
            // InternalNCL.g:84:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'rule' ruleUnrestrictedName ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) ) )* (otherlv_7= 'rule' ruleUnrestrictedName ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) ) )* otherlv_10= '}' )
            {
            // InternalNCL.g:84:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'rule' ruleUnrestrictedName ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) ) )* (otherlv_7= 'rule' ruleUnrestrictedName ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) ) )* otherlv_10= '}' )
            // InternalNCL.g:85:3: otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'rule' ruleUnrestrictedName ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) ) )* (otherlv_7= 'rule' ruleUnrestrictedName ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTopLevelCPAccess().getModuleKeyword_0());
              		
            }
            // InternalNCL.g:89:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalNCL.g:90:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalNCL.g:90:4: (lv_name_1_0= ruleIdentifier )
            // InternalNCL.g:91:5: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTopLevelCPAccess().getNameIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.ocl.xtext.base.Base.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTopLevelCPAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalNCL.g:112:3: ( (lv_ownedImports_3_0= ruleImportCP ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNCL.g:113:4: (lv_ownedImports_3_0= ruleImportCP )
            	    {
            	    // InternalNCL.g:113:4: (lv_ownedImports_3_0= ruleImportCP )
            	    // InternalNCL.g:114:5: lv_ownedImports_3_0= ruleImportCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedImportsImportCPParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_ownedImports_3_0=ruleImportCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedImports",
            	      						lv_ownedImports_3_0,
            	      						"org.xtext.example.ncl.NCL.ImportCP");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalNCL.g:131:3: (otherlv_4= 'rule' ruleUnrestrictedName ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_SIMPLE_ID) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==24) ) {
                            alt2=1;
                        }


                    }
                    else if ( (LA2_1==RULE_ESCAPED_ID) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==24) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalNCL.g:132:4: otherlv_4= 'rule' ruleUnrestrictedName ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getTopLevelCPAccess().getRuleKeyword_4_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_4_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalNCL.g:146:4: ( (lv_ownedHomocoms_6_0= ruleHomocomCP ) )
            	    // InternalNCL.g:147:5: (lv_ownedHomocoms_6_0= ruleHomocomCP )
            	    {
            	    // InternalNCL.g:147:5: (lv_ownedHomocoms_6_0= ruleHomocomCP )
            	    // InternalNCL.g:148:6: lv_ownedHomocoms_6_0= ruleHomocomCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedHomocomsHomocomCPParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_ownedHomocoms_6_0=ruleHomocomCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedHomocoms",
            	      							lv_ownedHomocoms_6_0,
            	      							"org.xtext.example.ncl.NCL.HomocomCP");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalNCL.g:166:3: (otherlv_7= 'rule' ruleUnrestrictedName ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNCL.g:167:4: otherlv_7= 'rule' ruleUnrestrictedName ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getTopLevelCPAccess().getRuleKeyword_5_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_5_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalNCL.g:181:4: ( (lv_ownedHetecoms_9_0= ruleHetecomCP ) )
            	    // InternalNCL.g:182:5: (lv_ownedHetecoms_9_0= ruleHetecomCP )
            	    {
            	    // InternalNCL.g:182:5: (lv_ownedHetecoms_9_0= ruleHetecomCP )
            	    // InternalNCL.g:183:6: lv_ownedHetecoms_9_0= ruleHetecomCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedHetecomsHetecomCPParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_ownedHetecoms_9_0=ruleHetecomCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedHetecoms",
            	      							lv_ownedHetecoms_9_0,
            	      							"org.xtext.example.ncl.NCL.HetecomCP");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTopLevelCPAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTopLevelCP"


    // $ANTLR start "entryRuleImportCP"
    // InternalNCL.g:209:1: entryRuleImportCP returns [EObject current=null] : iv_ruleImportCP= ruleImportCP EOF ;
    public final EObject entryRuleImportCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportCP = null;


        try {
            // InternalNCL.g:209:49: (iv_ruleImportCP= ruleImportCP EOF )
            // InternalNCL.g:210:2: iv_ruleImportCP= ruleImportCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImportCP=ruleImportCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportCP"


    // $ANTLR start "ruleImportCP"
    // InternalNCL.g:216:1: ruleImportCP returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_ownedPathName_3_0= ruleURIPathNameCS ) ) ( (lv_isAll_4_0= '::*' ) )? ) ;
    public final EObject ruleImportCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_isAll_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedPathName_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:222:2: ( (otherlv_0= 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_ownedPathName_3_0= ruleURIPathNameCS ) ) ( (lv_isAll_4_0= '::*' ) )? ) )
            // InternalNCL.g:223:2: (otherlv_0= 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_ownedPathName_3_0= ruleURIPathNameCS ) ) ( (lv_isAll_4_0= '::*' ) )? )
            {
            // InternalNCL.g:223:2: (otherlv_0= 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_ownedPathName_3_0= ruleURIPathNameCS ) ) ( (lv_isAll_4_0= '::*' ) )? )
            // InternalNCL.g:224:3: otherlv_0= 'import' ( ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_ownedPathName_3_0= ruleURIPathNameCS ) ) ( (lv_isAll_4_0= '::*' ) )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportCPAccess().getImportKeyword_0());
              		
            }
            // InternalNCL.g:228:3: ( ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SIMPLE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=1;
                }
            }
            else if ( (LA4_0==RULE_ESCAPED_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==22) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalNCL.g:229:4: ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':'
                    {
                    // InternalNCL.g:229:4: ( (lv_name_1_0= ruleIdentifier ) )
                    // InternalNCL.g:230:5: (lv_name_1_0= ruleIdentifier )
                    {
                    // InternalNCL.g:230:5: (lv_name_1_0= ruleIdentifier )
                    // InternalNCL.g:231:6: lv_name_1_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportCPAccess().getNameIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_name_1_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportCPRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.base.Base.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportCPAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalNCL.g:253:3: ( (lv_ownedPathName_3_0= ruleURIPathNameCS ) )
            // InternalNCL.g:254:4: (lv_ownedPathName_3_0= ruleURIPathNameCS )
            {
            // InternalNCL.g:254:4: (lv_ownedPathName_3_0= ruleURIPathNameCS )
            // InternalNCL.g:255:5: lv_ownedPathName_3_0= ruleURIPathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportCPAccess().getOwnedPathNameURIPathNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_ownedPathName_3_0=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportCPRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.URIPathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:272:3: ( (lv_isAll_4_0= '::*' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNCL.g:273:4: (lv_isAll_4_0= '::*' )
                    {
                    // InternalNCL.g:273:4: (lv_isAll_4_0= '::*' )
                    // InternalNCL.g:274:5: lv_isAll_4_0= '::*'
                    {
                    lv_isAll_4_0=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAll_4_0, grammarAccess.getImportCPAccess().getIsAllColonColonAsteriskKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getImportCPRule());
                      					}
                      					setWithLastConsumed(current, "isAll", true, "::*");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImportCP"


    // $ANTLR start "entryRuleHomocomCP"
    // InternalNCL.g:290:1: entryRuleHomocomCP returns [EObject current=null] : iv_ruleHomocomCP= ruleHomocomCP EOF ;
    public final EObject entryRuleHomocomCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomocomCP = null;


        try {
            // InternalNCL.g:290:50: (iv_ruleHomocomCP= ruleHomocomCP EOF )
            // InternalNCL.g:291:2: iv_ruleHomocomCP= ruleHomocomCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHomocomCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHomocomCP=ruleHomocomCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHomocomCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHomocomCP"


    // $ANTLR start "ruleHomocomCP"
    // InternalNCL.g:297:1: ruleHomocomCP returns [EObject current=null] : (otherlv_0= 'matchHomo' ( (lv_ownedMetaModels_1_0= rulemetaModelTypeCS ) ) (otherlv_2= 'extends' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* )? otherlv_6= '{' otherlv_7= 'compareModels' otherlv_8= ':' ( (lv_ownedStatements_9_0= ruleHomoStatementCS ) )+ otherlv_10= '}' ) ;
    public final EObject ruleHomocomCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedMetaModels_1_0 = null;

        EObject lv_ownedStatements_9_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:303:2: ( (otherlv_0= 'matchHomo' ( (lv_ownedMetaModels_1_0= rulemetaModelTypeCS ) ) (otherlv_2= 'extends' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* )? otherlv_6= '{' otherlv_7= 'compareModels' otherlv_8= ':' ( (lv_ownedStatements_9_0= ruleHomoStatementCS ) )+ otherlv_10= '}' ) )
            // InternalNCL.g:304:2: (otherlv_0= 'matchHomo' ( (lv_ownedMetaModels_1_0= rulemetaModelTypeCS ) ) (otherlv_2= 'extends' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* )? otherlv_6= '{' otherlv_7= 'compareModels' otherlv_8= ':' ( (lv_ownedStatements_9_0= ruleHomoStatementCS ) )+ otherlv_10= '}' )
            {
            // InternalNCL.g:304:2: (otherlv_0= 'matchHomo' ( (lv_ownedMetaModels_1_0= rulemetaModelTypeCS ) ) (otherlv_2= 'extends' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* )? otherlv_6= '{' otherlv_7= 'compareModels' otherlv_8= ':' ( (lv_ownedStatements_9_0= ruleHomoStatementCS ) )+ otherlv_10= '}' )
            // InternalNCL.g:305:3: otherlv_0= 'matchHomo' ( (lv_ownedMetaModels_1_0= rulemetaModelTypeCS ) ) (otherlv_2= 'extends' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* )? otherlv_6= '{' otherlv_7= 'compareModels' otherlv_8= ':' ( (lv_ownedStatements_9_0= ruleHomoStatementCS ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHomocomCPAccess().getMatchHomoKeyword_0());
              		
            }
            // InternalNCL.g:309:3: ( (lv_ownedMetaModels_1_0= rulemetaModelTypeCS ) )
            // InternalNCL.g:310:4: (lv_ownedMetaModels_1_0= rulemetaModelTypeCS )
            {
            // InternalNCL.g:310:4: (lv_ownedMetaModels_1_0= rulemetaModelTypeCS )
            // InternalNCL.g:311:5: lv_ownedMetaModels_1_0= rulemetaModelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHomocomCPAccess().getOwnedMetaModelsMetaModelTypeCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_ownedMetaModels_1_0=rulemetaModelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHomocomCPRule());
              					}
              					add(
              						current,
              						"ownedMetaModels",
              						lv_ownedMetaModels_1_0,
              						"org.xtext.example.ncl.NCL.metaModelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:328:3: (otherlv_2= 'extends' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNCL.g:329:4: otherlv_2= 'extends' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )*
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getHomocomCPAccess().getExtendsKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getHomocomCPAccess().getUnrestrictedNameParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNCL.g:343:4: (otherlv_4= ',' ruleUnrestrictedName )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==26) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalNCL.g:344:5: otherlv_4= ',' ruleUnrestrictedName
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getHomocomCPAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					/* */
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getHomocomCPAccess().getUnrestrictedNameParserRuleCall_2_2_1());
                    	      				
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    ruleUnrestrictedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getHomocomCPAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getHomocomCPAccess().getCompareModelsKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getHomocomCPAccess().getColonKeyword_5());
              		
            }
            // InternalNCL.g:372:3: ( (lv_ownedStatements_9_0= ruleHomoStatementCS ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=31)||(LA8_0>=43 && LA8_0<=48)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNCL.g:373:4: (lv_ownedStatements_9_0= ruleHomoStatementCS )
            	    {
            	    // InternalNCL.g:373:4: (lv_ownedStatements_9_0= ruleHomoStatementCS )
            	    // InternalNCL.g:374:5: lv_ownedStatements_9_0= ruleHomoStatementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHomocomCPAccess().getOwnedStatementsHomoStatementCSParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_ownedStatements_9_0=ruleHomoStatementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getHomocomCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedStatements",
            	      						lv_ownedStatements_9_0,
            	      						"org.xtext.example.ncl.NCL.HomoStatementCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getHomocomCPAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHomocomCP"


    // $ANTLR start "entryRulemetaModelTypeCS"
    // InternalNCL.g:399:1: entryRulemetaModelTypeCS returns [EObject current=null] : iv_rulemetaModelTypeCS= rulemetaModelTypeCS EOF ;
    public final EObject entryRulemetaModelTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemetaModelTypeCS = null;


        try {
            // InternalNCL.g:399:56: (iv_rulemetaModelTypeCS= rulemetaModelTypeCS EOF )
            // InternalNCL.g:400:2: iv_rulemetaModelTypeCS= rulemetaModelTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaModelTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulemetaModelTypeCS=rulemetaModelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemetaModelTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulemetaModelTypeCS"


    // $ANTLR start "rulemetaModelTypeCS"
    // InternalNCL.g:406:1: rulemetaModelTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName ) ;
    public final EObject rulemetaModelTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:412:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName ) )
            // InternalNCL.g:413:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName )
            {
            // InternalNCL.g:413:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName )
            // InternalNCL.g:414:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName
            {
            // InternalNCL.g:414:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalNCL.g:415:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalNCL.g:415:4: (lv_name_0_0= ruleIdentifier )
            // InternalNCL.g:416:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaModelTypeCSAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetaModelTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.base.Base.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMetaModelTypeCSAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMetaModelTypeCSAccess().getUnrestrictedNameParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulemetaModelTypeCS"


    // $ANTLR start "entryRuleHomoStatementCS"
    // InternalNCL.g:451:1: entryRuleHomoStatementCS returns [EObject current=null] : iv_ruleHomoStatementCS= ruleHomoStatementCS EOF ;
    public final EObject entryRuleHomoStatementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomoStatementCS = null;


        try {
            // InternalNCL.g:451:56: (iv_ruleHomoStatementCS= ruleHomoStatementCS EOF )
            // InternalNCL.g:452:2: iv_ruleHomoStatementCS= ruleHomoStatementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHomoStatementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHomoStatementCS=ruleHomoStatementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHomoStatementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHomoStatementCS"


    // $ANTLR start "ruleHomoStatementCS"
    // InternalNCL.g:458:1: ruleHomoStatementCS returns [EObject current=null] : ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )+ ) ;
    public final EObject ruleHomoStatementCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedConditions_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:464:2: ( ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )+ ) )
            // InternalNCL.g:465:2: ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )+ )
            {
            // InternalNCL.g:465:2: ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )+ )
            // InternalNCL.g:466:3: (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )+
            {
            // InternalNCL.g:466:3: (otherlv_0= 'not' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNCL.g:467:4: otherlv_0= 'not'
                    {
                    otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getHomoStatementCSAccess().getNotKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalNCL.g:472:3: ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalNCL.g:473:4: (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) )
            	    {
            	    // InternalNCL.g:473:4: (otherlv_1= 'or' | otherlv_2= 'and' )?
            	    int alt10=3;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==29) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==30) ) {
            	        alt10=2;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalNCL.g:474:5: otherlv_1= 'or'
            	            {
            	            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_1, grammarAccess.getHomoStatementCSAccess().getOrKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNCL.g:479:5: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_2, grammarAccess.getHomoStatementCSAccess().getAndKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNCL.g:484:4: ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) )
            	    // InternalNCL.g:485:5: (lv_ownedConditions_3_0= ruleHomoConditionCS )
            	    {
            	    // InternalNCL.g:485:5: (lv_ownedConditions_3_0= ruleHomoConditionCS )
            	    // InternalNCL.g:486:6: lv_ownedConditions_3_0= ruleHomoConditionCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getHomoStatementCSAccess().getOwnedConditionsHomoConditionCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_ownedConditions_3_0=ruleHomoConditionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getHomoStatementCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedConditions",
            	      							lv_ownedConditions_3_0,
            	      							"org.xtext.example.ncl.NCL.HomoConditionCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHomoStatementCS"


    // $ANTLR start "entryRuleHomoConditionCS"
    // InternalNCL.g:508:1: entryRuleHomoConditionCS returns [EObject current=null] : iv_ruleHomoConditionCS= ruleHomoConditionCS EOF ;
    public final EObject entryRuleHomoConditionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomoConditionCS = null;


        try {
            // InternalNCL.g:508:56: (iv_ruleHomoConditionCS= ruleHomoConditionCS EOF )
            // InternalNCL.g:509:2: iv_ruleHomoConditionCS= ruleHomoConditionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHomoConditionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHomoConditionCS=ruleHomoConditionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHomoConditionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHomoConditionCS"


    // $ANTLR start "ruleHomoConditionCS"
    // InternalNCL.g:515:1: ruleHomoConditionCS returns [EObject current=null] : ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* otherlv_28= ')' ) ) ;
    public final EObject ruleHomoConditionCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_ownedElementA_2_0 = null;

        AntlrDatatypeRuleToken lv_ownedElementB_12_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_21_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_23_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_25_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:521:2: ( ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* otherlv_28= ')' ) ) )
            // InternalNCL.g:522:2: ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* otherlv_28= ')' ) )
            {
            // InternalNCL.g:522:2: ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* otherlv_28= ')' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=43 && LA16_0<=48)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalNCL.g:523:3: (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' )
                    {
                    // InternalNCL.g:523:3: (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' )
                    // InternalNCL.g:524:4: otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')'
                    {
                    otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getHomoConditionCSAccess().getIsValidKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getHomoConditionCSAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalNCL.g:532:4: ( (lv_ownedElementA_2_0= ruleFQN ) )
                    // InternalNCL.g:533:5: (lv_ownedElementA_2_0= ruleFQN )
                    {
                    // InternalNCL.g:533:5: (lv_ownedElementA_2_0= ruleFQN )
                    // InternalNCL.g:534:6: lv_ownedElementA_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHomoConditionCSAccess().getOwnedElementAFQNParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_ownedElementA_2_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHomoConditionCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedElementA",
                      							lv_ownedElementA_2_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:551:4: (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )
                    int alt12=9;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt12=1;
                        }
                        break;
                    case 34:
                        {
                        alt12=2;
                        }
                        break;
                    case 35:
                        {
                        alt12=3;
                        }
                        break;
                    case 36:
                        {
                        alt12=4;
                        }
                        break;
                    case 37:
                        {
                        alt12=5;
                        }
                        break;
                    case 38:
                        {
                        alt12=6;
                        }
                        break;
                    case 39:
                        {
                        alt12=7;
                        }
                        break;
                    case 40:
                        {
                        alt12=8;
                        }
                        break;
                    case 41:
                        {
                        alt12=9;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalNCL.g:552:5: otherlv_3= '>'
                            {
                            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getHomoConditionCSAccess().getGreaterThanSignKeyword_0_3_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalNCL.g:557:5: otherlv_4= '<'
                            {
                            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getHomoConditionCSAccess().getLessThanSignKeyword_0_3_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalNCL.g:562:5: otherlv_5= '='
                            {
                            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getHomoConditionCSAccess().getEqualsSignKeyword_0_3_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalNCL.g:567:5: otherlv_6= '<>'
                            {
                            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getHomoConditionCSAccess().getLessThanSignGreaterThanSignKeyword_0_3_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalNCL.g:572:5: otherlv_7= '!'
                            {
                            otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getHomoConditionCSAccess().getExclamationMarkKeyword_0_3_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalNCL.g:577:5: otherlv_8= '>='
                            {
                            otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getHomoConditionCSAccess().getGreaterThanSignEqualsSignKeyword_0_3_5());
                              				
                            }

                            }
                            break;
                        case 7 :
                            // InternalNCL.g:582:5: otherlv_9= '=<'
                            {
                            otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getHomoConditionCSAccess().getEqualsSignLessThanSignKeyword_0_3_6());
                              				
                            }

                            }
                            break;
                        case 8 :
                            // InternalNCL.g:587:5: otherlv_10= 'IN'
                            {
                            otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getHomoConditionCSAccess().getINKeyword_0_3_7());
                              				
                            }

                            }
                            break;
                        case 9 :
                            // InternalNCL.g:592:5: otherlv_11= 'NotIN'
                            {
                            otherlv_11=(Token)match(input,41,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getHomoConditionCSAccess().getNotINKeyword_0_3_8());
                              				
                            }

                            }
                            break;

                    }

                    // InternalNCL.g:597:4: ( (lv_ownedElementB_12_0= ruleFQN ) )
                    // InternalNCL.g:598:5: (lv_ownedElementB_12_0= ruleFQN )
                    {
                    // InternalNCL.g:598:5: (lv_ownedElementB_12_0= ruleFQN )
                    // InternalNCL.g:599:6: lv_ownedElementB_12_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHomoConditionCSAccess().getOwnedElementBFQNParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_ownedElementB_12_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHomoConditionCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedElementB",
                      							lv_ownedElementB_12_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getHomoConditionCSAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:622:3: ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* otherlv_28= ')' )
                    {
                    // InternalNCL.g:622:3: ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* otherlv_28= ')' )
                    // InternalNCL.g:623:4: (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* otherlv_28= ')'
                    {
                    // InternalNCL.g:623:4: (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' )
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt13=1;
                        }
                        break;
                    case 44:
                        {
                        alt13=2;
                        }
                        break;
                    case 45:
                        {
                        alt13=3;
                        }
                        break;
                    case 46:
                        {
                        alt13=4;
                        }
                        break;
                    case 47:
                        {
                        alt13=5;
                        }
                        break;
                    case 48:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalNCL.g:624:5: otherlv_14= 'isEqual'
                            {
                            otherlv_14=(Token)match(input,43,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getHomoConditionCSAccess().getIsEqualKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalNCL.g:629:5: otherlv_15= 'isTrue'
                            {
                            otherlv_15=(Token)match(input,44,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getHomoConditionCSAccess().getIsTrueKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalNCL.g:634:5: otherlv_16= 'isFalse'
                            {
                            otherlv_16=(Token)match(input,45,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getHomoConditionCSAccess().getIsFalseKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalNCL.g:639:5: otherlv_17= 'isEmpty'
                            {
                            otherlv_17=(Token)match(input,46,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getHomoConditionCSAccess().getIsEmptyKeyword_1_0_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalNCL.g:644:5: otherlv_18= 'isContain'
                            {
                            otherlv_18=(Token)match(input,47,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getHomoConditionCSAccess().getIsContainKeyword_1_0_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalNCL.g:649:5: otherlv_19= 'isEquivalent'
                            {
                            otherlv_19=(Token)match(input,48,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_19, grammarAccess.getHomoConditionCSAccess().getIsEquivalentKeyword_1_0_5());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getHomoConditionCSAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalNCL.g:658:4: ( (lv_ownedElement_21_0= ruleFQN ) )
                    // InternalNCL.g:659:5: (lv_ownedElement_21_0= ruleFQN )
                    {
                    // InternalNCL.g:659:5: (lv_ownedElement_21_0= ruleFQN )
                    // InternalNCL.g:660:6: lv_ownedElement_21_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHomoConditionCSAccess().getOwnedElementFQNParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_ownedElement_21_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHomoConditionCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedElement",
                      							lv_ownedElement_21_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,49,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getHomoConditionCSAccess().getColonColonKeyword_1_3());
                      			
                    }
                    // InternalNCL.g:681:4: ( (lv_ownedElement_23_0= ruleFQN ) )
                    // InternalNCL.g:682:5: (lv_ownedElement_23_0= ruleFQN )
                    {
                    // InternalNCL.g:682:5: (lv_ownedElement_23_0= ruleFQN )
                    // InternalNCL.g:683:6: lv_ownedElement_23_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHomoConditionCSAccess().getOwnedElementFQNParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_ownedElement_23_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHomoConditionCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedElement",
                      							lv_ownedElement_23_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:700:4: (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==50) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalNCL.g:701:5: otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )?
                    	    {
                    	    otherlv_24=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_24, grammarAccess.getHomoConditionCSAccess().getFullStopKeyword_1_5_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:705:5: ( (lv_ownedElement_25_0= ruleFQN ) )
                    	    // InternalNCL.g:706:6: (lv_ownedElement_25_0= ruleFQN )
                    	    {
                    	    // InternalNCL.g:706:6: (lv_ownedElement_25_0= ruleFQN )
                    	    // InternalNCL.g:707:7: lv_ownedElement_25_0= ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHomoConditionCSAccess().getOwnedElementFQNParserRuleCall_1_5_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
                    	    lv_ownedElement_25_0=ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getHomoConditionCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedElement",
                    	      								lv_ownedElement_25_0,
                    	      								"org.xtext.example.ncl.NCL.FQN");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalNCL.g:724:5: (otherlv_26= '(' otherlv_27= ')' )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==32) ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalNCL.g:725:6: otherlv_26= '(' otherlv_27= ')'
                    	            {
                    	            otherlv_26=(Token)match(input,32,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_26, grammarAccess.getHomoConditionCSAccess().getLeftParenthesisKeyword_1_5_2_0());
                    	              					
                    	            }
                    	            otherlv_27=(Token)match(input,42,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_27, grammarAccess.getHomoConditionCSAccess().getRightParenthesisKeyword_1_5_2_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getHomoConditionCSAccess().getRightParenthesisKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHomoConditionCS"


    // $ANTLR start "entryRuleHetecomCP"
    // InternalNCL.g:744:1: entryRuleHetecomCP returns [EObject current=null] : iv_ruleHetecomCP= ruleHetecomCP EOF ;
    public final EObject entryRuleHetecomCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHetecomCP = null;


        try {
            // InternalNCL.g:744:50: (iv_ruleHetecomCP= ruleHetecomCP EOF )
            // InternalNCL.g:745:2: iv_ruleHetecomCP= ruleHetecomCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHetecomCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHetecomCP=ruleHetecomCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHetecomCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHetecomCP"


    // $ANTLR start "ruleHetecomCP"
    // InternalNCL.g:751:1: ruleHetecomCP returns [EObject current=null] : (otherlv_0= 'matchHete' ( (lv_ownedModels_1_0= rulemetaModelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemetaModelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) ) )* (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' otherlv_11= 'compareModels' otherlv_12= ':' ( (lv_ownedStatements_13_0= ruleHeteStatementCS ) )+ otherlv_14= '}' ) ;
    public final EObject ruleHetecomCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_ownedModels_1_0 = null;

        EObject lv_ownedModels_3_0 = null;

        EObject lv_ownedModels_5_0 = null;

        EObject lv_ownedStatements_13_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:757:2: ( (otherlv_0= 'matchHete' ( (lv_ownedModels_1_0= rulemetaModelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemetaModelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) ) )* (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' otherlv_11= 'compareModels' otherlv_12= ':' ( (lv_ownedStatements_13_0= ruleHeteStatementCS ) )+ otherlv_14= '}' ) )
            // InternalNCL.g:758:2: (otherlv_0= 'matchHete' ( (lv_ownedModels_1_0= rulemetaModelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemetaModelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) ) )* (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' otherlv_11= 'compareModels' otherlv_12= ':' ( (lv_ownedStatements_13_0= ruleHeteStatementCS ) )+ otherlv_14= '}' )
            {
            // InternalNCL.g:758:2: (otherlv_0= 'matchHete' ( (lv_ownedModels_1_0= rulemetaModelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemetaModelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) ) )* (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' otherlv_11= 'compareModels' otherlv_12= ':' ( (lv_ownedStatements_13_0= ruleHeteStatementCS ) )+ otherlv_14= '}' )
            // InternalNCL.g:759:3: otherlv_0= 'matchHete' ( (lv_ownedModels_1_0= rulemetaModelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemetaModelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) ) )* (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' otherlv_11= 'compareModels' otherlv_12= ':' ( (lv_ownedStatements_13_0= ruleHeteStatementCS ) )+ otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHetecomCPAccess().getMatchHeteKeyword_0());
              		
            }
            // InternalNCL.g:763:3: ( (lv_ownedModels_1_0= rulemetaModelTypeCS ) )
            // InternalNCL.g:764:4: (lv_ownedModels_1_0= rulemetaModelTypeCS )
            {
            // InternalNCL.g:764:4: (lv_ownedModels_1_0= rulemetaModelTypeCS )
            // InternalNCL.g:765:5: lv_ownedModels_1_0= rulemetaModelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHetecomCPAccess().getOwnedModelsMetaModelTypeCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_ownedModels_1_0=rulemetaModelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHetecomCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_1_0,
              						"org.xtext.example.ncl.NCL.metaModelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getHetecomCPAccess().getWithKeyword_2());
              		
            }
            // InternalNCL.g:786:3: ( (lv_ownedModels_3_0= rulemetaModelTypeCS ) )
            // InternalNCL.g:787:4: (lv_ownedModels_3_0= rulemetaModelTypeCS )
            {
            // InternalNCL.g:787:4: (lv_ownedModels_3_0= rulemetaModelTypeCS )
            // InternalNCL.g:788:5: lv_ownedModels_3_0= rulemetaModelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHetecomCPAccess().getOwnedModelsMetaModelTypeCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_ownedModels_3_0=rulemetaModelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHetecomCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_3_0,
              						"org.xtext.example.ncl.NCL.metaModelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:805:3: (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalNCL.g:806:4: otherlv_4= ',' ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getHetecomCPAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalNCL.g:810:4: ( (lv_ownedModels_5_0= rulemetaModelTypeCS ) )
            	    // InternalNCL.g:811:5: (lv_ownedModels_5_0= rulemetaModelTypeCS )
            	    {
            	    // InternalNCL.g:811:5: (lv_ownedModels_5_0= rulemetaModelTypeCS )
            	    // InternalNCL.g:812:6: lv_ownedModels_5_0= rulemetaModelTypeCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getHetecomCPAccess().getOwnedModelsMetaModelTypeCSParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_ownedModels_5_0=rulemetaModelTypeCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getHetecomCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedModels",
            	      							lv_ownedModels_5_0,
            	      							"org.xtext.example.ncl.NCL.metaModelTypeCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalNCL.g:830:3: (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalNCL.g:831:4: otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )*
                    {
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getHetecomCPAccess().getExtendsKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getHetecomCPAccess().getUnrestrictedNameParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNCL.g:845:4: (otherlv_8= ',' ruleUnrestrictedName )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==26) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalNCL.g:846:5: otherlv_8= ',' ruleUnrestrictedName
                    	    {
                    	    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getHetecomCPAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					/* */
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getHetecomCPAccess().getUnrestrictedNameParserRuleCall_5_2_1());
                    	      				
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    ruleUnrestrictedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getHetecomCPAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getHetecomCPAccess().getCompareModelsKeyword_7());
              		
            }
            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getHetecomCPAccess().getColonKeyword_8());
              		
            }
            // InternalNCL.g:874:3: ( (lv_ownedStatements_13_0= ruleHeteStatementCS ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=28 && LA20_0<=31)||(LA20_0>=43 && LA20_0<=48)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalNCL.g:875:4: (lv_ownedStatements_13_0= ruleHeteStatementCS )
            	    {
            	    // InternalNCL.g:875:4: (lv_ownedStatements_13_0= ruleHeteStatementCS )
            	    // InternalNCL.g:876:5: lv_ownedStatements_13_0= ruleHeteStatementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHetecomCPAccess().getOwnedStatementsHeteStatementCSParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_ownedStatements_13_0=ruleHeteStatementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getHetecomCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedStatements",
            	      						lv_ownedStatements_13_0,
            	      						"org.xtext.example.ncl.NCL.HeteStatementCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getHetecomCPAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHetecomCP"


    // $ANTLR start "entryRuleHeteStatementCS"
    // InternalNCL.g:901:1: entryRuleHeteStatementCS returns [EObject current=null] : iv_ruleHeteStatementCS= ruleHeteStatementCS EOF ;
    public final EObject entryRuleHeteStatementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeteStatementCS = null;


        try {
            // InternalNCL.g:901:56: (iv_ruleHeteStatementCS= ruleHeteStatementCS EOF )
            // InternalNCL.g:902:2: iv_ruleHeteStatementCS= ruleHeteStatementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeteStatementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHeteStatementCS=ruleHeteStatementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeteStatementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHeteStatementCS"


    // $ANTLR start "ruleHeteStatementCS"
    // InternalNCL.g:908:1: ruleHeteStatementCS returns [EObject current=null] : ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )+ ) ;
    public final EObject ruleHeteStatementCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedConditions_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:914:2: ( ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )+ ) )
            // InternalNCL.g:915:2: ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )+ )
            {
            // InternalNCL.g:915:2: ( (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )+ )
            // InternalNCL.g:916:3: (otherlv_0= 'not' )? ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )+
            {
            // InternalNCL.g:916:3: (otherlv_0= 'not' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNCL.g:917:4: otherlv_0= 'not'
                    {
                    otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getHeteStatementCSAccess().getNotKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalNCL.g:922:3: ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalNCL.g:923:4: (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) )
            	    {
            	    // InternalNCL.g:923:4: (otherlv_1= 'or' | otherlv_2= 'and' )?
            	    int alt22=3;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==29) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==30) ) {
            	        alt22=2;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalNCL.g:924:5: otherlv_1= 'or'
            	            {
            	            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_1, grammarAccess.getHeteStatementCSAccess().getOrKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNCL.g:929:5: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_2, grammarAccess.getHeteStatementCSAccess().getAndKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNCL.g:934:4: ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) )
            	    // InternalNCL.g:935:5: (lv_ownedConditions_3_0= ruleHeteConditionCS )
            	    {
            	    // InternalNCL.g:935:5: (lv_ownedConditions_3_0= ruleHeteConditionCS )
            	    // InternalNCL.g:936:6: lv_ownedConditions_3_0= ruleHeteConditionCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getHeteStatementCSAccess().getOwnedConditionsHeteConditionCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_ownedConditions_3_0=ruleHeteConditionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getHeteStatementCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedConditions",
            	      							lv_ownedConditions_3_0,
            	      							"org.xtext.example.ncl.NCL.HeteConditionCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHeteStatementCS"


    // $ANTLR start "entryRuleHeteConditionCS"
    // InternalNCL.g:958:1: entryRuleHeteConditionCS returns [EObject current=null] : iv_ruleHeteConditionCS= ruleHeteConditionCS EOF ;
    public final EObject entryRuleHeteConditionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeteConditionCS = null;


        try {
            // InternalNCL.g:958:56: (iv_ruleHeteConditionCS= ruleHeteConditionCS EOF )
            // InternalNCL.g:959:2: iv_ruleHeteConditionCS= ruleHeteConditionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeteConditionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHeteConditionCS=ruleHeteConditionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeteConditionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHeteConditionCS"


    // $ANTLR start "ruleHeteConditionCS"
    // InternalNCL.g:965:1: ruleHeteConditionCS returns [EObject current=null] : ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )* otherlv_36= ')' ) ) ;
    public final EObject ruleHeteConditionCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_ownedElementA_2_0 = null;

        AntlrDatatypeRuleToken lv_ownedElementB_12_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_21_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_23_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_25_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_29_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_31_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_33_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:971:2: ( ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )* otherlv_36= ')' ) ) )
            // InternalNCL.g:972:2: ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )* otherlv_36= ')' ) )
            {
            // InternalNCL.g:972:2: ( (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' ) | ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )* otherlv_36= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=43 && LA31_0<=48)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalNCL.g:973:3: (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' )
                    {
                    // InternalNCL.g:973:3: (otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')' )
                    // InternalNCL.g:974:4: otherlv_0= 'isValid' otherlv_1= '(' ( (lv_ownedElementA_2_0= ruleFQN ) ) (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' ) ( (lv_ownedElementB_12_0= ruleFQN ) ) otherlv_13= ')'
                    {
                    otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getHeteConditionCSAccess().getIsValidKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getHeteConditionCSAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalNCL.g:982:4: ( (lv_ownedElementA_2_0= ruleFQN ) )
                    // InternalNCL.g:983:5: (lv_ownedElementA_2_0= ruleFQN )
                    {
                    // InternalNCL.g:983:5: (lv_ownedElementA_2_0= ruleFQN )
                    // InternalNCL.g:984:6: lv_ownedElementA_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementAFQNParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_ownedElementA_2_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedElementA",
                      							lv_ownedElementA_2_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:1001:4: (otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )
                    int alt24=9;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt24=1;
                        }
                        break;
                    case 34:
                        {
                        alt24=2;
                        }
                        break;
                    case 35:
                        {
                        alt24=3;
                        }
                        break;
                    case 36:
                        {
                        alt24=4;
                        }
                        break;
                    case 37:
                        {
                        alt24=5;
                        }
                        break;
                    case 38:
                        {
                        alt24=6;
                        }
                        break;
                    case 39:
                        {
                        alt24=7;
                        }
                        break;
                    case 40:
                        {
                        alt24=8;
                        }
                        break;
                    case 41:
                        {
                        alt24=9;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalNCL.g:1002:5: otherlv_3= '>'
                            {
                            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getHeteConditionCSAccess().getGreaterThanSignKeyword_0_3_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalNCL.g:1007:5: otherlv_4= '<'
                            {
                            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getHeteConditionCSAccess().getLessThanSignKeyword_0_3_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalNCL.g:1012:5: otherlv_5= '='
                            {
                            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getHeteConditionCSAccess().getEqualsSignKeyword_0_3_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalNCL.g:1017:5: otherlv_6= '<>'
                            {
                            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getHeteConditionCSAccess().getLessThanSignGreaterThanSignKeyword_0_3_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalNCL.g:1022:5: otherlv_7= '!'
                            {
                            otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getHeteConditionCSAccess().getExclamationMarkKeyword_0_3_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalNCL.g:1027:5: otherlv_8= '>='
                            {
                            otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getHeteConditionCSAccess().getGreaterThanSignEqualsSignKeyword_0_3_5());
                              				
                            }

                            }
                            break;
                        case 7 :
                            // InternalNCL.g:1032:5: otherlv_9= '=<'
                            {
                            otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getHeteConditionCSAccess().getEqualsSignLessThanSignKeyword_0_3_6());
                              				
                            }

                            }
                            break;
                        case 8 :
                            // InternalNCL.g:1037:5: otherlv_10= 'IN'
                            {
                            otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getHeteConditionCSAccess().getINKeyword_0_3_7());
                              				
                            }

                            }
                            break;
                        case 9 :
                            // InternalNCL.g:1042:5: otherlv_11= 'NotIN'
                            {
                            otherlv_11=(Token)match(input,41,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getHeteConditionCSAccess().getNotINKeyword_0_3_8());
                              				
                            }

                            }
                            break;

                    }

                    // InternalNCL.g:1047:4: ( (lv_ownedElementB_12_0= ruleFQN ) )
                    // InternalNCL.g:1048:5: (lv_ownedElementB_12_0= ruleFQN )
                    {
                    // InternalNCL.g:1048:5: (lv_ownedElementB_12_0= ruleFQN )
                    // InternalNCL.g:1049:6: lv_ownedElementB_12_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementBFQNParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_ownedElementB_12_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedElementB",
                      							lv_ownedElementB_12_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getHeteConditionCSAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:1072:3: ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )* otherlv_36= ')' )
                    {
                    // InternalNCL.g:1072:3: ( (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )* otherlv_36= ')' )
                    // InternalNCL.g:1073:4: (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' ) otherlv_20= '(' ( (lv_ownedElement_21_0= ruleFQN ) ) otherlv_22= '::' ( (lv_ownedElement_23_0= ruleFQN ) ) (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )* (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )* otherlv_36= ')'
                    {
                    // InternalNCL.g:1073:4: (otherlv_14= 'isEqual' | otherlv_15= 'isTrue' | otherlv_16= 'isFalse' | otherlv_17= 'isEmpty' | otherlv_18= 'isContain' | otherlv_19= 'isEquivalent' )
                    int alt25=6;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt25=1;
                        }
                        break;
                    case 44:
                        {
                        alt25=2;
                        }
                        break;
                    case 45:
                        {
                        alt25=3;
                        }
                        break;
                    case 46:
                        {
                        alt25=4;
                        }
                        break;
                    case 47:
                        {
                        alt25=5;
                        }
                        break;
                    case 48:
                        {
                        alt25=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalNCL.g:1074:5: otherlv_14= 'isEqual'
                            {
                            otherlv_14=(Token)match(input,43,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getHeteConditionCSAccess().getIsEqualKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalNCL.g:1079:5: otherlv_15= 'isTrue'
                            {
                            otherlv_15=(Token)match(input,44,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getHeteConditionCSAccess().getIsTrueKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalNCL.g:1084:5: otherlv_16= 'isFalse'
                            {
                            otherlv_16=(Token)match(input,45,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getHeteConditionCSAccess().getIsFalseKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalNCL.g:1089:5: otherlv_17= 'isEmpty'
                            {
                            otherlv_17=(Token)match(input,46,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getHeteConditionCSAccess().getIsEmptyKeyword_1_0_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalNCL.g:1094:5: otherlv_18= 'isContain'
                            {
                            otherlv_18=(Token)match(input,47,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getHeteConditionCSAccess().getIsContainKeyword_1_0_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalNCL.g:1099:5: otherlv_19= 'isEquivalent'
                            {
                            otherlv_19=(Token)match(input,48,FollowSets000.FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_19, grammarAccess.getHeteConditionCSAccess().getIsEquivalentKeyword_1_0_5());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getHeteConditionCSAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalNCL.g:1108:4: ( (lv_ownedElement_21_0= ruleFQN ) )
                    // InternalNCL.g:1109:5: (lv_ownedElement_21_0= ruleFQN )
                    {
                    // InternalNCL.g:1109:5: (lv_ownedElement_21_0= ruleFQN )
                    // InternalNCL.g:1110:6: lv_ownedElement_21_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementFQNParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_ownedElement_21_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedElement",
                      							lv_ownedElement_21_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,49,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getHeteConditionCSAccess().getColonColonKeyword_1_3());
                      			
                    }
                    // InternalNCL.g:1131:4: ( (lv_ownedElement_23_0= ruleFQN ) )
                    // InternalNCL.g:1132:5: (lv_ownedElement_23_0= ruleFQN )
                    {
                    // InternalNCL.g:1132:5: (lv_ownedElement_23_0= ruleFQN )
                    // InternalNCL.g:1133:6: lv_ownedElement_23_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementFQNParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_ownedElement_23_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedElement",
                      							lv_ownedElement_23_0,
                      							"org.xtext.example.ncl.NCL.FQN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:1150:4: (otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )? )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==50) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalNCL.g:1151:5: otherlv_24= '.' ( (lv_ownedElement_25_0= ruleFQN ) ) (otherlv_26= '(' otherlv_27= ')' )?
                    	    {
                    	    otherlv_24=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_24, grammarAccess.getHeteConditionCSAccess().getFullStopKeyword_1_5_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:1155:5: ( (lv_ownedElement_25_0= ruleFQN ) )
                    	    // InternalNCL.g:1156:6: (lv_ownedElement_25_0= ruleFQN )
                    	    {
                    	    // InternalNCL.g:1156:6: (lv_ownedElement_25_0= ruleFQN )
                    	    // InternalNCL.g:1157:7: lv_ownedElement_25_0= ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementFQNParserRuleCall_1_5_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_ownedElement_25_0=ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedElement",
                    	      								lv_ownedElement_25_0,
                    	      								"org.xtext.example.ncl.NCL.FQN");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalNCL.g:1174:5: (otherlv_26= '(' otherlv_27= ')' )?
                    	    int alt26=2;
                    	    int LA26_0 = input.LA(1);

                    	    if ( (LA26_0==32) ) {
                    	        alt26=1;
                    	    }
                    	    switch (alt26) {
                    	        case 1 :
                    	            // InternalNCL.g:1175:6: otherlv_26= '(' otherlv_27= ')'
                    	            {
                    	            otherlv_26=(Token)match(input,32,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_26, grammarAccess.getHeteConditionCSAccess().getLeftParenthesisKeyword_1_5_2_0());
                    	              					
                    	            }
                    	            otherlv_27=(Token)match(input,42,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_27, grammarAccess.getHeteConditionCSAccess().getRightParenthesisKeyword_1_5_2_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // InternalNCL.g:1185:4: (otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )* )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==26) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalNCL.g:1186:5: otherlv_28= ',' ( (lv_ownedElement_29_0= ruleFQN ) ) otherlv_30= '::' ( (lv_ownedElement_31_0= ruleFQN ) ) (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )*
                    	    {
                    	    otherlv_28=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_28, grammarAccess.getHeteConditionCSAccess().getCommaKeyword_1_6_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:1190:5: ( (lv_ownedElement_29_0= ruleFQN ) )
                    	    // InternalNCL.g:1191:6: (lv_ownedElement_29_0= ruleFQN )
                    	    {
                    	    // InternalNCL.g:1191:6: (lv_ownedElement_29_0= ruleFQN )
                    	    // InternalNCL.g:1192:7: lv_ownedElement_29_0= ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementFQNParserRuleCall_1_6_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_ownedElement_29_0=ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedElement",
                    	      								lv_ownedElement_29_0,
                    	      								"org.xtext.example.ncl.NCL.FQN");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_30=(Token)match(input,49,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_30, grammarAccess.getHeteConditionCSAccess().getColonColonKeyword_1_6_2());
                    	      				
                    	    }
                    	    // InternalNCL.g:1213:5: ( (lv_ownedElement_31_0= ruleFQN ) )
                    	    // InternalNCL.g:1214:6: (lv_ownedElement_31_0= ruleFQN )
                    	    {
                    	    // InternalNCL.g:1214:6: (lv_ownedElement_31_0= ruleFQN )
                    	    // InternalNCL.g:1215:7: lv_ownedElement_31_0= ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementFQNParserRuleCall_1_6_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_ownedElement_31_0=ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedElement",
                    	      								lv_ownedElement_31_0,
                    	      								"org.xtext.example.ncl.NCL.FQN");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalNCL.g:1232:5: (otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )? )*
                    	    loop29:
                    	    do {
                    	        int alt29=2;
                    	        int LA29_0 = input.LA(1);

                    	        if ( (LA29_0==50) ) {
                    	            alt29=1;
                    	        }


                    	        switch (alt29) {
                    	    	case 1 :
                    	    	    // InternalNCL.g:1233:6: otherlv_32= '.' ( (lv_ownedElement_33_0= ruleFQN ) ) (otherlv_34= '(' otherlv_35= ')' )?
                    	    	    {
                    	    	    otherlv_32=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(otherlv_32, grammarAccess.getHeteConditionCSAccess().getFullStopKeyword_1_6_4_0());
                    	    	      					
                    	    	    }
                    	    	    // InternalNCL.g:1237:6: ( (lv_ownedElement_33_0= ruleFQN ) )
                    	    	    // InternalNCL.g:1238:7: (lv_ownedElement_33_0= ruleFQN )
                    	    	    {
                    	    	    // InternalNCL.g:1238:7: (lv_ownedElement_33_0= ruleFQN )
                    	    	    // InternalNCL.g:1239:8: lv_ownedElement_33_0= ruleFQN
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								newCompositeNode(grammarAccess.getHeteConditionCSAccess().getOwnedElementFQNParserRuleCall_1_6_4_1_0());
                    	    	      							
                    	    	    }
                    	    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    	    lv_ownedElement_33_0=ruleFQN();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								if (current==null) {
                    	    	      									current = createModelElementForParent(grammarAccess.getHeteConditionCSRule());
                    	    	      								}
                    	    	      								add(
                    	    	      									current,
                    	    	      									"ownedElement",
                    	    	      									lv_ownedElement_33_0,
                    	    	      									"org.xtext.example.ncl.NCL.FQN");
                    	    	      								afterParserOrEnumRuleCall();
                    	    	      							
                    	    	    }

                    	    	    }


                    	    	    }

                    	    	    // InternalNCL.g:1256:6: (otherlv_34= '(' otherlv_35= ')' )?
                    	    	    int alt28=2;
                    	    	    int LA28_0 = input.LA(1);

                    	    	    if ( (LA28_0==32) ) {
                    	    	        alt28=1;
                    	    	    }
                    	    	    switch (alt28) {
                    	    	        case 1 :
                    	    	            // InternalNCL.g:1257:7: otherlv_34= '(' otherlv_35= ')'
                    	    	            {
                    	    	            otherlv_34=(Token)match(input,32,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    	    	            if ( state.backtracking==0 ) {

                    	    	              							newLeafNode(otherlv_34, grammarAccess.getHeteConditionCSAccess().getLeftParenthesisKeyword_1_6_4_2_0());
                    	    	              						
                    	    	            }
                    	    	            otherlv_35=(Token)match(input,42,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    	    	            if ( state.backtracking==0 ) {

                    	    	              							newLeafNode(otherlv_35, grammarAccess.getHeteConditionCSAccess().getRightParenthesisKeyword_1_6_4_2_1());
                    	    	              						
                    	    	            }

                    	    	            }
                    	    	            break;

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop29;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getHeteConditionCSAccess().getRightParenthesisKeyword_1_7());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHeteConditionCS"


    // $ANTLR start "entryRuleFQN"
    // InternalNCL.g:1277:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalNCL.g:1277:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalNCL.g:1278:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalNCL.g:1284:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_ID_1 = null;

        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;

        AntlrDatatypeRuleToken this_ID_5 = null;



        	enterRule();

        try {
            // InternalNCL.g:1290:2: ( ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) )
            // InternalNCL.g:1291:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            {
            // InternalNCL.g:1291:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            // InternalNCL.g:1292:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            {
            // InternalNCL.g:1292:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SIMPLE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred56_InternalNCL()) ) {
                    alt32=1;
                }
                else if ( (true) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA32_0==RULE_ESCAPED_ID) ) {
                int LA32_2 = input.LA(2);

                if ( (synpred56_InternalNCL()) ) {
                    alt32=1;
                }
                else if ( (true) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalNCL.g:1293:4: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UnrestrictedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:1304:4: this_ID_1= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    this_ID_1=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalNCL.g:1315:3: ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==50) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==RULE_SIMPLE_ID) ) {
                        int LA37_4 = input.LA(3);

                        if ( (synpred61_InternalNCL()) ) {
                            alt37=1;
                        }


                    }
                    else if ( (LA37_2==RULE_ESCAPED_ID) ) {
                        int LA37_5 = input.LA(3);

                        if ( (synpred61_InternalNCL()) ) {
                            alt37=1;
                        }


                    }


                }
                else if ( (LA37_0==53) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalNCL.g:1316:4: (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )?
            	    {
            	    // InternalNCL.g:1316:4: (kw= '.' | kw= '->' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==50) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==53) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalNCL.g:1317:5: kw= '.'
            	            {
            	            kw=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNCL.g:1323:5: kw= '->'
            	            {
            	            kw=(Token)match(input,53,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNCL.g:1329:4: (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==RULE_SIMPLE_ID) ) {
            	        int LA34_1 = input.LA(2);

            	        if ( (synpred58_InternalNCL()) ) {
            	            alt34=1;
            	        }
            	        else if ( (true) ) {
            	            alt34=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 34, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA34_0==RULE_ESCAPED_ID) ) {
            	        int LA34_2 = input.LA(2);

            	        if ( (synpred58_InternalNCL()) ) {
            	            alt34=1;
            	        }
            	        else if ( (true) ) {
            	            alt34=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 34, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalNCL.g:1330:5: this_UnrestrictedName_4= ruleUnrestrictedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_30);
            	            this_UnrestrictedName_4=ruleUnrestrictedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_UnrestrictedName_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNCL.g:1341:5: this_ID_5= ruleID
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_1_1_1());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_30);
            	            this_ID_5=ruleID();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ID_5);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNCL.g:1352:4: (kw= '(' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==32) ) {
            	        int LA35_1 = input.LA(2);

            	        if ( (LA35_1==42) ) {
            	            int LA35_3 = input.LA(3);

            	            if ( (synpred59_InternalNCL()) ) {
            	                alt35=1;
            	            }
            	        }
            	        else if ( (LA35_1==EOF||LA35_1==26||(LA35_1>=32 && LA35_1<=41)||(LA35_1>=49 && LA35_1<=50)||LA35_1==53) ) {
            	            alt35=1;
            	        }
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalNCL.g:1353:5: kw= '('
            	            {
            	            kw=(Token)match(input,32,FollowSets000.FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getLeftParenthesisKeyword_1_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNCL.g:1359:4: (kw= ')' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==42) ) {
            	        int LA36_1 = input.LA(2);

            	        if ( (LA36_1==EOF) ) {
            	            int LA36_3 = input.LA(3);

            	            if ( (LA36_3==EOF) ) {
            	                alt36=1;
            	            }
            	        }
            	        else if ( (LA36_1==26||(LA36_1>=32 && LA36_1<=42)||(LA36_1>=49 && LA36_1<=50)||LA36_1==53) ) {
            	            alt36=1;
            	        }
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalNCL.g:1360:5: kw= ')'
            	            {
            	            kw=(Token)match(input,42,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getRightParenthesisKeyword_1_3());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // InternalNCL.g:1371:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalNCL.g:1371:69: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalNCL.g:1372:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorName"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorName"
    // InternalNCL.g:1378:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' | kw= 'not2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNCL.g:1384:2: ( (kw= '-' | kw= 'not' | kw= 'not2' ) )
            // InternalNCL.g:1385:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            {
            // InternalNCL.g:1385:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt38=1;
                }
                break;
            case 28:
                {
                alt38=2;
                }
                break;
            case 55:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalNCL.g:1386:3: kw= '-'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:1392:3: kw= 'not'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:1398:3: kw= 'not2'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNot2Keyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorName"
    // InternalNCL.g:1407:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalNCL.g:1407:69: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalNCL.g:1408:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorName"


    // $ANTLR start "ruleEssentialOCLInfixOperatorName"
    // InternalNCL.g:1414:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNCL.g:1420:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) )
            // InternalNCL.g:1421:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            {
            // InternalNCL.g:1421:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            int alt39=18;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt39=1;
                }
                break;
            case 57:
                {
                alt39=2;
                }
                break;
            case 58:
                {
                alt39=3;
                }
                break;
            case 54:
                {
                alt39=4;
                }
                break;
            case 33:
                {
                alt39=5;
                }
                break;
            case 34:
                {
                alt39=6;
                }
                break;
            case 38:
                {
                alt39=7;
                }
                break;
            case 59:
                {
                alt39=8;
                }
                break;
            case 35:
                {
                alt39=9;
                }
                break;
            case 36:
                {
                alt39=10;
                }
                break;
            case 30:
                {
                alt39=11;
                }
                break;
            case 60:
                {
                alt39=12;
                }
                break;
            case 61:
                {
                alt39=13;
                }
                break;
            case 62:
                {
                alt39=14;
                }
                break;
            case 29:
                {
                alt39=15;
                }
                break;
            case 63:
                {
                alt39=16;
                }
                break;
            case 64:
                {
                alt39=17;
                }
                break;
            case 65:
                {
                alt39=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalNCL.g:1422:3: kw= '*'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:1428:3: kw= '/'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:1434:3: kw= '+'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:1440:3: kw= '-'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNCL.g:1446:3: kw= '>'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNCL.g:1452:3: kw= '<'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNCL.g:1458:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNCL.g:1464:3: kw= '<='
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNCL.g:1470:3: kw= '='
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNCL.g:1476:3: kw= '<>'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalNCL.g:1482:3: kw= 'and'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalNCL.g:1488:3: kw= 'and2'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAnd2Keyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalNCL.g:1494:3: kw= 'implies'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalNCL.g:1500:3: kw= 'implies2'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImplies2Keyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalNCL.g:1506:3: kw= 'or'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalNCL.g:1512:3: kw= 'or2'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOr2Keyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalNCL.g:1518:3: kw= 'xor'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalNCL.g:1524:3: kw= 'xor2'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXor2Keyword_17());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLInfixOperatorName"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // InternalNCL.g:1533:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalNCL.g:1533:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalNCL.g:1534:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // InternalNCL.g:1540:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNCL.g:1546:2: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalNCL.g:1547:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalNCL.g:1547:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt40=1;
                }
                break;
            case 53:
                {
                alt40=2;
                }
                break;
            case 66:
                {
                alt40=3;
                }
                break;
            case 67:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalNCL.g:1548:3: kw= '.'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:1554:3: kw= '->'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:1560:3: kw= '?.'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:1566:3: kw= '?->'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleBinaryOperatorName"
    // InternalNCL.g:1575:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalNCL.g:1575:58: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalNCL.g:1576:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOperatorName"


    // $ANTLR start "ruleBinaryOperatorName"
    // InternalNCL.g:1582:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalNCL.g:1588:2: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // InternalNCL.g:1589:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // InternalNCL.g:1589:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=29 && LA41_0<=30)||(LA41_0>=33 && LA41_0<=36)||LA41_0==38||LA41_0==54||(LA41_0>=56 && LA41_0<=65)) ) {
                alt41=1;
            }
            else if ( (LA41_0==50||LA41_0==53||(LA41_0>=66 && LA41_0<=67)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalNCL.g:1590:3: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InfixOperatorName_0=ruleInfixOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_InfixOperatorName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:1601:3: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NavigationOperatorName_1=ruleNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NavigationOperatorName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBinaryOperatorName"


    // $ANTLR start "entryRuleInfixOperatorName"
    // InternalNCL.g:1615:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // InternalNCL.g:1615:57: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // InternalNCL.g:1616:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixOperatorName"


    // $ANTLR start "ruleInfixOperatorName"
    // InternalNCL.g:1622:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:1628:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // InternalNCL.g:1629:2: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLInfixOperatorName_0=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLInfixOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInfixOperatorName"


    // $ANTLR start "entryRuleNavigationOperatorName"
    // InternalNCL.g:1642:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // InternalNCL.g:1642:62: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // InternalNCL.g:1643:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOperatorName"


    // $ANTLR start "ruleNavigationOperatorName"
    // InternalNCL.g:1649:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:1655:2: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // InternalNCL.g:1656:2: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLNavigationOperatorName_0=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLNavigationOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigationOperatorName"


    // $ANTLR start "entryRuleUnaryOperatorName"
    // InternalNCL.g:1669:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalNCL.g:1669:57: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalNCL.g:1670:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOperatorName"


    // $ANTLR start "ruleUnaryOperatorName"
    // InternalNCL.g:1676:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:1682:2: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalNCL.g:1683:2: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnaryOperatorName_0=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnaryOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalNCL.g:1696:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalNCL.g:1696:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalNCL.g:1697:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // InternalNCL.g:1703:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:1709:2: (this_Identifier_0= ruleIdentifier )
            // InternalNCL.g:1710:2: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalNCL.g:1723:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalNCL.g:1723:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalNCL.g:1724:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // InternalNCL.g:1730:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:1736:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalNCL.g:1737:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalNCL.g:1750:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalNCL.g:1750:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalNCL.g:1751:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // InternalNCL.g:1757:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalNCL.g:1763:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // InternalNCL.g:1764:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // InternalNCL.g:1764:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt42=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt42=1;
                }
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt42=2;
                }
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt42=3;
                }
                break;
            case 68:
                {
                alt42=4;
                }
                break;
            case 69:
                {
                alt42=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalNCL.g:1765:3: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UnrestrictedName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:1776:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CollectionTypeIdentifier_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:1787:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimitiveTypeIdentifier_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:1798:3: kw= 'Map'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNCL.g:1804:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRuleUnreservedName"
    // InternalNCL.g:1813:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalNCL.g:1813:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalNCL.g:1814:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // InternalNCL.g:1820:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:1826:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalNCL.g:1827:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRuleURIPathNameCS"
    // InternalNCL.g:1840:1: entryRuleURIPathNameCS returns [EObject current=null] : iv_ruleURIPathNameCS= ruleURIPathNameCS EOF ;
    public final EObject entryRuleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIPathNameCS = null;


        try {
            // InternalNCL.g:1840:54: (iv_ruleURIPathNameCS= ruleURIPathNameCS EOF )
            // InternalNCL.g:1841:2: iv_ruleURIPathNameCS= ruleURIPathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURIPathNameCS=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIPathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURIPathNameCS"


    // $ANTLR start "ruleURIPathNameCS"
    // InternalNCL.g:1847:1: ruleURIPathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject ruleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:1853:2: ( ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalNCL.g:1854:2: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalNCL.g:1854:2: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalNCL.g:1855:3: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalNCL.g:1855:3: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) )
            // InternalNCL.g:1856:4: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            {
            // InternalNCL.g:1856:4: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            // InternalNCL.g:1857:5: lv_ownedPathElements_0_0= ruleURIFirstPathElementCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsURIFirstPathElementCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_ownedPathElements_0_0=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getURIPathNameCSRule());
              					}
              					add(
              						current,
              						"ownedPathElements",
              						lv_ownedPathElements_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.URIFirstPathElementCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:1874:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==49) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalNCL.g:1875:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getURIPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalNCL.g:1879:4: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalNCL.g:1880:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalNCL.g:1880:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalNCL.g:1881:6: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getURIPathNameCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedPathElements",
            	      							lv_ownedPathElements_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.NextPathElementCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleURIPathNameCS"


    // $ANTLR start "entryRuleURIFirstPathElementCS"
    // InternalNCL.g:1903:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // InternalNCL.g:1903:62: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // InternalNCL.g:1904:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURIFirstPathElementCS"


    // $ANTLR start "ruleURIFirstPathElementCS"
    // InternalNCL.g:1910:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNCL.g:1916:2: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // InternalNCL.g:1917:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // InternalNCL.g:1917:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_SIMPLE_ID && LA44_0<=RULE_ESCAPED_ID)) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalNCL.g:1918:3: ( ( ruleUnrestrictedName ) )
                    {
                    // InternalNCL.g:1918:3: ( ( ruleUnrestrictedName ) )
                    // InternalNCL.g:1919:4: ( ruleUnrestrictedName )
                    {
                    // InternalNCL.g:1919:4: ( ruleUnrestrictedName )
                    // InternalNCL.g:1920:5: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:1938:3: ( () ( ( ruleURI ) ) )
                    {
                    // InternalNCL.g:1938:3: ( () ( ( ruleURI ) ) )
                    // InternalNCL.g:1939:4: () ( ( ruleURI ) )
                    {
                    // InternalNCL.g:1939:4: ()
                    // InternalNCL.g:1940:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getURIFirstPathElementCSAccess().getPathElementWithURICSAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNCL.g:1949:4: ( ( ruleURI ) )
                    // InternalNCL.g:1950:5: ( ruleURI )
                    {
                    // InternalNCL.g:1950:5: ( ruleURI )
                    // InternalNCL.g:1951:6: ruleURI
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamespaceCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleURIFirstPathElementCS"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalNCL.g:1973:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalNCL.g:1973:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalNCL.g:1974:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalNCL.g:1980:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNCL.g:1986:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalNCL.g:1987:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalNCL.g:1987:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt45=8;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt45=1;
                }
                break;
            case 71:
                {
                alt45=2;
                }
                break;
            case 72:
                {
                alt45=3;
                }
                break;
            case 73:
                {
                alt45=4;
                }
                break;
            case 74:
                {
                alt45=5;
                }
                break;
            case 75:
                {
                alt45=6;
                }
                break;
            case 76:
                {
                alt45=7;
                }
                break;
            case 77:
                {
                alt45=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalNCL.g:1988:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:1994:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:2000:3: kw= 'Real'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:2006:3: kw= 'String'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNCL.g:2012:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNCL.g:2018:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNCL.g:2024:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNCL.g:2030:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalNCL.g:2039:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalNCL.g:2039:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalNCL.g:2040:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalNCL.g:2046:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2052:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalNCL.g:2053:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalNCL.g:2053:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalNCL.g:2054:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalNCL.g:2054:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalNCL.g:2055:4: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrimitiveTypeIdentifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalNCL.g:2075:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalNCL.g:2075:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalNCL.g:2076:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalNCL.g:2082:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNCL.g:2088:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalNCL.g:2089:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalNCL.g:2089:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt46=1;
                }
                break;
            case 79:
                {
                alt46=2;
                }
                break;
            case 80:
                {
                alt46=3;
                }
                break;
            case 81:
                {
                alt46=4;
                }
                break;
            case 82:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalNCL.g:2090:3: kw= 'Set'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:2096:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:2102:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:2108:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNCL.g:2114:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalNCL.g:2123:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalNCL.g:2123:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalNCL.g:2124:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalNCL.g:2130:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedCollectionMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2136:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) )
            // InternalNCL.g:2137:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            {
            // InternalNCL.g:2137:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            // InternalNCL.g:2138:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            {
            // InternalNCL.g:2138:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalNCL.g:2139:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalNCL.g:2139:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalNCL.g:2140:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:2157:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalNCL.g:2158:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:2162:4: ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) )
                    // InternalNCL.g:2163:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    {
                    // InternalNCL.g:2163:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    // InternalNCL.g:2164:6: lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpWithoutMultiplicityCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_ownedType_2_0=ruleTypeExpWithoutMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpWithoutMultiplicityCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:2181:4: ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==93) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalNCL.g:2182:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            {
                            // InternalNCL.g:2182:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            // InternalNCL.g:2183:6: lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedCollectionMultiplicityMultiplicityCSParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_21);
                            lv_ownedCollectionMultiplicity_3_0=ruleMultiplicityCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                              						}
                              						set(
                              							current,
                              							"ownedCollectionMultiplicity",
                              							lv_ownedCollectionMultiplicity_3_0,
                              							"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMapTypeCS"
    // InternalNCL.g:2209:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalNCL.g:2209:50: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalNCL.g:2210:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapTypeCS"


    // $ANTLR start "ruleMapTypeCS"
    // InternalNCL.g:2216:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleMapTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2222:2: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalNCL.g:2223:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalNCL.g:2223:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalNCL.g:2224:3: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalNCL.g:2224:3: ( (lv_name_0_0= 'Map' ) )
            // InternalNCL.g:2225:4: (lv_name_0_0= 'Map' )
            {
            // InternalNCL.g:2225:4: (lv_name_0_0= 'Map' )
            // InternalNCL.g:2226:5: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,68,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMapTypeCSAccess().getNameMapKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Map");
              				
            }

            }


            }

            // InternalNCL.g:2238:3: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==32) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalNCL.g:2239:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:2243:4: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalNCL.g:2244:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:2244:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalNCL.g:2245:6: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_ownedKeyType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedKeyType",
                      							lv_ownedKeyType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalNCL.g:2266:4: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalNCL.g:2267:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:2267:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalNCL.g:2268:6: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_ownedValueType_4_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedValueType",
                      							lv_ownedValueType_4_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMapTypeCSAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalNCL.g:2294:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalNCL.g:2294:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalNCL.g:2295:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // InternalNCL.g:2301:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2307:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalNCL.g:2308:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalNCL.g:2308:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalNCL.g:2309:3: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalNCL.g:2309:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalNCL.g:2310:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalNCL.g:2310:4: (lv_name_0_0= 'Tuple' )
            // InternalNCL.g:2311:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,69,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              				
            }

            }


            }

            // InternalNCL.g:2323:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==32) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalNCL.g:2324:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:2328:4: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=RULE_SIMPLE_ID && LA51_0<=RULE_ESCAPED_ID)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalNCL.g:2329:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalNCL.g:2329:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalNCL.g:2330:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalNCL.g:2330:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalNCL.g:2331:7: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_38);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              							}
                              							add(
                              								current,
                              								"ownedParts",
                              								lv_ownedParts_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalNCL.g:2348:5: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==26) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // InternalNCL.g:2349:6: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalNCL.g:2353:6: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalNCL.g:2354:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalNCL.g:2354:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalNCL.g:2355:8: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_38);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"ownedParts",
                            	      									lv_ownedParts_4_0,
                            	      									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // InternalNCL.g:2383:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalNCL.g:2383:52: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalNCL.g:2384:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // InternalNCL.g:2390:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2396:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalNCL.g:2397:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalNCL.g:2397:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalNCL.g:2398:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalNCL.g:2398:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNCL.g:2399:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNCL.g:2399:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNCL.g:2400:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
              		
            }
            // InternalNCL.g:2421:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalNCL.g:2422:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalNCL.g:2422:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalNCL.g:2423:5: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalNCL.g:2444:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalNCL.g:2444:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalNCL.g:2445:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalNCL.g:2451:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2457:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNCL.g:2458:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNCL.g:2458:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNCL.g:2459:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNCL.g:2459:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalNCL.g:2460:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalNCL.g:2460:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalNCL.g:2461:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNCL.g:2482:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_SIMPLE_ID && LA54_0<=RULE_SINGLE_QUOTED_STRING)||LA54_0==22||LA54_0==28||LA54_0==32||(LA54_0>=54 && LA54_0<=56)||(LA54_0>=68 && LA54_0<=82)||LA54_0==85||(LA54_0>=87 && LA54_0<=90)||LA54_0==98||(LA54_0>=103 && LA54_0<=104)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalNCL.g:2483:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalNCL.g:2483:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalNCL.g:2484:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalNCL.g:2484:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalNCL.g:2485:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:2502:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==26) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalNCL.g:2503:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:2507:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalNCL.g:2508:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalNCL.g:2508:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalNCL.g:2509:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalNCL.g:2536:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalNCL.g:2536:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalNCL.g:2537:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalNCL.g:2543:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2549:2: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalNCL.g:2550:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalNCL.g:2550:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt56=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 28:
            case 32:
            case 54:
            case 55:
            case 56:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 85:
            case 87:
            case 88:
            case 89:
            case 90:
            case 98:
            case 103:
            case 104:
                {
                alt56=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==EOF||LA56_2==18||LA56_2==20||LA56_2==26||(LA56_2>=29 && LA56_2<=30)||(LA56_2>=32 && LA56_2<=36)||LA56_2==38||(LA56_2>=49 && LA56_2<=50)||(LA56_2>=53 && LA56_2<=54)||(LA56_2>=56 && LA56_2<=67)||LA56_2==83||LA56_2==91||LA56_2==93) ) {
                    alt56=1;
                }
                else if ( (LA56_2==22) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA56_3 = input.LA(2);

                if ( (LA56_3==22) ) {
                    alt56=2;
                }
                else if ( (LA56_3==EOF||LA56_3==18||LA56_3==20||LA56_3==26||(LA56_3>=29 && LA56_3<=30)||(LA56_3>=32 && LA56_3<=36)||LA56_3==38||(LA56_3>=49 && LA56_3<=50)||(LA56_3>=53 && LA56_3<=54)||(LA56_3>=56 && LA56_3<=67)||LA56_3==83||LA56_3==91||LA56_3==93) ) {
                    alt56=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt56=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalNCL.g:2551:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalNCL.g:2551:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalNCL.g:2552:4: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalNCL.g:2552:4: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalNCL.g:2553:5: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalNCL.g:2553:5: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalNCL.g:2554:6: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExpression",
                      							lv_ownedExpression_0_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:2571:4: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==83) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalNCL.g:2572:5: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                              				
                            }
                            // InternalNCL.g:2576:5: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalNCL.g:2577:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalNCL.g:2577:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalNCL.g:2578:7: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedLastExpression_2_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedLastExpression",
                              								lv_ownedLastExpression_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:2598:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalNCL.g:2598:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalNCL.g:2599:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalNCL.g:2599:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalNCL.g:2600:5: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedExpression_3_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedExpression",
                      						lv_ownedExpression_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleCollectionPatternCS"
    // InternalNCL.g:2621:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalNCL.g:2621:60: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalNCL.g:2622:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionPatternCS"


    // $ANTLR start "ruleCollectionPatternCS"
    // InternalNCL.g:2628:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        AntlrDatatypeRuleToken lv_restVariableName_6_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2634:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // InternalNCL.g:2635:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // InternalNCL.g:2635:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // InternalNCL.g:2636:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // InternalNCL.g:2636:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalNCL.g:2637:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalNCL.g:2637:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalNCL.g:2638:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNCL.g:2659:3: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_SIMPLE_ID && LA58_0<=RULE_ESCAPED_ID)||LA58_0==22) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalNCL.g:2660:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // InternalNCL.g:2660:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalNCL.g:2661:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalNCL.g:2661:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalNCL.g:2662:6: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_ownedParts_2_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:2679:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==26) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalNCL.g:2680:5: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:2684:5: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalNCL.g:2685:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalNCL.g:2685:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalNCL.g:2686:7: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
                    	    lv_ownedParts_4_0=rulePatternExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    // InternalNCL.g:2704:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // InternalNCL.g:2705:5: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,84,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                      				
                    }
                    // InternalNCL.g:2709:5: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // InternalNCL.g:2710:6: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // InternalNCL.g:2710:6: (lv_restVariableName_6_0= ruleIdentifier )
                    // InternalNCL.g:2711:7: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_restVariableName_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      							}
                      							set(
                      								current,
                      								"restVariableName",
                      								lv_restVariableName_6_0,
                      								"org.eclipse.ocl.xtext.base.Base.Identifier");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCollectionPatternCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionPatternCS"


    // $ANTLR start "entryRuleShadowPartCS"
    // InternalNCL.g:2738:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalNCL.g:2738:53: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalNCL.g:2739:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShadowPartCS"


    // $ANTLR start "ruleShadowPartCS"
    // InternalNCL.g:2745:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;

        EObject lv_ownedInitExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2751:2: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) )
            // InternalNCL.g:2752:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            {
            // InternalNCL.g:2752:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_SIMPLE_ID && LA60_0<=RULE_ESCAPED_ID)) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalNCL.g:2753:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    {
                    // InternalNCL.g:2753:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    // InternalNCL.g:2754:4: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    {
                    // InternalNCL.g:2754:4: ( ( ruleUnrestrictedName ) )
                    // InternalNCL.g:2755:5: ( ruleUnrestrictedName )
                    {
                    // InternalNCL.g:2755:5: ( ruleUnrestrictedName )
                    // InternalNCL.g:2756:6: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getShadowPartCSRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShadowPartCSAccess().getReferredPropertyPropertyCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalNCL.g:2777:4: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    // InternalNCL.g:2778:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    {
                    // InternalNCL.g:2778:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    // InternalNCL.g:2779:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    {
                    // InternalNCL.g:2779:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    int alt59=2;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_SINGLE_QUOTED_STRING:
                    case 28:
                    case 32:
                    case 54:
                    case 55:
                    case 56:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 85:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 98:
                    case 103:
                    case 104:
                        {
                        alt59=1;
                        }
                        break;
                    case RULE_SIMPLE_ID:
                        {
                        int LA59_2 = input.LA(2);

                        if ( (LA59_2==EOF||LA59_2==18||LA59_2==20||LA59_2==26||(LA59_2>=29 && LA59_2<=30)||(LA59_2>=32 && LA59_2<=36)||LA59_2==38||(LA59_2>=49 && LA59_2<=50)||(LA59_2>=53 && LA59_2<=54)||(LA59_2>=56 && LA59_2<=67)||LA59_2==91||LA59_2==93) ) {
                            alt59=1;
                        }
                        else if ( (LA59_2==22) ) {
                            alt59=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 59, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ESCAPED_ID:
                        {
                        int LA59_3 = input.LA(2);

                        if ( (LA59_3==22) ) {
                            alt59=2;
                        }
                        else if ( (LA59_3==EOF||LA59_3==18||LA59_3==20||LA59_3==26||(LA59_3>=29 && LA59_3<=30)||(LA59_3>=32 && LA59_3<=36)||LA59_3==38||(LA59_3>=49 && LA59_3<=50)||(LA59_3>=53 && LA59_3<=54)||(LA59_3>=56 && LA59_3<=67)||LA59_3==91||LA59_3==93) ) {
                            alt59=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 59, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        alt59=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // InternalNCL.g:2780:7: lv_ownedInitExpression_2_1= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_2_1=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_1,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNCL.g:2796:7: lv_ownedInitExpression_2_2= rulePatternExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_0_2_0_1());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_2_2=rulePatternExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_2,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:2816:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    {
                    // InternalNCL.g:2816:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    // InternalNCL.g:2817:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    {
                    // InternalNCL.g:2817:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    // InternalNCL.g:2818:5: lv_ownedInitExpression_3_0= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionStringLiteralExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedInitExpression_3_0=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedInitExpression",
                      						lv_ownedInitExpression_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.StringLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShadowPartCS"


    // $ANTLR start "entryRulePatternExpCS"
    // InternalNCL.g:2839:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalNCL.g:2839:53: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalNCL.g:2840:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternExpCS"


    // $ANTLR start "rulePatternExpCS"
    // InternalNCL.g:2846:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2852:2: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalNCL.g:2853:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalNCL.g:2853:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalNCL.g:2854:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalNCL.g:2854:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_SIMPLE_ID && LA61_0<=RULE_ESCAPED_ID)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalNCL.g:2855:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalNCL.g:2855:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalNCL.g:2856:5: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_patternVariableName_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
                      					}
                      					set(
                      						current,
                      						"patternVariableName",
                      						lv_patternVariableName_0_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
              		
            }
            // InternalNCL.g:2877:3: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalNCL.g:2878:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalNCL.g:2878:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalNCL.g:2879:5: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedPatternType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
              					}
              					set(
              						current,
              						"ownedPatternType",
              						lv_ownedPatternType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePatternExpCS"


    // $ANTLR start "entryRuleLambdaLiteralExpCS"
    // InternalNCL.g:2900:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalNCL.g:2900:59: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalNCL.g:2901:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLambdaLiteralExpCS"


    // $ANTLR start "ruleLambdaLiteralExpCS"
    // InternalNCL.g:2907:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2913:2: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalNCL.g:2914:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalNCL.g:2914:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalNCL.g:2915:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNCL.g:2923:3: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalNCL.g:2924:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalNCL.g:2924:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalNCL.g:2925:5: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
            lv_ownedExpressionCS_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLambdaLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpressionCS",
              						lv_ownedExpressionCS_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLambdaLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLambdaLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralExpCS"
    // InternalNCL.g:2950:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalNCL.g:2950:56: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalNCL.g:2951:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralExpCS"


    // $ANTLR start "ruleMapLiteralExpCS"
    // InternalNCL.g:2957:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:2963:2: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNCL.g:2964:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNCL.g:2964:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNCL.g:2965:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNCL.g:2965:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalNCL.g:2966:4: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalNCL.g:2966:4: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalNCL.g:2967:5: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNCL.g:2988:3: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_SIMPLE_ID && LA63_0<=RULE_SINGLE_QUOTED_STRING)||LA63_0==28||LA63_0==32||(LA63_0>=54 && LA63_0<=56)||(LA63_0>=68 && LA63_0<=82)||LA63_0==85||(LA63_0>=87 && LA63_0<=90)||LA63_0==98||(LA63_0>=103 && LA63_0<=104)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalNCL.g:2989:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalNCL.g:2989:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalNCL.g:2990:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalNCL.g:2990:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalNCL.g:2991:6: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_ownedParts_2_0=ruleMapLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:3008:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==26) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalNCL.g:3009:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:3013:5: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalNCL.g:3014:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalNCL.g:3014:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalNCL.g:3015:7: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_ownedParts_4_0=ruleMapLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMapLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralPartCS"
    // InternalNCL.g:3042:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalNCL.g:3042:57: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalNCL.g:3043:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralPartCS"


    // $ANTLR start "ruleMapLiteralPartCS"
    // InternalNCL.g:3049:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3055:2: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalNCL.g:3056:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalNCL.g:3056:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalNCL.g:3057:3: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalNCL.g:3057:3: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalNCL.g:3058:4: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalNCL.g:3058:4: (lv_ownedKey_0_0= ruleExpCS )
            // InternalNCL.g:3059:5: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_48);
            lv_ownedKey_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedKey",
              						lv_ownedKey_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalNCL.g:3080:3: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalNCL.g:3081:4: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalNCL.g:3081:4: (lv_ownedValue_2_0= ruleExpCS )
            // InternalNCL.g:3082:5: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedValue_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedValue",
              						lv_ownedValue_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalNCL.g:3103:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalNCL.g:3103:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalNCL.g:3104:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalNCL.g:3110:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;



        	enterRule();

        try {
            // InternalNCL.g:3116:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalNCL.g:3117:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalNCL.g:3117:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt64=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt64=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt64=2;
                }
                break;
            case 87:
            case 88:
                {
                alt64=3;
                }
                break;
            case 56:
                {
                alt64=4;
                }
                break;
            case 89:
                {
                alt64=5;
                }
                break;
            case 90:
                {
                alt64=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalNCL.g:3118:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:3130:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:3142:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:3154:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnlimitedNaturalLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNCL.g:3166:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvalidLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNCL.g:3178:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalNCL.g:3193:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalNCL.g:3193:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalNCL.g:3194:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalNCL.g:3200:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3206:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalNCL.g:3207:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalNCL.g:3207:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalNCL.g:3208:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNCL.g:3216:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalNCL.g:3217:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalNCL.g:3217:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalNCL.g:3218:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              					}
              					add(
              						current,
              						"ownedParts",
              						lv_ownedParts_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:3235:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==26) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalNCL.g:3236:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalNCL.g:3240:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalNCL.g:3241:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalNCL.g:3241:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalNCL.g:3242:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedParts",
            	      							lv_ownedParts_4_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // InternalNCL.g:3268:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalNCL.g:3268:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalNCL.g:3269:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // InternalNCL.g:3275:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3281:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalNCL.g:3282:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalNCL.g:3282:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalNCL.g:3283:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalNCL.g:3283:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNCL.g:3284:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNCL.g:3284:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNCL.g:3285:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:3302:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==22) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalNCL.g:3303:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:3307:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalNCL.g:3308:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:3308:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalNCL.g:3309:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalNCL.g:3331:3: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalNCL.g:3332:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalNCL.g:3332:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalNCL.g:3333:5: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInitExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_4_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalNCL.g:3354:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalNCL.g:3354:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalNCL.g:3355:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalNCL.g:3361:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3367:2: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalNCL.g:3368:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalNCL.g:3368:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // InternalNCL.g:3369:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // InternalNCL.g:3369:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // InternalNCL.g:3370:4: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_symbol_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              				}
              				set(
              					current,
              					"symbol",
              					lv_symbol_0_0,
              					"org.eclipse.ocl.xtext.base.Base.NUMBER_LITERAL");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalNCL.g:3390:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalNCL.g:3390:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalNCL.g:3391:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalNCL.g:3397:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3403:2: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalNCL.g:3404:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalNCL.g:3404:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalNCL.g:3405:3: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalNCL.g:3405:3: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalNCL.g:3406:4: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    lv_segments_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      				}
            	      				add(
            	      					current,
            	      					"segments",
            	      					lv_segments_0_0,
            	      					"org.eclipse.ocl.xtext.base.Base.StringLiteral");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalNCL.g:3426:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalNCL.g:3426:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalNCL.g:3427:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalNCL.g:3433:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalNCL.g:3439:2: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalNCL.g:3440:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalNCL.g:3440:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==87) ) {
                alt68=1;
            }
            else if ( (LA68_0==88) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalNCL.g:3441:3: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalNCL.g:3441:3: ( (lv_symbol_0_0= 'true' ) )
                    // InternalNCL.g:3442:4: (lv_symbol_0_0= 'true' )
                    {
                    // InternalNCL.g:3442:4: (lv_symbol_0_0= 'true' )
                    // InternalNCL.g:3443:5: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:3456:3: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalNCL.g:3456:3: ( (lv_symbol_1_0= 'false' ) )
                    // InternalNCL.g:3457:4: (lv_symbol_1_0= 'false' )
                    {
                    // InternalNCL.g:3457:4: (lv_symbol_1_0= 'false' )
                    // InternalNCL.g:3458:5: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_1_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalNCL.g:3474:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalNCL.g:3474:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalNCL.g:3475:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalNCL.g:3481:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNCL.g:3487:2: ( ( () otherlv_1= '*' ) )
            // InternalNCL.g:3488:2: ( () otherlv_1= '*' )
            {
            // InternalNCL.g:3488:2: ( () otherlv_1= '*' )
            // InternalNCL.g:3489:3: () otherlv_1= '*'
            {
            // InternalNCL.g:3489:3: ()
            // InternalNCL.g:3490:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalNCL.g:3507:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalNCL.g:3507:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalNCL.g:3508:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalNCL.g:3514:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNCL.g:3520:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalNCL.g:3521:2: ( () otherlv_1= 'invalid' )
            {
            // InternalNCL.g:3521:2: ( () otherlv_1= 'invalid' )
            // InternalNCL.g:3522:3: () otherlv_1= 'invalid'
            {
            // InternalNCL.g:3522:3: ()
            // InternalNCL.g:3523:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalNCL.g:3540:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalNCL.g:3540:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalNCL.g:3541:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalNCL.g:3547:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNCL.g:3553:2: ( ( () otherlv_1= 'null' ) )
            // InternalNCL.g:3554:2: ( () otherlv_1= 'null' )
            {
            // InternalNCL.g:3554:2: ( () otherlv_1= 'null' )
            // InternalNCL.g:3555:3: () otherlv_1= 'null'
            {
            // InternalNCL.g:3555:3: ()
            // InternalNCL.g:3556:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalNCL.g:3573:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalNCL.g:3573:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalNCL.g:3574:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // InternalNCL.g:3580:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;



        	enterRule();

        try {
            // InternalNCL.g:3586:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalNCL.g:3587:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalNCL.g:3587:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt69=1;
                }
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt69=2;
                }
                break;
            case 68:
                {
                alt69=3;
                }
                break;
            case 69:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalNCL.g:3588:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:3600:3: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionTypeCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:3612:3: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MapTypeCS_2=ruleMapTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapTypeCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:3624:3: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleTypeCS_3=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTypeCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // InternalNCL.g:3639:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalNCL.g:3639:70: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalNCL.g:3640:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // InternalNCL.g:3646:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3652:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalNCL.g:3653:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalNCL.g:3653:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalNCL.g:3654:3: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_51);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeLiteralCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNCL.g:3665:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==93) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalNCL.g:3666:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalNCL.g:3666:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalNCL.g:3667:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // InternalNCL.g:3688:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalNCL.g:3688:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalNCL.g:3689:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // InternalNCL.g:3695:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3701:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalNCL.g:3702:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalNCL.g:3702:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalNCL.g:3703:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalNCL.g:3703:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalNCL.g:3704:4: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              				}
              				set(
              					current,
              					"ownedType",
              					lv_ownedType_0_0,
              					"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeLiteralWithMultiplicityCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalNCL.g:3724:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalNCL.g:3724:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalNCL.g:3725:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // InternalNCL.g:3731:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3737:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalNCL.g:3738:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalNCL.g:3738:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalNCL.g:3739:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalNCL.g:3739:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNCL.g:3740:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNCL.g:3740:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNCL.g:3741:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:3758:3: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==18) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalNCL.g:3759:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalNCL.g:3759:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalNCL.g:3760:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalNCL.g:3760:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalNCL.g:3761:6: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_ownedCurlyBracketedClause_1_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCurlyBracketedClause",
                      							lv_ownedCurlyBracketedClause_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:3778:4: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==18) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalNCL.g:3779:5: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalNCL.g:3783:5: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalNCL.g:3784:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalNCL.g:3784:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalNCL.g:3785:7: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
                            lv_ownedPatternGuard_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedPatternGuard",
                              								lv_ownedPatternGuard_3_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTypeNameExpCSAccess().getRightCurlyBracketKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpWithoutMultiplicityCS"
    // InternalNCL.g:3812:1: entryRuleTypeExpWithoutMultiplicityCS returns [EObject current=null] : iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF ;
    public final EObject entryRuleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpWithoutMultiplicityCS = null;


        try {
            // InternalNCL.g:3812:69: (iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF )
            // InternalNCL.g:3813:2: iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExpWithoutMultiplicityCS=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpWithoutMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "ruleTypeExpWithoutMultiplicityCS"
    // InternalNCL.g:3819:1: ruleTypeExpWithoutMultiplicityCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ;
    public final EObject ruleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;



        	enterRule();

        try {
            // InternalNCL.g:3825:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) )
            // InternalNCL.g:3826:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            {
            // InternalNCL.g:3826:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalNCL.g:3827:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeNameExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeNameExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:3839:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:3851:3: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getCollectionPatternCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionPatternCS_2=ruleCollectionPatternCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionPatternCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalNCL.g:3866:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalNCL.g:3866:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalNCL.g:3867:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // InternalNCL.g:3873:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpWithoutMultiplicityCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:3879:2: ( (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalNCL.g:3880:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalNCL.g:3880:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalNCL.g:3881:3: this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeExpWithoutMultiplicityCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_51);
            this_TypeExpWithoutMultiplicityCS_0=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeExpWithoutMultiplicityCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNCL.g:3892:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==93) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalNCL.g:3893:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalNCL.g:3893:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalNCL.g:3894:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleExpCS"
    // InternalNCL.g:3915:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalNCL.g:3915:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalNCL.g:3916:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // InternalNCL.g:3922:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;



        	enterRule();

        try {
            // InternalNCL.g:3928:2: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalNCL.g:3929:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalNCL.g:3929:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalNCL.g:3930:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalNCL.g:3930:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalNCL.g:3931:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrefixedPrimaryExpCS_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNCL.g:3942:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( ((LA75_0>=29 && LA75_0<=30)||(LA75_0>=33 && LA75_0<=36)||LA75_0==38||LA75_0==50||(LA75_0>=53 && LA75_0<=54)||(LA75_0>=56 && LA75_0<=67)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalNCL.g:3943:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalNCL.g:3943:5: ()
                            // InternalNCL.g:3944:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndSet(
                              							grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalNCL.g:3953:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // InternalNCL.g:3954:6: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // InternalNCL.g:3954:6: (lv_name_2_0= ruleBinaryOperatorName )
                            // InternalNCL.g:3955:7: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_43);
                            lv_name_2_0=ruleBinaryOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"name",
                              								lv_name_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.BinaryOperatorName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalNCL.g:3972:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalNCL.g:3973:6: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalNCL.g:3973:6: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalNCL.g:3974:7: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedRight_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedRight",
                              								lv_ownedRight_3_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:3994:3: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrefixedLetExpCS_4=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrefixedLetExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedLetExpCS"
    // InternalNCL.g:4009:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalNCL.g:4009:57: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalNCL.g:4010:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedLetExpCS"


    // $ANTLR start "rulePrefixedLetExpCS"
    // InternalNCL.g:4016:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;



        	enterRule();

        try {
            // InternalNCL.g:4022:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalNCL.g:4023:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalNCL.g:4023:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==28||(LA77_0>=54 && LA77_0<=55)) ) {
                alt77=1;
            }
            else if ( (LA77_0==103) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalNCL.g:4024:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalNCL.g:4024:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalNCL.g:4025:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalNCL.g:4025:4: ()
                    // InternalNCL.g:4026:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedLetExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNCL.g:4035:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalNCL.g:4036:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalNCL.g:4036:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalNCL.g:4037:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:4054:4: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalNCL.g:4055:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalNCL.g:4055:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalNCL.g:4056:6: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedLetExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:4075:3: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LetExpCS_3=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrefixedLetExpCS"


    // $ANTLR start "entryRulePrefixedPrimaryExpCS"
    // InternalNCL.g:4090:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalNCL.g:4090:61: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalNCL.g:4091:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedPrimaryExpCS"


    // $ANTLR start "rulePrefixedPrimaryExpCS"
    // InternalNCL.g:4097:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;



        	enterRule();

        try {
            // InternalNCL.g:4103:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalNCL.g:4104:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalNCL.g:4104:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==28||(LA78_0>=54 && LA78_0<=55)) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=RULE_SIMPLE_ID && LA78_0<=RULE_SINGLE_QUOTED_STRING)||LA78_0==32||LA78_0==56||(LA78_0>=68 && LA78_0<=82)||LA78_0==85||(LA78_0>=87 && LA78_0<=90)||LA78_0==98||LA78_0==104) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalNCL.g:4105:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalNCL.g:4105:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalNCL.g:4106:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalNCL.g:4106:4: ()
                    // InternalNCL.g:4107:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedPrimaryExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNCL.g:4116:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalNCL.g:4117:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalNCL.g:4117:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalNCL.g:4118:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:4135:4: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalNCL.g:4136:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalNCL.g:4136:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalNCL.g:4137:6: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedPrimaryExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:4156:3: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrefixedPrimaryExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalNCL.g:4171:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalNCL.g:4171:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalNCL.g:4172:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // InternalNCL.g:4178:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_SelfExpCS_2 = null;

        EObject this_PrimitiveLiteralExpCS_3 = null;

        EObject this_TupleLiteralExpCS_4 = null;

        EObject this_MapLiteralExpCS_5 = null;

        EObject this_CollectionLiteralExpCS_6 = null;

        EObject this_LambdaLiteralExpCS_7 = null;

        EObject this_TypeLiteralExpCS_8 = null;

        EObject this_NameExpCS_9 = null;



        	enterRule();

        try {
            // InternalNCL.g:4184:2: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) )
            // InternalNCL.g:4185:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            {
            // InternalNCL.g:4185:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            int alt79=10;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalNCL.g:4186:3: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:4198:3: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:4210:3: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SelfExpCS_2=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SelfExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNCL.g:4222:3: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveLiteralExpCS_3=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNCL.g:4234:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNCL.g:4246:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNCL.g:4258:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExpCS_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNCL.g:4270:3: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LambdaLiteralExpCS_7=ruleLambdaLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LambdaLiteralExpCS_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNCL.g:4282:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralExpCS_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNCL.g:4294:3: this_NameExpCS_9= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NameExpCS_9=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExpCS_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalNCL.g:4309:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalNCL.g:4309:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalNCL.g:4310:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // InternalNCL.g:4316:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_isPre_4_0=null;
        Token otherlv_5=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedSquareBracketedClauses_1_0 = null;

        EObject lv_ownedRoundBracketedClause_2_0 = null;

        EObject lv_ownedCurlyBracketedClause_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:4322:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // InternalNCL.g:4323:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // InternalNCL.g:4323:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // InternalNCL.g:4324:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // InternalNCL.g:4324:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNCL.g:4325:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNCL.g:4325:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNCL.g:4326:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:4343:3: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==93) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalNCL.g:4344:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalNCL.g:4344:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalNCL.g:4345:5: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_ownedSquareBracketedClauses_1_0=ruleSquareBracketedClauseCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedSquareBracketedClauses",
            	      						lv_ownedSquareBracketedClauses_1_0,
            	      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.SquareBracketedClauseCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // InternalNCL.g:4362:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==32) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalNCL.g:4363:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalNCL.g:4363:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalNCL.g:4364:5: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_2_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNCL.g:4381:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==18) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalNCL.g:4382:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalNCL.g:4382:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalNCL.g:4383:5: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
                    lv_ownedCurlyBracketedClause_3_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedCurlyBracketedClause",
                      						lv_ownedCurlyBracketedClause_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNCL.g:4400:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==91) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalNCL.g:4401:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // InternalNCL.g:4401:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalNCL.g:4402:5: (lv_isPre_4_0= '@' )
                    {
                    // InternalNCL.g:4402:5: (lv_isPre_4_0= '@' )
                    // InternalNCL.g:4403:6: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,91,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPre_4_0, grammarAccess.getNameExpCSAccess().getIsPreCommercialAtKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNameExpCSRule());
                      						}
                      						setWithLastConsumed(current, "isPre", true, "@");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNameExpCSAccess().getPreKeyword_4_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleCurlyBracketedClauseCS"
    // InternalNCL.g:4424:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalNCL.g:4424:63: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalNCL.g:4425:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCurlyBracketedClauseCS"


    // $ANTLR start "ruleCurlyBracketedClauseCS"
    // InternalNCL.g:4431:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:4437:2: ( ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNCL.g:4438:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNCL.g:4438:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNCL.g:4439:3: () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNCL.g:4439:3: ()
            // InternalNCL.g:4440:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCurlyBracketedClauseCSAccess().getCurlyBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNCL.g:4453:3: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_SIMPLE_ID && LA85_0<=RULE_ESCAPED_ID)||LA85_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalNCL.g:4454:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    {
                    // InternalNCL.g:4454:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                    // InternalNCL.g:4455:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    {
                    // InternalNCL.g:4455:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    // InternalNCL.g:4456:6: lv_ownedParts_2_0= ruleShadowPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_ownedParts_2_0=ruleShadowPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:4473:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==26) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalNCL.g:4474:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:4478:5: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    // InternalNCL.g:4479:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    {
                    	    // InternalNCL.g:4479:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    // InternalNCL.g:4480:7: lv_ownedParts_4_0= ruleShadowPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_ownedParts_4_0=ruleShadowPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCurlyBracketedClauseCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCurlyBracketedClauseCS"


    // $ANTLR start "entryRuleRoundBracketedClauseCS"
    // InternalNCL.g:4507:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalNCL.g:4507:63: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalNCL.g:4508:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRoundBracketedClauseCS"


    // $ANTLR start "ruleRoundBracketedClauseCS"
    // InternalNCL.g:4514:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedArguments_2_0 = null;

        EObject lv_ownedArguments_3_1 = null;

        EObject lv_ownedArguments_3_2 = null;

        EObject lv_ownedArguments_3_3 = null;



        	enterRule();

        try {
            // InternalNCL.g:4520:2: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) )
            // InternalNCL.g:4521:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            {
            // InternalNCL.g:4521:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            // InternalNCL.g:4522:3: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')'
            {
            // InternalNCL.g:4522:3: ()
            // InternalNCL.g:4523:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoundBracketedClauseCSAccess().getRoundBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalNCL.g:4536:3: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RULE_SIMPLE_ID && LA88_0<=RULE_SINGLE_QUOTED_STRING)||LA88_0==22||LA88_0==28||LA88_0==32||(LA88_0>=54 && LA88_0<=56)||(LA88_0>=68 && LA88_0<=82)||LA88_0==85||(LA88_0>=87 && LA88_0<=90)||LA88_0==98||(LA88_0>=103 && LA88_0<=104)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalNCL.g:4537:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    {
                    // InternalNCL.g:4537:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalNCL.g:4538:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalNCL.g:4538:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalNCL.g:4539:6: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_61);
                    lv_ownedArguments_2_0=ruleNavigatingArgCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedArguments",
                      							lv_ownedArguments_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:4556:4: ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==26||(LA87_0>=96 && LA87_0<=97)) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalNCL.g:4557:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    {
                    	    // InternalNCL.g:4557:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    // InternalNCL.g:4558:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalNCL.g:4558:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    int alt86=3;
                    	    switch ( input.LA(1) ) {
                    	    case 26:
                    	        {
                    	        alt86=1;
                    	        }
                    	        break;
                    	    case 97:
                    	        {
                    	        alt86=2;
                    	        }
                    	        break;
                    	    case 96:
                    	        {
                    	        alt86=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 86, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt86) {
                    	        case 1 :
                    	            // InternalNCL.g:4559:7: lv_ownedArguments_3_1= ruleNavigatingCommaArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_61);
                    	            lv_ownedArguments_3_1=ruleNavigatingCommaArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_1,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingCommaArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalNCL.g:4575:7: lv_ownedArguments_3_2= ruleNavigatingSemiArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_61);
                    	            lv_ownedArguments_3_2=ruleNavigatingSemiArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_2,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingSemiArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalNCL.g:4591:7: lv_ownedArguments_3_3= ruleNavigatingBarArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_1_0_2());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_61);
                    	            lv_ownedArguments_3_3=ruleNavigatingBarArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_3,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingBarArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoundBracketedClauseCSAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRoundBracketedClauseCS"


    // $ANTLR start "entryRuleSquareBracketedClauseCS"
    // InternalNCL.g:4618:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalNCL.g:4618:64: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalNCL.g:4619:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSquareBracketedClauseCS"


    // $ANTLR start "ruleSquareBracketedClauseCS"
    // InternalNCL.g:4625:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:4631:2: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalNCL.g:4632:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalNCL.g:4632:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalNCL.g:4633:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,93,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalNCL.g:4637:3: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalNCL.g:4638:4: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalNCL.g:4638:4: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalNCL.g:4639:5: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_62);
            lv_ownedTerms_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
              					}
              					add(
              						current,
              						"ownedTerms",
              						lv_ownedTerms_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:4656:3: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==26) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalNCL.g:4657:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNCL.g:4661:4: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalNCL.g:4662:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalNCL.g:4662:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalNCL.g:4663:6: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_ownedTerms_3_0=ruleExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedTerms",
            	      							lv_ownedTerms_3_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_4=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSquareBracketedClauseCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSquareBracketedClauseCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // InternalNCL.g:4689:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalNCL.g:4689:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalNCL.g:4690:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // InternalNCL.g:4696:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_ownedNameExpression_0_0 = null;

        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;

        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;

        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;

        EObject lv_ownedType_18_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:4702:2: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) )
            // InternalNCL.g:4703:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            {
            // InternalNCL.g:4703:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_SIMPLE_ID && LA96_0<=RULE_SINGLE_QUOTED_STRING)||LA96_0==28||LA96_0==32||(LA96_0>=54 && LA96_0<=56)||(LA96_0>=68 && LA96_0<=82)||LA96_0==85||(LA96_0>=87 && LA96_0<=90)||LA96_0==98||(LA96_0>=103 && LA96_0<=104)) ) {
                alt96=1;
            }
            else if ( (LA96_0==22) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalNCL.g:4704:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalNCL.g:4704:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    // InternalNCL.g:4705:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    {
                    // InternalNCL.g:4705:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalNCL.g:4706:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalNCL.g:4706:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalNCL.g:4707:6: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
                    lv_ownedNameExpression_0_0=ruleNavigatingArgExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedNameExpression",
                      							lv_ownedNameExpression_0_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:4724:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    int alt95=4;
                    alt95 = dfa95.predict(input);
                    switch (alt95) {
                        case 1 :
                            // InternalNCL.g:4725:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalNCL.g:4725:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalNCL.g:4726:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_0_0());
                              					
                            }
                            // InternalNCL.g:4730:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
                            // InternalNCL.g:4731:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNCL.g:4731:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            // InternalNCL.g:4732:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_64);
                            lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_2_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalNCL.g:4749:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==35) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // InternalNCL.g:4750:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                      						
                                    }
                                    // InternalNCL.g:4754:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalNCL.g:4755:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalNCL.g:4755:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalNCL.g:4756:9: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_ownedInitExpression_4_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_4_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalNCL.g:4776:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            {
                            // InternalNCL.g:4776:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            // InternalNCL.g:4777:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            {
                            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_1_0());
                              					
                            }
                            // InternalNCL.g:4781:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
                            // InternalNCL.g:4782:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            {
                            // InternalNCL.g:4782:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            // InternalNCL.g:4783:8: lv_ownedType_6_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_65);
                            lv_ownedType_6_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_6_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalNCL.g:4800:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==86) ) {
                                alt91=1;
                            }
                            switch (alt91) {
                                case 1 :
                                    // InternalNCL.g:4801:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_7=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_1_2_0());
                                      						
                                    }
                                    // InternalNCL.g:4805:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    // InternalNCL.g:4806:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalNCL.g:4806:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    // InternalNCL.g:4807:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_64);
                                    lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_8_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalNCL.g:4825:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==35) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // InternalNCL.g:4826:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    {
                                    otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_9, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_1_3_0());
                                      						
                                    }
                                    // InternalNCL.g:4830:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    // InternalNCL.g:4831:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    {
                                    // InternalNCL.g:4831:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    // InternalNCL.g:4832:9: lv_ownedInitExpression_10_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_ownedInitExpression_10_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_10_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalNCL.g:4852:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            {
                            // InternalNCL.g:4852:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            // InternalNCL.g:4853:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            {
                            // InternalNCL.g:4853:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
                            int alt93=2;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==22) ) {
                                alt93=1;
                            }
                            switch (alt93) {
                                case 1 :
                                    // InternalNCL.g:4854:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    {
                                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_11, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_2_0_0());
                                      						
                                    }
                                    // InternalNCL.g:4858:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    // InternalNCL.g:4859:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    {
                                    // InternalNCL.g:4859:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    // InternalNCL.g:4860:9: lv_ownedType_12_0= ruleTypeExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_66);
                                    lv_ownedType_12_0=ruleTypeExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedType",
                                      										lv_ownedType_12_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalNCL.g:4878:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==86) ) {
                                alt94=1;
                            }
                            switch (alt94) {
                                case 1 :
                                    // InternalNCL.g:4879:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_13=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_13, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_2_1_0());
                                      						
                                    }
                                    // InternalNCL.g:4883:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    // InternalNCL.g:4884:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalNCL.g:4884:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    // InternalNCL.g:4885:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_67);
                                    lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_14_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_15=(Token)match(input,95,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_2_2());
                              					
                            }
                            // InternalNCL.g:4907:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            // InternalNCL.g:4908:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            {
                            // InternalNCL.g:4908:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            // InternalNCL.g:4909:8: lv_ownedInitExpression_16_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_16_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_16_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:4930:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    {
                    // InternalNCL.g:4930:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    // InternalNCL.g:4931:4: otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    {
                    otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:4935:4: ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    // InternalNCL.g:4936:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:4936:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    // InternalNCL.g:4937:6: lv_ownedType_18_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedType_18_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_18_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // InternalNCL.g:4959:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalNCL.g:4959:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalNCL.g:4960:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // InternalNCL.g:4966:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:4972:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalNCL.g:4973:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalNCL.g:4973:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalNCL.g:4974:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalNCL.g:4974:3: ( (lv_prefix_0_0= '|' ) )
            // InternalNCL.g:4975:4: (lv_prefix_0_0= '|' )
            {
            // InternalNCL.g:4975:4: (lv_prefix_0_0= '|' )
            // InternalNCL.g:4976:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,96,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              				
            }

            }


            }

            // InternalNCL.g:4988:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNCL.g:4989:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNCL.g:4989:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNCL.g:4990:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_68);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:5007:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==22) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalNCL.g:5008:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNCL.g:5012:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNCL.g:5013:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:5013:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNCL.g:5014:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:5031:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==35) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalNCL.g:5032:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalNCL.g:5036:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNCL.g:5037:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNCL.g:5037:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNCL.g:5038:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // InternalNCL.g:5061:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalNCL.g:5061:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalNCL.g:5062:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // InternalNCL.g:5068:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;

        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;

        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5074:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) )
            // InternalNCL.g:5075:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            {
            // InternalNCL.g:5075:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            // InternalNCL.g:5076:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            {
            // InternalNCL.g:5076:3: ( (lv_prefix_0_0= ',' ) )
            // InternalNCL.g:5077:4: (lv_prefix_0_0= ',' )
            {
            // InternalNCL.g:5077:4: (lv_prefix_0_0= ',' )
            // InternalNCL.g:5078:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,26,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              				
            }

            }


            }

            // InternalNCL.g:5090:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNCL.g:5091:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNCL.g:5091:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNCL.g:5092:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_63);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:5109:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            int alt104=4;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalNCL.g:5110:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalNCL.g:5110:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalNCL.g:5111:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_0_0());
                      				
                    }
                    // InternalNCL.g:5115:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
                    // InternalNCL.g:5116:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    {
                    // InternalNCL.g:5116:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    // InternalNCL.g:5117:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
                    lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedCoIterator",
                      								lv_ownedCoIterator_3_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalNCL.g:5134:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==35) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalNCL.g:5135:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                              					
                            }
                            // InternalNCL.g:5139:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNCL.g:5140:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNCL.g:5140:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNCL.g:5141:8: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_5_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNCL.g:5161:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    {
                    // InternalNCL.g:5161:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    // InternalNCL.g:5162:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    {
                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_1_0());
                      				
                    }
                    // InternalNCL.g:5166:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalNCL.g:5167:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:5167:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalNCL.g:5168:7: lv_ownedType_7_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_65);
                    lv_ownedType_7_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedType",
                      								lv_ownedType_7_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalNCL.g:5185:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==86) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalNCL.g:5186:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_8=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_1_2_0());
                              					
                            }
                            // InternalNCL.g:5190:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            // InternalNCL.g:5191:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNCL.g:5191:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            // InternalNCL.g:5192:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_64);
                            lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_9_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalNCL.g:5210:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==35) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalNCL.g:5211:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            {
                            otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_1_3_0());
                              					
                            }
                            // InternalNCL.g:5215:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            // InternalNCL.g:5216:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            {
                            // InternalNCL.g:5216:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            // InternalNCL.g:5217:8: lv_ownedInitExpression_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_11_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_11_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNCL.g:5237:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    {
                    // InternalNCL.g:5237:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    // InternalNCL.g:5238:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    {
                    // InternalNCL.g:5238:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==22) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalNCL.g:5239:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            {
                            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_12, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_2_0_0());
                              					
                            }
                            // InternalNCL.g:5243:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            // InternalNCL.g:5244:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            {
                            // InternalNCL.g:5244:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            // InternalNCL.g:5245:8: lv_ownedType_13_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_66);
                            lv_ownedType_13_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_13_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalNCL.g:5263:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==86) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalNCL.g:5264:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_14=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_14, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_2_1_0());
                              					
                            }
                            // InternalNCL.g:5268:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            // InternalNCL.g:5269:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNCL.g:5269:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            // InternalNCL.g:5270:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_67);
                            lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_15_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,95,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_16, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_2_2());
                      				
                    }
                    // InternalNCL.g:5292:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    // InternalNCL.g:5293:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    {
                    // InternalNCL.g:5293:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    // InternalNCL.g:5294:7: lv_ownedInitExpression_17_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedInitExpression_17_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedInitExpression",
                      								lv_ownedInitExpression_17_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // InternalNCL.g:5317:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalNCL.g:5317:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalNCL.g:5318:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // InternalNCL.g:5324:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5330:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalNCL.g:5331:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalNCL.g:5331:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalNCL.g:5332:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalNCL.g:5332:3: ( (lv_prefix_0_0= ';' ) )
            // InternalNCL.g:5333:4: (lv_prefix_0_0= ';' )
            {
            // InternalNCL.g:5333:4: (lv_prefix_0_0= ';' )
            // InternalNCL.g:5334:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,97,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              				
            }

            }


            }

            // InternalNCL.g:5346:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNCL.g:5347:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNCL.g:5347:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNCL.g:5348:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_68);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:5365:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==22) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalNCL.g:5366:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNCL.g:5370:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNCL.g:5371:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:5371:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNCL.g:5372:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:5389:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==35) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalNCL.g:5390:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalNCL.g:5394:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNCL.g:5395:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNCL.g:5395:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNCL.g:5396:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalNCL.g:5419:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalNCL.g:5419:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalNCL.g:5420:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // InternalNCL.g:5426:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5432:2: (this_ExpCS_0= ruleExpCS )
            // InternalNCL.g:5433:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpCS_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleCoIteratorVariableCS"
    // InternalNCL.g:5447:1: entryRuleCoIteratorVariableCS returns [EObject current=null] : iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF ;
    public final EObject entryRuleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoIteratorVariableCS = null;


        try {
            // InternalNCL.g:5447:61: (iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF )
            // InternalNCL.g:5448:2: iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoIteratorVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCoIteratorVariableCS=ruleCoIteratorVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoIteratorVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCoIteratorVariableCS"


    // $ANTLR start "ruleCoIteratorVariableCS"
    // InternalNCL.g:5454:1: ruleCoIteratorVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5460:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // InternalNCL.g:5461:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // InternalNCL.g:5461:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // InternalNCL.g:5462:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // InternalNCL.g:5462:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNCL.g:5463:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNCL.g:5463:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNCL.g:5464:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_68);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:5481:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==22) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalNCL.g:5482:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCoIteratorVariableCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:5486:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalNCL.g:5487:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:5487:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalNCL.g:5488:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCoIteratorVariableCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalNCL.g:5510:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalNCL.g:5510:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalNCL.g:5511:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalNCL.g:5517:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_1 = null;

        EObject lv_ownedCondition_1_2 = null;

        EObject lv_ownedThenExpression_3_0 = null;

        EObject lv_ownedIfThenExpressions_4_0 = null;

        EObject lv_ownedElseExpression_6_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5523:2: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalNCL.g:5524:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalNCL.g:5524:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalNCL.g:5525:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalNCL.g:5529:3: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalNCL.g:5530:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalNCL.g:5530:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalNCL.g:5531:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalNCL.g:5531:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt108=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 28:
            case 32:
            case 54:
            case 55:
            case 56:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 85:
            case 87:
            case 88:
            case 89:
            case 90:
            case 98:
            case 103:
            case 104:
                {
                alt108=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA108_2 = input.LA(2);

                if ( (LA108_2==18||(LA108_2>=29 && LA108_2<=30)||(LA108_2>=32 && LA108_2<=36)||LA108_2==38||(LA108_2>=49 && LA108_2<=50)||(LA108_2>=53 && LA108_2<=54)||(LA108_2>=56 && LA108_2<=67)||LA108_2==91||LA108_2==93||LA108_2==99) ) {
                    alt108=1;
                }
                else if ( (LA108_2==22) ) {
                    alt108=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA108_3 = input.LA(2);

                if ( (LA108_3==18||(LA108_3>=29 && LA108_3<=30)||(LA108_3>=32 && LA108_3<=36)||LA108_3==38||(LA108_3>=49 && LA108_3<=50)||(LA108_3>=53 && LA108_3<=54)||(LA108_3>=56 && LA108_3<=67)||LA108_3==91||LA108_3==93||LA108_3==99) ) {
                    alt108=1;
                }
                else if ( (LA108_3==22) ) {
                    alt108=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt108=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalNCL.g:5532:6: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
                    lv_ownedCondition_1_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_1,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:5548:6: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
                    lv_ownedCondition_1_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_2,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,99,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalNCL.g:5570:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalNCL.g:5571:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalNCL.g:5571:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalNCL.g:5572:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_70);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:5589:3: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==102) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalNCL.g:5590:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalNCL.g:5590:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalNCL.g:5591:5: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_70);
            	    lv_ownedIfThenExpressions_4_0=ruleElseIfThenExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedIfThenExpressions",
            	      						lv_ownedIfThenExpressions_4_0,
            	      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ElseIfThenExpCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            otherlv_5=(Token)match(input,100,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
              		
            }
            // InternalNCL.g:5612:3: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalNCL.g:5613:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalNCL.g:5613:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalNCL.g:5614:5: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_71);
            lv_ownedElseExpression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedElseExpression",
              						lv_ownedElseExpression_6_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpCSAccess().getEndifKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleElseIfThenExpCS"
    // InternalNCL.g:5639:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalNCL.g:5639:56: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalNCL.g:5640:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseIfThenExpCS"


    // $ANTLR start "ruleElseIfThenExpCS"
    // InternalNCL.g:5646:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5652:2: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalNCL.g:5653:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalNCL.g:5653:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalNCL.g:5654:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,102,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
              		
            }
            // InternalNCL.g:5658:3: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalNCL.g:5659:4: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalNCL.g:5659:4: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalNCL.g:5660:5: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_69);
            lv_ownedCondition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedCondition",
              						lv_ownedCondition_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,99,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalNCL.g:5681:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalNCL.g:5682:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalNCL.g:5682:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalNCL.g:5683:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleElseIfThenExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalNCL.g:5704:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalNCL.g:5704:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalNCL.g:5705:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalNCL.g:5711:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedVariables_1_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedInExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5717:2: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalNCL.g:5718:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalNCL.g:5718:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalNCL.g:5719:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,103,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalNCL.g:5723:3: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalNCL.g:5724:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalNCL.g:5724:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalNCL.g:5725:5: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_72);
            lv_ownedVariables_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					add(
              						current,
              						"ownedVariables",
              						lv_ownedVariables_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:5742:3: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==26) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalNCL.g:5743:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNCL.g:5747:4: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalNCL.g:5748:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalNCL.g:5748:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalNCL.g:5749:6: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_ownedVariables_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedVariables",
            	      							lv_ownedVariables_3_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            otherlv_4=(Token)match(input,95,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalNCL.g:5771:3: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalNCL.g:5772:4: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalNCL.g:5772:4: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalNCL.g:5773:5: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					set(
              						current,
              						"ownedInExpression",
              						lv_ownedInExpression_5_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // InternalNCL.g:5794:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalNCL.g:5794:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalNCL.g:5795:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // InternalNCL.g:5801:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRoundBracketedClause_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5807:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalNCL.g:5808:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalNCL.g:5808:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalNCL.g:5809:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalNCL.g:5809:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNCL.g:5810:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNCL.g:5810:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNCL.g:5811:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_73);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:5828:3: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==32) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalNCL.g:5829:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalNCL.g:5829:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalNCL.g:5830:5: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
                    lv_ownedRoundBracketedClause_1_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_1_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNCL.g:5847:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==22) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalNCL.g:5848:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNCL.g:5852:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNCL.g:5853:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNCL.g:5853:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNCL.g:5854:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalNCL.g:5876:3: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalNCL.g:5877:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalNCL.g:5877:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalNCL.g:5878:5: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInitExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_5_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalNCL.g:5899:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalNCL.g:5899:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalNCL.g:5900:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalNCL.g:5906:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5912:2: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalNCL.g:5913:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalNCL.g:5913:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalNCL.g:5914:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalNCL.g:5918:3: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalNCL.g:5919:4: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalNCL.g:5919:4: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalNCL.g:5920:5: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_ownedExpression_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpression",
              						lv_ownedExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // InternalNCL.g:5945:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalNCL.g:5945:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalNCL.g:5946:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // InternalNCL.g:5952:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNCL.g:5958:2: ( ( () otherlv_1= 'self' ) )
            // InternalNCL.g:5959:2: ( () otherlv_1= 'self' )
            {
            // InternalNCL.g:5959:2: ( () otherlv_1= 'self' )
            // InternalNCL.g:5960:3: () otherlv_1= 'self'
            {
            // InternalNCL.g:5960:3: ()
            // InternalNCL.g:5961:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,104,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // InternalNCL.g:5978:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalNCL.g:5978:61: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalNCL.g:5979:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // InternalNCL.g:5985:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:5991:2: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalNCL.g:5992:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalNCL.g:5992:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalNCL.g:5993:3: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalNCL.g:5993:3: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalNCL.g:5994:4: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalNCL.g:5994:4: (lv_lowerBound_0_0= ruleLOWER )
            // InternalNCL.g:5995:5: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              					}
              					set(
              						current,
              						"lowerBound",
              						lv_lowerBound_0_0,
              						"org.eclipse.ocl.xtext.base.Base.LOWER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:6012:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==83) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalNCL.g:6013:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:6017:4: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalNCL.g:6018:5: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalNCL.g:6018:5: (lv_upperBound_2_0= ruleUPPER )
                    // InternalNCL.g:6019:6: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.UPPER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // InternalNCL.g:6041:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalNCL.g:6041:55: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalNCL.g:6042:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // InternalNCL.g:6048:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_isNullFree_4_0=null;
        Token otherlv_5=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;



        	enterRule();

        try {
            // InternalNCL.g:6054:2: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) )
            // InternalNCL.g:6055:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            {
            // InternalNCL.g:6055:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            // InternalNCL.g:6056:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,93,FollowSets000.FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalNCL.g:6060:3: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_INT) ) {
                alt114=1;
            }
            else if ( (LA114_0==56||LA114_0==58||LA114_0==107) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalNCL.g:6061:4: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityBoundsCS_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:6073:4: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityStringCS_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalNCL.g:6085:3: (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )?
            int alt115=3;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==105) ) {
                alt115=1;
            }
            else if ( (LA115_0==106) ) {
                alt115=2;
            }
            switch (alt115) {
                case 1 :
                    // InternalNCL.g:6086:4: otherlv_3= '|?'
                    {
                    otherlv_3=(Token)match(input,105,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:6091:4: ( (lv_isNullFree_4_0= '|1' ) )
                    {
                    // InternalNCL.g:6091:4: ( (lv_isNullFree_4_0= '|1' ) )
                    // InternalNCL.g:6092:5: (lv_isNullFree_4_0= '|1' )
                    {
                    // InternalNCL.g:6092:5: (lv_isNullFree_4_0= '|1' )
                    // InternalNCL.g:6093:6: lv_isNullFree_4_0= '|1'
                    {
                    lv_isNullFree_4_0=(Token)match(input,106,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isNullFree_4_0, grammarAccess.getMultiplicityCSAccess().getIsNullFree1Keyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultiplicityCSRule());
                      						}
                      						setWithLastConsumed(current, "isNullFree", true, "|1");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // InternalNCL.g:6114:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalNCL.g:6114:61: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalNCL.g:6115:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // InternalNCL.g:6121:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;


        	enterRule();

        try {
            // InternalNCL.g:6127:2: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalNCL.g:6128:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalNCL.g:6128:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalNCL.g:6129:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalNCL.g:6129:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalNCL.g:6130:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalNCL.g:6130:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt116=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt116=1;
                }
                break;
            case 58:
                {
                alt116=2;
                }
                break;
            case 107:
                {
                alt116=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalNCL.g:6131:5: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:6142:5: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalNCL.g:6153:5: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,107,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRulePathNameCS"
    // InternalNCL.g:6169:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalNCL.g:6169:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalNCL.g:6170:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // InternalNCL.g:6176:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6182:2: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalNCL.g:6183:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalNCL.g:6183:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalNCL.g:6184:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalNCL.g:6184:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // InternalNCL.g:6185:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // InternalNCL.g:6185:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // InternalNCL.g:6186:5: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_ownedPathElements_0_0=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              					}
              					add(
              						current,
              						"ownedPathElements",
              						lv_ownedPathElements_0_0,
              						"org.eclipse.ocl.xtext.base.Base.FirstPathElementCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:6203:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==49) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalNCL.g:6204:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalNCL.g:6208:4: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalNCL.g:6209:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalNCL.g:6209:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalNCL.g:6210:6: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedPathElements",
            	      							lv_ownedPathElements_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.NextPathElementCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleFirstPathElementCS"
    // InternalNCL.g:6232:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // InternalNCL.g:6232:59: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // InternalNCL.g:6233:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFirstPathElementCS"


    // $ANTLR start "ruleFirstPathElementCS"
    // InternalNCL.g:6239:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNCL.g:6245:2: ( ( ( ruleUnrestrictedName ) ) )
            // InternalNCL.g:6246:2: ( ( ruleUnrestrictedName ) )
            {
            // InternalNCL.g:6246:2: ( ( ruleUnrestrictedName ) )
            // InternalNCL.g:6247:3: ( ruleUnrestrictedName )
            {
            // InternalNCL.g:6247:3: ( ruleUnrestrictedName )
            // InternalNCL.g:6248:4: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFirstPathElementCSRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFirstPathElementCS"


    // $ANTLR start "entryRuleNextPathElementCS"
    // InternalNCL.g:6268:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // InternalNCL.g:6268:58: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // InternalNCL.g:6269:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNextPathElementCS"


    // $ANTLR start "ruleNextPathElementCS"
    // InternalNCL.g:6275:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNCL.g:6281:2: ( ( ( ruleUnreservedName ) ) )
            // InternalNCL.g:6282:2: ( ( ruleUnreservedName ) )
            {
            // InternalNCL.g:6282:2: ( ( ruleUnreservedName ) )
            // InternalNCL.g:6283:3: ( ruleUnreservedName )
            {
            // InternalNCL.g:6283:3: ( ruleUnreservedName )
            // InternalNCL.g:6284:4: ruleUnreservedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNextPathElementCSRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNextPathElementCSAccess().getReferredElementNamedElementCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNextPathElementCS"


    // $ANTLR start "entryRuleTemplateBindingCS"
    // InternalNCL.g:6304:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // InternalNCL.g:6304:58: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // InternalNCL.g:6305:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateBindingCS"


    // $ANTLR start "ruleTemplateBindingCS"
    // InternalNCL.g:6311:1: ruleTemplateBindingCS returns [EObject current=null] : ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedSubstitutions_0_0 = null;

        EObject lv_ownedSubstitutions_2_0 = null;

        EObject lv_ownedMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6317:2: ( ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // InternalNCL.g:6318:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // InternalNCL.g:6318:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // InternalNCL.g:6319:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // InternalNCL.g:6319:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) )
            // InternalNCL.g:6320:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            {
            // InternalNCL.g:6320:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            // InternalNCL.g:6321:5: lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_78);
            lv_ownedSubstitutions_0_0=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
              					}
              					add(
              						current,
              						"ownedSubstitutions",
              						lv_ownedSubstitutions_0_0,
              						"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:6338:3: (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==26) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalNCL.g:6339:4: otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalNCL.g:6343:4: ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    // InternalNCL.g:6344:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // InternalNCL.g:6344:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    // InternalNCL.g:6345:6: lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
            	    lv_ownedSubstitutions_2_0=ruleTemplateParameterSubstitutionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedSubstitutions",
            	      							lv_ownedSubstitutions_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            // InternalNCL.g:6363:3: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==93) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalNCL.g:6364:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // InternalNCL.g:6364:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // InternalNCL.g:6365:5: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_3_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_3_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTemplateBindingCS"


    // $ANTLR start "entryRuleTemplateParameterSubstitutionCS"
    // InternalNCL.g:6386:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // InternalNCL.g:6386:72: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // InternalNCL.g:6387:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateParameterSubstitutionCS"


    // $ANTLR start "ruleTemplateParameterSubstitutionCS"
    // InternalNCL.g:6393:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6399:2: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // InternalNCL.g:6400:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // InternalNCL.g:6400:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // InternalNCL.g:6401:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // InternalNCL.g:6401:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // InternalNCL.g:6402:4: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedActualParameter_0_0=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTemplateParameterSubstitutionCSRule());
              				}
              				set(
              					current,
              					"ownedActualParameter",
              					lv_ownedActualParameter_0_0,
              					"org.eclipse.ocl.xtext.base.Base.TypeRefCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTemplateParameterSubstitutionCS"


    // $ANTLR start "entryRuleTypeParameterCS"
    // InternalNCL.g:6422:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // InternalNCL.g:6422:56: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // InternalNCL.g:6423:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeParameterCS"


    // $ANTLR start "ruleTypeParameterCS"
    // InternalNCL.g:6429:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6435:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // InternalNCL.g:6436:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // InternalNCL.g:6436:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // InternalNCL.g:6437:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // InternalNCL.g:6437:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNCL.g:6438:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNCL.g:6438:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNCL.g:6439:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_80);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:6456:3: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==25) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalNCL.g:6457:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:6461:4: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // InternalNCL.g:6462:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // InternalNCL.g:6462:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // InternalNCL.g:6463:6: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_81);
                    lv_ownedExtends_2_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedExtends",
                      							lv_ownedExtends_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNCL.g:6480:4: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==108) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalNCL.g:6481:5: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,108,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalNCL.g:6485:5: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // InternalNCL.g:6486:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // InternalNCL.g:6486:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // InternalNCL.g:6487:7: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_81);
                    	    lv_ownedExtends_4_0=ruleTypedRefCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedExtends",
                    	      								lv_ownedExtends_4_0,
                    	      								"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeParameterCS"


    // $ANTLR start "entryRuleTypeRefCS"
    // InternalNCL.g:6510:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // InternalNCL.g:6510:50: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // InternalNCL.g:6511:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeRefCS"


    // $ANTLR start "ruleTypeRefCS"
    // InternalNCL.g:6517:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;



        	enterRule();

        try {
            // InternalNCL.g:6523:2: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // InternalNCL.g:6524:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // InternalNCL.g:6524:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=RULE_SIMPLE_ID && LA122_0<=RULE_ESCAPED_ID)) ) {
                alt122=1;
            }
            else if ( (LA122_0==107) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalNCL.g:6525:3: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedRefCS_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedRefCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:6537:3: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WildcardTypeRefCS_1=ruleWildcardTypeRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WildcardTypeRefCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeRefCS"


    // $ANTLR start "entryRuleTypedRefCS"
    // InternalNCL.g:6552:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // InternalNCL.g:6552:51: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // InternalNCL.g:6553:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedRefCS"


    // $ANTLR start "ruleTypedRefCS"
    // InternalNCL.g:6559:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6565:2: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // InternalNCL.g:6566:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_TypedTypeRefCS_0=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_TypedTypeRefCS_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypedRefCS"


    // $ANTLR start "entryRuleTypedTypeRefCS"
    // InternalNCL.g:6580:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // InternalNCL.g:6580:55: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // InternalNCL.g:6581:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedTypeRefCS"


    // $ANTLR start "ruleTypedTypeRefCS"
    // InternalNCL.g:6587:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_2_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6593:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) )
            // InternalNCL.g:6594:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            {
            // InternalNCL.g:6594:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            // InternalNCL.g:6595:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            {
            // InternalNCL.g:6595:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNCL.g:6596:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNCL.g:6596:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNCL.g:6597:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNCL.g:6614:3: (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==32) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalNCL.g:6615:4: otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypedTypeRefCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNCL.g:6619:4: ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) )
                    // InternalNCL.g:6620:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    {
                    // InternalNCL.g:6620:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    // InternalNCL.g:6621:6: lv_ownedBinding_2_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_ownedBinding_2_0=ruleTemplateBindingCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedBinding",
                      							lv_ownedBinding_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.TemplateBindingCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypedTypeRefCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypedTypeRefCS"


    // $ANTLR start "entryRuleWildcardTypeRefCS"
    // InternalNCL.g:6647:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // InternalNCL.g:6647:58: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // InternalNCL.g:6648:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWildcardTypeRefCS"


    // $ANTLR start "ruleWildcardTypeRefCS"
    // InternalNCL.g:6654:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6660:2: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // InternalNCL.g:6661:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // InternalNCL.g:6661:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // InternalNCL.g:6662:3: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // InternalNCL.g:6662:3: ()
            // InternalNCL.g:6663:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWildcardTypeRefCSAccess().getWildcardTypeRefCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,107,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalNCL.g:6676:3: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==25) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalNCL.g:6677:4: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalNCL.g:6681:4: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // InternalNCL.g:6682:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // InternalNCL.g:6682:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // InternalNCL.g:6683:6: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedExtends_3_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWildcardTypeRefCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExtends",
                      							lv_ownedExtends_3_0,
                      							"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWildcardTypeRefCS"


    // $ANTLR start "entryRuleID"
    // InternalNCL.g:6705:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // InternalNCL.g:6705:42: (iv_ruleID= ruleID EOF )
            // InternalNCL.g:6706:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // InternalNCL.g:6712:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;


        	enterRule();

        try {
            // InternalNCL.g:6718:2: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // InternalNCL.g:6719:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // InternalNCL.g:6719:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_SIMPLE_ID) ) {
                alt125=1;
            }
            else if ( (LA125_0==RULE_ESCAPED_ID) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalNCL.g:6720:3: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SIMPLE_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:6728:3: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ESCAPED_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ESCAPED_ID_1, grammarAccess.getIDAccess().getESCAPED_IDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleIdentifier"
    // InternalNCL.g:6739:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalNCL.g:6739:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalNCL.g:6740:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalNCL.g:6746:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;



        	enterRule();

        try {
            // InternalNCL.g:6752:2: (this_ID_0= ruleID )
            // InternalNCL.g:6753:2: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ID_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleLOWER"
    // InternalNCL.g:6766:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalNCL.g:6766:45: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalNCL.g:6767:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // InternalNCL.g:6773:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalNCL.g:6779:2: (this_INT_0= RULE_INT )
            // InternalNCL.g:6780:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // InternalNCL.g:6790:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalNCL.g:6790:54: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalNCL.g:6791:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // InternalNCL.g:6797:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalNCL.g:6803:2: (this_INT_0= RULE_INT )
            // InternalNCL.g:6804:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalNCL.g:6814:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalNCL.g:6814:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalNCL.g:6815:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalNCL.g:6821:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalNCL.g:6827:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalNCL.g:6828:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleUPPER"
    // InternalNCL.g:6838:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalNCL.g:6838:45: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalNCL.g:6839:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // InternalNCL.g:6845:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalNCL.g:6851:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalNCL.g:6852:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalNCL.g:6852:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_INT) ) {
                alt126=1;
            }
            else if ( (LA126_0==56) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalNCL.g:6853:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNCL.g:6861:3: kw= '*'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleURI"
    // InternalNCL.g:6870:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // InternalNCL.g:6870:43: (iv_ruleURI= ruleURI EOF )
            // InternalNCL.g:6871:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // InternalNCL.g:6877:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalNCL.g:6883:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalNCL.g:6884:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getURIAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleURI"

    // $ANTLR start synpred12_InternalNCL
    public final void synpred12_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedConditions_3_0 = null;


        // InternalNCL.g:473:4: ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )
        // InternalNCL.g:473:4: (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) )
        {
        // InternalNCL.g:473:4: (otherlv_1= 'or' | otherlv_2= 'and' )?
        int alt128=3;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==29) ) {
            alt128=1;
        }
        else if ( (LA128_0==30) ) {
            alt128=2;
        }
        switch (alt128) {
            case 1 :
                // InternalNCL.g:474:5: otherlv_1= 'or'
                {
                otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_16); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNCL.g:479:5: otherlv_2= 'and'
                {
                otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_16); if (state.failed) return ;

                }
                break;

        }

        // InternalNCL.g:484:4: ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) )
        // InternalNCL.g:485:5: (lv_ownedConditions_3_0= ruleHomoConditionCS )
        {
        // InternalNCL.g:485:5: (lv_ownedConditions_3_0= ruleHomoConditionCS )
        // InternalNCL.g:486:6: lv_ownedConditions_3_0= ruleHomoConditionCS
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getHomoStatementCSAccess().getOwnedConditionsHomoConditionCSParserRuleCall_1_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedConditions_3_0=ruleHomoConditionCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalNCL

    // $ANTLR start synpred36_InternalNCL
    public final void synpred36_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedConditions_3_0 = null;


        // InternalNCL.g:923:4: ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )
        // InternalNCL.g:923:4: (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) )
        {
        // InternalNCL.g:923:4: (otherlv_1= 'or' | otherlv_2= 'and' )?
        int alt132=3;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==29) ) {
            alt132=1;
        }
        else if ( (LA132_0==30) ) {
            alt132=2;
        }
        switch (alt132) {
            case 1 :
                // InternalNCL.g:924:5: otherlv_1= 'or'
                {
                otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_16); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNCL.g:929:5: otherlv_2= 'and'
                {
                otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_16); if (state.failed) return ;

                }
                break;

        }

        // InternalNCL.g:934:4: ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) )
        // InternalNCL.g:935:5: (lv_ownedConditions_3_0= ruleHeteConditionCS )
        {
        // InternalNCL.g:935:5: (lv_ownedConditions_3_0= ruleHeteConditionCS )
        // InternalNCL.g:936:6: lv_ownedConditions_3_0= ruleHeteConditionCS
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getHeteStatementCSAccess().getOwnedConditionsHeteConditionCSParserRuleCall_1_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedConditions_3_0=ruleHeteConditionCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalNCL

    // $ANTLR start synpred56_InternalNCL
    public final void synpred56_InternalNCL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;


        // InternalNCL.g:1293:4: (this_UnrestrictedName_0= ruleUnrestrictedName )
        // InternalNCL.g:1293:4: this_UnrestrictedName_0= ruleUnrestrictedName
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_0_0());
          			
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnrestrictedName_0=ruleUnrestrictedName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalNCL

    // $ANTLR start synpred58_InternalNCL
    public final void synpred58_InternalNCL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;


        // InternalNCL.g:1330:5: (this_UnrestrictedName_4= ruleUnrestrictedName )
        // InternalNCL.g:1330:5: this_UnrestrictedName_4= ruleUnrestrictedName
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_1_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnrestrictedName_4=ruleUnrestrictedName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalNCL

    // $ANTLR start synpred59_InternalNCL
    public final void synpred59_InternalNCL_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalNCL.g:1353:5: (kw= '(' )
        // InternalNCL.g:1353:5: kw= '('
        {
        kw=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalNCL

    // $ANTLR start synpred61_InternalNCL
    public final void synpred61_InternalNCL_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;

        AntlrDatatypeRuleToken this_ID_5 = null;


        // InternalNCL.g:1316:4: ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )
        // InternalNCL.g:1316:4: (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )?
        {
        // InternalNCL.g:1316:4: (kw= '.' | kw= '->' )
        int alt138=2;
        int LA138_0 = input.LA(1);

        if ( (LA138_0==50) ) {
            alt138=1;
        }
        else if ( (LA138_0==53) ) {
            alt138=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 138, 0, input);

            throw nvae;
        }
        switch (alt138) {
            case 1 :
                // InternalNCL.g:1317:5: kw= '.'
                {
                kw=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNCL.g:1323:5: kw= '->'
                {
                kw=(Token)match(input,53,FollowSets000.FOLLOW_3); if (state.failed) return ;

                }
                break;

        }

        // InternalNCL.g:1329:4: (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID )
        int alt139=2;
        int LA139_0 = input.LA(1);

        if ( (LA139_0==RULE_SIMPLE_ID) ) {
            int LA139_1 = input.LA(2);

            if ( (synpred58_InternalNCL()) ) {
                alt139=1;
            }
            else if ( (true) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 1, input);

                throw nvae;
            }
        }
        else if ( (LA139_0==RULE_ESCAPED_ID) ) {
            int LA139_2 = input.LA(2);

            if ( (synpred58_InternalNCL()) ) {
                alt139=1;
            }
            else if ( (true) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 139, 0, input);

            throw nvae;
        }
        switch (alt139) {
            case 1 :
                // InternalNCL.g:1330:5: this_UnrestrictedName_4= ruleUnrestrictedName
                {
                pushFollow(FollowSets000.FOLLOW_82);
                this_UnrestrictedName_4=ruleUnrestrictedName();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNCL.g:1341:5: this_ID_5= ruleID
                {
                if ( state.backtracking==0 ) {

                  					newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_1_1_1());
                  				
                }
                pushFollow(FollowSets000.FOLLOW_82);
                this_ID_5=ruleID();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // InternalNCL.g:1352:4: (kw= '(' )?
        int alt140=2;
        int LA140_0 = input.LA(1);

        if ( (LA140_0==32) ) {
            alt140=1;
        }
        switch (alt140) {
            case 1 :
                // InternalNCL.g:1353:5: kw= '('
                {
                kw=(Token)match(input,32,FollowSets000.FOLLOW_83); if (state.failed) return ;

                }
                break;

        }

        // InternalNCL.g:1359:4: (kw= ')' )?
        int alt141=2;
        int LA141_0 = input.LA(1);

        if ( (LA141_0==42) ) {
            alt141=1;
        }
        switch (alt141) {
            case 1 :
                // InternalNCL.g:1360:5: kw= ')'
                {
                kw=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred61_InternalNCL

    // $ANTLR start synpred135_InternalNCL
    public final void synpred135_InternalNCL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalNCL.g:3839:3: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalNCL.g:3839:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_InternalNCL

    // $ANTLR start synpred138_InternalNCL
    public final void synpred138_InternalNCL_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalNCL.g:3930:3: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalNCL.g:3930:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalNCL.g:3930:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalNCL.g:3931:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FollowSets000.FOLLOW_53);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalNCL.g:3942:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( ((LA152_0>=29 && LA152_0<=30)||(LA152_0>=33 && LA152_0<=36)||LA152_0==38||LA152_0==50||(LA152_0>=53 && LA152_0<=54)||(LA152_0>=56 && LA152_0<=67)) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // InternalNCL.g:3943:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalNCL.g:3943:5: ()
                // InternalNCL.g:3944:6: 
                {
                if ( state.backtracking==0 ) {

                  						/* */
                  					
                }

                }

                // InternalNCL.g:3953:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // InternalNCL.g:3954:6: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // InternalNCL.g:3954:6: (lv_name_2_0= ruleBinaryOperatorName )
                // InternalNCL.g:3955:7: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_43);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalNCL.g:3972:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalNCL.g:3973:6: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalNCL.g:3973:6: (lv_ownedRight_3_0= ruleExpCS )
                // InternalNCL.g:3974:7: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedRight_3_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred138_InternalNCL

    // $ANTLR start synpred145_InternalNCL
    public final void synpred145_InternalNCL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // InternalNCL.g:4234:3: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // InternalNCL.g:4234:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred145_InternalNCL

    // $ANTLR start synpred146_InternalNCL
    public final void synpred146_InternalNCL_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // InternalNCL.g:4246:3: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // InternalNCL.g:4246:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred146_InternalNCL

    // $ANTLR start synpred147_InternalNCL
    public final void synpred147_InternalNCL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // InternalNCL.g:4258:3: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // InternalNCL.g:4258:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred147_InternalNCL

    // $ANTLR start synpred149_InternalNCL
    public final void synpred149_InternalNCL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_8 = null;


        // InternalNCL.g:4282:3: (this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS )
        // InternalNCL.g:4282:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred149_InternalNCL

    // $ANTLR start synpred162_InternalNCL
    public final void synpred162_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


        // InternalNCL.g:4725:5: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) )
        // InternalNCL.g:4725:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        {
        // InternalNCL.g:4725:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        // InternalNCL.g:4726:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        {
        otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalNCL.g:4730:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
        // InternalNCL.g:4731:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        {
        // InternalNCL.g:4731:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        // InternalNCL.g:4732:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_64);
        lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNCL.g:4749:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        int alt157=2;
        int LA157_0 = input.LA(1);

        if ( (LA157_0==35) ) {
            alt157=1;
        }
        switch (alt157) {
            case 1 :
                // InternalNCL.g:4750:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                {
                otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return ;
                // InternalNCL.g:4754:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                // InternalNCL.g:4755:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                {
                // InternalNCL.g:4755:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                // InternalNCL.g:4756:9: lv_ownedInitExpression_4_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_4_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred162_InternalNCL

    // $ANTLR start synpred165_InternalNCL
    public final void synpred165_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;


        // InternalNCL.g:4776:5: ( (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) )
        // InternalNCL.g:4776:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        {
        // InternalNCL.g:4776:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        // InternalNCL.g:4777:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        {
        otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return ;
        // InternalNCL.g:4781:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
        // InternalNCL.g:4782:7: (lv_ownedType_6_0= ruleTypeExpCS )
        {
        // InternalNCL.g:4782:7: (lv_ownedType_6_0= ruleTypeExpCS )
        // InternalNCL.g:4783:8: lv_ownedType_6_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_65);
        lv_ownedType_6_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNCL.g:4800:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
        int alt158=2;
        int LA158_0 = input.LA(1);

        if ( (LA158_0==86) ) {
            alt158=1;
        }
        switch (alt158) {
            case 1 :
                // InternalNCL.g:4801:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_7=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNCL.g:4805:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                // InternalNCL.g:4806:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                {
                // InternalNCL.g:4806:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                // InternalNCL.g:4807:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_64);
                lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNCL.g:4825:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        int alt159=2;
        int LA159_0 = input.LA(1);

        if ( (LA159_0==35) ) {
            alt159=1;
        }
        switch (alt159) {
            case 1 :
                // InternalNCL.g:4826:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                {
                otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return ;
                // InternalNCL.g:4830:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                // InternalNCL.g:4831:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                {
                // InternalNCL.g:4831:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                // InternalNCL.g:4832:9: lv_ownedInitExpression_10_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_10_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred165_InternalNCL

    // $ANTLR start synpred168_InternalNCL
    public final void synpred168_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;


        // InternalNCL.g:4852:5: ( ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )
        // InternalNCL.g:4852:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        {
        // InternalNCL.g:4852:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        // InternalNCL.g:4853:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        {
        // InternalNCL.g:4853:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
        int alt160=2;
        int LA160_0 = input.LA(1);

        if ( (LA160_0==22) ) {
            alt160=1;
        }
        switch (alt160) {
            case 1 :
                // InternalNCL.g:4854:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                {
                otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return ;
                // InternalNCL.g:4858:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                // InternalNCL.g:4859:8: (lv_ownedType_12_0= ruleTypeExpCS )
                {
                // InternalNCL.g:4859:8: (lv_ownedType_12_0= ruleTypeExpCS )
                // InternalNCL.g:4860:9: lv_ownedType_12_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_66);
                lv_ownedType_12_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNCL.g:4878:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
        int alt161=2;
        int LA161_0 = input.LA(1);

        if ( (LA161_0==86) ) {
            alt161=1;
        }
        switch (alt161) {
            case 1 :
                // InternalNCL.g:4879:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_13=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNCL.g:4883:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                // InternalNCL.g:4884:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                {
                // InternalNCL.g:4884:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                // InternalNCL.g:4885:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_67);
                lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_15=(Token)match(input,95,FollowSets000.FOLLOW_43); if (state.failed) return ;
        // InternalNCL.g:4907:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        // InternalNCL.g:4908:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        {
        // InternalNCL.g:4908:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        // InternalNCL.g:4909:8: lv_ownedInitExpression_16_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedInitExpression_16_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred168_InternalNCL

    // $ANTLR start synpred173_InternalNCL
    public final void synpred173_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


        // InternalNCL.g:5110:4: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) )
        // InternalNCL.g:5110:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        {
        // InternalNCL.g:5110:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        // InternalNCL.g:5111:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        {
        otherlv_2=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalNCL.g:5115:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
        // InternalNCL.g:5116:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        {
        // InternalNCL.g:5116:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        // InternalNCL.g:5117:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_64);
        lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNCL.g:5134:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        int alt169=2;
        int LA169_0 = input.LA(1);

        if ( (LA169_0==35) ) {
            alt169=1;
        }
        switch (alt169) {
            case 1 :
                // InternalNCL.g:5135:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                {
                otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return ;
                // InternalNCL.g:5139:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                // InternalNCL.g:5140:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                {
                // InternalNCL.g:5140:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                // InternalNCL.g:5141:8: lv_ownedInitExpression_5_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_5_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred173_InternalNCL

    // $ANTLR start synpred176_InternalNCL
    public final void synpred176_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;


        // InternalNCL.g:5161:4: ( (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) )
        // InternalNCL.g:5161:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        {
        // InternalNCL.g:5161:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        // InternalNCL.g:5162:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        {
        otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return ;
        // InternalNCL.g:5166:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
        // InternalNCL.g:5167:6: (lv_ownedType_7_0= ruleTypeExpCS )
        {
        // InternalNCL.g:5167:6: (lv_ownedType_7_0= ruleTypeExpCS )
        // InternalNCL.g:5168:7: lv_ownedType_7_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_65);
        lv_ownedType_7_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNCL.g:5185:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
        int alt170=2;
        int LA170_0 = input.LA(1);

        if ( (LA170_0==86) ) {
            alt170=1;
        }
        switch (alt170) {
            case 1 :
                // InternalNCL.g:5186:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_8=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNCL.g:5190:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                // InternalNCL.g:5191:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                {
                // InternalNCL.g:5191:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                // InternalNCL.g:5192:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_64);
                lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNCL.g:5210:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        int alt171=2;
        int LA171_0 = input.LA(1);

        if ( (LA171_0==35) ) {
            alt171=1;
        }
        switch (alt171) {
            case 1 :
                // InternalNCL.g:5211:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                {
                otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_43); if (state.failed) return ;
                // InternalNCL.g:5215:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                // InternalNCL.g:5216:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                {
                // InternalNCL.g:5216:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                // InternalNCL.g:5217:8: lv_ownedInitExpression_11_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_11_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred176_InternalNCL

    // $ANTLR start synpred179_InternalNCL
    public final void synpred179_InternalNCL_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;


        // InternalNCL.g:5237:4: ( ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )
        // InternalNCL.g:5237:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        {
        // InternalNCL.g:5237:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        // InternalNCL.g:5238:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        {
        // InternalNCL.g:5238:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
        int alt172=2;
        int LA172_0 = input.LA(1);

        if ( (LA172_0==22) ) {
            alt172=1;
        }
        switch (alt172) {
            case 1 :
                // InternalNCL.g:5239:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                {
                otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_33); if (state.failed) return ;
                // InternalNCL.g:5243:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                // InternalNCL.g:5244:7: (lv_ownedType_13_0= ruleTypeExpCS )
                {
                // InternalNCL.g:5244:7: (lv_ownedType_13_0= ruleTypeExpCS )
                // InternalNCL.g:5245:8: lv_ownedType_13_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_66);
                lv_ownedType_13_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNCL.g:5263:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
        int alt173=2;
        int LA173_0 = input.LA(1);

        if ( (LA173_0==86) ) {
            alt173=1;
        }
        switch (alt173) {
            case 1 :
                // InternalNCL.g:5264:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_14=(Token)match(input,86,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNCL.g:5268:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                // InternalNCL.g:5269:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                {
                // InternalNCL.g:5269:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                // InternalNCL.g:5270:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_67);
                lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_16=(Token)match(input,95,FollowSets000.FOLLOW_43); if (state.failed) return ;
        // InternalNCL.g:5292:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        // InternalNCL.g:5293:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        {
        // InternalNCL.g:5293:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        // InternalNCL.g:5294:7: lv_ownedInitExpression_17_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedInitExpression_17_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred179_InternalNCL

    // Delegated rules

    public final boolean synpred176_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred145_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred145_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred165_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred165_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred173_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred173_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred162_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred162_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred147_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred179_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred179_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalNCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalNCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA104 dfa104 = new DFA104(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\24\1\uffff\11\0\1\uffff";
    static final String dfa_4s = "\1\60\1\uffff\11\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_6s = "\2\uffff\1\4\1\0\1\1\1\5\1\2\1\6\1\3\1\7\1\10\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\uffff\1\1\1\2\1\3\1\4\13\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 472:3: ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHomoConditionCS ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\2\uffff\1\0\1\6\1\1\1\2\1\7\1\3\1\10\1\4\1\5\1\uffff}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 922:3: ( (otherlv_1= 'or' | otherlv_2= 'and' )? ( (lv_ownedConditions_3_0= ruleHeteConditionCS ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalNCL()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_9s = "\23\uffff";
    static final String dfa_10s = "\1\4\12\uffff\5\0\3\uffff";
    static final String dfa_11s = "\1\122\12\uffff\5\0\3\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3";
    static final String dfa_13s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\76\uffff\12\3\1\13\1\14\1\15\1\16\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_9;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3826:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalNCL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalNCL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalNCL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalNCL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalNCL()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\41\uffff";
    static final String dfa_16s = "\1\4\3\0\35\uffff";
    static final String dfa_17s = "\1\150\3\0\35\uffff";
    static final String dfa_18s = "\4\uffff\1\1\33\uffff\1\2";
    static final String dfa_19s = "\1\uffff\1\0\1\1\1\2\35\uffff}>";
    static final String[] dfa_20s = {
            "\4\4\24\uffff\1\2\3\uffff\1\4\25\uffff\1\1\1\3\1\4\13\uffff\17\4\2\uffff\1\4\1\uffff\4\4\7\uffff\1\4\4\uffff\1\40\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3929:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNCL()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNCL()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNCL()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\40\uffff";
    static final String dfa_22s = "\1\4\12\uffff\7\0\16\uffff";
    static final String dfa_23s = "\1\150\12\uffff\7\0\16\uffff";
    static final String dfa_24s = "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\1\11\7\uffff\1\12\1\uffff\1\5\1\6\1\7";
    static final String dfa_25s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\16\uffff}>";
    static final String[] dfa_26s = {
            "\2\33\2\4\30\uffff\1\1\27\uffff\1\4\13\uffff\1\14\1\13\10\23\1\15\1\16\1\17\1\20\1\21\2\uffff\1\22\1\uffff\4\4\7\uffff\1\2\5\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4185:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalNCL()) ) {s = 29;}

                        else if ( (synpred149_InternalNCL()) ) {s = 19;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalNCL()) ) {s = 30;}

                        else if ( (synpred149_InternalNCL()) ) {s = 19;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred147_InternalNCL()) ) {s = 31;}

                        else if ( (synpred149_InternalNCL()) ) {s = 19;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred147_InternalNCL()) ) {s = 31;}

                        else if ( (synpred149_InternalNCL()) ) {s = 19;}

                         
                        input.seek(index79_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_15 = input.LA(1);

                         
                        int index79_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred147_InternalNCL()) ) {s = 31;}

                        else if ( (synpred149_InternalNCL()) ) {s = 19;}

                         
                        input.seek(index79_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_16 = input.LA(1);

                         
                        int index79_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred147_InternalNCL()) ) {s = 31;}

                        else if ( (synpred149_InternalNCL()) ) {s = 19;}

                         
                        input.seek(index79_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_17 = input.LA(1);

                         
                        int index79_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred147_InternalNCL()) ) {s = 31;}

                        else if ( (synpred149_InternalNCL()) ) {s = 19;}

                         
                        input.seek(index79_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\13\uffff";
    static final String dfa_28s = "\1\4\12\uffff";
    static final String dfa_29s = "\1\26\2\0\10\uffff";
    static final String dfa_30s = "\1\141\2\0\10\uffff";
    static final String dfa_31s = "\3\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String dfa_32s = "\1\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_33s = {
            "\1\2\3\uffff\1\4\17\uffff\1\4\53\uffff\1\1\10\uffff\1\3\2\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "4724:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_1 = input.LA(1);

                         
                        int index95_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_InternalNCL()) ) {s = 9;}

                        else if ( (synpred168_InternalNCL()) ) {s = 3;}

                         
                        input.seek(index95_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA95_2 = input.LA(1);

                         
                        int index95_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred165_InternalNCL()) ) {s = 10;}

                        else if ( (synpred168_InternalNCL()) ) {s = 3;}

                         
                        input.seek(index95_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "5109:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA104_1 = input.LA(1);

                         
                        int index104_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred173_InternalNCL()) ) {s = 9;}

                        else if ( (synpred179_InternalNCL()) ) {s = 3;}

                         
                        input.seek(index104_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA104_2 = input.LA(1);

                         
                        int index104_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_InternalNCL()) ) {s = 10;}

                        else if ( (synpred179_InternalNCL()) ) {s = 3;}

                         
                        input.seek(index104_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 104, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000380000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000B0L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002040000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001F800F0000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001F800F0100000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001F800F0000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000003FE00000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004040000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004040100000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000006040000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004040004000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004040104000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0024000000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0024040100000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0024040000000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000030L,0x000000000007FFF0L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000030L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040004000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x01C00001105000F0L,0x0000018407A7FFF0L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x01C00001104000F0L,0x0000018407A7FFF0L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x01C00001100000F0L,0x0000018407A7FFF0L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000004000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x01C00001101000F0L,0x0000018407A7FFF0L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000800400000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFF64005E60000002L,0x000000000000000FL});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x01C00001100000F0L,0x0000010407A7FFF0L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000100040002L,0x0000000028000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000040002L,0x0000000008000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00000000001000B0L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x01C00401104000F0L,0x0000018407A7FFF0L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000040004000000L,0x0000000300000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000004000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000400002L,0x0000000080400000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000800000002L,0x0000000000400000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000080400000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000004000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000900400000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0500000000000040L,0x0000080000000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000060040000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000004000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000030L,0x0000080000000000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000040100000002L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000040000000002L});
    }


}