INSERT INTO users(username,password,enabled) VALUES ('test1','test1234', TRUE);
INSERT INTO users(username,password,enabled) VALUES ('admin1','nimda', TRUE);

INSERT INTO user_roles (username, ROLE) VALUES ('test1', 'ROLE_USER');
INSERT INTO user_roles (username, ROLE) VALUES ('admin1', 'ROLE_ADMIN');