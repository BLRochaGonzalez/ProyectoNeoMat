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
-- Table structure for table `settlementresearch`
--

DROP TABLE IF EXISTS `settlementresearch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `settlementresearch` (
  `settlementresearchid` bigint NOT NULL AUTO_INCREMENT,
  `reqcquantity` double NOT NULL,
  `reqgquantity` double NOT NULL,
  `reqrquantity` double DEFAULT NULL,
  `reqsquantity` double NOT NULL,
  `reqwquantity` double NOT NULL,
  `researchlevel` int DEFAULT NULL,
  `researchtime` int NOT NULL,
  `research` bigint DEFAULT NULL,
  `settlement` bigint DEFAULT NULL,
  PRIMARY KEY (`settlementresearchid`),
  KEY `FK14aldceqq244ie1lnlhj07uv0` (`research`),
  KEY `FK93cgv749y5kpop8duawjgf4wc` (`settlement`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `settlementresearch`
--

LOCK TABLES `settlementresearch` WRITE;
/*!40000 ALTER TABLE `settlementresearch` DISABLE KEYS */;
INSERT INTO `settlementresearch` VALUES (1,150,200,0,20,20,0,5,1,1),(2,280,470,0,15,25,0,17,2,1),(3,250,500,0,75,50,0,11,3,1),(4,15,25,0,300,250,0,24,4,1),(5,100,60,0,700,30,0,19,5,1),(6,25,30,0,670,450,0,26,6,1),(7,600,800,0,80,80,2,16,1,2),(8,2240,3760,0,120,200,3,97,2,2),(9,500,1000,0,150,100,1,20,3,2),(10,15,25,0,300,250,0,24,4,2),(11,100,60,0,700,30,0,19,5,2),(12,25,30,0,670,450,0,26,6,2),(13,150,200,0,20,20,0,5,1,3),(14,280,470,0,15,25,0,17,2,3),(15,250,500,0,75,50,0,11,3,3),(16,15,25,0,300,250,0,24,4,3),(17,100,60,0,700,30,0,19,5,3),(18,25,30,0,670,450,0,26,6,3);
/*!40000 ALTER TABLE `settlementresearch` ENABLE KEYS */;
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
