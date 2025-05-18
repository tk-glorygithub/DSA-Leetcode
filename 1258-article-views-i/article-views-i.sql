# Write your MySQL query state
select distinct(author_id) AS id 
from Views
WHERE (author_id = viewer_id)
ORDER BY id;