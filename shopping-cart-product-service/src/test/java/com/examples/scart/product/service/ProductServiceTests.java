package com.examples.scart.product.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.examples.scart.product.model.Product;
import com.examples.scart.product.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTests {

//	ProductService productService = new ProductService();

	@Autowired
	ProductService productService;

//	@MockBean
//	ProductRepository productRepo;

	@BeforeAll
	public static void init() {
		// Logic to initialize test data goes here
		System.out.println("Test data initialization at class level..");
	}

	@AfterAll
	public static void tearDown() {
		// Logic to clean up test data goes here
		System.out.println("Test data clean up at class level..");
	}
	
	private static List<Product> products = new ArrayList<>();

	@BeforeEach
	public void setup() {
		// Initialize Test data
		Product mobile = new Product();
		mobile.setId("1");
		mobile.setName("Samsung Galaxy Note10");
		mobile.setCategory("Mobiles");
		mobile.setManufacturer("Samsung");
		productService.createProduct(mobile);
//		products.add(mobile);

		Product laptop = new Product();
		laptop.setId("2");
		laptop.setName("Lenovo Thinkpad E490");
		laptop.setCategory("Laptops");
		laptop.setManufacturer("Samsung");
		productService.createProduct(laptop);
//		products.add(laptop);
	}

	@AfterEach
	public void cleanup() {
		productService.clear();
	}

	@Test
	public void shouldCreateProductWhenPassingMandatoryDetails() {
		Product product = new Product();
		product.setId("3");
		product.setName("Laptop");
		productService.createProduct(product);

		assertNotNull(productService.getProduct("3"));
		assertEquals("3", productService.getProduct("3").getId());
	}

	@Test
	public void shouldShowErrorWhenNotPassingMandatoryDetails() {
		Product product = new Product();
		try {
			productService.createProduct(product);
		} catch (Exception e) {
			assertEquals("Product Id mandatory", e.getMessage());
		}
	}

	@Test
	public void shouldUpdateProductForGivenProductId() {
		Product laptop = new Product();
		laptop.setName("Lenovo Thinkpad E490");
		laptop.setCategory("Laptops");
		laptop.setManufacturer("Lenovo");

		productService.updateProduct("2", laptop);

		assertNotNull(productService.getProduct("2"));
		assertEquals("Lenovo", productService.getProduct("2").getManufacturer());
	}

	@Test
	public void shouldDeleteProductWhenPassingValidProductId() {
		productService.deleteProduct("2");
		assertNull(productService.getProduct("2"));
		assertEquals(1, productService.getProducts().size());
	}

	@Test
	public void shouldReturnProductForGivenProductId() {
//		Mockito.when(productRepo.findById("2")).thenReturn(Optional.of(products.get(1)));
		
		
		assertNotNull(productService.getProduct("2"));
		assertEquals("2", productService.getProduct("2").getId());
	}

	@Test
	public void shouldReturnAllProductsWhenDontSpecifyProductId() {
//		Mockito.when(productRepo.findAll()).thenReturn(products);
		
		assertEquals(2, productService.getProducts().size());
	}

}
