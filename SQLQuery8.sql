USE [DB01]
GO
/****** Object:  StoredProcedure [dbo].[loop99]    Script Date: 2017/4/27 下午 07:32:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER proc [dbo].[loop99] @x int, @y int   --@result varchar(20) output
as
--drop table lop99
create table lop99(result varchar(20))
declare @i int = 1;
declare @j int = 1;


while(@i<=@x)
	begin		
		while(@j<=@y)
			begin					
				print cast(@i as varchar(2))+'x'+cast(@j as varchar(2))+'='+cast(@i*@j as varchar(5))
					-- set @result=cast(@i as varchar(2))+'x'+cast(@j as varchar(2))+'='+cast(@i*@j as varchar(5))
					insert into lop99 values(cast(@i as varchar(2))+'x'+cast(@j as varchar(2))+'='+cast(@i*@j as varchar(5)))
					set @j=@j+1
				end
		set @i=@i+1
		set @j = 1;	
    end
	go

--declare @result varchar(20);




exec loop99 3,3  --@result output