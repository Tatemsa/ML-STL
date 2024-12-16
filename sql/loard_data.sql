--
-- Dumping data for table `CLIENT`
--

LOCK TABLES `CLIENT` WRITE;
/*!40000 ALTER TABLE `CLIENT` DISABLE KEYS */;
INSERT INTO CLIENT (
    CL_NAME, CL_SECOND_NAME, CL_BIRTHDAY, CL_NATIONNALITE, CL_COUNTRY_STAY,
    CL_ADDRESSE, CL_EMAIL, CL_PROFESSION, CL_PROVENANCE, CL_DESTINATION,
    CL_PARENT_NAME, CL_IDENTITY_PIECE, CL_DELIVRANCE_DATE,
    CL_TRANSPORT_MODE, CL_IMMATRICULATION, CL_CONTACT
)
VALUES
('Jean', 'Dupont', '1985-05-15 00:00:00', 'Française', 'France',
 '123 Rue de Paris, Paris', 'jean.dupont@gmail.com', 'Ingénieur', 'Paris', 'Londres',
 'Marie Dupont', 'IDF123456', '2021-03-10', 'Avion', 'F1234AB', '0678123456'),

('Marie', 'Curie', '1990-12-20 00:00:00', 'Française', 'France',
 '456 Avenue des Champs, Lyon', 'marie.curie@gmail.com', 'Scientifique', 'Lyon', 'Berlin',
 'Pierre Curie', 'IDC789101', '2022-06-15', 'Train', 'T5678BC', '0689123457'),

('Ahmed', 'Benali', '1988-08-10 00:00:00', 'Algérienne', 'Algérie',
 '789 Rue des Palmiers, Alger', 'ahmed.benali@gmail.com', 'Médecin', 'Alger', 'Tunis',
 'Fatima Benali', 'IDA654321', '2020-12-05', 'Voiture', 'DZ123456', '0778123458'),

('Laura', 'Smith', '1995-03-25 00:00:00', 'Américaine', 'États-Unis',
 '101 Main Street, New York', 'laura.smith@gmail.com', 'Designer', 'New York', 'Toronto',
 'John Smith', 'IDU789654', '2023-01-20', 'Bus', 'NY987654', '0712345678');
/*!40000 ALTER TABLE `CLIENT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ROOM`
--

INSERT INTO ROOM (RM_NUMBER, RM_PRICE, RM_STANDING, RM_STATUS, RM_IMAGE)
VALUES
('A101', 50.00, 'simple', 'pending', 'image_a101.jpg'),
('B202', 75.50, 'stadard', 'booked', 'image_b202.jpg'),
('C303', 100.00, 'hight', 'pending', 'image_c303.jpg'),
('D404', 120.75, 'hight', 'booked', 'image_d404.jpg');

--
-- Dumping data for table `BOOKING`
--

INSERT INTO BOOKING (BK_CL_ID, BK_RM_ID, BK_START_DATE, BK_END_DATE, BK_STATUS, BK_CHILD_NUMBER, BK_ADULT_NUMBER)
VALUES
(1, 5, '2024-12-20', '2024-12-25', 'confirmed', 2, 2),
(2, 6, '2025-01-10', '2025-01-15', 'pending', 0, 1),
(3, 7, '2025-02-01', '2025-02-05', 'cancelled', 1, 2),
(4, 8, '2025-03-15', '2025-03-20', 'confirmed', 0, 3);
