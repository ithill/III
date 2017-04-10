--查出學員各科分數 及列出總平均
select  AVG(score)
 from  course


 select name, AVG(score)
 from  course
 group by name

 JAVA                	82
T-SQL               	85
電概                	83

select id , name, score, (select  AVG(score)
                          from  course)
from  course

----method 1 查出學員各科分數 及列出 該科總平均

select id , name, score, (select  AVG(score)
                          from  course c2
			 where name = c.name )
from  course c


----method 2 查出學員各科分數 及列出 該科總平均

select id , c.name, c.score,  g.avgs
from  course c  JOIN  ( select name, AVG(score) avgs
                        from  course
                        group by name) g
ON  c.name = g.name
