package com.jikexueyuan.Thread;

    /**
     * @program: HelloWOrld
     * @description:�̵߳�ͬ��syncronized
     * @create: 2018-11-16 15:52
     **/
    class MyThreadDemo implements Runnable{
        private int ticket = 5;

        public void run(){
            for (int i = 0; i < 10; i++) {
                tell();
            }
        }

        public synchronized void tell(){
            if(ticket>0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("��Ʊ:"+ticket--);
            }
        }
    }

/**
 * ����:ѧ���ҹ���(��н)
 *      ��ҵ��Ҫ�й�������(����)
 */
public class ThreadDemo_5 {
        public static void main(String[] args) {
            MyThreadDemo m = new MyThreadDemo();
            Thread t1 = new Thread(m);
            Thread t2 = new Thread(m);
            Thread t3 = new Thread(m);
            t1.start();
            t2.start();
            t3.start();
        }
}
