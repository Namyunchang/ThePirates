package ga.bowwow.service.store.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ga.bowwow.service.store.Product;
import ga.bowwow.service.store.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreDAO storeDAO;
	
	// 코딩테스트 과제
	@Override
	public int insertStore(Map<String, Object> map) {
		return storeDAO.insertStore(map);
	}

	@Override
	public void deleteStore(int id) {
		storeDAO.deleteTest(id);
	}

	@Override
	public Map<String, Object> getStoreList() {
		return storeDAO.getStoreList();
	}

	@Override
	public Map<String, Object> getStoreDetail(int id) {
		return storeDAO.getStoreDetail(id);
		
	}

	@Override
	public int insertHoliday(Map<String, Object> map) {
		return storeDAO.insertHoliday(map);
	}
	
	@Override
	public void insertProducts(Product product) {

	}

	@Override
	public void updateProducts(Product product) {

	}

	@Override
	public void deleteProducts(Product product) {

	}

	@Override
	public Product getProductDetail(int p_id) {
		return storeDAO.getProductDetail(p_id);
	}

	@Override
	public List<Product> getProductList(Map<String, String> map) {
		return storeDAO.getProductList(map);
	}

	@Override
	public int getProductCount(Map<String, String> map) {
		return storeDAO.getProductCount(map);
	}

	@Override
	public List<Product> prodSearch(Map<String, String> map) {
		return storeDAO.searchProd(map);
	}

	@Override
	public int getSearchCount(Map<String, String> map) {
		return storeDAO.getSearchCount(map);
	}	

	public List<Product> getDogProductByPrice(Product products) {
		return storeDAO.getDogProductByPrice(products);
	}

	@Override
	public List<Product> getCatProductByPrice(Product products) {
		return storeDAO.getCatProductByPrice(products);
	}

}
