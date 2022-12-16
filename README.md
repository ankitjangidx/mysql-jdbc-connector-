# mysql-jdbc-connector-
<h1>program which using mysql jdbc connector, using mysql create database of students now using java ask the students for its details, check whether students details exist or not , if present update the records else add details into database</h1>

<h4>CREATE TABLE stud (  student_id INT(11) NOT NULL AUTO_INCREMENT,  student_name VARCHAR(100) NOT NULL,  father_name VARCHAR(100) NOT NULL,  dob DATE NOT NULL,  address VARCHAR(255) NOT NULL,  city VARCHAR(100) NOT NULL,  pin_code VARCHAR(6) NOT NULL,  mobile_no VARCHAR(15) NOT NULL CHECK (LENGTH(mobile_no) >= 10,  email_id VARCHAR(100) NOT NULL,  date DATE NOT NULL,  PRIMARY KEY (student_id));</h4>
