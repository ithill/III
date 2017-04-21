--check 
--�� 1
create table ck1
(  id int ,
   qty  int  check (qty >=10)
  )

--ok
insert into ck1 values(101, 25)

--not ok
insert into ck1 values(102, 5)

/*
�T�� 547�A�h�� 16�A���A 0�A�� 1
INSERT ���z���P CHECK ������� "CK__ck1__qty__1367E606" �Ĭ�C�Ĭ�o�ͦb��Ʈw "sample2"�A��ƪ� "dbo.ck1", column 'qty'�C
���z���w�g�����C--->qty���j��10
*/

--�� 2 �[ Constraint name
create table ck11
(  id int ,
   qty  int  constraint ck_ck_11_greater_than_10 check (qty >=10)
)
go

--not ok
insert into ck11 values(102, 5)

/*
�T�� 547�A�h�� 16�A���A 0�A�� 2
INSERT ���z���P CHECK ������� "ck_ck_11_greater_than_10" �Ĭ�C�Ĭ�o�ͦb��Ʈw "sample2"�A��ƪ� "dbo.ck11", column 'qty'�C
���z���w�g�����C
*/


--�d�� check �]�w
sp_help ck1


--on update cascade

create table cust5
(  id int     primary key
)

create table ord5
(ono int primary key,
 id  int foreign key references cust5(id) ON UPDATE CASCADE
) 

insert into cust5 values(101)
insert into cust5 values(102)
insert into cust5 values(103)

insert into ord5 values(1, 101)
insert into ord5 values(2, 101)
insert into ord5 values(3, 102)

select * from cust5
select * from ord5

--test

delete from cust5 where id = 101---->�]����FK�ѦҨ�id
update cust5 set id = 901 where id = 101

select * from cust5
select * from ord5


