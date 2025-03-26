package ch.csbe.uek295_boilerplate.resources.playground.Controllers;


import ch.csbe.uek295_boilerplate.resources.playground.Entity.Product;
import ch.csbe.uek295_boilerplate.resources.playground.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
}
