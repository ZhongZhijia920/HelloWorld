package com.jikexueyuan.Thread;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-16 14:38
 **/
public class MyThread extends Thread{
    private String name;

     public MyThread(String name){
         this.name = name;
     }

     public void run(){
         for (int i = 0; i < 1010; i++) {
             System.out.println(name + ":" + i);
         }
         super.run();
     }
}
