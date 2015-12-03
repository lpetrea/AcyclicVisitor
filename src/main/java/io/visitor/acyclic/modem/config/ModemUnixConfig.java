package io.visitor.acyclic.modem.config;

import io.visitor.acyclic.modem.hayes.Hayes;
import io.visitor.acyclic.modem.hayes.HayesUnixConfig;

public class ModemUnixConfig {

	public void config(Hayes hayes) {
		
		hayes.accept(new HayesUnixConfig());
	}
}
