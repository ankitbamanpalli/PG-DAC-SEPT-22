/*

*

*/
import java.util.*; 
class pyp3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
        // loop to iterate for the given number of rows
			
		for(int i =1;i<=rows;i++){
			for(int k =1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j =1;j<=(i*2-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
					
}



