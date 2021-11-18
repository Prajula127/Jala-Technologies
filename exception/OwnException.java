package exception;


//Write a program to create your own exception
class StudentException extends Exception{

}
public class OwnException {

	public static void main(String[] args) {
    try {
    	throw new StudentException();
    }catch(StudentException e) {
    	e.getMessage();
    	System.out.println("student");
    }
    System.out.println("print");
	}

}
