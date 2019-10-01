package com.exam;

public class ex4 {

	public static void main(String[] args) {
		//멀티 스레딩 적용방법
		//1.Thread 클래스 이용
		//[2.Runnable 인터페이스 이용]
		
		//thread는 일꾼, runnable 은 일거리(작업)
		
		// runnable 인터페이스를 구현한 클래스를 익명클래스로 정의하고
		// 기본생성자로 객체생성해서 매개변수에 전달
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.println("go");
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.println("come");
				}
				
			}
		});
		
		thread1.start();
		thread2.start();
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
