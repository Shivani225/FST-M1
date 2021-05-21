select sum(purchase_amount) as totalsum from orders;
select avg(purchase_amount) as average from orders;
select max(purchase_amount) as MaxOrder from orders;
select min(purchase_amount) as MinOrder from orders;
select count(distinct salesman_id) as TotalCount from orders;