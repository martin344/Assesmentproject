package guru.springframework.controllers;

import guru.springframework.commands.ProductForm;
import guru.springframework.converters.ProductToProductForm;
import guru.springframework.domain.Product;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
//import javax.validation.Valid;

/**
 * Created by jt on 1/10/17.
 */
@Controller
public class ProductJController {
    private ProductService productService;

    
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/all")
    public String redirToList(){
        return "redirect:/jproduct/listjson";
    }

    @RequestMapping("/jproduct/listjson")
    public ResponseEntity<List<Product>> listJProduct(){
        return ResponseEntity.ok(productService.listAll());
    }


    @RequestMapping("/jproduct/show/{bankName}")
    public ResponseEntity<Product> getProduct(@PathVariable String id){
        return ResponseEntity.ok(productService.getById(String.valueOf(id)));
    }

    @RequestMapping(value = "/jproduct", method = RequestMethod.POST)
    public ResponseEntity<Product> saveOrUpdateJProduct(@RequestBody Product product){
        Product savedProduct = productService.saveOrUpdate(product);
        return ResponseEntity.ok(savedProduct);
    }


    @RequestMapping("/jproduct/delete/{bankName}")
    public ResponseEntity<Object> delete(@PathVariable String bankName){
        productService.delete(String.valueOf(bankName));
        return ResponseEntity.noContent().build();
    }
}
