package io.visitor.acyclic.modem.hayes;

import io.visitor.acyclic.Visitor;
import io.visitor.acyclic.modem.Modem;

public class ExtraHayes implements Modem<ExtraHayes> {

	private Hayes hayes = new Hayes();
	
	@Override
	public void accept(Visitor<ExtraHayes> visitor) {

		visitor.visit(this);
	}

	@Override
	public void send() {

		hayes.send();
	}

	@Override
	public void receive() {

		hayes.receive();
	}
}
