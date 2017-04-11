create table emp2
 ( id   int,  
   name char(10),
   gender char(1) CHECK (gender IN ('F','M'))
 )

 insert into emp2 values (101,'John','M')    --Ok
 insert into emp2 values (102,'Mary','F')    --OK
 insert into emp2 values (103,'John2','O')   --Error

 /*
 �T�� 547�A�h�� 16�A���A 0�A�� 1
INSERT ���z���P CHECK ������� "CK__emp2__gender__5CD6CB2B" �Ĭ�C�Ĭ�o�ͦb��Ʈw "DB01"�A��ƪ� "dbo.emp2", column 'gender'�C
���z���w�g�����C

 */

 select * from emp2


