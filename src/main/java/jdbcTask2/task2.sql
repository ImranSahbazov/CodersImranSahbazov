select * from aprel26.customers


select * from aprel26.orders


-- müştərilərin toplam xərclərini listeləyin

SELECT customers.name , sum(orders.amount) as expenses
FROM aprel26.customers
         LEFT JOIN aprel26.orders
                   ON aprel26.orders.customer_id = aprel26.customers.customer_id
group by customers.name

-- şəhərlərə görə şifarişlərin sayını listeləyin

select customers.city , count(amount)
from aprel26.customers
         left join aprel26.orders
                   on customers.customer_id = orders.customer_id
group by customers.city

