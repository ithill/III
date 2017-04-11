create table emp2
 ( id   int,  
   name char(10),
   gender char(1) CHECK (gender IN ('F','M'))
 )

 insert into emp2 values (101,'John','M')    --Ok
 insert into emp2 values (102,'Mary','F')    --OK
 insert into emp2 values (103,'John2','O')   --Error

 /*
 訊息 547，層級 16，狀態 0，行 1
INSERT 陳述式與 CHECK 條件約束 "CK__emp2__gender__5CD6CB2B" 衝突。衝突發生在資料庫 "DB01"，資料表 "dbo.emp2", column 'gender'。
陳述式已經結束。

 */

 select * from emp2


