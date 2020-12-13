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
-- Table structure for table `settlementtroup`
--

DROP TABLE IF EXISTS `settlementtroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `settlementtroup` (
  `settlementtroupid` bigint NOT NULL AUTO_INCREMENT,
  `quantity` int DEFAULT NULL,
  `settlement` bigint DEFAULT NULL,
  `troup` bigint DEFAULT NULL,
  PRIMARY KEY (`settlementtroupid`),
  KEY `FKthp21k3q1o3ktlynyp9onhlqp` (`settlement`),
  KEY `FK66btdchm7mk7hs5r0tifeh9lh` (`troup`)
) ENGINE=MyISAM AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `settlementtroup`
--

LOCK TABLES `settlementtroup` WRITE;
/*!40000 ALTER TABLE `settlementtroup` DISABLE KEYS */;
INSERT INTO `settlementtroup` VALUES (1,2,1,1),(2,0,1,2),(3,0,1,3),(4,0,1,4),(5,0,1,5),(6,0,1,6),(7,0,1,7),(8,0,1,8),(9,0,1,9),(10,0,1,10),(11,0,1,11),(12,0,1,12),(13,0,1,13),(14,0,1,14),(15,0,1,15),(16,0,1,16),(17,0,1,17),(18,0,1,18),(19,0,1,19),(20,0,1,20),(21,0,1,21),(22,8,2,1),(23,2,2,2),(24,0,2,3),(25,0,2,4),(26,0,2,5),(27,0,2,6),(28,0,2,7),(29,0,2,8),(30,0,2,9),(31,0,2,10),(32,0,2,11),(33,0,2,12),(34,0,2,13),(35,0,2,14),(36,0,2,15),(37,0,2,16),(38,0,2,17),(39,0,2,18),(40,0,2,19),(41,0,2,20),(42,0,2,21),(43,0,3,1),(44,0,3,2),(45,0,3,3),(46,0,3,4),(47,0,3,5),(48,0,3,6),(49,0,3,7),(50,0,3,8),(51,0,3,9),(52,0,3,10),(53,0,3,11),(54,0,3,12),(55,0,3,13),(56,0,3,14),(57,0,3,15),(58,0,3,16),(59,0,3,17),(60,0,3,18),(61,0,3,19),(62,0,3,20),(63,0,3,21);
/*!40000 ALTER TABLE `settlementtroup` ENABLE KEYS */;
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
