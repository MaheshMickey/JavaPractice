package com.ancile.threads;

class Table{
    synchronized public void printTable(int n) {
        for(int i=1;i<=10;i++) {
            System.out.println(n+"*" +i +"=" +(n * i));
        }
    }
}
class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run() {
        t.printTable(5);
    }
}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run() {
    t.printTable(7);
    }
}
public class TestThread {
	public static void main(String[] args) {
	Table t = new Table();
	MyThread1 mt1 = new MyThread1(t);
	MyThread2 mt2 = new MyThread2(t);
	mt1.start();
	mt2.start();
	}

}
