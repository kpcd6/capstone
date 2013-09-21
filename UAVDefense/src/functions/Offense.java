package functions;

public class Offense extends Drone
{
	private static final int DEACTIVATE_COOLDOWN=30;
	
	Offense(int id, String name, int teamid, String role)//constructor 
	{
		super(id, name, teamid, role);
	}

	@Override
	protected void startWepCooldown()
	{
		
	}
	
	@Override
	protected void deactivate()
	{
		
	}
	
	@Override
	protected void getShot()
	{
		
	}
}
