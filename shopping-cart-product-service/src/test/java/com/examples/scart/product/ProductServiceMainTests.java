package com.examples.scart.product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.examples.scart.product.model.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceMainTests {

	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Product product;
	
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void testApplicationContext() {
		System.out.println("Context: "  + ctx);
		assertNotNull(ctx);
	}
	
	@Test
	public void testProductEntityExists() {
//		Product product = (Product) ctx.getBean("product");
		System.out.println("Product: "  + product);
		assertNotNull(product);
	}
	
	@Test
	public void testSetProductName() {
		product.setName("Samsung Galaxy M40");
		assertEquals("Samsung Galax M40", product.getName());		
	}
	
	

}
