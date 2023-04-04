
/*Skapandet av databasen hattProjektet */
CREATE DATABASE hattProjektet;
USE hattProjektet;

/*Koden skapar databasen för att möjliggöra skapandet av en användare för uppkoppling till databasen och skapandet av tabellerna.*/
/*
    Skapa användare för uppkoppling mot databasen
 */

CREATE USER hattProjektet@localhost IDENTIFIED BY 'hattkey';
GRANT ALL PRIVILEGES ON hattProjektet.* TO hattProjektet@localhost;

CREATE TABLE specialHattar(
    SpecialhattID INT(4) NOT NULL,
    Namn varchar(20),
    Tyg varchar(20),
    Storlek varchar(2),
    Modell varchar(20),
    Färg varchar(20),
    Dekoration varchar(20),
    beskrivning varchar(20),
    Övrigt varchar(20),
    PRIMARY KEY (SpecialhattID)
);

ALTER TABLE specialHattar
add column hattStatus varchar(20);
/**
drop table hattStatus;

CREATE TABLE hattStatus(
  statusen varchar(10),
  PRIMARY KEY (statusen)
);
  *
 */

CREATE TABLE kop(
    kopID INT(4) NOT NULL,
    Pris DOUBLE,
    Datum date,
    PRIMARY KEY (kopID)
);

CREATE TABLE Kund (
  kundID int(4) NOT NULL,
  kundNamn varchar(30),
  adress varchar(30),
  telefonNummer varchar(30),
  hedersKund varchar(10),
  epost varchar(20),
  PRIMARY KEY (kundID)
);

CREATE TABLE ordrar (
    orderID int(6) not null,
    kundID int(4) not null,
    SpecialhattID int(4) not null,
    orderDatum date,
    orderStatus varchar(20),
    PRIMARY KEY (orderID),
    FOREIGN KEY (kundID) REFERENCES Kund(kundID),
    FOREIGN KEY (SpecialhattID) REFERENCES specialHattar(SpecialhattID)
);


