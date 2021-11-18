package interfaces;
//Create an interface with static final variable
interface ABCclass{
	public static final double pi = 3.14;
}
public class StaticFinal {
    public static void main(String[] args) {
    	int r = 2;
    	double a = Math.PI*r*r;
    	System.out.println("A value = "+a);
    }
}
