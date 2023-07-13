package org.bhanu.productservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product_info")
public class ProductEntity  implements Serializable
{
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
    @GeneratedValue(generator = "auto")
	@Column(name = "id")
	private Long id;
   
	@Column(name = "name")
    private String name;
   
	@Column(name = "price")
    private Double price;
   
	@Column(name = "quantity")
    private Integer quantity;
   
	@Column(name = "description")
    private String description;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + "]";
	}

	
	
	
   
}
