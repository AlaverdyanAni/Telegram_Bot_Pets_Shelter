create  table visitor(
                         id bigint primary key generated by default as identity,
                         chat_id bigint not null,
                         name varchar(255) unique not null,
                         registered_at timestamp not null,
                         last_action varchar(255)
);