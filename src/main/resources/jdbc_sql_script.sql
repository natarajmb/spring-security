# create database
CREATE DATABASE spring_security_jdbc CHARACTER SET=utf8 COLLATE=utf8_bin;
# add a user
CREATE USER 'ss'@'localhost' IDENTIFIED BY 'password';
# add privileges to the user on the newly added database
GRANT ALL PRIVILEGES ON spring_security_jdbc.* TO 'ss'@'localhost' WITH GRANT OPTION;


# create the user table
CREATE  TABLE users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));

# create user roles table
CREATE TABLE user_roles (
  user_role_id INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  ROLE VARCHAR(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (ROLE,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));

# create remember me table
CREATE TABLE persistent_logins (
  username VARCHAR(45) NOT NULL,
  series VARCHAR(64) PRIMARY KEY,
  token VARCHAR(64) NOT NULL,
  last_used TIMESTAMP NOT NULL
);