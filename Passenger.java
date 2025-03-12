   /**
    * Passenger class gives name to passenger 
    *so they can be added or removed from 
    */
public class Passenger implements PassengerRequirements{
    
    private String name;

   /**
    * Constructor that gives passanger a name.
    */
    public Passenger(String name) {
        this.name = name;
    }

   /**
    * If there is space on the car indicated in car.java,
    *this lets passenger board the car. An error message is given if
    *car is at max capacity.
    */
    public void boardCar(Car c){
        if(c.addPassenger(this)){
            System.out.println(name + " got on the car.");
        }else{
            System.out.println("Sorry" + name +  "! This car is at max capacity!");
        }
        

    }

   /**
    * If user is in the car they can get off the car.
    */
    public void getOffCar(Car c){
        if(c.removePassenger(this)){
            System.out.println(name + " got off of the car.");
        }
        
    }
}
