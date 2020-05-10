package mypack;
public class InjectReference
{
    public void setAbn(AnotherBean abn) 
    {
        System.out.println("inside setter method");
        this.abn = abn;
    }
    private AnotherBean abn;
    public void perform()
    {
        System.out.println(abn.disp());
    }
	public InjectReference() {
		super();
		System.out.println("in InjectReference no-arg");
	}

}
