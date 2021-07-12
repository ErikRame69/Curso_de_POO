<?php
require_once("Car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("Account.php");
require_once("uberBlack.php");
require_once("uberVan.php")

$uberX = new uberX("DMR399", new Account("Daniel Mendoza", "DMID123"), "Chevrolet", "Aveo");
$uberX->setPassenger(4);
$uberX->printDataCar();

$uberPool = new uberPool("RME990", new Account("Erik Ramirez", "ERID303"), "Dodge", "Attitude");
$uberPool->printDataCar();

$uberBlack = new uberBlack("ALR903", new Account("Alejandro Ramirez", "ARID909"), "Porche", "911 carrera s");
$uberBlack->printDataCar();

$uberVan =new uberVan("OJL395",new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

?>