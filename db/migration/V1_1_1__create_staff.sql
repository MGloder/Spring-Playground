drop table if exists staff;
create table STAFF
(
  ID       BIGINT not null auto_increment primary key,
  NAME     VARCHAR(255),
  STAFF_ID VARCHAR(255)
);