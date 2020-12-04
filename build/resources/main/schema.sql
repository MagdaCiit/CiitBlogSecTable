drop table if exists customer;
drop table if exists customer_details;

create table customer (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name  varchar(255),
    last_name   varchar(255)
);

create table customer_details (
    customer_id         BIGINT AUTO_INCREMENT PRIMARY KEY ,
    customer_number     varchar(255),
    join_date           datetime default current_timestamp not null
);