import java.util.*;

public class Ibm_two_string {
	static Set<Character> x;
	static Set<Character> y;

	public static void main(String[] args) 
	{
		// I'm assuming the problem wants a scanner but it is not specific, I can resubmit if needed

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			x = new HashSet<Character>();
			y = new HashSet<Character>();
			for(char s : scan.next().toCharArray())
			{
				x.add(s);
			}
			for(char s : scan.next().toCharArray()) 
			{
				y.add(s);
			}

			x.retainAll(y);

			System.out.println( (x.isEmpty()) ? "NO" : "YES" );
		}
		scan.close();
	}
}
