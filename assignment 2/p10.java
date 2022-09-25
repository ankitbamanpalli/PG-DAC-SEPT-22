/*

*/
import java.util.*; 
class p10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
        // loop to iterate for the given number of rows
			
		for(char i ='E';i>='A';i--){
			for(char j ='A';j<i;j++){
				System.out.print(" ");
			}
			for(char l = i;l<='E';l++){
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	}
					
}

