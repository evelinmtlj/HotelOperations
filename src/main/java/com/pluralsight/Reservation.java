package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(int numberOfNights, String roomType, boolean isWeekend) {
        this.numberOfNights = numberOfNights;
        this.roomType = roomType;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekends() {
        return isWeekend;
    }

    public void setIsWeekends(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice(){
        double basePrice;
        if(roomType.equalsIgnoreCase("king")){
            basePrice = 139;
        }
        else if (roomType.equalsIgnoreCase("double")){
            basePrice = 124;
        }
        else {
            return 0; //this should never really happen maybe throw an exception
        }

        if(isWeekend){
            return basePrice * 1.10;
        }
        else{
            return basePrice;
        }
    }
    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomType='" + roomType + '\'' +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + isWeekend + ", getPrice()=" + getPrice()+
                ", get reservation total()="+ getReservationTotal();
    }
}
