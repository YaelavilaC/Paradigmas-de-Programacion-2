package com.pp2;

public class Runner2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Runner 2: " + i);
		}
	}

}
