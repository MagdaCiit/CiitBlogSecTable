insert into customer(id, first_name, last_name)
values
(1, 'Gandalf', 'the White'),
(2, 'Gellert', 'Grindelwald'),
(3, 'Gretchen', 'Hase');

insert into customer_details(customer_id, customer_number, join_date)
values
(1, 'LordOfRings', current_timestamp()),
(2, 'FantasticBeasts', current_timestamp()),
(3, 'DoctorsDiary', current_timestamp());