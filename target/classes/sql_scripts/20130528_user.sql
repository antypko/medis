CREATE TABLE medis.user (
    id BIGINT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
    login VARCHAR(20) NOT NULL,
    password VARCHAR(20) NOT NULL,
	role ENUM('ROLE_USER', 'ROLE_ADMIN') NOT NULL, 
    PRIMARY KEY (id)
)  ENGINE=INNODB;