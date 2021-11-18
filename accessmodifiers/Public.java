package accessmodifiers;

public class Public {
   public void msg() {
	   System.out.println("Public");
   }
}
class Print{
	public static void main(String[] args) {
       Public obj = new Public();
       obj.msg();
	}

}
