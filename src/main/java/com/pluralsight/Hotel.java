package com.pluralsight;

public class Hotel {

   private String name;
    private int numberOfSuites;
    private int numerofBasicRooms;
    private int bookedSuites;
    private int  bookedBasicRooms;
    private int numberOfRooms;

    public int getnumberofRooms() {
        return numberOfRooms;
    }

    public int getNumerofBasicRooms() {
        return numerofBasicRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }


    //constructors

    public Hotel(String name, int numberOfSuites, int bookedSuites, int numberOfRooms, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = bookedSuites;
        this.numerofBasicRooms = numberOfRooms;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public Hotel(String name,int numberOfSuites, int numerofBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numerofBasicRooms = numerofBasicRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public String getName() {
        return name;
    }
    //methods
    public boolean bookRoom(int numerofBasicRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= getAvailableSuites()) {
                bookedSuites += numberOfRooms; //check number of rooms
                return true;
            } else {
                return false;

            }  else{
                if (numberOfRooms <= getNumerofBasicRooms()) {
                    bookedBasicRooms += numberOfRooms; //number of rooms
                    return true;
                }
            }   else{
                return false;
            }
        }
    }
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableClassicRooms(){
        return numerofBasicRooms - bookedBasicRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", numberOfSuites=" + numberOfSuites +
                ", numerofBasicRooms=" + numerofBasicRooms +
                ", bookedSuites=" + bookedSuites +
                ", bookedBasicRooms=" + bookedBasicRooms +
                ", getAvailableSuites()=" + getAvailableSuites()+  // when you use  get use ()
                ",getAvailableBasicRooms()=" + getAvailableClassicRooms()+  //available basic rooms
                '}';
    }
}
