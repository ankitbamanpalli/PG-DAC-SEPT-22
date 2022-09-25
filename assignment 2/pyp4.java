/*

*

*/
import java.util.*; 
class pyp4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
			for(int i =1;i<=rows;i++){
				for(int k =rows-1;k>=i;k--){
					System.out.print("  ");
				}
				for(int l=1;l<=i;l++){
					System.out.print(l+" ");
				}
				for(int j =i-1;j>=1;j-- ){
					System.out.print(j+" ");
				}
				System.out.println();
				}
					
			}
}
 



/*



                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 






*/