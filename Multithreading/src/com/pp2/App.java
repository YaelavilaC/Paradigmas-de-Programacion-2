package com.pp2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread T1 = new Thread (new Runner1());
		Thread T2 = new Thread (new Runner2());
		T1.start();
		T2.start();
	}

}
