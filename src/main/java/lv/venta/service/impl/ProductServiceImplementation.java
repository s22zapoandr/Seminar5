package lv.venta.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import lv.venta.model.Product;
import lv.venta.service.IProductFilteringService;
import lv.venta.service.IproductCRUDService;

@Service
public class ProductServiceImplementation implements IproductCRUDService, IProductFilteringService {

	@Override
	public void create(String title, String description, float price, int quantity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> retrieveALl() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product retrieveById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateById(int id, String title, String description, float price, int quantity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBuId(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> filterByQuantitythreshold(int threshold) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> filterByPriceBetween(float minPrice, float maxPrice) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
