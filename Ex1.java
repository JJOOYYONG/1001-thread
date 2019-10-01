package com.exam;

	class Go{
		
		void go() {
			
			while(true) {
			System.out.println("go");
			}		
		}
		
	}//GO
	
	class Come{
		
		void coem() {
			
			while(true) {
			System.out.println("come");
			}		
		}
		
	}//Come

	
	
public class Ex1 {

	public static void main(String[] args) {
		Go g = new Go();
		Come c = new Come();
		
		g.go();
		c.coem();
		
		//메인스레드
		

	}//main

}

