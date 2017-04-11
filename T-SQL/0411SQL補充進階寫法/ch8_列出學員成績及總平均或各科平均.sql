
--列出個人成績+總平均
select  avg(score) avgs
from course

--mehtod1
select id,name, score, 83
from   course

--method 2

select id,name, score, avgs
from   course c1 CROSS JOIN (select  avg(score) avgs
                       from course) c2

--method 3

select  avg(score) avgs
from course

select id,name, score, ???
from   course

select id,name, score, (select  avg(score) avgs
                        from course)
from   course



--列出個人成績+該科平均

select name , avg(score) avgs
from course
group by name

/*
JAVA                	82
T-SQL               	85
電概                	83
*/


select  id, c1.name,  score ,  avgs
from    course  c1  JOIN  (select name , avg(score) avgs
                           from course
                           group by name) c2
ON  c1.name = c2.name

/*
1	JAVA                	85	82
2	JAVA                	86	82
3	JAVA                	80	82
4	JAVA                	85	82
5	JAVA                	75	82
6	JAVA                	70	82
7	JAVA                	92	82
8	JAVA                	85	82
9	JAVA                	83	82
11	JAVA                	87	82
12	JAVA                	85	82
13	JAVA                	86	82
14	JAVA                	85	82
15	JAVA                	84	82
16	JAVA                	75	82
17	JAVA                	81	82
18	JAVA                	85	82
19	JAVA                	79	82
20	JAVA                	85	82
21	JAVA                	78	82
22	JAVA                	85	82
1	T-SQL               	85	85
2	T-SQL               	85	85
3	T-SQL               	80	85
4	T-SQL               	85	85
5	T-SQL               	85	85
6	T-SQL               	83	85
7	T-SQL               	85	85
8	T-SQL               	82	85
9	T-SQL               	91	85
10	T-SQL               	85	85
11	T-SQL               	85	85
12	T-SQL               	87	85
13	T-SQL               	85	85
14	T-SQL               	85	85
15	T-SQL               	86	85
16	T-SQL               	85	85
17	T-SQL               	85	85
18	T-SQL               	89	85
19	T-SQL               	85	85
20	T-SQL               	88	85
21	T-SQL               	85	85
22	T-SQL               	84	85
1	電概                	81	83
2	電概                	80	83
3	電概                	82	83
4	電概                	84	83
5	電概                	64	83
6	電概                	83	83
7	電概                	85	83
8	電概                	87	83
9	電概                	86	83
10	電概                	85	83
11	電概                	82	83
12	電概                	81	83
13	電概                	89	83
14	電概                	85	83
15	電概                	88	83
16	電概                	87	83
17	電概                	86	83
18	電概                	85	83
19	電概                	84	83
20	電概                	82	83
21	電概                	85	83
22	電概                	81	83
*/