package StringBased;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usrname = "vpn.rmb@2022";
		System.out.println(usrname);
		System.out.println("User Name is " + usrname.length() + " Characters long.");
		
		System.out.println("First 3 characters are : "+ usrname.substring(0,3).toUpperCase());
		
		System.out.println("Index 4 is: " + usrname.charAt(4));
	}

}
