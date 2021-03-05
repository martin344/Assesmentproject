package guru.springframework.services;

import guru.springframework.commands.ProductForm;
import guru.springframework.domain.Product;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

    List<Product> listAll();

	void delete(String id);

	Product saveOrUpdateProductForm(ProductForm productForm);

	Product saveOrUpdate(Product product);

	Product getById(String id);

	Product getById(Long valueOf);

	Product getByBankName(String valueOf);

	Object getByBankName(Long valueOf);

  
}
