package io.visitor.acyclic.modem;

import io.visitor.acyclic.Visitor;
import io.visitor.acyclic.util.Visit;

public class ModemVisit<T extends Modem<T>> extends Visit<T>{

	public ModemVisit(T visitee, Visitor<T> visitor) {
		
		super(visitee, visitor);
	}
}
