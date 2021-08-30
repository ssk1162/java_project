package com.mega.mvc08.generic;

public class Truck<T, S> {
	
	T weight;
	S distance;
	
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}
	
	
}
