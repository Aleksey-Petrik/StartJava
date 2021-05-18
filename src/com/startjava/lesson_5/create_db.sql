CREATE DATABASE Jaegers;
--\c jaegers; --коннект к базе 
CREATE TABLE jaegers (id SERIAL PRIMARY KEY,
                      modelName TEXT, mark CHAR(7),
                      height REAL, weight REAL, status CHAR(9),
                      origin TEXT, launch DATE, kaijuKill INTEGER);