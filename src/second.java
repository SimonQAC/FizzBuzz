
public class second {

	public static void main(String[] args) {
	
		int min = 1;
		
		for (int i = 15 ; i >= min; i--) {
			
			String output = "";
			
			if (i % 3 == 0) {
				output += "Fizz";
			}
			if (i % 5 == 0) {
				output += "Buzz";
			}
			if(output.equals("")) {
				output += Integer.toString(i);
			}
				
			System.out.println(output);
		}
	}

}
