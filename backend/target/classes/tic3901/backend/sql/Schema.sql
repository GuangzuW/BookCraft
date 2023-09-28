CREATE TABLE user_role (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role VARCHAR(255) UNIQUE
);

CREATE TABLE user_account (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    user_role INT DEFAULT 1
    constraint user_role_fk foreign key (user_role) references user_role(id)
);