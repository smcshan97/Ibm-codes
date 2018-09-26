import java.util.*;

public class Ibm_left_rotation {
	
	public static void main(String[] args) 
	{
		// I'm assuming the problem wants a scanner but it is not specific, I can resubmit if needed
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int[] a= new int[x];
        
   for(int i=0;i<x;a[i]=scan.nextInt(),i++);
   	     y=y%x;
    
   for(int i=y;i<x;i++)
         System.out.print(a[i]+" ");
    
   for(int i=0;i<y;i++)
         System.out.print(a[i]+" ");
    }
}
