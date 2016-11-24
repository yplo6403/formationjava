package com.orange.formationjava;

class Sheep extends Animal {
	public Sheep(String name) {
		super(name);
	}

	@Override
	public String sound() {
		return "baaaa";
	}
}