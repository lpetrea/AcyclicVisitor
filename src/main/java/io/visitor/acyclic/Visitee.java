package io.visitor.acyclic;

public interface Visitee<T extends Visitee<T>> {

	@SuppressWarnings("unchecked")
	default void accept(Visitor<T> visitor) {
		
		visitor.visit((T) this);
	}
}
