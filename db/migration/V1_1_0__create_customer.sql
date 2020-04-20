create table CUSTOMER
(
  ID          BIGINT not null auto_increment primary key,
  CUSTOMER_ID BIGINT,
  FIRST_NAME  VARCHAR(255),
  LAST_NAME   VARCHAR(255)
);