-- Clear database before init
DROP DATABASE IF EXISTS user;

-- Initialization of database
CREATE DATABASE user;

-- Selects database to use
USE user;

-- Create table for user's login credentials
CREATE TABLE users (username VARCHAR(20), password VARCHAR(20));

-- Populate table with data
INSERT INTO users VALUES ('tom','apple123');
INSERT INTO users VALUES ('dick','orange123');
INSERT INTO users VALUES ('harry','banana123');

-- Display table (for checking purposes)
-- SELECT * FROM users;