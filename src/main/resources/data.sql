INSERT INTO users (name, password) VALUES ('alice', 'password1');
INSERT INTO users (name, password) VALUES ('bob', 'password2');
INSERT INTO users (name, password) VALUES ('carol', 'password3');

INSERT INTO films (name, author, genre) VALUES ('The Matrix', 'Wachowski', 'Sci-Fi');
INSERT INTO films (name, author, genre) VALUES ('Spirited Away', 'Hayao Miyazaki', 'Animation');
INSERT INTO films (name, author, genre) VALUES ('Inception', 'Christopher Nolan', 'Sci-Fi');
INSERT INTO films (name, author, genre) VALUES ('The Godfather', 'Francis Ford Coppola', 'Crime');
INSERT INTO films (name, author, genre) VALUES ('Pulp Fiction', 'Quentin Tarantino', 'Crime');

INSERT INTO ratings (user_id, film_id, rating_value) VALUES (1, 1, 5);
INSERT INTO ratings (user_id, film_id, rating_value) VALUES (2, 1, 4);
INSERT INTO ratings (user_id, film_id, rating_value) VALUES (3, 2, 5);
INSERT INTO ratings (user_id, film_id, rating_value) VALUES (1, 3, 4);
 
