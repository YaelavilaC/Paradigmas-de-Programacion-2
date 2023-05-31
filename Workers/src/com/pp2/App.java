package com.pp2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		worker Worker = new worker();
		Thread t1 = new Thread (Worker);
		t1.start();
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Worker.setTerminated(true);
		System.out.println("FINISHED...");
	}

}
