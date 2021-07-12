package JAVA;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial; 
    private Integer passenger;

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
            System.out.println("Bienvenido, Viajemos seguros con Uber =)");
           }
           else { 
               System.out.println("Oh oh, Parece que hacen falta más asientos :(");
           }
    }

    public UberVan(String license, Account driver, String string, String string2) {
        super(license, driver);
    }
}