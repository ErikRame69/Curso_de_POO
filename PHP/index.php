<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");
require_once("uberBlack.php")

$uberX = new uberX("DMR399", new Account("Daniel Mendoza", "DMID123"), "Chevrolet", "Aveo");
$uberX->printDataCar();

$uberPool = new uberPool("RME990", new Account("Erik Ramirez", "ERID303"), "Dodge", "Attitude");
$uberPool->printDataCar();

$uberPool = new uberBlack("ALR903", new Account("Alejandro Ramirez", "ARID909"), "Porche", "911 carrera s");
$uberPool->printDataCar();
?>