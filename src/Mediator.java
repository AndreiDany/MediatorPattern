
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Mediator {

	private static ArrayList<Car> cars = new ArrayList<Car>();

    public static void RegisterCar(Car car)
    {
        if(!cars.contains(car))
        	cars.add(car);
    }

    public static Car getCar() {
    	
    	cars.sort(Comparator.comparing(Car::getDistance));
    	
    	System.out.println("Alege soferul: ");
    	
    	int numberofCars = 1; 
    	
    	for(Car car:cars) {
    		
    		if(car.isInProgress() == false){
            	
    			System.out.println("[" + numberofCars + "] " + car.getDriverName());
    			numberofCars++;
    		}
            
            if(numberofCars == 4) break;
        }
    	
    	
    	boolean optionChosed = false;
    	
    	while(!optionChosed){
    		
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
				
			if(option == 1){
				optionChosed = true;
				return cars.get(0);
			}
			else if(option == 2){
				optionChosed = true;
				return cars.get(1);
			}
			else {
				optionChosed = true;
				return cars.get(2);
			}
		}
    	
    	return null;
    }
    
    public static void sendCar(Client client) {
    	
    	Car car = getCar();
    	
    	if( car != null ) {
    		
    		if(car.acceptance(client)) {
    			car.setInProgress(true);
    			System.out.println("Masina " + car.getId() + " a preluat clientul " + client.getName());
    		}
    		else {
    			System.out.println("Soferul a respins comanda");
    			sendCar(client);
    		}
    	}
    }
}
