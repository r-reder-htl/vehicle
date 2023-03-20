select setval('hibernate_sequence', 1000);

insert into x_person (p_id, p_dob, p_name)
values (1,'2000-01-02','John Doe');

insert into x_person (p_id, p_dob, p_name)
values (2,'2000-01-03','John Huber');

insert into x_vehicle (v_id, v_model, v_brand)
values (1,'Mercedes','C200');
insert into x_vehicle (v_id, v_model, v_brand)
values (2,'Fiat','Regata');
insert into x_vehicle (v_id, v_model, v_brand)
values (3,'Fiat','Regata2');
insert into x_vehicle (v_id, v_model, v_brand)
values (4,'Ford','Focus');

insert into x_rental (r_id, r_discount, r_end_date_time, r_start_date_time, r_p_id, r_v_id)
values (1,0,'2023-03-17 10:55:00','2023-03-16 10:55:00',2,1);

insert into x_rental (r_id, r_discount, r_end_date_time, r_start_date_time, r_p_id, r_v_id)
values (2,10,'2023-03-17 10:55:00','2023-03-16 10:55:00',1,2);