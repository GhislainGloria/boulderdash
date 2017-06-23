CREATE DATABASE BoulderDash;
USE BoulderDash;
-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Lun 12 Juin 2017 à 20:25
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `boulderdash`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllExamples` ()  NO SQL
SELECT id, name
FROM example$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleById` (IN `id` INT)  NO SQL
SELECT id, name
FROM example
WHERE example.id = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleByName` (IN `name` VARCHAR(255))  NO SQL
SELECT id, name
FROM example
WHERE example.name = name$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `example`
--

CREATE TABLE `example` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `example`
--

INSERT INTO `example` (`id`, `name`) VALUES
(1, 'Example 1'),
(2, 'Example 2'),
(3, 'Example 3'),
(4, 'Exmaple 4');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `example`
--
ALTER TABLE `example`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `example`
--
ALTER TABLE `example`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Object
#------------------------------------------------------------

CREATE TABLE Object(
        IDObject  int (11) Auto_increment  NOT NULL ,
        NomObject Varchar (25) ,
        IDDiamond Int ,
        IDBoulder Int ,
        PRIMARY KEY (IDObject )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Wall
#------------------------------------------------------------

CREATE TABLE Wall(
        IDWall int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDWall )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Monster
#------------------------------------------------------------

CREATE TABLE Monster(
        IDMonster      int (11) Auto_increment  NOT NULL ,
        NomMonster     Varchar (25) ,
        IDBubbleBubble Int ,
        IDTackyTacky   Int ,
        IDPuffPuff     Int ,
        IDPingPing     Int ,
        PRIMARY KEY (IDMonster )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Dimension
#------------------------------------------------------------

CREATE TABLE Dimension(
        IDDimension int (11) Auto_increment  NOT NULL ,
        Width       Int NOT NULL ,
        Height      Int NOT NULL ,
        IDElement   Int ,
        IDLevel     Int ,
        PRIMARY KEY (IDDimension )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Mud
#------------------------------------------------------------

CREATE TABLE Mud(
        IDMud int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDMud )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Element
#------------------------------------------------------------

CREATE TABLE Element(
        IDElement    int (11) Auto_increment  NOT NULL ,
        NomElement   Varchar (25) ,
        X            Int NOT NULL ,
        Y            Int NOT NULL ,
        MaxX         Int NOT NULL ,
        MaxY         Int NOT NULL ,
        MinX         Int NOT NULL ,
        MinY         Int NOT NULL ,
        IDDimension  Int ,
        IDMobile     Int ,
        IDMotionless Int NOT NULL ,
        PRIMARY KEY (IDElement )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Mobile
#------------------------------------------------------------

CREATE TABLE Mobile(
        IDMobile   int (11) Auto_increment  NOT NULL ,
        NomMobile  Varchar (25) ,
        Direction  Varchar (25) NOT NULL ,
        IDObject   Int ,
        IDRockFord Int ,
        IDMonster  Int ,
        PRIMARY KEY (IDMobile )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Motionless
#------------------------------------------------------------

CREATE TABLE Motionless(
        IDMotionless  int (11) Auto_increment  NOT NULL ,
        NomMotionless Varchar (25) NOT NULL ,
        IDWall        Int ,
        IDMud         Int ,
        PRIMARY KEY (IDMotionless )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Level
#------------------------------------------------------------

CREATE TABLE Level(
        IDLevel     int (11) Auto_increment  NOT NULL ,
        NomLevel    Varchar (25) ,
        IDDimension Int ,
        PRIMARY KEY (IDLevel )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: RockFord
#------------------------------------------------------------

CREATE TABLE RockFord(
        IDRockFord  int (11) Auto_increment  NOT NULL ,
        NomRockFord Varchar (25) ,
        PRIMARY KEY (IDRockFord )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: BubbleBubble
#------------------------------------------------------------

CREATE TABLE BubbleBubble(
        IDBubbleBubble int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDBubbleBubble )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: PingPing
#------------------------------------------------------------

CREATE TABLE PingPing(
        IDPingPing int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDPingPing )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: PuffPuff
#------------------------------------------------------------

CREATE TABLE PuffPuff(
        IDPuffPuff int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDPuffPuff )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: TackyTacky
#------------------------------------------------------------

CREATE TABLE TackyTacky(
        IDTackyTacky int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDTackyTacky )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Boulder
#------------------------------------------------------------

CREATE TABLE Boulder(
        IDBoulder int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDBoulder )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Diamond
#------------------------------------------------------------

CREATE TABLE Diamond(
        IDDiamond int (11) Auto_increment  NOT NULL ,
        PRIMARY KEY (IDDiamond )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: ArrayList<Element>
#------------------------------------------------------------

CREATE TABLE ArrayList_Element_(
        IDElement Int NOT NULL ,
        IDLevel   Int NOT NULL ,
        PRIMARY KEY (IDElement ,IDLevel )
)ENGINE=InnoDB;

ALTER TABLE Object ADD CONSTRAINT FK_Object_IDDiamond FOREIGN KEY (IDDiamond) REFERENCES Diamond(IDDiamond);
ALTER TABLE Object ADD CONSTRAINT FK_Object_IDBoulder FOREIGN KEY (IDBoulder) REFERENCES Boulder(IDBoulder);
ALTER TABLE Monster ADD CONSTRAINT FK_Monster_IDBubbleBubble FOREIGN KEY (IDBubbleBubble) REFERENCES BubbleBubble(IDBubbleBubble);
ALTER TABLE Monster ADD CONSTRAINT FK_Monster_IDTackyTacky FOREIGN KEY (IDTackyTacky) REFERENCES TackyTacky(IDTackyTacky);
ALTER TABLE Monster ADD CONSTRAINT FK_Monster_IDPuffPuff FOREIGN KEY (IDPuffPuff) REFERENCES PuffPuff(IDPuffPuff);
ALTER TABLE Monster ADD CONSTRAINT FK_Monster_IDPingPing FOREIGN KEY (IDPingPing) REFERENCES PingPing(IDPingPing);
ALTER TABLE Dimension ADD CONSTRAINT FK_Dimension_IDElement FOREIGN KEY (IDElement) REFERENCES Element(IDElement);
ALTER TABLE Dimension ADD CONSTRAINT FK_Dimension_IDLevel FOREIGN KEY (IDLevel) REFERENCES Level(IDLevel);
ALTER TABLE Element ADD CONSTRAINT FK_Element_IDDimension FOREIGN KEY (IDDimension) REFERENCES Dimension(IDDimension);
ALTER TABLE Element ADD CONSTRAINT FK_Element_IDMobile FOREIGN KEY (IDMobile) REFERENCES Mobile(IDMobile);
ALTER TABLE Element ADD CONSTRAINT FK_Element_IDMotionless FOREIGN KEY (IDMotionless) REFERENCES Motionless(IDMotionless);
ALTER TABLE Mobile ADD CONSTRAINT FK_Mobile_IDObject FOREIGN KEY (IDObject) REFERENCES Object(IDObject);
ALTER TABLE Mobile ADD CONSTRAINT FK_Mobile_IDRockFord FOREIGN KEY (IDRockFord) REFERENCES RockFord(IDRockFord);
ALTER TABLE Mobile ADD CONSTRAINT FK_Mobile_IDMonster FOREIGN KEY (IDMonster) REFERENCES Monster(IDMonster);
ALTER TABLE Motionless ADD CONSTRAINT FK_Motionless_IDWall FOREIGN KEY (IDWall) REFERENCES Wall(IDWall);
ALTER TABLE Motionless ADD CONSTRAINT FK_Motionless_IDMud FOREIGN KEY (IDMud) REFERENCES Mud(IDMud);
ALTER TABLE Level ADD CONSTRAINT FK_Level_IDDimension FOREIGN KEY (IDDimension) REFERENCES Dimension(IDDimension);
ALTER TABLE ArrayList_Element_ ADD CONSTRAINT FK_ArrayList_Element__IDElement FOREIGN KEY (IDElement) REFERENCES Element(IDElement);
ALTER TABLE ArrayList_Element_ ADD CONSTRAINT FK_ArrayList_Element__IDLevel FOREIGN KEY (IDLevel) REFERENCES Level(IDLevel);