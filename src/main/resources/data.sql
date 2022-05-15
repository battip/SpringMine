CREATE TABLE userdata (
  id INT NOT NULL,
   username VARCHAR(255),
   CONSTRAINT pk_userdata PRIMARY KEY (id)
);
insert into userdata values(101,'Tom');
insert into userdata values(102,'Andrew');
insert into userdata values(103,'Tony');
insert into userdata values(104,'Bob');
insert into userdata values(105,'Sam');

