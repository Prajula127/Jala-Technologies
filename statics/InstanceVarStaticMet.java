package statics;
//Print instance variables in static methods
public class InstanceVarStaticMet {
    int a;
    
	public InstanceVarStaticMet(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		InstanceVarStaticMet is = new InstanceVarStaticMet(10);
		System.out.println(is.getA());
	}

}
