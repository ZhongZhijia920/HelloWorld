package com.jikexueyuan.Thread;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-16 15:01
 **/
public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name =name;
    }
    
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(name+":"+i);
        }
    }
}
