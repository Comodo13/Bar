Goal is to make a real world simulation of cocktail bar.
REST API
Spring framework
Mysql
RabbitMQ

Each customer can have only 1 order(One to One relationship) which is paid at the end of the visit.
Firstly order is created after age validation and then all next drinks will be assigned to created order.
Orders will be delivered from the waitress to bartender and put in queue through RabbitMQ messaging.
At the end of the visit order should be paid by customer after validation if he has enough money.

Bar API:
GET /drink-menu - returns all drinks
GET /customers/ - returns all customers
GET /customers/{id} - returns customer by id with his order(short version)
GET /orders - returns all orders(full version)
POST /order - creates new order
PUT /anotherdrink/{drinkId}/{orderId} - assignes drink to existing order
GET summary/all - returns list of all ordered drinks, their ammount and price
GET summary/drink - returns total amount of particular drink