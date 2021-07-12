package JAVA;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo, estoy aprendiendo POO");
        Car car = new Car("DMR399", new Account("Daniel Mendoza", "DMID123"));
       // car.passegenger = 7;
        car.printDataCar();

       /* Car car2 = new Car("RME990", new Account("Erik Ramirez", "ERID303"));
        car2.passegenger = 3;
        car2.printDataCar();

        Car car3 = new Car("ALR903", new Account("Alejandro Ramirez", "ARID909"));
        car3.passegenger = 3;
        car3.printDataCar();*/
    }
} 
