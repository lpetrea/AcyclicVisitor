package io.visitor.acyclic.modem.hayes;

import io.visitor.acyclic.Visitor;
import io.visitor.acyclic.modem.Modem;

public class Hayes implements Modem<Hayes> {

	String config;
	
	@Override
	public void accept(Visitor<Hayes> visitor) {
		
		visitor.visit(this);
	}

	@Override
	public void send() {
		
		config.concat("\n");
	}

	@Override
	public void receive() {
		
	}

	public void setConfig(String config) {

		this.config = config;
	}
}
