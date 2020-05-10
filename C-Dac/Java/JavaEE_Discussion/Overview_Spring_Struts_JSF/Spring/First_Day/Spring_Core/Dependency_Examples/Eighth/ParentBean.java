package mypack;

import java.beans.ConstructorProperties;

public class ParentBean
{
    public ParentBean()
    {
        System.out.println("ParentBean no-arg constructor");
    }
    public void setAbn(AnotherBean abn) 
    {
        System.out.println("inside setter method of ParentBean");
        this.abn = abn;
    }
    private AnotherBean abn;
    public void perform()
    {
        System.out.println(abn.disp());
    }
    public void myInit()
    {
        System.out.println("inside myinit of ParentBean");
    }
    public void myDestroy()
    {
       System.out.println("inside mydestroy of ParentBean");
    }
}





