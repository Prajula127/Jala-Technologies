package inheritance;

/*Runtime Polymorphism with Data Members/Instance variables, Repeat the above 
process only for data member*/
class Bike {
	
	int speed = 90;
}
class Honda extends Bike {
	int speed = 150;
}
public class Runtime {

public static void main(String[] args) {
    Bike obj = new Honda();
    System.out.println(obj.speed);
	}

}
