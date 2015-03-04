
public class DemoMyString {
	public static void main (String [] args) {
		char [] startChar10 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g' };
		/*
		for (char x : startChar10) {
			System.out.println(x);
		}
		*/
		System.out.println("Calling MyString constructor with a - g char array (10 characters). ");
		MyString myStObj0 = new MyString(startChar10);
		System.out.println("myStObj0.charAt(i) to print out MyString");
		for (int i = 0; i < 10; i++){
			System.out.print(myStObj0.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("myStObj0.length()");
		System.out.println(myStObj0.length());
		System.out.println("MyString mySubobj0 = myStObj0.substring(0, 5)");
		MyString mySubObj0 = myStObj0.substring(0, 5); 
		System.out.println("mySubObj0.charAt(i) to print out substring");
		for (int i = 0; i < mySubObj0.length(); i++){
			System.out.print(mySubObj0.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("System.out.println(myStObj0.toUpperCase())");
		System.out.println(myStObj0.toUpperCase());
		System.out.println("System.out.println((myStObj0.toUpperCase()).toLowerCase())");
		System.out.println((myStObj0.toUpperCase()).toLowerCase());
		System.out.println("char [] startChar10b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g' }; +"
				+ "MyString myStObj1 = new MyString(startChar10b);");
		char [] startChar10b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g' };
		MyString myStObj1 = new MyString(startChar10b);
		System.out.printf("myStObj0.equals(myStObj1) = %s%n", myStObj0.equals(myStObj1)); 
		System.out.printf("myStObj0.equals(myStObj1.toUpperCase()) = %s%n", myStObj0.equals(myStObj1.toUpperCase())); 
		System.out.printf("myStObj0.getMyString() = %s%n", myStObj0.getMyString());
		String realString = myStObj0.toString();
		System.out.printf("String realString = myStObj0.toString(); System.out.println(realString) = %s%n", realString);
		System.out.printf("MyString intMyString = MyString.valueOf(5378); System.out.println(intMyString) = ");
		MyString intMyString = MyString.valueOf(5378);
		System.out.println(intMyString);
		
	}
}