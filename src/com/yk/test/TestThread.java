package com.yk.test;

/**
 * thread �� ʵ�ֵ�Ҳ��Runnable�ӿ�
 * @author Administrator
 *
 */
public class TestThread extends Thread {
	
	public void run() {
		//��дrun����
		System.out.println("��Ҫִ�е�����");
	}
	
	public static void main(String[] args) {
		new TestThread().start();   //start����ͨ��synchronized�ؼ���ʵ��ͬ��
	}
}
