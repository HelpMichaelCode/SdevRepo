# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table projects (
  project_id                    bigint auto_increment not null,
  project_name                  varchar(255),
  project_date                  varchar(255),
  constraint pk_projects primary key (project_id)
);


# --- !Downs

drop table if exists projects;

