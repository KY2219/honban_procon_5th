
/**

	’²®’†
	
**/

import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num < 1 || num > Math.pow(10, 5)) {
			return;
		}
		
		
		int i = 0;
		//Scanner scan2 = new Scanner(System.in);
		int[] out_x = new int[num];
		
		while(i < num) {
			out_x[i] = scan.nextInt();
			if(out_x[i] < -Math.pow(10,5) || out_x[i] > Math.pow(10,5))
				return;
			i++;
		}
		//ŒÂ”‚ª‚P‚Â‚Ì‚İ‚Ìê‡
		if(num == 1){
			System.out.println(1);
			return;
		}

		Arrays.sort(out_x);

		int point = num/2;
		i = 0;
		int count = 1;
		while(i < out_x.length){
			//•½‹Ï‚ğæ‚é•û–@i‚æ‚­‚È‚¢j
			/*if((out_x[i+1] - out_x[i]) <= 2 && (out_x[i+1] - out_x[i]) >= 0){
				out_x[i] = (out_x[i+1] + out_x[i])/2;
				out_x[i+1] = (out_x[i+1] + out_x[i])/2;
				count++;
			}*/
			if(out_x[i] < out_x[point]){
				out_x[i]++;
			}
			if(out_x[i] > out_x[point]){
				out_x[i]--;
			}
			i++;
			
			//if(i == out_x.length-1)
			//	System.out.println(count);
		}
		
		if((out_x[point]-out_x[point-1]) == 1){
			out_x[point]--;
		}
		else if((out_x[point+1]-out_x[point]) == 1){
			out_x[point]++;
		}
		
		i=0;
		while(i < out_x.length-1){
			if(out_x[i] == out_x[i+1]){
				count++;
			}
			i++;
			
			if(i == out_x.length-1)
				System.out.println(count);
		}

	}

}