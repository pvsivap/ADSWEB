//testing pull request for techcom demo.

package test.java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.ads.businessentities.InsuranceType;
import com.ads.businessentities.User;
import com.ads.businessobjects.InsuranceTypeBusinessObject;
import com.ads.businessobjects.UserBusinessObject;

public class InsuranceTypeBusinessObjectsTest {

	
		@Before
		  public void setUp() throws Exception {
		    // NiceMocks return default values for
		    // unimplemented methods
		    		    
		  }
		//Test method
		  @Test
		  public void testInsuranceTypeId() {
			  InsuranceTypeBusinessObject bobj = new InsuranceTypeBusinessObject();
			  InsuranceType returnInsuranceType = null;
			  InsuranceType insuranceType = new InsuranceType();
			  insuranceType.setId(1);
			    try {
			    	returnInsuranceType = bobj.Add(insuranceType);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting 100", 1, returnInsuranceType.getId());
		    }
		  @Test
		  public void testInsuranceTypeName() {
			  InsuranceTypeBusinessObject bobj = new InsuranceTypeBusinessObject();
			  InsuranceType returnInsuranceType = null;
			  InsuranceType insuranceType = new InsuranceType();
			  insuranceType.setInsuranceTypeName("Jeevan Jothi");
			    try {
			    	returnInsuranceType = bobj.Add(insuranceType);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting 100", "Jeevan Jothi", returnInsuranceType.getInsuranceTypeName());
		    }		  
}
