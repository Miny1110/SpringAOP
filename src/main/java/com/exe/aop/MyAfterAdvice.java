package com.exe.aop;

public class MyAfterAdvice {

	public void afterMethodCall() {
		System.out.println("메소드 실행 후(After Advice)");
	}
}
