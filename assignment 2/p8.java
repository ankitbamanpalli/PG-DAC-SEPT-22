/*

*/
import java.util.*; 
class p8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
        // loop to iterate for the given number of rows
			
		for(int i =rows;i>0;i--){
			for(int j =1;j<i;j++){
				System.out.print(" ");
			}
			for(int l = i;l<=rows;l++){
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	}
					
}

