package assignment1;// N.B.  Use of default package at this point in
                    // the program would indicate a lack of knowledge on the part of the student!

public class Actor {
    /**
     * A reference to object Actor, has the following attributes
     * A name
     * Health, Speed, and Strength.
     * Health and Speed are represented by a double value between 0 and 100, this is based on the fact that a percentage
     * is a logical way of measuring Health, and Speed.
     * <p/>
     * Strength is between 1, and 50, much akin to the nature of many video games Strength attribute, this could
     * easily be expanded if necessary.
     *
     * @author Liam McGovern
     * @project: Assignment 1, Object Oriented Programming.
     */


    public final static double MAX_HEALTH = 100.0;
    public final static double MIN_HEALTH = 0.0;

    public final static double MIN_SPEED = 0.0;
    public final static double MAX_SPEED = 100.0;

    public final static double MAX_STRENGTH = 50.0;
    public final static double MIN_STRENGTH = 1.0;


    public static int actorSerialNumber = 0; //Starts with 0, incresed everytime it's used.

    private String name;

    private double strength;
    private double speed;
    private double health;

    // Actor Constructor
    Actor() {
        name = ("Actor" + (actorSerialNumber++));
        strength = SingletonRandom.instance.getNormalDistribution(MIN_STRENGTH, MAX_STRENGTH, 0.1);
        speed = SingletonRandom.instance.getNormalDistribution(MIN_SPEED, MAX_SPEED, 0.1);
        health = SingletonRandom.instance.getNormalDistribution(MIN_HEALTH, MAX_HEALTH, 0.1);
    }

    //getter and setters for Actor Strength Attribute
    public double getStrength()
    {
        return strength;
    }

    public void setStrength(double strength)
    {
        this.strength = Input.instance.getDouble("Input Actor Strength", MIN_HEALTH, MAX_HEALTH);
    }


    //getter and setters for Actor Speed Attribute
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = Input.instance.getDouble("Input Actor Speed", MIN_SPEED, MAX_SPEED);
    }

    //getter and setters for Actor's Health
    public double getHealth() {
        return health;
    }

    public void setHealth() {
        this.health = Input.instance.getDouble("Input actor Health, between" + MIN_HEALTH + " and " + MAX_HEALTH, MIN_HEALTH, MAX_HEALTH);
    }
}
