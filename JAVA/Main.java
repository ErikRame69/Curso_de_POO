package JAVA;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo, estoy aprendiendo POO");
        Car car = new Car();
        car.license = "EDR399";
        car.driver = "Daniel Mendoza";
        car.passegenger = 7;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "RME990";
        car2.driver = "Erik Ramirez";
        car2.passegenger = 3;
        car2.printDataCar();

        Car car3 = new Car();
        car3.license = "EDR903";
        car3.driver = "Daniel Ramirez";
        car3.passegenger = 3;
        car3.printDataCar();
    }
} 
