import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		int sum = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter N:");
//		int n = Integer.parseInt(input.nextLine());
//		System.out.println("Enter Space separated integers:");
//		String[] temp = input.nextLine().split(" ");
//		if(n != temp.length){
//			System.out.println("Incorrect input");
//		}else{
//			for(int i=0; i < temp.length; i++){
//				System.out.println(temp.length);
//				sum = sum + Integer.parseInt(temp[i]);
//			}	
//		}		
//		System.out.println("Sum is:" + sum);
//		input.close();
//		
		
		 	int apoint,bpoint;
		 	apoint = bpoint = 0;
	        Scanner input = new Scanner(System.in);
	        String[] a = input.nextLine().split(" ");
	        String[] b = input.nextLine().split(" ");
	        if(a.length != b.length){
	            System.out.println("incorrect input");
	        }else{
	            for(int i=0; i<a.length;i++){
	            	int ai = Integer.valueOf(a[i]).intValue();
	            	int bi = Integer.valueOf(b[i]).intValue();
	            	
	                if(ai > bi ){
	                    apoint += 1;
	                }else if(ai < bi){
	                    bpoint += 1;
	                }
	            }
	        }
	        
	        System.out.println(apoint + "" + bpoint);
	        input.close();

	}

}
