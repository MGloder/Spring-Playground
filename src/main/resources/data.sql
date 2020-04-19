drop table if exists ORDER_CUSTOMER;
drop table if exists customer;
create table CUSTOMER
(
  ID          BIGINT not null auto_increment primary key,
  CUSTOMER_ID BIGINT,
  FIRST_NAME  VARCHAR(255),
  LAST_NAME   VARCHAR(255)
);
drop table if exists staff;
create table STAFF
(
  ID       BIGINT not null auto_increment primary key,
  NAME     VARCHAR(255),
  STAFF_ID VARCHAR(255)
);
-- --
insert into CUSTOMER(customer_id, first_name, last_name) values (1, 'eric', 'yan');
insert into STAFF(STAFF_ID, name) values (1, 'eric yan');

-- auto-generated definition
create table ORDER_CUSTOMER
(
  CUSTOMER_ID BIGINT not null,
  STAFF_ID    BIGINT not null,
  primary key (CUSTOMER_ID, STAFF_ID),
  constraint FK8Q1JFVWH4H6KXPMTV3UJQGLS
  foreign key (CUSTOMER_ID) references STAFF,
  constraint FKDS3XABOHQ32S9FPT3O6XBU1CF
  foreign key (STAFF_ID) references CUSTOMER
);

insert into order_customer(customer_id, staff_id) values (1, 1);