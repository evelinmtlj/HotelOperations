package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


      public Room(int numberOfBeds){
          this.numberOfBeds = numberOfBeds;
          this.price = 120.00;
          this.isOccupied = false;
          this.isDirty = false;
      }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable(){
          return !(isDirty || isOccupied);
        //  if( isOccupied || isDirty){
            //  return false;
       //   }
       //   else{
        //      return true;
              // return !(isoccupied|| is Dirty;
        //  }
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", isOccupied=" + isOccupied +
                ", isDirty=" + isDirty +
                '}';
    }
}

