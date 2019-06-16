package sample.demo.service;

import sample.demo.model.Medicine;

public class MedicineService 
{
	
	public static double discount(Medicine m)
	{
		if(m.getPrice()>1000)
		{
			int discount=100;
			return discount;
		}
		else if(m.getPrice()>500 && m.getPrice()<1000)
		{
			int discount=50;
			return discount;
		}
		else
		{
			return 20;
		}
	 }
	
	

}
