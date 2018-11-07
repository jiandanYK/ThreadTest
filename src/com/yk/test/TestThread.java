package com.yk.test;

/**
 * thread 类 实现的也是Runnable接口
 * @author Administrator
 *
 */
public class TestThread extends Thread {
	
	public void run() {
		//重写run方法
		System.out.println("需要执行的任务");
	}
	
	public static void main(String[] args) {
		new TestThread().start();   //start方法通过synchronized关键字实现同步
	}
}
