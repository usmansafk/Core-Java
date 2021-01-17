
public class Main {

	public static void main(String[] args) {
		
		
		String[][] cars = 	{
								{"BMW","Audi","Merc"}, 
								{"Skoda","Vauxhall" ,"Toyota"}, 
								{"Honda","Ford" , "Lambo"}, 
							};
		 
		/*String[][] cars = new String[3][3];
		
		cars[0][0] = "BMW";
		cars[0][1] = "Audi";
		cars[0][2] = "Merc";
		cars[1][0] = "Skoda";
		cars[1][1] = "Vauxhall";
		cars[1][2] = "Toyota";
		cars[2][0] = "Honda";
		cars[2][1] = "Ford";
		cars[2][2] = "Lambo";
		*/
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for (int j=0; j<cars[i].length;j++) {
				System.out.print(cars[i][j] + " ");
			}
			
		}

	}

}



/* 

Further Notes:

2D arrays = an array  of  arrays 


*/