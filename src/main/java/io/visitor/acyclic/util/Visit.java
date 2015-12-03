package io.visitor.acyclic.util;

import io.visitor.acyclic.Visitee;
import io.visitor.acyclic.Visitor;

public class Visit<T extends Visitee<T>> {

	T visitee;
	Visitor<T> visitor;
	
	public Visit(T visitee, Visitor<T> visitor) {
		
		this.visitee = visitee;
		this.visitor = visitor;
	}
	
	public void perform() {
		
		visitee.accept(visitor);
	}
}
