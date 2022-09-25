/*

*/
import java.util.*; 
class p16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
        // loop to iterate for the given number of rows
			
		for(int i =rows;i>=1;i--){
			for(int k =rows;k>=i;k--){
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
	}
					
}

