--�E�E���k��

DECLARE   @i int, @j int
SET @i = 1;
SET @j = 1;
BEGIN
  WHILE ( @i<=9 )
    BEGIN
      WHILE ( @j<=9 )
        BEGIN
            PRINT cast(@i as varchar(3)) + '* ' + cast(@j as varchar(3)) + '=' + cast(@i*@j as varchar(3))
           SET @j = @j+1 ;   
        END;
      SET @i = @i+1;
      SET @j = @j+1;
   END;
END;


--��X�榡
/*

1 ��0 ����k���@ 3--> 03,  12-->12 
  PRINT  RIGHT('0'+CONVERT(varchar(2), ��),2)

2 ��� i * j = i*j ����k���@  03*04=12  
  
  �Υ[���[�r���_ :  i + '*' + j + '=' + i*j

PRINT right('0'+convert(varchar(2), @i),2) 
      + '*'
      + right('0'+convert(varchar(2), @j),2) 
      + '=' 
      + right('0'+convert(varchar(2), @i*@j),2);
      

SQL 2012 �s�W format���

declare  @str varchar(150)
set @str= ''
set @str += format(@j,'00') + '*' + format(@i,'00') + '=' + format(@i*@j,'00') + CHAR(9)

*/