package com.shu;

public class Threadtest{
	public static void main(String[] args) {
		final Threadtest test=new Threadtest();
		Runnable runnable= new Runnable() {
			public void run() {
				test.model2();
				test.model3();
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
		test.model1();
	}
	public synchronized void model1(){
			try {
				Thread.sleep(1000);
				System.out.println("call method1");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public synchronized void model2(){
		System.out.println("call method2");
	}
	public synchronized void model3(){
		System.out.println("call method3");
	}
}
