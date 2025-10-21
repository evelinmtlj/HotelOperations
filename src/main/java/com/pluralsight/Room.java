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

    public void checkIn(){

          this.isDirty = true; //use this so no conflict with local variables
          this.isOccupied = true;
    }
//      if(isAvailable()){
//          isOccupied = true;
//          isDirty = true;
//      } else {
//          System.out.println("Room is not available");
//      }
//    }

    public void checkOut() {
        this.isOccupied = false;
//      isOccupied = false;
//      isDirty = true;
    }
    public void cleanRoom(){
          if(!isOccupied){
              this.isDirty = false;
          }
//     if(isOccupied){
//         System.out.println("Can't clean");
//     } else {
//         isDirty = false;
//         System.out.println("Clean room");
//
//     }
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", isOccupied=" + isOccupied +
                ", isDirty=" + isDirty +
                ", isAvailable=" + isAvailable()+ "}";
    }
}

