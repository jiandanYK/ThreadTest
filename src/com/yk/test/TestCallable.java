package com.yk.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 接使用Lambda表达式创建Callable对象）。
2】使用FutureTask类来包装Callable对象，该FutureTask对象封装了Callable对象的call()方法的返回值
3】使用FutureTask对象作为Thread对象的target创建并启动线程（因为FutureTask实现了Runnable接口）
4】调用FutureTask对象的get()方法来获得子线程执行结束后的返回值
 * @author Administrator
 */
public class TestCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new TestCallable());
		new Thread(futureTask).start();
		try {
			Integer sum = futureTask.get();
			System.out.println(sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
