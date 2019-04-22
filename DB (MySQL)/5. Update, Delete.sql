DELETE FROM магазины WHERE Страна IN (1, 4);
DELETE FROM авторы WHERE ИмяФамилия LIKE 'Чайна %';
DELETE FROM авторы WHERE ГодРождения < 1950;
DELETE FROM книги WHERE ГодИздания BETWEEN 2000 AND 2010;
UPDATE страны SET Название='КНР' WHERE ID=1;
