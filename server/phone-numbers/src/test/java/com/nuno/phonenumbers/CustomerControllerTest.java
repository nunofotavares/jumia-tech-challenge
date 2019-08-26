package com.nuno.phonenumbers;

//import static org.hamcrest.CoreMatchers.hasItems;
//import static org.junit.Assert.assertThat;

//import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//import com.nuno.phonenumbers.controller.CustomerController;
//import com.nuno.phonenumbers.model.Customer;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestBeanConfig.class})
public class CustomerControllerTest {
	
	@Autowired
	//private CustomerController customerController;
	
	@Test
	public void getAllEmployes_Test() {

		/*List<Customer> actual =  customerController.getAllEmployees();
		assertThat(actual, hasItems(
                new Customer(40,"Nelson Nelson", "(237) 699209115"),
                new Customer(0,"Walid Hammadi", "(212) 6007989253")
        ));*/
		
		/*assertThat(actual, containsInAnyOrder(
                hasProperty("name", is("Nelson Nelson")),
                hasProperty("name", is("Walid Hammadi"))
        ));*/
	}
}
