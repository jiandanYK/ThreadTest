package com.yk.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ��ʹ��Lambda���ʽ����Callable���󣩡�
2��ʹ��FutureTask������װCallable���󣬸�FutureTask�����װ��Callable�����call()�����ķ���ֵ
3��ʹ��FutureTask������ΪThread�����target�����������̣߳���ΪFutureTaskʵ����Runnable�ӿڣ�
4������FutureTask�����get()������������߳�ִ�н�����ķ���ֵ
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
