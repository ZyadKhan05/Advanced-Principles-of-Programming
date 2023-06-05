// This program was completed by Zyad Khan for CIS-232-01 Lab #1 on 2/1/23
// The purpose of this class is to create the sub class which extends the super class with additional attributes that the user inputs from main

public class player extends character {

    public static String getName(String name){
        return name;
    }
    public static String getColor(String color){
        return color;
    }
    public static String getSpecies(String species){
        return species;
    }


    public double getSpeed(){
        double speed = super.speed;
        return speed;
    }

    public double getStrength(){
        double strength = super.strength;
        return strength;
    }

    public boolean getPersonality(){
        boolean personality = super.personality;
        return personality;
    }
}