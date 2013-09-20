CREATE TABLE TODOS (
	ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	DESCRIPTION VARCHAR(100),
	DONE CHAR(1) DEFAULT 'N',
	CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	DUE_DATE TIMESTAMP);
	
	
insert into todos (description) values ('Testing1');
insert into todos (description) values ('Testing2');
insert into todos (description) values ('Testing3');
