#1 Вывести предпоследний заказ

SELECT * FROM Orders
ORDER BY OrderID DESC
LIMIT 1 OFFSET 1

#2 Вывести пять самых старых заказов

SELECT * FROM Orders
ORDER BY OrderDate ASC
LIMIT 5

#3 Вывести номера телефонов поставщиков, кроме тех, что из UK и Brazil

SELECT * FROM Suppliers
WHERE
NOT Country IN ('UK', 'Brazil')

#4 Вывести товары из категорий 4 и 5 с ценой до 250 EUR (вкл.)

SELECT * FROM Products
WHERE
CategoryID IN (4, 5)
AND
Price <= 250

#5 Дайте ответ на вопрос, зачем нужна проекция в БД

    Database software
is used to create, edit, and maintain database files and records, enabling easier file and record creation,
data entry, data editing, updating, and reporting. The software also handles data storage, backup and reporting, multi-access
control, and security.

    Strong database security
is especially important today, as data theft becomes more frequent.

    Database software
is sometimes also referred to as a "database management system" (DBMS)

    Database software
makes data management simpler by enabling users to store data in a structured form and then access it. It typically
has a graphical interface to help create and manage the data and, in some cases, users can construct their own databases by using
database software.