package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ProductEntity {
	
	
	@Id
	@Column(name = "product_id")
	private String productId;
	@Column(name = "product_name",nullable = false)
	private String productName;
	@Column(name="product_type",nullable = false)
	@Enumerated(EnumType.STRING)
	private ProductType productType;
	@Column(name = "product_code",unique = true,nullable = false)
	private String productCode;
	
	
	public ProductEntity() {
		super();
	}


	public ProductEntity(String productId, String productName, ProductType productType, String productCode) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productCode = productCode;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public ProductType getProductType() {
		return productType;
	}


	public void setProductType(ProductType productType) {
		this.productType = productType;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productCode=" + productCode + "]";
	}
	


}
