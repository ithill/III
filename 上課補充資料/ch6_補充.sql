--�d�X�ǭ��U����� �ΦC�X�`����
select  AVG(score)
 from  course


 select name, AVG(score)
 from  course
 group by name

 JAVA                	82
T-SQL               	85
�q��                	83

select id , name, score, (select  AVG(score)
                          from  course)
from  course

----method 1 �d�X�ǭ��U����� �ΦC�X �Ӭ��`����

select id , name, score, (select  AVG(score)
                          from  course c2
			 where name = c.name )
from  course c


----method 2 �d�X�ǭ��U����� �ΦC�X �Ӭ��`����

select id , c.name, c.score,  g.avgs
from  course c  JOIN  ( select name, AVG(score) avgs
                        from  course
                        group by name) g
ON  c.name = g.name
