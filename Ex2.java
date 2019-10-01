package com.exam;


class GoThread extends Thread{
		//run()은 별도의 스택에서 시작점 역할을 하는 메소드
		//메인 스레드의 main()역할 과 동일함.
	
	@Override
	public void run() {	
		go();
		
	}
	
	
	void go() {
		while(true) {
			System.out.println("go");
		}		
	}//run

}//goThread




class ComeThread extends Thread{

	@Override
	public void run() {
		come();
	}
	
	void come() {
		while(true) {
			System.out.println("come");
		}
	}
	
}//comeThread


public class Ex2 {

	public static void main(String[] args) {
		
		//멀티 스레딩 적용방법
		//[1.Thread 클래스 이용]
		//2.Runnable 인터페이스 이용
		
		//스레드 객체준비. 별도 스택이 준비됨
		GoThread goThread = new GoThread();
		ComeThread comeThread = new ComeThread();
		
		//스레드 시작시키기
		goThread.start();
		comeThread.start();
		
		//star()호출하면 스케줄링으로 선택받아서 run() 호출됨
		//스레드 객체 내부의 run()메소드가 호출됨
		
		
		
		
		
		
		
		
		

	}//main

}
