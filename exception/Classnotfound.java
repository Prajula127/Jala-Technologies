package exception;
//Write a program to generate ClassNotFoundException
public class Classnotfound {

	public static void main(String[] args) throws Exception {
    	  Class.forName("com.mysql.cj.jdbc.Driver");
	}

}
