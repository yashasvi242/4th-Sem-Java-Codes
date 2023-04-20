//Inheritance (2)


// parent
class Vehicle{
    String vehicleType;
} 

// child
public class Car extends Vehicle{
    String modelType;
    public void showDetails(){
        vehicleType = "Car";
        modelType = "Sports";
        System.out.println(modelType + " " + vehicleType);
    }
    public static void main(String[] args){
        Car car = new Car();
        car.showDetails();
        
        System.out.println(car.modelType);
        System.out.println(car.vehicleType);
    }
}
/*
Output :- 

Sports Car
Sports
Car


*/










