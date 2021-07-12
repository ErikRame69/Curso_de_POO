<?php
require_once('Account.php');
classCar {

public $id;
public $license;
public $driver;
protected $passenger; // Es importante que esta propiedad esté marcada como protected

publicfunction__construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

 publicfunctionprintDataCar() {
echo    "
            Licencia: $this->license
            Driver: {$this->driver->name}
            Número de pasajeros: $this->passenger
        
        
        ";
        }
            

publicfunctionsetPassenger($passenger) {

     if ($passenger == 4) {
             $this->passenger = $passenger;
          }
      else {
       echo "Necesitas asignar 4 pasajeros";
           }
     }
}
?>