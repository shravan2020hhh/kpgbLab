package hyderabad.practice;

//@CONTROLLER
public class EDay15DuplicateWords_Of_MaxCharacter {

//	
//	 @getmapting("getEmployyee")
//	 Employee getEmployee( @requestparam int empId)
//	 {
//		 //databse se emp recprd fetch karega sevice database comnnectivity 
//	 }
//	 @postmaping("saveEmployee")
//	 saveemployye()
//	 {}

	public static void main(String[] args) {
		String str = "tomorrow";//01234567

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				for (int j = 0; j <= count; j++) {
					System.out.print("*");
				}
				//8-2 6<6
				if (i < str.length() - 2)
				  System.out.println();

				count++;

			} else
				System.out.print(str.charAt(i));
			
			

		}
	}

}
