package mypack;
@ManagedBean(name = "navigationController")
@RequestScoped
public class NavigationController 
{
   public String moveToPage2()
   {
      return "page2";
   }
   public String moveToIndex()
   {
	return "index";
   }
}
