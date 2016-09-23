import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given a time in AM/PM format, convert it to military (24-hour) time.
		
		Scanner input = new Scanner(System.in);
		String time = input.next();
		DecimalFormat format = new DecimalFormat();
		String[] HMS = time.split(":");
		format.setMinimumIntegerDigits(2);
		int hr = Integer.parseInt(HMS[0]);		
		int min = Integer.parseInt(HMS[1]);
		int sec = Integer.parseInt(HMS[2].substring(0, HMS[2].length() - 2));
		if(time.contains("AM")){
			if(hr == 12){
				System.out.println("00" + ":" + format.format(min) + ":" + format.format(sec));
			}else{
				System.out.println(format.format(hr) + ":" + format.format(min) + ":" + format.format(sec));
			}
			
		}else if(time.contains("PM")){
			if(hr == 12){
				System.out.println("00" + ":" + format.format(min) + ":" + format.format(sec));
			}else{
				System.out.println(format.format((hr+12)) + ":" + format.format(min) + ":" + format.format(sec));
			}
			
			System.out.println();
		}else{
			System.out.println("Something went wrong!!!");
		}
		input.close();
	}

}
