import java.util.*;
public class Ibm_sparse_array {

	public static void main(String[] args) 
	{

		// I'm assuming the problem wants a scanner but it is not specific, I can resubmit if needed

		Scanner scan=new Scanner(System.in); 
		int n=scan.nextInt(); 
		int count=0;
		String []s=new String[n];   


		for(int i=0;i<n;i++)
		{
			scan.nextLine();
			s[i]=scan.next();
		}   

		int n1=scan.nextInt();
		String[] s1=new String[n1];

		for(int j=0;j<n1;j++)
		{
			scan.nextLine();
			s1[j]=scan.next();  
		}

		for(int i=0;i<n1;i++)
		{
			count=0;

			for(int j=0;j<n;j++)
			{  
				if((s[j].equals(s1[i])))
				{
					count++;
				}
			}
			System.out.println(count);
		}


	}

}
