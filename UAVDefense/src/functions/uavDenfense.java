package functions;

import gui.LoginFrame;

import java.util.Scanner;
import java.awt.EventQueue;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


public class uavDenfense 
{
	public static void main(String[] args)
	{
		//gui 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//create defense and offense drones for test
		Defense defense1=new Defense(1,"d1",1,"Defense");
		Defense defense2=new Defense(2,"d2",1,"Defense");
		Defense defense3=new Defense(3,"d3",1,"Defense");
		Offense offense1=new Offense(4,"o1",2,"Offense");
		Offense offense2=new Offense(5,"o2",2,"Offense");
		Offense offense3=new Offense(6,"o3",2,"Offense");
		
		//create teams for test
		Team team1=new Team(1);
		Team team2=new Team(2);
		
		//create targets for test
		Target target1=new Target(1,-100,50);
		Target target2=new Target(2,-100,0);
		Target target3=new Target(3,-100,-50);
		
		//create score board for test
		ScoreBoard scoreboard=new ScoreBoard();
		
		System.out.println("Successfully created!");	
		
		
		
		
		//thread pool
		//ExecutorService exec = Executors.newCachedThreadPool();
		//final Semaphore semp = new Semaphore(10);//10 threads concurrently running at most
		//run test
		
		//exec.shutdown();
		
	}
}
