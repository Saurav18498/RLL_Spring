package com.mph.testcase;


import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mph.controller.OrderRestController;
import com.mph.entity.Order;
import com.mph.service.OrderService;



@WebMvcTest(value=OrderRestController.class)
@ContextConfiguration(classes= {OrderRestController.class})
@AutoConfigureMockMvc
public class OrderRestControllerTest {
	
	 private MockMvc mockMvc;
	    @InjectMocks
	    OrderRestController orderRestController;
	    
	    @Mock
	     OrderService orderService;
	    
	    @Before
	    public void setUp(){
	    	MockitoAnnotations.initMocks(this);
	        mockMvc = MockMvcBuilders.standaloneSetup(orderRestController).build();
	    }
	    
	@Test
	 public void testgetOrderById() throws Exception{
		Order o= new Order(1,"panipuri","6");
		Mockito.when(orderService.getOrderById(1)).thenReturn(o);
		mockMvc.perform(MockMvcRequestBuilders.get("/canteen/getOrder/1")
		        .accept(MediaType.APPLICATION_JSON))
		                .andExpect(MockMvcResultMatchers.status().isOk())
		                .andExpect(MockMvcResultMatchers.jsonPath("$.order_id", Matchers.is(1)))
		                .andExpect(MockMvcResultMatchers.jsonPath("$.order_item",Matchers.is("biryani")))
		                .andExpect(MockMvcResultMatchers.jsonPath("$.quantity",Matchers.is("6")));
		        Mockito.verify(orderService).getOrderById(1);
		
	}
}



