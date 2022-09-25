/*

*/
import java.util.*; 
class p7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
		for(int i =1;i<=rows;i++){
			for(int j =1;j<=rows-i;j++){
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
					
}

