4. Find the largest order taken by each salesperson on each date.
select sname, max(amt), odate from salesperson join orders on salesperson.snum=orders.snum group by sname

6. Find which salespeople currently have orders in the Orders table.
select * from salesperson where snum not in (select snum from orders)

7. List names of all customers matched with the salespeople serving them
select a.cname,b.sname from customers a join salesperson b on a.snum=b.snum where a.snum in (select b.snum from salesperson)

8.Find the names and numbers of all salespeople who had more than one customer
select c.snum,s.sname,count(c.snum) custcount from customers c join salesperson s
on c.snum= s.snum
group by c.snum having custcount>1


9. Count the orders of each of the salespeople and output the results in descending order.
select o.snum,s.sname,count(o.snum) cnt from orders o join salesperson s
on o.snum=s.snum
group by o.snum order by cnt desc


10. List the Customer table if and only if one or more of the customers in the Customer table are
located in San Jose.

11. Match salespeople to customers according to what city they lived in.
select c.cname,c.city,s.sname,s.city from customers c join salesperson s on s.snum=c.snum
where s.city=c.city

12. Find the largest order taken by each salesperson.
select s.sname, max(o.amt) from orders o join salesperson s 
on o.snum=s.snum group by o.snum 


13. Find customers in San Jose who have a rating above 200.
select * from customers where city='san jose' and rating>200


14. List the names and commissions of all salespeople in London.
select sname,comm from salesperson where city='london'

17. Give the sums of the amounts from the Orders table, grouped by date, eliminating all those
dates where the SUM was not at least 2000.00 above the MAX amount.
select odate,sum(amt) sums from orders group by odate having sums>2000


18. Select all orders that had amounts that were greater than at least one of the orders from
October 6.
select * from orders where amt >(select min(amt) from orders where odate='10/06/96') 

19. Write a query that uses the EXISTS operator to extract all salespeople who have customers
with a rating of 300.
select sname from salesperson where exists (select snum from customers where rating =300)

20. Find all pairs of customers having the same rating.
select c.cname, s.cname, s.rating from customers c join customers s
on c.rating=s.rating where c.cname<>s.cname and c.cnum>s.cnum

21. Find all customers whose CNUM is 1000 above the SNUM of Serres.
select cname from customers where ((select snum from salesperson where sname ='serres')+1000)=cnum

22. Give the salespeople’s commissions as percentages instead of decimal numbers.
select concat(format(comm*100,''),'%')as percentage from salesperson 

23. Find the largest order taken by each salesperson on each date, eliminating those MAX orders
which are less than $3000.00 in value.
select sname, max(amt) myorders, odate from salesperson join orders on salesperson.snum=orders.snum
group by sname having myorders>3000

24. List the largest orders for October 3, for each salesperson.
select snum, odate, max(amt) from orders group by snum having odate='10/03/96'

25. Find all customers located in cities where Serres (SNUM 1002) has customers
select cname from customers where city in (select city from customers where snum =1002)

27. Count the number of salespeople currently listing orders in the Orders table.
select count(distinct snum) Total_People from orders

28. Write a query that produces all customers serviced by salespeople with a commission above
12%. Output the customer’s name and the salesperson’s rate of commission.
select c.cname,format(s.comm*100,'%') from customers c join salesperson s
on c.snum=s.snum where s.comm>0.12 

29. Find salespeople who have multiple customers.
select snum, count(snum) from customers group by snum having count(snum)>1

30. Find salespeople with customers located in their city.
select c.cname,c.city,s.sname,s.city from customers c join salesperson s on s.snum=c.snum
where s.city=c.city

31. Find all salespeople whose name starts with ‘P’ and the fourth character is ‘l’.
select * from salesperson where sname like 'p%' and substr(sname,4,4)='l'

32. Write a query that uses a subquery to obtain all orders for the customer named Cisneros.
Assume you do not know his customer number.
select onum from orders where cnum=2008














