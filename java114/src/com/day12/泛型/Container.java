package com.day12.·ºÐÍ;

public class Container<VV,V> {
	private VV value;
	private V value1;
	
	public VV getValue() {
		return value;
	}

	public void setValue(VV value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Container [value=" + value + "]";
	}
	
}
