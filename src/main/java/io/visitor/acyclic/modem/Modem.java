package io.visitor.acyclic.modem;

import io.visitor.acyclic.Visitee;

public interface Modem<T extends Modem<T>> extends Visitee<T> {
	
	void send();
	void receive();
}
