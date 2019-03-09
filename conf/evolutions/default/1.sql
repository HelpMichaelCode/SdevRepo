# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table employee (
  emp_ID                        integer auto_increment not null,
  F_name                     varchar(255),
  L_name                     varchar(255),
  id                            bigint,
  constraint pk_employee primary key (emp_id)
);

create table project_category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_project_category primary key (id)
);

create table projects (
  project_id                    bigint auto_increment not null,
  project_name                  varchar(255),
  project_date                  varchar(255),
  constraint pk_projects primary key (project_id)
);

alter table employee add constraint fk_employee_id foreign key (id) references project_category (id) on delete restrict on update restrict;
create index ix_employee_id on employee (id);

# --- !Downs

alter table employee drop constraint if exists fk_employee_project_cat_id;
drop index if exists ix_employee_project_cat_id;

drop table if exists employee;

drop table if exists project_category;

drop table if exists projects;

