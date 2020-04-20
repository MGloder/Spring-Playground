create table ORDER_CUSTOMER
(
  CUSTOMER_ID BIGINT not null,
  STAFF_ID    BIGINT not null,
  primary key (CUSTOMER_ID, STAFF_ID),
  constraint customer_id_constraint
  foreign key (CUSTOMER_ID) references STAFF,
  constraint staff_id_constraint
  foreign key (STAFF_ID) references CUSTOMER
);