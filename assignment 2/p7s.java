/*

*/
import java.util.*; 
class p7s
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
			for(int i =1;i<=rows;i++){
				for(int k=rows;k>i;k--){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				for(int l=2;l<=i;l++){
					System.out.print("*");
				}
				System.out.println();
				}
			for(int i =rows-1;i>=1;i--){
				for(int k=rows-1;k>=i;k--){
					System.out.print(" ");
				}
				for(int j=i;j>=1;j--){
					System.out.print("*");
				}
				for(int l=i;l>=2;l--){
					System.out.print("*");
				}
				System.out.println();
				}		
			}
}
 



