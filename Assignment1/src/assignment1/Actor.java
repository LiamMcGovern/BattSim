package assignment1;// N.B.  Use of default package at this point in
                    // the program would indicate a lack of knowledge on the part of the student!
import java.util.Formatter;
import java.lang.String;


public class Actor {
    /**
     * A reference to object Actor, has the following attributes
     * A name with it's coinciding serial number, incremented at each call to the constructor.
     * Health, Speed, and Strength.
     * Health and Speed are represented by a double value between 0 and 100, this is based on the fact that a percentage
     * is a logical way of measuring Health, Speed, and Strength.
     * <p/>
     * @author Liam McGovern [Input and SingletonRandom aside]
     * Project:  BattleField Simulator
     * Version: Assignment 1, Object Oriented Programming.
     * Lab Proffessor: David Houtman
     */

    //Defining the Maximum and Minimum values for each attribute
    //It was decided that 1-100 is valid since a percentage style representation is very versatile.
    public final static double MAX_HEALTH = 100.0;
    public final static double MIN_HEALTH = 1.0;

    public final static double MAX_SPEED = 100.0;
    public final static double MIN_SPEED = 1.0;

    public final static double MAX_STRENGTH = 100.0;
    public final static double MIN_STRENGTH = 1.0;

    //actorSerialNumber a class variable
    //used to assign each actor a unique number, static since it should not be unique to each actor.
    public static int actorSerialNumber = 0; //Starts with 0, increased every time it's used.

    //Actor instance variables
    private String name = "Actor"; //A string object initialized with the value of 'Actor'
    private double strength;
    private double speed;
    private double health;

    // Actor Constructor
    Actor() {
        actorSerialNumber++;//Increased upon each instantiation to correlate with the quantity of Actors created.
        name = String.format("%s%d", name, actorSerialNumber);
        //Actor instance variables are automagically instantiated with random values between the defined limits.
        strength = SingletonRandom.instance.getNormalDistribution(MIN_STRENGTH, MAX_STRENGTH, 1);
        speed = SingletonRandom.instance.getNormalDistribution(MIN_SPEED, MAX_SPEED, 1);
        health = SingletonRandom.instance.getNormalDistribution(MIN_HEALTH, MAX_HEALTH, 1);
        //SingletonRandom is Prof. Woolard's random number generator.
    }

    public void inputAllFields(){
        //Utilizes the set methods to pass input to the coinciding variables.
        setStrength(Input.instance.getDouble((String.format("Input %s's Strength", this.name))));
        setSpeed(Input.instance.getDouble((String.format("Input %s's Speed", this.name))));
        setHealth(Input.instance.getDouble((String.format("Input %s's Health", this.name))));
        //This uses Prof. Woolard's Input parsing class to capture input.
    }

    @Override //This method overrides Java's inherited Object.toString method.
    public String toString(){
        return String.format("Name: %-12s Health:%4.1f \t Speed:%4.1f \t Strength:%4.1f",
                this.name, this.health, this.speed, this.strength );
    }

    //get and set methods are attributes of standard design pattern.

    public double getHealth() { //getHealth returns the respective value of health to the object it's called by.
        return this.health;
    }

    public double getStrength(){//getStrength returns the respective value of health to the object it's called by.
        return this.strength;
    }

    public double getSpeed() {//getSpeed returns the respective value of health to the object it's called by.
        return this.speed;
    }


    //The values of speed are checked against the limits, and when they exceed them,
    // the values are set to the closest limit
    public void setSpeed(double speed) {
        if (speed > MAX_SPEED){
            System.out.printf("The entered Speed is greater than specified limits," +
                    " setting the value to defined max %.1f instead %n", MAX_SPEED);
            this.speed = MAX_SPEED;
        } else if (speed < MIN_SPEED){
            System.out.printf("The entered Speed is lower than specified limits," +
                    " setting the value to defined min %.1f instead %n", MIN_SPEED);
            this.speed = MIN_SPEED;
        } else {
            this.speed = speed;
        }
    }

    public void setHealth(double health) {
        if (health > MAX_HEALTH){
            System.out.printf("The entered Health value is greater than specified limits," +
                    " setting the value to defined max %.1f instead %n", MAX_HEALTH);
            this.health = MAX_HEALTH;
        } else if (health < MIN_HEALTH){
            System.out.printf("The entered Health value is lower than specified limits," +
                    " setting the value to defined min %.1f instead %n", MIN_HEALTH);
            this.health = MIN_HEALTH;
        } else {
            this.health = health;
        }
    }

    public void setStrength(double strength){
        if (strength > MAX_STRENGTH){
            System.out.printf("The entered Strength is greater than specified limits," +
                    " setting the value to defined max %.1f instead %n", MAX_STRENGTH);
            this.strength = MAX_STRENGTH;
        } else if (strength < MIN_STRENGTH){
            System.out.printf("The entered Strength is lower than specified limits," +
                    " setting the value to defined min %.1f instead %n", MIN_STRENGTH);
            this.strength = MIN_STRENGTH;
        } else {
            this.strength = strength;
        }
    }



}
