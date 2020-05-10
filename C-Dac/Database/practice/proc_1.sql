SELECT * FROM dbmodule.orders;
alter table orders add sum_tat int after snum;
call proc_sum_tat(1002);
select * from orders;