-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: neomaterial
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `troup`
--

DROP TABLE IF EXISTS `troup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `troup` (
  `troupid` bigint NOT NULL AUTO_INCREMENT,
  `createtime` int DEFAULT NULL,
  `damage` double DEFAULT NULL,
  `description` longtext NOT NULL,
  `isdef` tinyint(1) NOT NULL,
  `life` double DEFAULT NULL,
  `name` varchar(45) NOT NULL,
  `reqcquantity` double NOT NULL,
  `reqgquantity` double NOT NULL,
  `reqrquantity` double DEFAULT NULL,
  `reqsquantity` double NOT NULL,
  `reqwquantity` double NOT NULL,
  `shield` double DEFAULT NULL,
  PRIMARY KEY (`troupid`),
  UNIQUE KEY `UK_sda6e8e8ibrmhubcpt2eywwk8` (`name`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `troup`
--

LOCK TABLES `troup` WRITE;
/*!40000 ALTER TABLE `troup` DISABLE KEYS */;
INSERT INTO `troup` VALUES (1,13,0,'Vehiculo ultra ligero casi indetectable para las defensas enemigas',0,800,'Espía',900,1000,50,1000,800,10),(2,32,80,'Vehiculo ágil desarrollado para incursiones tras las fronteras enemigas',0,3200,'Avispa',1200,1250,200,1500,1500,50),(3,48,240,'Vehiculo básico de ataque, usdo como primera linea de fuego en los combates',0,6000,'Cazador Ligero',2500,2000,220,3000,2500,100),(4,102,500,'Vehiculo de ataque mas robusto que su predecesor',0,8000,'Cazador Pesado',3200,3400,260,6000,5600,250),(5,48,10,'Vehiculo de carga que transporta recursos',0,5000,'Nave Pequeña de Carga',4300,5000,300,2000,8000,6000),(6,64,16015,'Vehiculo pesado con gran capacidad para el transporte',0,10000,'Nave Grande de Carga',6700,7500,350,6000,12000,31000),(7,122,5,'Vehiculo blindado que sirve de escudo ante el enemigo',0,20000,'Escolta',5000,6500,500,17000,10000,500),(8,160,400,'vehiculo que usa rayos laser a modo de ataque',0,7000,'Asaltador Ligero',7500,10000,1000,12000,15000,250),(9,179,750,'vehiculo de mayor tamaño que usa un cañon laser doble',0,9000,'Asaltador Pesado',12500,18000,1500,15000,22500,400),(10,192,900,'Vehiculo extremadamente blindado que ataca con impulsos electromagneticos',0,40000,'Acorazado',28000,20000,3000,60000,31000,1000),(11,211,1500,'Vehiculo diseñado para lanzar misiles de gran potencia',0,15000,'Bombardero',44000,24000,5000,35000,40000,600),(12,224,1200,'Vehiculo con un fuerte blindaje y gran daño con su cañon laser',0,20000,'Destructor',60000,30000,7500,40000,50000,750),(13,512,5000,'Vehiculo de dimensiones masivas preparado para la guerra, su ataque es devastador',0,150000,'Gran Wick',260000,220000,100000,500000,300000,150000),(14,384,0,'Fortaleza que defiende la ciudad de el asedio de los atacantes',1,200000,'El Muro',32000,30000,0,70000,45000,0),(15,19,50,'Robot de defensa de escasa durabilidad, dará su vida por defender a su pueblo',1,4000,'Araña',300,380,0,700,500,0),(16,38,170,'Robot estatico preparado para la defensa del asentamiento',1,8000,'Lanzamisiles',1700,700,0,2000,1500,0),(17,77,340,'Cañón de gran envergadura, su ataque a traves de rayos laser son eficaces contra los ataques del exterior',1,9750,'Torre Cañón',3000,1500,0,3800,2750,0),(18,96,875,'Robot que reconoce al enemigo a traves de su sistema de rayos infrarojos y despues aniquila lo que se ponga delante',1,15000,'Defensor',4500,3000,0,4900,5750,0),(19,102,1050,'Robot masivo de defensa, eficaz en la defensa y con mayor armamento para su labor',1,23000,'Anti Asedio',7800,6000,0,12500,9500,0),(20,122,1400,'Maquina de guerra destinada a la defensa a traves de misiles, balas, sierras cuerpo a cuerpo... es el robot perfecto de defensa... o casi',1,30000,'Tron-X',17000,14000,0,30000,18000,0),(21,160,3200,'Robot mega masivo altamente veloz y sigiloso, el daño de sus cañónes laseres a poca distancia son letales para aquel que se le ponga en frente',1,35000,'Laser Dog',26000,22000,0,50000,30000,0);
/*!40000 ALTER TABLE `troup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-13 21:12:01
