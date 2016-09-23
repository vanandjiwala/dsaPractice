import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
		
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String[] inputString = input.nextLine().split(" ");
		float countPositive = 0;
		float countNegativce = 0;
		float countZero = 0;
		for(int i=0;i < n; i++){
			float sign = Math.signum(Integer.parseInt(inputString[i]));
			if(sign == 0){
				countZero += 1;
			}else if(sign == 1){
				countPositive += 1;
			}else if(sign == -1){
				countNegativce +=1;
			}else{
				System.out.println("Something went wrong!!");
			}
		}
		DecimalFormat format = new DecimalFormat("#.######");
		format.setMinimumFractionDigits(6);
		System.out.println(format.format(countPositive/n));
		System.out.println(format.format(countNegativce/n));
		System.out.println(format.format(countZero/n));
		
		
		
		input.close();
	
	
	}

}
