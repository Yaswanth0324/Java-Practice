package com.tapacademy.MultiThreading;


class Queue
{
	private int data;
	boolean dataIsPresent = false;
	public synchronized void setData(int data) 
	{
		if(dataIsPresent == false) 
		{
			this.data = data;
			System.out.println("producer produced the value " + data);
			dataIsPresent=true;
			notify();
		}
		else 
		{
			try 
			{
				wait();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	public synchronized void getData() 
	{
		if(dataIsPresent==true) 
		{
			System.out.println( "consumer consumed the value "+ data);
			dataIsPresent=false;
			notify();
		}
		else 
		{
			try 
			{
				wait();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}
	
}

class Producer extends Thread
{
	
	Queue q;
	public Producer(Queue q) 
	{
		this.q = q;
	}
	int i=1;
	@Override
	public void run() 
	{
		for( ; ; ) 
		{
			q.setData(i++);
			
		}
	}
	
}
class Consumer extends Thread
{
	Queue q;
	public Consumer(Queue q) 
	{
		this.q = q;
	}
	
	@Override
	public void run() 
	{
		for( ; ; ) 
		{
			q.getData();
			
		}
	}
}

public class ProducerConsumer 
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.setName("Producer");
		c.setName("Consumer");
		
		p.start();
		c.start();
		
	}
}
