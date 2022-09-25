/*

*

*/
import java.util.*; 
class p16s
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
			for(int i =1;i<=rows;i++){
				
				for(int j=1;j<=rows;j++){
					if(i==rows||j==rows||i+j==(rows+1)){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				
				System.out.println();
			}
			
	}
}
					


 



/*

        *
       **
      * *
     *  *
    *   *
   *    *
  *     *
 *      *
*********




*/