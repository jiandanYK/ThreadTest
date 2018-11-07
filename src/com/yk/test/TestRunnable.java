package com.yk.test;

/**
 *
 1】定义Runnable接口的实现类，一样要重写run()方法，这个run（）方法和Thread中的run()方法一样是线程的执行体
2】创建Runnable实现类的实例，并用这个实例作为Thread的target来创建Thread对象，这个Thread对象才是真正的线程对象
3】第三部依然是通过调用线程对象的start()方法来启动线程
 * @author Administrator
 *
 */
public class TestRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("实现Runnable接口需要执行的内容");

	}

	public static void main(String[] args) {
		//new TestRunnable().run();
		new Thread(new TestRunnable()).start();
		
	}
	
	//1、线程只是实现Runnable或实现Callable接口，还可以继承其他类。

    //这种方式下，多个线程可以共享一个target对象，非常适合多线程处理同一份资源的情形。

    //但是编程稍微复杂，如果需要访问当前线程，必须调用Thread.currentThread()方法。

    //继承Thread类的线程类不能再继承其他父类（Java单继承决定）。
}
