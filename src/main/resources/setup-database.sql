CREATE DATABASE chat_book_review CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
CREATE USER 'cbruser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON chat_book_review.* to 'cbruser'@'localhost';