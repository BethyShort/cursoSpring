-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.4-m7


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ejemplos
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ ejemplos;
USE ejemplos;

--
-- Table structure for table `ejemplos`.`customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `CUSTOMER_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `CREATED_DATE` datetime NOT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ejemplos`.`customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`CUSTOMER_ID`,`NAME`,`ADDRESS`,`CREATED_DATE`) VALUES 
 (17,'mkyong2','address2','2012-11-15 12:53:33'),
 (18,'Antonio','Calle Madrid','2012-11-15 12:55:06'),
 (19,'Pepe','Coslada','2012-11-15 13:03:17');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Table structure for table `ejemplos`.`roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `role` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ejemplos`.`roles`
--

/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id`,`role`) VALUES 
 (1,'ROLE_USER'),
 (2,'ROLE_ADMIN'),
 (3,'ROLE_ROOT');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;


--
-- Table structure for table `ejemplos`.`stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `STOCK_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `STOCK_CODE` varchar(10) NOT NULL,
  `STOCK_NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`STOCK_ID`) USING BTREE,
  UNIQUE KEY `UNI_STOCK_NAME` (`STOCK_NAME`),
  UNIQUE KEY `UNI_STOCK_ID` (`STOCK_CODE`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ejemplos`.`stock`
--

/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`STOCK_ID`,`STOCK_CODE`,`STOCK_NAME`) VALUES 
 (12,'7669','HAIO2'),
 (14,'7670','HAIO3'),
 (16,'7671','HAIO4');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;


--
-- Table structure for table `ejemplos`.`trabajadores`
--

DROP TABLE IF EXISTS `trabajadores`;
CREATE TABLE `trabajadores` (
  `id` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `departamento` varchar(20) NOT NULL DEFAULT 'No Asignado',
  `numero_trabajador` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`numero_trabajador`) USING BTREE,
  UNIQUE KEY `Index_2` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ejemplos`.`trabajadores`
--

/*!40000 ALTER TABLE `trabajadores` DISABLE KEYS */;
INSERT INTO `trabajadores` (`id`,`nombre`,`departamento`,`numero_trabajador`) VALUES 
 ('990','Antony','Urgente',84),
 ('101','Antonio','Contabilidad',96),
 ('102','Juan','Informatica',97);
/*!40000 ALTER TABLE `trabajadores` ENABLE KEYS */;


--
-- Table structure for table `ejemplos`.`usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL DEFAULT '',
  `id_role` int(10) unsigned NOT NULL DEFAULT '0',
  `password` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `FK_usuarios_1` (`id_role`),
  CONSTRAINT `FK_usuarios_1` FOREIGN KEY (`id_role`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ejemplos`.`usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`id`,`username`,`id_role`,`password`) VALUES 
 (2,'user',1,'user'),
 (3,'admin',2,'admin'),
 (4,'root',3,'root');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
