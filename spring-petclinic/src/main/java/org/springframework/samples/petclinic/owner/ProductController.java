package org.springframework.samples.petclinic.owner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Product;
import org.springframework.samples.petclinic.service.ProductService;
import org.springframework.samples.petclinic.vet.ResponseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	
    @Autowired
    private ProductService productService;
	
    @GetMapping(value="/getProductsList/{cid}")
    @ResponseBody
    public ResponseVo<List<Product>> retrieveProducts(@PathVariable int cid) {
    	
    	final List<Product> retrieveProducts = productService.retrieveProducts(cid);
    	
        return new ResponseVo<>("Retrieve Products Succussfully", 200, retrieveProducts);
    }

}
