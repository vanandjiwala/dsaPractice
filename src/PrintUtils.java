import java.util.ArrayList;


public class PrintUtils {

	public static void PrintAListInt(ArrayList<Integer> list){
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	public static void PrintIntArray(int[] a){
		for(int i =0; i< a.length; i++){
			System.out.println(a[i]);
		}
	}
}
