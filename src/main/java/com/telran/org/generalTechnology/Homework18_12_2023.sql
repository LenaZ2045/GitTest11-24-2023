#1 Вывести данные о товарах (название товара, ценасоскидкой_0.5%)

SELECT ProductName,
Price AS Price,
Price * .995 AS Price_Down
FROM Products

#2 Вывести заказы клиентов не из France  (номерзаказа, имяклиента, страна_клиента)

SELECT Orders.OrderID, Customers.CustomerName, Customers.Country
FROM Customers
JOIN Orders ON Customers.CustomerID = Orders.CustomerID
WHERE
NOT Country IN ('France')

#3 Вывести название и стоимость в USD одного самого дорогого проданного товара (не используя агрегацию)

SELECT ProductName, Price
FROM Products
ORDER BY Price DESC
LiMIT 1

another variation

SELECT ProductName, Price
FROM Products
WHERE
Price > 250

#4 Вывести список стран, которые поставляют морепродукты

SELECT Products.CategoryID, Products.ProductName, Suppliers.Country
FROM Products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE Products.CategoryID = 8

#5 Вывести два самых дорогих товара из категории Beverages из USA

SELECT Products.ProductName, Products.Price, Categories.CategoryName, Suppliers.Country
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE
Categories.CategoryName LIKE 'Beverages'
AND
Suppliers.Country = 'USA'
ORDER BY Products.Price DESC
LIMIT 2