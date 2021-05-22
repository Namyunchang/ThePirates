package ga.bowwow.service.store;

import java.util.List;
import java.util.Map;

public interface StoreService {

	public void insertProducts(Product product);
	public void updateProducts(Product product);
	public void deleteProducts(Product product);
	public Product getProductDetail(int p_id);
	public List<Product> getProductList(Map<String, String> map);
	public int getProductCount(Map<String, String> map);
	public int getSearchCount(Map<String, String> map);
	public List<Product> prodSearch(Map<String, String> map);
	public List<Product> getDogProductByPrice(Product products);
  public List<Product> getCatProductByPrice(Product products);
  
  
  	// 코딩테스트 과제
	public int insertStore(Map<String, Object> map);
	public int insertHoliday(Map<String, Object> map);
	public void deleteStore(int id);
	public Map<String, Object> getStoreList();
	public Map<String, Object> getStoreDetail(int id);


}
