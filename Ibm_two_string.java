import java.util.*;

public class Ibm_two_string {
	 static Set<Character> a;
	    static Set<Character> b;

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        for(int i = 0; i < n; i++) {
	            a = new HashSet<Character>();
	            b = new HashSet<Character>();
	            for(char c : scan.next().toCharArray()) {
	                a.add(c);
	            }
	            for(char c : scan.next().toCharArray()) {
	                b.add(c);
	            }
	            
	            // store the set intersection in set 'a'
	            a.retainAll(b);
	            
	            System.out.println( (a.isEmpty()) ? "NO" : "YES" );
	        }
	        scan.close();
	    }
}
