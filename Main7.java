/**

	調整中


**/

import java.util.Scanner;
import java.math.BigDecimal;
import java.io.*;

public class Main7 {
	public static void main(String[] args) {
		//BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		//try{
			Scanner scan = new Scanner(System.in);
			//String n[] = in.readLine().split("\\s+");
			String n[] = scan.nextLine().split(" ");
			//int dimen_num = scan.nextInt();
			//if(!(n[0].equals(" ")))
			//return;
			
			//サイトの入力例の謎の空白に対応（？）
			int dimen_num = Integer.parseInt(n[0]);
			if(dimen_num < 1 || dimen_num > 100) {
				return;
			}
			//String str = scan.nextLine();
			//if(!(str.equals(" ")))
			//return;

			//Scanner scan_P = new Scanner(System.in);
			//String p[] = in.readLine().split("\\s+");
			String p[] = scan.nextLine().split(" ");
			int[] P = new int[dimen_num];
			int i = 0;
			while(i < dimen_num) {
				//P[i] = scan.nextInt();
				P[i] = Integer.parseInt(p[i]);
				if(P[i] < -100000 || P[i] > 100000)
					return;
				i++;
			}

			//Scanner scan_Q = new Scanner(System.in);
			//String q[] = in.readLine().split("\\s+");
			String q[] = scan.nextLine().split("\\s+");
			int[] Q = new int[dimen_num];
			i = 0;
			while(i < dimen_num) {
				//Q[i] = scan.nextInt();
				Q[i] = Integer.parseInt(q[i]);
				if(Q[i] < -100000 || Q[i] > 100000)
					return;
				i++;
			}
			
			double result = 0, sum = 0;
			i = 0;
			while(i < dimen_num){
				sum += (P[i] - Q[i]) * (P[i] - Q[i]);
				i++;
			}
			
			result = Math.sqrt(sum);
			BigDecimal bi = new BigDecimal(String.valueOf(result));
			double result2 = bi.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			if(result2 < 1 || result2 > 10000000)
			return;
			System.out.println(result2);
		//}catch(Exception e){
		//	System.out.println(e);
		//}
	return;
	}

}