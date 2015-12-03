package io.visitor.acyclic.modem;

import io.visitor.acyclic.Visitor;

public class System {
	
	public static <T extends Modem<T>> void visit(T modem, Visitor<T> modemVisitor) {
		
		modem.accept(modemVisitor);
	}
}
