CREATE TABLE rules (
	ID INT AUTO_INCREMENT PRIMARY KEY, 
	textraw VARCHAR(65535) NOT NULL,
	serialized VARCHAR(1000000) DEFAULT NULL
);