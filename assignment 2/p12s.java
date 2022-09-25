/*

*/
import java.util.*; 
class p12s
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
			for(int i =1;i<=rows;i++){
				for(int k=rows;k>=i;k--){
					System.out.print("*");
				}
				System.out.println();
				}
			for(int i =2;i<=rows;i++){
				for(int k=1;k<=i;k++){
					System.out.print("*");
				}
				System.out.println();
				}				
			}
}
/*  

*****
****
***
**
*
**
***
****
*****

*/


