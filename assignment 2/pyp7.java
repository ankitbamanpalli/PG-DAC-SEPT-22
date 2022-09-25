/*

*

*/
import java.util.*; 
class pyp7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
			for(int i =rows;i>=1;i--){
				for(int l=i;l<=rows;l++){
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					System.out.print(i+" ");
				}
				System.out.println();
				}
					
			}
}
 



/*



 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7
    6 6 6 6 6 6
     5 5 5 5 5
      4 4 4 4
       3 3 3
        2 2
         1







*/