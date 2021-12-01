drop table if exists cd CASCADE;
create table cd
(
id integer auto_increment,
cd_name varchar (255),
year_released integer,
artist varchar (255),
genre varchar (255),
price double(.00),
primary key (id)
);