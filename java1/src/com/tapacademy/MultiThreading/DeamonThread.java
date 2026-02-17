package com.tapacademy.MultiThreading;

class Captian extends Thread
{
	@Override
	public void run() 
	{

		try 
		{	
			BatterCoach bc = new BatterCoach();
			BowlerCoach blc = new BowlerCoach();
			
			bc.setName("BatCoach");
			blc.setName("BowlCoach");
			
			bc.setDaemon(true);
			blc.setDaemon(true);
			
			bc.start();
			blc.start();
			
			System.out.println("captian entered into ground");
			Thread.sleep(3000);
			System.out.println("captian set up the dress");
			Thread.sleep(3000);
			System.out.println("captian do warm up");
			Thread.sleep(3000);
			System.out.println("captian practice the batting");
			Thread.sleep(3000);
			System.out.println("captian practice the fielding");
			Thread.sleep(3000);
			System.out.println("captian going to hotel");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}

class BatterCoach extends Thread
{
	@Override
	public void run() {
		for( ; ; )
		{
			System.out.println("Batting coachEntering into the ground");
			try {
				Thread.sleep(3000);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class BowlerCoach extends Thread
{
	@Override
	public void run() {
		for( ; ; )
		{
			System.out.println("Bowling coach Entering into the ground");
			try {
				Thread.sleep(3000);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}





public class DeamonThread 
{
	public static void main(String[] args) 
	{
		Captian cap = new Captian();
		
		cap.setName("Captian");
		
		cap.start();
	}
}
