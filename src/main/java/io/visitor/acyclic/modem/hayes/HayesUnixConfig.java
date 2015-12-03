package io.visitor.acyclic.modem.hayes;

import io.visitor.acyclic.Visitor;

public class HayesUnixConfig implements Visitor<Hayes> {

	public void visit(Hayes hayes) {

		hayes.setConfig("&s1=4&D=3");
	}
}
