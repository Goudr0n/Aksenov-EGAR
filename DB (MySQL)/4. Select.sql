SELECT Название FROM жанры WHERE Популярность = 'Высокая';
SELECT * FROM авторы WHERE ИмяФамилия = 'Иван Ефремов';
SELECT DISTINCT Автор FROM книги;
SELECT ИмяФамилия FROM авторы WHERE СтранаРождения IN (SELECT ID FROM страны WHERE Население < 10000000);