
public class Main {

	public static void main(String[] args) {
		
		String[] carsList1 = {"BMW", "Audi", "Merc", "Tesla"};
		carsList1[0] = "Lambo";
		System.out.println(carsList1[0]);
		
		//-----------------------------------------------------
		System.out.println();
		//-----------------------------------------------------
		
		String[] carsList2 = new String[4];
		carsList2[0] = "BMW";
		carsList2[1] = "Audi";
		carsList2[2] = "Merc";
		carsList2[3] = "Tesla";

		for (int i = 0; i<carsList2.length; i++ ) {
			System.out.println(carsList2[i]);
			
		}
	}

}



/* 

Further Notes:

-Arrays= used to store multiple values in a single variable


-to find out arrays size of an simple array use:  .length


*/