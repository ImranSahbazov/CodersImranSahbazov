select * from aprel26.customers


CREATE OR REPLACE PROCEDURE aprel26.add_new_row (
  param1 int,
  param2 varchar,
  param3 varchar

)
LANGUAGE plpgsql
AS $$
BEGIN
INSERT INTO aprel26.customers (customer_id, name, city)
VALUES (param1, param2,param3);
END;
$$;

CALL add_new_row(8, 'imran','Lenkeran');





CREATE OR REPLACE VIEW aprel26.expenses_view AS
SELECT customers.name , sum(orders.amount) as expenses
FROM aprel26.customers
         full JOIN aprel26.orders
                   ON aprel26.orders.customer_id = aprel26.customers.customer_id
group by customers.name





SELECT * FROM aprel26.expenses_view;


CREATE FUNCTION aprel26.calculate_sum(num1 INT, num2 INT)
    RETURNS INT
AS $$
BEGIN
RETURN num1 + num2;
END;
$$
LANGUAGE plpgsql;

SELECT aprel26.calculate_sum(5, 3);
SELECT aprel26.calculate_sum(3, 7);
SELECT aprel26.calculate_sum(4, 9);
SELECT aprel26.calculate_sum(5, 3);









