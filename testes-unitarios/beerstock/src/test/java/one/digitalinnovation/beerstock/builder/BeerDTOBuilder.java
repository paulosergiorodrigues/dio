package one.digitalinnovation.beerstock.builder;

import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.enums.BeerType;

public class BeerDTOBuilder {

	private Long id = 1L;

	private String name = "Brahma";

	private String brand = "Ambev";

	private int max = 50;

	private int quantity = 10;

	private BeerType type = BeerType.LAGER;

	public BeerDTO toBeerDTO() {
		return new BeerDTO(id, name, brand, max, quantity, type);
	}
}
