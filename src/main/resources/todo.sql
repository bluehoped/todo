create table test.todo
(
    id           bigint       not null        primary key,
    created_date datetime(6)  null,
    done         bit          not null,
    task_name    varchar(255) null
);

