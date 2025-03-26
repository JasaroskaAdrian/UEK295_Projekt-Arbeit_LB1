package ch.csbe.uek295_boilerplate.resources.playground.Services;


import ch.csbe.uek295_boilerplate.resources.playground.Entity.Product;
import ch.csbe.uek295_boilerplate.resources.playground.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
