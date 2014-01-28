package assignment1;


public class Actor {
	public final static double MIN_SPEED = 0.0;
	public final static double MAX_SPEED = 150.0;
	
	private static int actorSerialNumber = 1;
	
	private String name;
	private double strength;
	private double speed;
	private double health;

	
	// Actor Constructor
	Actor() {	
		name = ("Actor" + actorSerialNumber);
		strength = 0;
		speed = 0;
		health = 0;

	}
	
	

}
