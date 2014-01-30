package assignment1;// N.B.  Use of default package at this point in
                    // the program would indicate a lack of knowledge on the part of the student!
import java.util.Formatter;
import java.lang.String;


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
    public final static double MIN_HEALTH = 1.0;

    public final static double MAX_SPEED = 100.0;
    public final static double MIN_SPEED = 1.0;

    public final static double MAX_STRENGTH = 100.0;
    public final static double MIN_STRENGTH = 1.0;


    public static int actorSerialNumber = 0; //Starts with 0, incresed everytime it's used.

    private String name;
    private double strength;
    private double speed;
    private double health;

    // Actor Constructor
    Actor() {
        actorSerialNumber++;
        name = String.format("%s%d", name, actorSerialNumber);
        strength = SingletonRandom.instance.getNormalDistribution(MIN_STRENGTH, MAX_STRENGTH, 0.1);
        speed = SingletonRandom.instance.getNormalDistribution(MIN_SPEED, MAX_SPEED, 0.1);
        health = SingletonRandom.instance.getNormalDistribution(MIN_HEALTH, MAX_HEALTH, 0.1);
    }

    public void inputAllFields(){
        this.strength = setStrength(Input.instance.getDouble( (String.format("Input %s's Strength", this.name))));
        this.speed = setSpeed(Input.instance.getDouble((String.format("Input %s's Speed", this.name))));
        this.health = setHealth(Input.instance.getDouble((String.format("Input %s's Health", this.name))));
    }

    public String toString(){
        return String.format("Name:%-12s Strength:%4.1f Health:%4.1f", this.name, this.strength, this.health);
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
            this.speed = MAX_SPEED;
        } else if (speed < MIN_SPEED){
            this.speed = MIN_SPEED;
        } else {
            this.speed = speed;
        }
    }



    public void setHealth(double health) {
        if (health > MAX_HEALTH){
            this.health = MAX_HEALTH;
        } else if (health < MIN_HEALTH){
            this.health = MIN_HEALTH;
        } else {
            this.health = health;
        }
    }

    public void setStrength(double strength){
        if (strength > MAX_STRENGTH){
            this.strength = MAX_STRENGTH;
        } else if (strength < MIN_STRENGTH){
            this.strength = MIN_STRENGTH;
        } else {
            this.strength = strength;
        }
    }


}
