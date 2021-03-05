package guru.springframework.converters;

import guru.springframework.commands.ProductForm;
import guru.springframework.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        if (productForm.getBankId() != null  && !StringUtils.isEmpty(productForm.getBankId())) {
            product.setBankId(new Long(productForm.getBankId()));
        }
        product.setBankName(productForm.getBankName());
        product.setBankAbbrev(productForm.getBankAbbrev());
        product.setCompanyId(productForm.getCompanyId());
        return product;
    }
}
