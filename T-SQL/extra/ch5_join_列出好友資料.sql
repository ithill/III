--�|��

create table member
( mno  int primary key,
  name  char(20)
);


--���[�n��
create table friend
(  mno  int references member(mno),
   fmno int references member(mno)
);

insert into member  values ( 101,'�i�T');
insert into member  values ( 102,'���|');
insert into member  values ( 103,'����');
--
insert into friend  values (101, 102);
insert into friend  values (101, 103);
insert into friend  values (102, 101);
insert into friend  values (103, 101);
--error
insert into friend  values (103, 104);
insert into friend  values (104, 101);

--

select * from member;
select * from prod;
select * from friend;


--�C�X�n�͸��

select *
from  member m  JOIN  friend  f
ON   m.mno = f.mno
JOIN  member  fm
ON  f.fmno = fm.mno


----------------------------

create table prod
(  ino  int primary key,
   smno  int  references member(mno),
   pname char(20),
   price int,
   bmno  int  references member(mno)
);

insert into  prod  values ( 1, 101, 'p1', 100, 102);
insert into  prod  values ( 2, 101, 'p1', 110, 103);

--�C�X�檫�~�|�����ʶR�Hlist member name and buyername
--���H���ʶR�H ,�@�˪��~�u���@�ʶR�H

select *
from  member m JOIN  prod  p
ON    m.mno = p.smno
JOIN  member bm
ON   p.bmno = bm.mno

