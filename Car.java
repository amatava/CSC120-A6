import java.util.ArrayList;

   /**
    * Car Class refers to a specific car that holds a certain amount of passengers.
    * Multiple car classes make up the train.
    */
public class Car implements CarRequirements {

    private ArrayList<Passenger> passengersOnboard; //stores passenger names in car
    private int maxCapacity;

   /**
    * Constructor for car object
    */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        passengersOnboard = new ArrayList<>(maxCapacity); 
      }

   /**
    * Returns maximum capacity of car.
    */
      public int getCapacity(){
        return maxCapacity;
      }
      
   /**
    * Returns number of seats left in car.
    */
      public int seatsRemaining(){
        return maxCapacity - passengersOnboard.size();
      }

   /**
    * Adds passenger to the car if there is room. Returns a boolean indicating
    * if a passenger was added.
    */
      public boolean addPassenger(Passenger p){
        if (passengersOnboard.size() < maxCapacity){ //If there is room on the train
            passengersOnboard.add(p);
            return true;
        }else{
            return false;
        }    
      }
  
   /**
    * Removes passenger from the car if they get off. Returns boolean indicating
    * if a passenger was removed.
    */
      public boolean removePassenger(Passenger p){
        if (passengersOnboard.contains(p)){ //if the passenger is in the car, remove
            passengersOnboard.remove(p); 
            return true;
        }else{ //if passenger not in the car, print error message
            System.out.println("Error: passenger not found");
            return false;
        }
         
      }

   /**
    * Prints a list of the passengers currently in the car.
    */
      public void printManifest(){
        if(passengersOnboard.size() > 0){ //Check if anyone is on board
            System.out.println("Passengers Currently Onboard: " + passengersOnboard);
        }else{
            System.out.println("This car is EMPTY.");
        }
      }
    

    
}
   
