/*You have been assigned the task of designing an interface in Java for a system that 
manages various types of vehicles. The interface should provide a common set of methods 
that can be implemented by different types of vehicles, such as cars, motorcycles, and trucks.
The interface should include the following functionality:
•	Get the vehicle's identification number.
•	Get the vehicle's name and model.
•	Get the vehicle's current speed.
•	Accelerate the vehicle.
•	Decelerate the vehicle.
•	Get the vehicle's current fuel level.
•	Refuel the vehicle
 */

import java.util.Scanner;

public class Q1 {
    interface Vehicle {
        public int getIdentificationNumber();
        public String getNameAndModel();
        public int getCurrentSpeed();
        public void accelerate();
        public void decelerate();
        public int getCurrentFuelLevel();
        public void refuel();
    }
    static class Car implements Vehicle {
        private int identificationNumber;
        private String nameAndModel;
        private int currentSpeed;
        private int currentFuelLevel;
        
        public void getDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the identification number: ");
            identificationNumber = sc.nextInt();
            System.out.print("Enter the Name and model: ");
            nameAndModel = sc.next();
            System.out.print("Enter the current speed: ");
            currentSpeed = sc.nextInt();
            System.out.print("Enter the current fuel level: ");
            currentFuelLevel = sc.nextInt();
        }
 
        public int getIdentificationNumber() {
            return identificationNumber;
        }
        
        public String getNameAndModel() {
            return nameAndModel;
        }
        
        public int getCurrentSpeed() {
            return currentSpeed;
        }
        
        public void accelerate() {
            currentSpeed += 10;
        }
        
        public void decelerate() {
            currentSpeed -= 10;
        }
        
        public int getCurrentFuelLevel() {
            return currentFuelLevel;
        }
        
        public void refuel() {
            currentFuelLevel = 100;
        }
    }

    static class Motorcycle implements Vehicle {
        private int identificationNumber;
        private String nameAndModel;
        private int currentSpeed;
        private int currentFuelLevel;
        
        public void getDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the identification number: ");
            identificationNumber = sc.nextInt();
            System.out.print("Enter the Name and model: ");
            nameAndModel = sc.next();
            System.out.print("Enter the current speed: ");
            currentSpeed = sc.nextInt();
            System.out.print("Enter the current fuel level: ");
            currentFuelLevel = sc.nextInt();
        }
        
        public int getIdentificationNumber() {
            return identificationNumber;
        }
        
        public String getNameAndModel() {
            return nameAndModel;
        }
        
        public int getCurrentSpeed() {
            return currentSpeed;
        }
        
        public void accelerate() {
            currentSpeed += 5;
        }
        
        public void decelerate() {
            currentSpeed -= 5;
        }
        
        public int getCurrentFuelLevel() {
            return currentFuelLevel;
        }
        
        public void refuel() {
            currentFuelLevel = 100;
        }
    }

    static class Truck implements Vehicle {
        private int identificationNumber;
        private String nameAndModel;
        private int currentSpeed;
        private int currentFuelLevel;
        
        public void getDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the identification number: ");
            identificationNumber = sc.nextInt();
            System.out.print("Enter the Name and model: ");
            nameAndModel = sc.next();
            System.out.print("Enter the current speed: ");
            currentSpeed = sc.nextInt();
            System.out.print("Enter the current fuel level: ");
            currentFuelLevel = sc.nextInt();
        }
        
        public int getIdentificationNumber() {
            return identificationNumber;
        }
        
        public String getNameAndModel() {
            return nameAndModel;
        }
        
        public int getCurrentSpeed() {
            return currentSpeed;
        }
        
        public void accelerate() {
            currentSpeed += 3;
        }
        
        public void decelerate() {
            currentSpeed -= 3;
        }
        
        public int getCurrentFuelLevel() {
            return currentFuelLevel;
        }
        
        public void refuel() {
            currentFuelLevel = 100;
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("-----Enter the details of the car------");
        c.getDetails();

        String s = "--------------------------------------------------------------";
        System.out.println(s);
        System.out.println("Car details:");
        System.out.println(s);
        System.out.println("Identification number: " + c.getIdentificationNumber());
        System.out.println("Name and model: " + c.getNameAndModel());
        System.out.println("Current speed: " + c.getCurrentSpeed());
        c.accelerate();
        System.out.println("Current speed after accelerating: " + c.getCurrentSpeed());
        c.decelerate();
        System.out.println("Current speed after decelerating: " + c.getCurrentSpeed());
        System.out.println("Current fuel level: " + c.getCurrentFuelLevel());
        c.refuel();
        System.out.println("Current fuel level after refueling: " + c.getCurrentFuelLevel());
        System.out.println(s);

        Motorcycle m = new Motorcycle();
        System.out.println("------Enter the details of the motorcycle-------");
        m.getDetails();
        System.out.println(s);
        System.out.println("Motorcycle details");
        System.out.println(s);
        System.out.println("Identification number: " + m.getIdentificationNumber());
        System.out.println("Name and model: " + m.getNameAndModel());
        System.out.println("Current speed: " + m.getCurrentSpeed());
        m.accelerate();
        System.out.println("Current speed after accelerating: " + m.getCurrentSpeed());
        m.decelerate();
        System.out.println("Current speed after decelerating: " + m.getCurrentSpeed());
        System.out.println("Current fuel level: " + m.getCurrentFuelLevel());
        m.refuel();
        System.out.println("Current fuel level after refueling: " + m.getCurrentFuelLevel());
        System.out.println(s);
        
        Truck t = new Truck();
        System.out.println("-------Enter the details of the truck------");
        t.getDetails();
        System.out.println(s);
        System.out.println("Truck details:");
        System.out.println(s);
        System.out.println("Identification number: " + t.getIdentificationNumber());
        System.out.println("Name and model: " + t.getNameAndModel());
        System.out.println("Current speed: " + t.getCurrentSpeed());
        t.accelerate();
        System.out.println("Current speed after accelerating: " + t.getCurrentSpeed());
        t.decelerate();
        System.out.println("Current speed after decelerating: " + t.getCurrentSpeed());
        System.out.println("Current fuel level: " + t.getCurrentFuelLevel());
        t.refuel();
        System.out.println("Current fuel level after refueling: " + t.getCurrentFuelLevel());
        System.out.println(s);
    }
}
