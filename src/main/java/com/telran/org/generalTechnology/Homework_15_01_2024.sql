# 1 TASK: Вывести сред/стоимость товаров из категорий 1, 2, 5, у которых название начинается с буквы t

SELECT AVG (Price) AS avg_product_price_T
FROM Products
WHERE CategoryID IN (1, 2, 5)
AND ProductName LIKE 't%'

# 2 TASK: Посчитать стоимость заказа 10248

SELECT SUM(Price) AS total_order10248_cost
FROM OrderDetails
JOIN Products ON OrderDetails.ProductID = Products.ProductID
WHERE OrderID = 10248

# 3 TASK: Вывести ко-во товаров с ценой от 10 до 250 EUR

SELECT COUNT(*) AS product_quantity_between_price_10_and_250
FROM Products
WHERE Products.Price BETWEEN 10 AND 250

# 4 TASK: Вывести сумму, на которую было отправлено товаров клиентам в Germany

SELECT SUM(Price) AS product_total_cost_sold_items_to_Germany
FROM Products
JOIN Suppliers ON Suppliers.SupplierID = Products.SupplierID
WHERE Country = 'Germany'

# 5 TASK: С помощью инструмента онлайн-проектирования опишите схему БД "онлайн-шахматы" (базовые сущности и характеристики)

https://dbdiagram.io/d/CHESS-GAME-65aeb7fbac844320ae782a44