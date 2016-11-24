package com.orange.formationjava;

class Horse extends Animal {
	public Horse(String name) {
		super(name);
	}

	@Override
	public String sound() {
		return "neigh";
	}
}
