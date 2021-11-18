package accessmodifiers;

public class Protected {
	protected void msg() {
		System.out.println("Protected");
	}
}
class B extends Protected{
	public static void main(String[] args) {
      B obj = new B();
      obj.msg();
	}

}
