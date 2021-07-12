package JAVA;

class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        
    }

    void printDataCar() {
        if(passenger != null){
            System.out.println("Car License: " + license +  "  Name Driver: " + driver.name + " Passenger: " + passenger);
        }
        
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if(passenger == 4){
         this.passenger = passenger;
         System.out.println("Bienvenido, Viajemos seguros con Uber =)");
        }
        else { 
            System.out.println("Oh oh, Parece que hacen falta más acompañantes :(");
        }
    }



}