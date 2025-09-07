# Write your MySQL query statement below
# Write a solution to report the product_name, year,
# and price for each sale_id in the Sales table.

select P.Product_name, S.YEAR ,S.PRICE
FROM  SALES S INNER JOIN PRODUCT P
ON S.PRODUCT_ID = P.PRODUCT_ID
