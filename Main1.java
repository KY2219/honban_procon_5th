
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if(s.length() < 1 || s.length() > 100)
			return;
		String[] out_s = s.split("");

		String tmp;
		//•¶š”‚ª‹ô”‚Ì
		if((s.length() % 2) == 0) {
			tmp = out_s[0];
			for(int i = 1; i <= (s.length()/2)-1; i++){
				out_s[i-1] = out_s[i];
			}
			out_s[(s.length()/2)-1] = tmp;

			tmp = out_s[s.length()-1];
			for(int i = s.length()-2; i >= s.length()/2; i--){
				out_s[i+1] = out_s[i];
			}
			out_s[s.length()/2] = tmp;
		}
		//•¶š”‚ªŠï”‚Ì
		else if((s.length() % 2) != 0) {
			tmp = out_s[0];
			for(int i = 1; i <= (s.length()/2)-1; i++){
				out_s[i-1] = out_s[i];
			}
			out_s[(s.length()/2)-1] = tmp;

			tmp = out_s[s.length()-1];
			for(int i = s.length()-2; i >= (s.length()/2)+1; i--){
				out_s[i+1] = out_s[i];
			}
			out_s[(s.length()/2)+1] = tmp;
		}

		int j = 0;
		while(j < out_s.length){
			System.out.print(out_s[j]);
			j++;
		}
		System.out.println("");

	}

}

