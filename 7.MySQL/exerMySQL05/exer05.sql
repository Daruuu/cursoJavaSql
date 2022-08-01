USE mydb;
CREATE TABLE IF NOT EXISTS Genre(
	idGenre INT, 
    genre VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Album(
	idAlbum INT, 
    albumName VARCHAR(255),
    dateReleased DATETIME
);
CREATE TABLE IF NOT EXISTS Artist(
	artistId INT,
    artistName VARCHAR(255)
);