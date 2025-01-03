CREATE TABLE BOOKING (
    BK_ID INT AUTO_INCREMENT PRIMARY KEY,
    BK_CL_ID INT NOT NULL,
    BK_RM_ID INT DEFAULT NULL,
    BK_START_DATE DATE NOT NULL,
    BK_END_DATE DATE NOT NULL,
    BK_STATUS ENUM('confirmed', 'cancelled', 'pending') DEFAULT 'pending',
    BK_CHILD_NUMBER INT,
    BK_ADULT_NUMBER INT NOT NULL,
    CONSTRAINT FK_BK_CL_ID FOREIGN KEY (BK_CL_ID) REFERENCES CLIENT(CL_ID),
    CONSTRAINT FK_BK_RM_ID FOREIGN KEY (BK_RM_ID) REFERENCES ROOM(RM_ID)
) ENGINE = INNODB DEFAULT CHARACTER SET utf8;