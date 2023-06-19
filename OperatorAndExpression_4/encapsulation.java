package OperatorAndExpression_4;

public class encapsulation {
    private String name  ="Hritik sharma";
    private int age=24;
    public int  getage()
    {
       return age;
    }
    public void setage(int a)
    {
        age=a;
    }
    public String getname()
    {
      return name;
    }
    public void setname(String s)
    {
        name=s;
    }

}
class encap
{
    public static void main(String args[])
    {
        encapsulation myobj=new encapsulation();
        myobj.setage(45);
        myobj.setname("Hritik sharma");
        System.out.println(myobj.getage()+":"+myobj.getname());
        System.out.println("Vinod sharma");
    }
}
