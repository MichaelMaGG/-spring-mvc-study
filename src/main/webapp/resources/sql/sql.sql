CREATE DATABASE `ims`CHARACTER SET utf8 ;

CREATE TABLE `ims`.`manager`
( `id` FLOAT(20) NOT NULL AUTO_INCREMENT, `name` VARCHAR(50), `password` VARCHAR(50), PRIMARY KEY (`id`) ) 
CHARSET=utf8; 

CREATE TABLE `ims`.`user`
( `id` INT NOT NULL AUTO_INCREMENT, `name` VARCHAR(50), `gender` INT, `age` INT, `level` INT, PRIMARY KEY (`id`) ) 
CHARSET=utf8; 

CREATE TABLE `ims`.`car`
( `id` INT NOT NULL AUTO_INCREMENT, `userid` INT, `catid` INT, `load` INT, `brand` VARCHAR(50), PRIMARY KEY (`id`) ) 
CHARSET=utf8; 