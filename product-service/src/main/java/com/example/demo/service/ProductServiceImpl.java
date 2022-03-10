package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repo.ProductRepository;

@Service

public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	private static final Logger logger = LoggerFactory.getLogger("ProductServiceImpl.class");

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public ProductEntity createProduct(ProductEntity productEntity) {
		logger.info("creating new product in service layer");
		ProductEntity tempProductEntity = productRepository.save(productEntity);
		logger.info("create product sucessfull in service layer");
		return tempProductEntity;
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		logger.info("displaying products in service layer");
		return productRepository.findAll();
		
	}

}
