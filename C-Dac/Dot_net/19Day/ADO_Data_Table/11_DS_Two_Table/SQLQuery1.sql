Create procedure spGetProductAndCategoriesData
as
Begin
 Select Id, Name,Price  from Product

 Select Id, Name  from Productcat
End
