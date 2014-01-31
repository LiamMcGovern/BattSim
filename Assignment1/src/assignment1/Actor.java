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
     * @project:  BattleField Simulator
     * Assignment 1, Object Oriented Programming.
     * Lab Proffessor: David Houtman
     */


    public final static double MAX_HEALTH = 100.0;
    public final static double MIN_HEALTH = 1.0;

    public final static double MAX_SPEED = 100.0;
    public final static double MIN_SPEED = 1.0;

    public final static double MAX_STRENGTH = 100.0;
    public final static double MIN_STRENGTH = 1.0;


    public static int actorSerialNumber = 0; //Starts with 0, increased every time it's used.

    private String name = "Actor";

    private double strength;
    private double speed;
    private double health;

    // Actor Constructor
    Actor() {
        actorSerialNumber++;
        name = String.format("%s%d", name, actorSerialNumber);
        strength = SingletonRandom.instance.getNormalDistribution(MIN_STRENGTH, MAX_STRENGTH, 1);
        speed = SingletonRandom.instance.getNormalDistribution(MIN_SPEED, MAX_SPEED, 1);
        health = SingletonRandom.instance.getNormalDistribution(MIN_HEALTH, MAX_HEALTH, 1);
    }

    public void inputAllFields(){
        setStrength(Input.instance.getDouble((String.format("Input %s's Strength", this.name))));
        setSpeed(Input.instance.getDouble((String.format("Input %s's Speed", this.name))));
        setHealth(Input.instance.getDouble((String.format("Input %s's Health", this.name))));
    }

    @Override //This overides the Java's Object toString method.
    public String toString(){
        return String.format("Name:%-12s Health:%4.1f \t Speed:%4.1f \t Strength:%4.1f", this.name, this.health, this.speed, this.strength );
    }

    //getter and setters for Actor Strength Attribute
    //getter and setters for Actor Speed Attribute

    //getter and setters for Actor's Health
    public double getHealth() {
        return this.health;
    }

    public double getStrength(){
        return this.strength;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        if (speed > MAX_SPEED){
            System.out.printf("The entered Speed is greater than specified limits, setting the value to defined max %.1f instead %n", MAX_SPEED);
            this.speed = MAX_SPEED;
        } else if (speed < MIN_SPEED){
            System.out.printf("The entered Speed is lower than specified limits, setting the value to defined min %.1f instead %n", MIN_SPEED);
            this.speed = MIN_SPEED;
        } else {
            this.speed = speed;
        }
    }

    public void setHealth(double health) {
        if (health > MAX_HEALTH){
            System.out.printf("The entered Health value is greater than specified limits, setting the value to defined max %.1f instead %n", MAX_HEALTH);
            this.health = MAX_HEALTH;
        } else if (health < MIN_HEALTH){
            System.out.printf("The entered Health value is lower than specified limits, setting the value to defined min %.1f instead %n", MIN_HEALTH);
            this.health = MIN_HEALTH;
        } else {
            this.health = health;
        }
    }

    public void setStrength(double strength){
        if (strength > MAX_STRENGTH){
            System.out.printf("The entered Strength is greater than specified limits, setting the value to defined max %.1f instead %n", MAX_STRENGTH);
            this.strength = MAX_STRENGTH;
        } else if (strength < MIN_STRENGTH){
            System.out.printf("The entered Strength is lower than specified limits, setting the value to defined min %.1f instead %n", MIN_STRENGTH);
            this.strength = MIN_STRENGTH;
        } else {
            this.strength = strength;
        }
    }



}
