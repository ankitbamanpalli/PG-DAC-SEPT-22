/*

*

*/
import java.util.*; 
class p15s
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
			for(int i =1;i<=rows;i++){
				if(i==rows){
					for(int j=1;j<=rows;j++){
						System.out.print("*");
					}
				}
				else{
					for(int k =1;k<=i;k++){
						if(k==1 || k==i){
							System.out.print("*");
					}
					else{
						System.out.print(" ");
						}
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