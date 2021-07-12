package JAVA;

class Car {
    private Integer id;
    private Integer passenger;
    private String license;
    private Account driver;

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
            System.out.println("Oh oh, Parece que hacen falta más asientos :(");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}