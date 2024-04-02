

CREATE TABLE Users (
    usser_id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    contact VARCHAR(40) NOT NULL,
    Role ENUM('Admin', 'Moderator', 'User') NOT NULL DEFAULT 'User',
    RegistrationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--Role of the user by default will user if user column is empty then it will be user
INSERT INTO Users (Username, Password, Email, Role)
    VALUES
    ('tilakbsnt', 'password123', 'tilak.bsnt@gmail.com', 'Admin'),
    ('indra', 'user_password', 'user.email@gmail.com', 'User');

INSERT INTO Users (Username, Password, Email, Role)
    VALUES ('admin_user', 'admin_password', 'admin.email@gmail.com', 'Admin');
