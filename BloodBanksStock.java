package BloodBanks;

public class BloodBanksStock {
	 

	protected Boolean BloodGroupAvailabity (char Bloodtype)
	   {
		   if (Bloodtype == 'A') 
		   {
			   System.out.println("This Blood Group is available in BloodBank One");
			   return true;
		   }
				
		   else {
		return false;
		   }
		   
	   }


}