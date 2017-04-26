--list 1 , 2, 3, 4 ...10

declare @x int;
set @x = 1;
while (@x <= 10)
begin
   print @x;
   set @x = @x + 1;
end
go

--sum 0 + 1 + 2 + 3+ 4 ..+10

declare @x int, @s int;
set @x = 1;
set @s = 0;
while (@x <= 10)
begin
   print @x;
   set @s = @s + @x
   set @x = @x + 1;
end
print @s

go
--function

create function f11( @v int)
returns int
as
begin
declare @x int, @s int;
set @x = 1;
set @s = 0;
while (@x <= @v)
begin
  -- print @x;
   set @s = @s + @x
   set @x = @x + 1;
end
return @s
end
go
--test
print dbo.f11(100)
