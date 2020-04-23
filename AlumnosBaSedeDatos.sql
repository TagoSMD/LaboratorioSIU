CREATE DATABASE alumnosm;
USE alumnosm;
CREATE TABLE  alumnos
(
ID int (20) auto_increment PRIMARY KEY,
carnet_alumnos varchar(5),
nombre_alumnos varchar(60),
dirreccion_alumnos varchar(60),
telefono_alumnos varchar(10),
correo_alumnos varchar(15),
estatus_alumnos varchar(10)
)engine=InnoDB default charset=latin1;

USE alumnosm;
Select * From alumnos;