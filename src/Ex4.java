import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A very big sum
		long sum = 0;
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String[] value = input.nextLine().split(" ");
		for(int i=0;i<value.length;i++){
			long elementValue = Long.parseLong(value[i]);
			sum = sum + elementValue;
			
		}
		
		
		System.out.println(sum);
		input.close();
	}

}
