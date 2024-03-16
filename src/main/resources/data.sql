INSERT INTO chat_book_review.users(id,username,password,role)
    VALUES (1,"今城","$2a$10$vY93/U2cXCfEMBESYnDJUevcjJ208sXav23S.K8elE/J6Sxr4w5jO","ADMIN");
INSERT INTO chat_book_review.book_data(isbn,book_title,author,publisher,year_and_month)
    VALUES ("978-4478108536","独学大全","読書猿","ダイヤモンド社","2020-09");
INSERT INTO chat_book_review.chat(id,chat,send_at)
    VALUES (1,"こんにちは",CURRENT_TIMESTAMP);
INSERT INTO chat_book_review.chat(id,chat,send_at)
    VALUES (2,"Hello",CURRENT_TIMESTAMP);