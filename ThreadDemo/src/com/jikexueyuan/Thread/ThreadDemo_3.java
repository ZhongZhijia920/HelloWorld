package com.jikexueyuan.Thread;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-16 15:15
 **/
class RunnableDemo implements Runnable{
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
    }
    
    public void run(){
        for (int i = 0; i < 50; i++) {
            //��ȡ�̵߳�ǰ�����߳�����
           // System.out.println("��ǰ�̶߳���"+Thread.currentThread().getName());
//�̵߳�����
//            try {
//                Thread.sleep(1000); //�̵߳�����ʱ��
//                System.out.println(name+":"+i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(name+":"+i);
            if(i==10){
                System.out.println("����");
                Thread.yield();
            }
        }
    }
}
public class ThreadDemo_3 {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("A");
        RunnableDemo r2 = new RunnableDemo("B");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        System.out.println(t1.isAlive());//�鿴�߳��Ƿ���ִ��
        t1.start();
        t2.start();

//        for (int i = 0; i <50 ; i++) {
//            if(i>10){
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("���߳�:"+i);
//        }

    }
}
