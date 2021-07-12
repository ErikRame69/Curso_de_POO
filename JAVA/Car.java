package JAVA;

class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        System.out.println("passegenger:" +passegenger);
    }

    void printDataCar() {
        System.out.println("Car License: " + license +  "  Name Driver: " + driver.name);
    }
}