package com.yk.test;

/**
 *
 1������Runnable�ӿڵ�ʵ���࣬һ��Ҫ��дrun()���������run����������Thread�е�run()����һ�����̵߳�ִ����
2������Runnableʵ�����ʵ�����������ʵ����ΪThread��target������Thread�������Thread��������������̶߳���
3����������Ȼ��ͨ�������̶߳����start()�����������߳�
 * @author Administrator
 *
 */
public class TestRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("ʵ��Runnable�ӿ���Ҫִ�е�����");

	}

	public static void main(String[] args) {
		//new TestRunnable().run();
		new Thread(new TestRunnable()).start();
		
	}
	
	//1���߳�ֻ��ʵ��Runnable��ʵ��Callable�ӿڣ������Լ̳������ࡣ

    //���ַ�ʽ�£�����߳̿��Թ���һ��target���󣬷ǳ��ʺ϶��̴߳���ͬһ����Դ�����Ρ�

    //���Ǳ����΢���ӣ������Ҫ���ʵ�ǰ�̣߳��������Thread.currentThread()������

    //�̳�Thread����߳��಻���ټ̳��������ࣨJava���̳о�������
}
