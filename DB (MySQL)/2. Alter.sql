ALTER TABLE страны ADD Название VARCHAR(40);
ALTER TABLE страны ADD Столица VARCHAR(40);
ALTER TABLE страны ADD Население INT;

ALTER TABLE жанры ADD Название VARCHAR(40);
ALTER TABLE жанры ADD Популярность VARCHAR(40);
ALTER TABLE жанры ADD КоличествоКниг INT;

ALTER TABLE авторы ADD ИмяФамилия VARCHAR(40);
ALTER TABLE авторы ADD ГодРождения INT;

ALTER TABLE книги ADD Название VARCHAR(40);
ALTER TABLE книги ADD ГодИздания INT;
ALTER TABLE книги ADD Страниц INT;

ALTER TABLE магазины ADD Название VARCHAR(40);
ALTER TABLE магазины ADD ГодОткрытия YEAR;