package mypack;
public class AnotherBean
{
    public String disp()
    {
        return "welcome to another bean";
    }
    public void myInit()
    {
        System.out.println("inside myinit of AnotherBean");
    }

    public AnotherBean()
    {
        System.out.println("inside AnotherBean no-arg constr");
    }
    public void myDestroy()
    {
        System.out.println("inside mydestroy of AnotherBean");
    }
}
