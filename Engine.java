

   /**
    * Implements the methods from engine requirments
    */
public class Engine implements EngineRequirements {
    private FuelType f;
    private double currentFuel;
    private double maxFuel;

   /**
    * Constructor for fuel type, the current fuel level, and the max fuel level of the train
    */
    public Engine(FuelType f, double currentFuel, double maxFuel){ //initialize engine
        this.f = f;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    } 
    
   /**
    * Allows access to FuelType
    */
    public FuelType getFuelType(){
        return this.f;
    }

   /**
    * Allows access to currentFuel
    */
    public double getCurrentFuel(){
        return this.currentFuel;
    }

   /**
    * Allows access to maxFuel
    */
    public double getMaxFuel(){
        return this.maxFuel;
    }
        
   /**
    * Refuels the engine to max fuel level
    */
    public void refuel(){
        this.currentFuel = this.maxFuel;
    }

   /**
    * Starts the train if their is enough fuel.
    */
    public Boolean go(){
        if (this.currentFuel >= 10){ //If the fuel level is not empty, let the train move
            this.currentFuel -= 10; //Subtract 10 from fuel level per trip
            return true;
        }else{
            return false;
        }
        
       
    }
}

