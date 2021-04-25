package one.digitalinnovation.beerstock.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class QuantityDTO {

	@NotNull
	@Max(100)
	private Integer quantity;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
