CREATE DATABASE tmsdb CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE USER 'tms' IDENTIFIED BY 'tms';
GRANT ALL ON tmsdb.* TO 'tms'@'%' IDENTIFIED BY 'tms';
GRANT ALL ON tmsdb.* TO 'tms'@'localhost' IDENTIFIED BY 'tms';
FLUSH PRIVILEGES;