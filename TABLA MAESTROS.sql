CREATE DATABASE labUSI;
USE labUSI;
CREATE TABLE MAESTROS
(
ID int(20) auto_increment PRIMARY KEY,
CodigoMaestro  VARCHAR (10) NOT NULL,
NombreMaestro VARCHAR (50) NOT NULL,
DireccionMaestro VARCHAR (20) NOT NULL,
TelefonoMaestro VARCHAR (10) NOT NULL,
CorreoMaestro VARCHAR (20) NOT NULL,
EstatusMaestro VARCHAR (10) NOT NULL
) ENGINE=INNODB;
USE labUSI;
Select * From MAESTROS;