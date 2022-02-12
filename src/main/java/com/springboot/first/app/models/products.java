package com.springboot.first.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_product;
	
	@Column(name = "barcode_product")
	private String barcode_product;
	
	@Column(name = "name_product")
	private String name_product;
	
	@ManyToOne
	@JoinColumn(name = "id_category")
	private categories categories;
	
	@Column(name = "photo_product")
	private String photo_product;
	
	@Column(name = "price_import")
	private double price_import;
	
	@Column(name = "price_sell")
	private double price_sell;
	
	@Column(name = "quantity")
	private int quantity;

	public products() {
		super();
	}

	public products(int id_product, String barcode_product, String name_product,
			categories categories, String photo_product, double price_import,
			double price_sell, int quantity) {
		super();
		this.id_product = id_product;
		this.barcode_product = barcode_product;
		this.name_product = name_product;
		this.categories = categories;
		this.photo_product = photo_product;
		this.price_import = price_import;
		this.price_sell = price_sell;
		this.quantity = quantity;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getBarcode_product() {
		return barcode_product;
	}

	public void setBarcode_product(String barcode_product) {
		this.barcode_product = barcode_product;
	}

	public String getName_product() {
		return name_product;
	}

	public void setName_product(String name_product) {
		this.name_product = name_product;
	}

	public categories getCategories() {
		return categories;
	}

	public void setCategories(categories categories) {
		this.categories = categories;
	}

	public String getPhoto_product() {
		return photo_product;
	}

	public void setPhoto_product(String photo_product) {
		this.photo_product = photo_product;
	}

	public double getPrice_import() {
		return price_import;
	}

	public void setPrice_import(double price_import) {
		this.price_import = price_import;
	}

	public double getPrice_sell() {
		return price_sell;
	}

	public void setPrice_sell(double price_sell) {
		this.price_sell = price_sell;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "products [id_product=" + id_product + ", barcode_product=" + barcode_product + ", name_product="
				+ name_product + ", categories=" + categories + ", photo_product=" + photo_product + ", price_import="
				+ price_import + ", price_sell=" + price_sell + ", quantity=" + quantity + "]";
	}
	
	
}
