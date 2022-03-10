package com.example.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.ProductType;
import com.example.demo.service.ProductService;

@SpringBootApplication
public class ProductServiceApplication {
	private static ProductService productService;
	
	


	public static void main(String[] args) {
		 ApplicationContext context=SpringApplication.run(ProductServiceApplication.class, args);
		productService=context.getBean("productServiceImpl",ProductService.class);
		//testCreateProduct();;
		fetchAllProducts();
	}
	
	
	public  static void testCreateProduct()
	{
		ProductEntity productEntity=new ProductEntity(UUID.randomUUID().toString(),"Laptop",ProductType.ELECTRONICS,"p-2");
		ProductEntity pEntity=productService.createProduct(productEntity);
		System.out.println(pEntity);
	}
	
	public static void fetchAllProducts()
	{
		List<ProductEntity> list=productService.getAllProducts();
		for(ProductEntity p:list)
		{
			System.out.println(p);
		}
	}

}
