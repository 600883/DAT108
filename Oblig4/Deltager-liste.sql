DROP SCHEMA IF EXISTS deltager_liste CASCADE;
CREATE SCHEMA deltager_liste;
SET search_path TO deltager_liste;


CREATE TABLE deltager (

    mobil CHAR(8) PRIMARY KEY,
    fornavn VARCHAR(20) NOT NULL,
    etternavn VARCHAR(20) NOT NULL,
    kjonn VARCHAR(6) CHECK (kjonn='mann' OR kjonn='kvinne'),
    salt CHAR(32) NOT NULL,
    passordHash CHAR(64) NOT NULL

);

		