
create sequence hibernate_sequence start with 1 increment by 1;

create table category (
        id integer NOT NULL AUTO_INCREMENT,
        name varchar(255), 
        primary key (id)
);

alter table category add constraint UK_46ccwnsi9409t36lurvtyljak unique (name);

insert into category (name) values ('Cacao');
insert into category (name) values ('Chocolate Liquor');
insert into category (name) values ('Unsweetened Chocolate');
insert into category (name) values ('Bittersweet Chocolate');
insert into category (name) values ('Sweet Chocolate');
insert into category (name) values ('Milk Chocolate');
insert into category (name) values ('White Chocolate');
insert into category (name) values ('Cocoa');
insert into category (name) values ('Ground Chocolate');
insert into category (name) values ('Baking Chocolate');
insert into category (name) values ('Chocolate Coating');
insert into category (name) values ('Couverture');
insert into category (name) values ('Gianduja');
insert into category (name) values ('Single Bean Chocolate');
insert into category (name) values ('Cocoa Butter');
insert into category (name) values ('Chocolates');
insert into category (name) values ('Chocolate Extract');
insert into category (name) values ('Chocolate Oil');