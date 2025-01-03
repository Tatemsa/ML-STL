CREATE TABLE ROOM (
    RM_ID INT AUTO_INCREMENT PRIMARY KEY,
    RM_NUMBER VARCHAR(10) UNIQUE NOT NULL,
    RM_PRICE DOUBLE NOT NULL,
    RM_STANDING ENUM('simple', 'stadard', 'hight') NULL,
    RM_STATUS ENUM('booked', 'pending'),
    RM_IMAGE VARCHAR(255) NOT NULL
) ENGINE = INNODB DEFAULT CHARACTER SET utf8;