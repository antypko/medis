CREATE TABLE medis.patient (
    id BIGINT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    fathersName VARCHAR(20) NULL,
    bloodType enum('Ap', 'An', 'Op', 'On', 'Bp', 'Bn', 'ABp', 'ABn') NULL,
    sex BOOL NOT NULL,
    birthDate DATE NULL,
    telephone BIGINT NULL,
    workAdress VARCHAR(50) NULL,
    liveAdress VARCHAR(50) NULL,
    specialAccounting VARCHAR(80) NULL,
    hiv BOOL NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;