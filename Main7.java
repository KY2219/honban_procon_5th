import java.util.Scanner;
import java.math.BigDecimal;
import java.io.*;

/*テストデータそのものが100000以下などになっているため、プログラム内で制約を書く必要はない*/

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dimen_num = scan.nextInt();

		//if(dimen_num < 1 || dimen_num > 100) {
		//	return;
		//}

		double[] P = new double[dimen_num];
		int i = 0;
		while(i < dimen_num) {
			P[i] = scan.nextInt();
			//if(P[i] < -100000 || P[i] > 100000)
			//	return;
			i++;
		}

		double[] Q = new double[dimen_num];
		i = 0;
		while(i < dimen_num) {
			Q[i] = scan.nextInt();
			//if(Q[i] < -100000 || Q[i] > 100000)
			//	return;
			i++;
		}
		
		double result = 0, sum = 0;
		i = 0;
		while(i < dimen_num){
			sum += (P[i] - Q[i]) * (P[i] - Q[i]);
			i++;
		}
		
		result = Math.sqrt(sum);
		
		//decimalはダメ
		/*BigDecimal bi = new BigDecimal(String.valueOf(result));
		double result2 = bi.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();*/
		
		//if(result < 1 || result > 10000000)
		//	return;
		
		//答えを出力
		System.out.println(String.format("%.2f", result));
		//System.out.println(result2);
	
	}

}