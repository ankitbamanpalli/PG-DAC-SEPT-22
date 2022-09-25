/*

*

*/
import java.util.*; 
class pyp5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
			for(int i =9;i>=1;i--){
				for(int k =i;k>1;k--){
					System.out.print("  ");
				}
				for(int l=i;l<=rows;l++){
					System.out.print(l+" ");
				}
				for(int j =rows-1;j>=i;j-- ){
					System.out.print(j+" ");
				}
				System.out.println();
				}
					
			}
}
 



/*



                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 






*/