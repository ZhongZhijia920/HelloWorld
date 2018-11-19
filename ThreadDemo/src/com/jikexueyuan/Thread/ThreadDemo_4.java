package com.jikexueyuan.Thread;

/**
 * @program: HelloWOrld
 * @description:测试线程的优先级
 * @create: 2018-11-16 15:43
 **/
class TheRun implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+":"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo_4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TheRun(),"A");
        Thread t2 = new Thread(new TheRun(),"B");
        Thread t3 = new Thread(new TheRun(),"C");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
