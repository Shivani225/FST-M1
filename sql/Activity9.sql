--SQL statement to know which salesman are working for which customer
SELECT customer_name AS "Customer Name", city, salesman_name as "Salesman Name",salesman_city FROM customers 
INNER JOIN salesman 
ON customers.salesman_id=salesman.salesman_id;

--SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
select customer_name as "Customer Name",city,grade,salesman_name as "Salesman Name", salesman_city from customers
left outer join salesman
on customers.salesman_id=salesman.salesman_id
where grade<300
order by customer_id;

--SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%
select customer_name as "Customer Name",city,salesman_name as "Salesman Name", salesman_city,commission from customers
right outer join salesman
on customers.salesman_id=salesman.salesman_id
where commission > 12
order by customer_id;

--SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order
select order_no,order_date,purchase_amount,customer_name as "Customer Name",salesman_name as "Salesman Name", Commission from orders
inner join customers on orders.customer_id = customers.customer_id
inner join salesman on orders.salesman_id = salesman.salesman_id;