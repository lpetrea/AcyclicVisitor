package io.visitor.acyclic;

public  interface  Visitor<T extends Visitee<T>> {

	 void visit(T visitee);
}
