/*
 * generated by Xtext 2.12.0
 */
package com.coffee.parser.antlr;

import com.coffee.parser.antlr.internal.InternalPLECParser;
import com.coffee.services.PLECGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PLECParser extends AbstractAntlrParser {

	@Inject
	private PLECGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPLECParser createParser(XtextTokenStream stream) {
		return new InternalPLECParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public PLECGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PLECGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
