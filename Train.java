import java.util.ArrayList;

public class Train implements TrainRequirements {

        private ArrayList<Car> carsAttached;
        private Engine engine;
        

        Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
            this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
            this.carsAttached = new ArrayList<>();
            
        }

        public Engine getEngine(){
            return this.engine;

        }
        
        public Car getCar(int i){
            return carsAttached.get(i);
        }

        public int getMaxCapacity(){
            int totalMaxCapacity = 0;
            for (int i = 0; i < carsAttached.size(); i++){
                totalMaxCapacity += carsAttached.get(i).getCapacity();
            }
            return totalMaxCapacity;
        }

        public int seatsRemaining(){
            int totalSeatsOpen = 0;
            for (int i = 0; i < carsAttached.size(); i++){
                totalSeatsOpen += carsAttached.get(i).seatsRemaining(); 
            }
            return totalSeatsOpen;
        }

        public void printManifest(){
            for (int i = 0; i < carsAttached.size(); i++) {
                carsAttached.get(i).printManifest();
            }
            
        }

    }


