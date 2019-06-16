package sample.demo.test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import sample.demo.model.Medicine;
import sample.demo.service.MedicineService;

public class MedicineTest {
	
	Medicine md=new Medicine();
	MedicineService mserve=new MedicineService();
  @Test
  public void f() 
  {
	  System.out.println("in f");
  }
  
  public void testdiscount() 
  {
	  System.out.println("in testdis");
	  md.setId(1);
	  md.setName("Crocin");
	  md.setPrice(500);
	  double price=mserve.discount(md);
	  AssertJUnit.assertEquals(50, price);
	  
 }
}
