package interfaces;
//an interface and inherit it from the other interface.
interface intfaceA{
    void Print();
}
  
interface intfaceB extends intfaceA{
    void Show();
}
  
class Interf implements intfaceB{
    public void Print()
    {
        System.out.println("Print");
    }
      public void Show()
    {
        System.out.println("Show");
    }
}
  public class OtherInterface{
    public static void main (String[] args)
    {
    	Interf obj = new Interf();
  
        obj.Print();
        obj.Show();
    }
}

