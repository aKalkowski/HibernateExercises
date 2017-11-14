
CREATE TABLE student (
    id int NOT NULL,
    name varchar(25),
    surname varchar(25),
    email varchar(35),
    PRIMARY KEY (id)
);

CREATE TABLE address (
    id int NOT NULL,
    city varchar(25),
    street varchar(25),
    postalcode varchar(6),
    homenumber int,
    studentid int,
    PRIMARY KEY (id),
    FOREIGN KEY (studentid) REFERENCES student(id)
);