CREATE SEQUENCE users_seq;

CREATE TABLE users (
  id BIGINT PRIMARY KEY DEFAULT nextval('users_seq'),
  "name" TEXT NOT NULL
);