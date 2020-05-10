package mypack;
public class Author
{
    private String name,address;

    public String getAddress() {
        return address;
    }

    @Override
    public String toString()
    {
        return name+"\t"+address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
