--SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount
select customer_id, max(purchase_amount) as "Max Amount" from orders
group by customer_id;

--SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID
select customer_id, max(purchase_amount) as "Max Amount" from orders
where order_date = to_date('2012/08/17','YYYY/MM/DD')
group by customer_id,order_date;

--SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000]
select customer_id, order_date, max(purchase_amount) as "Max Amount" from orders
having max(purchase_amount) in (2030,3450,5760,6000)
group by customer_id,order_date;