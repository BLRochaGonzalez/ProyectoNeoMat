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
-- Table structure for table `settlementbuilding`
--

DROP TABLE IF EXISTS `settlementbuilding`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `settlementbuilding` (
  `settlementbuildingid` bigint NOT NULL AUTO_INCREMENT,
  `buildlevel` int DEFAULT NULL,
  `buildtime` int NOT NULL,
  `reqcquantity` double NOT NULL,
  `reqequantity` double DEFAULT NULL,
  `reqgquantity` double NOT NULL,
  `reqrquantity` double DEFAULT NULL,
  `reqsquantity` double NOT NULL,
  `reqwquantity` double NOT NULL,
  `resourcequantity` double NOT NULL,
  `building` bigint DEFAULT NULL,
  `settlement` bigint DEFAULT NULL,
  PRIMARY KEY (`settlementbuildingid`),
  KEY `FKqvmm83hgjdr019u4a9sut6ar2` (`building`),
  KEY `FKlchrjm3lpm8d1p04wyuhpja1x` (`settlement`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `settlementbuilding`
--

LOCK TABLES `settlementbuilding` WRITE;
/*!40000 ALTER TABLE `settlementbuilding` DISABLE KEYS */;
INSERT INTO `settlementbuilding` VALUES (1,0,3,10,15,25,0,40,10,10,1,1),(2,0,3,15,15,20,0,35,15,10,2,1),(3,0,3,20,15,15,0,45,10,10,3,1),(4,0,3,15,15,10,0,50,20,10,4,1),(5,0,3,20,15,25,0,40,15,10,5,1),(6,0,3,10,0,30,0,50,10,81,6,1),(7,0,12,120,0,170,100,400,140,0,7,1),(8,0,12,140,0,130,100,320,100,0,8,1),(9,5,23,80,120,194,0,305,80,275,1,2),(10,5,23,80,80,108,0,190,80,431,2,2),(11,5,23,108,80,80,0,241,55,448,3,2),(12,8,92,125,125,83,0,411,163,1536,4,2),(13,2,7,34,26,43,0,68,26,22,5,2),(14,5,28,55,0,162,0,269,55,526,6,2),(15,2,28,480,0,680,400,1600,560,0,7,2),(16,4,65,2240,0,2080,1600,5120,1600,0,8,2),(17,0,3,10,15,25,0,40,10,10,1,3),(18,0,3,15,15,20,0,35,15,10,2,3),(19,0,3,20,15,15,0,45,10,10,3,3),(20,0,3,15,15,10,0,50,20,10,4,3),(21,0,3,20,15,25,0,40,15,10,5,3),(22,0,3,10,0,30,0,50,10,78,6,3),(23,0,14,120,0,170,100,400,140,0,7,3),(24,0,14,140,0,130,100,320,100,0,8,3);
/*!40000 ALTER TABLE `settlementbuilding` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-13 21:12:00
