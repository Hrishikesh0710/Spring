package com.constDI.Obj;

public class Engine {
	public double cc;

	public Engine(double cc) {
		this.cc = cc;
	}
	public void start() {
		System.out.println("engine started");
	}

}
