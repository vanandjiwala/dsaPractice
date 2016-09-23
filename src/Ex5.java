import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex5");
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String[][] inputMatrix = new String[n][n];
		int first = 0;
		int last = n -1;
		int sumDia1 = 0;
		int sumDia2 = 0;
		for(int i = 0; i<n ; i++){
			inputMatrix[i] = input.nextLine().split(" ");
			sumDia1 += Integer.parseInt(inputMatrix[i][first]);
			first += 1;
			sumDia2 += Integer.parseInt(inputMatrix[i][last]);
			last -= 1;
		}
		
		System.out.println(Math.abs(sumDia1 - sumDia2));
		input.close();
	}

}
