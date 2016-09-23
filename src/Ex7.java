import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		StringBuffer builder = new StringBuffer();
		//String[] stair = new String[n];
		String result = "";
		int last = n-1;
		for(int i=0; i<n ; i++){
			
			for(int j=0;j<n;j++){
				
				if(j >= last){
					result = builder.append("#").toString();
				}else{
					result = builder.append(" ").toString();
				}
				
			}
			System.out.println(result);
			builder.delete(0, builder.length());
			last -=1;
			result = "";
			
		}
		input.close();
	}

}
