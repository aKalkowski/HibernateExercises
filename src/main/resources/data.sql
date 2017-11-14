INSERT INTO student (id, name, surname, email)
VALUES
(1, 'Brajanek', 'Kowalski', 'bkowalski@buziaczek.pl'),
(2, 'Kevinek', 'Maciaszczyk', 'kmaciaszczyk@buetlka.org'),
(3, 'Izrael', 'Poznanski', 'ipoznanski@shalom.iz'),
(4, 'Tomasz', 'Pampuszek', 'pampuszek@okruszek.pl'),
(5, 'Maciej', 'Kebab', 'lubiekebab@kebsik.pl'),
(6, 'Tasma', 'Klejaca', 'sklejewszystko@wd40.org'),
(7, 'Janusz', 'Konski', 'janusz@pol.pl');

INSERT INTO address (id, city, street, postalcode, homenumber, studentid)
VALUES
(1, 'Warszawa', 'Sucza', '11-666', 11, 3),
(2, 'Krakow', 'Stradom', '31-654', 6, 1),
(3, 'Lublin', 'Warszawska', '20-987', 54, 7),
(4, 'Radom', 'Radomska', '85-951', 45, 6),
(5, 'Walbrzych', 'Graniczna', '45-621', 4, 2),
(6, 'Rzeszow', 'Orla', '54-520', 1, 4),
(7, 'Krakow', 'Meptepepte', '36-547', 5, 5);
