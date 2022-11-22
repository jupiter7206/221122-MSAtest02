package msatest.domain;

import msatest.DemoApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Product_table")
@Data

public class Product  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String stock;

    @PostPersist
    public void onPostPersist(){
    }

    public static ProductRepository repository(){
        ProductRepository productRepository = DemoApplication.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }






}
