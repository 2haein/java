package test;
import java.io.*;
import java.util.Date;

public class fileex1
{
	static long startTime=0;
	public static void main(String[] args) 
	{
		K k= new K();
		k.start();
	}
}

class K extends Thread{
	private int x=100;
	public synchronized void setX(int x) {
		this.x+= x;
	}
	public synchronized int getX() {
		return x;
	}
	public void run() {
		synchronized(this) {
			setX(200);
			System.out.println("x= "+ getX());
		}
	}
}
