

CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Username VARCHAR(50) NOT NULL,
    Password VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
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
