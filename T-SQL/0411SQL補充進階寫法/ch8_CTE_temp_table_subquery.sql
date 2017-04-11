--CTE
with  A
as (select id ,name, tel from student where id <=5)
select * from A

--adv subquery

select *
from   (select id ,name, tel 
        from student where id <=5
	   ) A

--ch7 temp table

select id ,name, tel  
into #a 
from student where id <=5

select * from #a
