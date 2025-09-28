# Write your MySQL query statement below
 select P.product_id ,IFNULL(round( SUM(P.PRICE * U.UNITS)/SUM(U.UNITS),2), 0)AS average_price
 from Prices P LEFT join UnitsSold U
 on P.product_id = U.PRODUCT_ID
 AND 
 U.PURCHASE_DATE BETWEEN P.START_DATE AND P.END_DATE
 GROUP BY P.PRODUCT_ID;
