/*
 * __Planning__
 * 1) Make the following fields with their respective data types:
 *      a)-name: String
 *      b)-address: String
 *      c)-phone: String
 * 2) Include the following methods:
 *      
 *      a- Customer()
 *      b- setName(n: String): void
 *      c- setAddress(a:String): void
 *      d- setPhone(p: String): void
 *      
 *      Bellow are the methods to get the following information.
 *      a- getName(): String
 *      b- getAddress(): String
 *      c- getPhone(): String
 */ 

public class Customer
{
    private String name;
    private String address;
    private String phone;
    
    public void setName(String n)
    {
        name = n;
    }
    public void setAddress(String a)
    {
        address = a;
    }
    public void setPhone(String p)
    {
        phone = p;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhone()
    {
        return phone; 
    }
}