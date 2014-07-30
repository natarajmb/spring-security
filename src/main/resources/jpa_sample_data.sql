INSERT INTO users(username, password, enabled) VALUES ('test2','test1234', TRUE);
INSERT INTO users(username, password, enabled) VALUES ('admin2','nimda', TRUE);


INSERT INTO roles(user_role_id, role, username) VALUES (1, 'ROLE_USER','test2');
INSERT INTO roles(user_role_id, role, username) VALUES (2, 'ROLE_ADMIN','admin2');

INSERT INTO user_roles(username,user_role_id) VALUES ('test2', 1);
INSERT INTO user_roles(username,user_role_id) VALUES ('admin2', 2);
