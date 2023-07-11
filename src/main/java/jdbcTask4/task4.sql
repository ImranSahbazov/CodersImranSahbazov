CREATE TABLE aprel26.Tələbələr (
                                   id SERIAL PRIMARY KEY,
                                   first_name VARCHAR(50),
                                   last_name VARCHAR(50),
                                   major VARCHAR(50)
);

INSERT INTO aprel26.Tələbələr (first_name, last_name, major)
VALUES ('Imran', 'Sahbazov', 'Computer Engineering');
INSERT INTO aprel26.Tələbələr (first_name, last_name, major)
VALUES ('Ilkin', 'Sahbazov', 'Muhasibat');

UPDATE aprel26.Tələbələr
SET first_name='Ejdeha'
WHERE last_name='kazimli';

select * from aprel26.Tələbələr
ORDER BY (id) ASC;
