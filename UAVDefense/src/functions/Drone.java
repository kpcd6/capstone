package functions;

public class Drone 
{
	private int ID;
	private String Name;
	private int teamID;
	private String teamRole;
	private int shotCount;
	private int hitCount;
	private double xCoord;
	private double yCoord;
	private double zCoord;
	
	//default values
	private boolean isActive=true;
	private boolean isWepCooldown=false;
	private int ammoLeft=30;
	
	Drone(int id, String name, int teamid, String role)//constructor
	{
		id=ID;
		name=Name;
		teamid=teamID;
		role=teamRole;
	}
	
	public int getShotCount()
	{
		return shotCount;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public boolean getStatus()
	{
		return isActive;
	}
	
	public int getTeamID()
	{
		return teamID;
	}
	
	public String getRole()
	{
		return teamRole;
	}
	
	//drone A shoots drone B
	public void shoot(Drone droneA,Drone droneB)
	{
		if(droneA.getRole().compareTo(droneB.getRole())==0)//two drones are in same team
			return;
		else
		{
			droneA.ammoLeft--;
			new Thread().start();
			droneA.startWepCooldown();//semaphore?
			droneB.getShot();
		}
			
	}
	
	protected void getShot()
	{
		isActive=false;
		try {
			Thread.sleep(30*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		isActive=true;
		
	}
	
	

	protected void startWepCooldown()
	{
		
	}
	
	protected void deactivate()
	{
		
	}
	
	protected boolean coordCheck()
	{
		return false;
	}
}
