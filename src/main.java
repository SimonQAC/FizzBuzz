
public class main {

	public static void main(String[] args) {
	
		int max=100;
		int count=1;
		
		while (count <= max) {
			
			String output = "";
			
			if (count % 3 == 0) {
				output += "Fizz";
			}
			if (count % 5 == 0) {
				output += "Buzz";
			}
			if(output.equals("")) {
				output += Integer.toString(count);
			}
			
			count++;
			
			System.out.println(output);
		}
	}

}
