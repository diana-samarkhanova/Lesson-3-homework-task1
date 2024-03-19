public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Highlander", 70.5); //assigning values to the variable of the first car
        Car car2 = new Car ("Audi", "A7", 90.8); //assigning values to the variable of the first car
        car1.start(); //calling method <start> for the first car
        car1.stop(); //calling method <stop> for the second car
        //Printing of the assigned values for the first car
        System.out.println("First car brand: " + car1.brand + ". Model: " + car1.model + ". Speed: " + car1.speed + " km/h");

        car2.start(); //calling method <start> for the second car
        car2.stop();//calling method <stop> for the second car
        //Printing of the assigned values for the second car
        System.out.println("Second car brand: " + car2.brand + ". Model: " + car2.model + ". Speed: " + car2.speed + " km/h");


    }

}
