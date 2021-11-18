package methodOverloading;

/*Write two methods with the same name, number of parameters and data type but 
different return Type*/
	class Arithmatic{
      public int Method(int x, int y) {
			System.out.println("Add");
			return x+y;
		}
		public double Method(int c, int d) {
			System.out.println("multiplication ");
			return c*d;
		}
	}
	public class Returntype {
	public static void main(String[] args) {
		Arithmatic ar = new Arithmatic();
			ar.Method(10, 5);
			ar.Method(2, 3);
		}
	}
/*It will throw a compilation error: 
 because,More than one method with same name and argument list can't be given in a class even though their return type is different.
 */


