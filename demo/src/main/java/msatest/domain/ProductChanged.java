package msatest.domain;

import msatest.domain.*;
import msatest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProductChanged extends AbstractEvent {

    private Long id;
    private String eventType;
    private Long productId;
    private String productName;
    private Integer productStock;

    public ProductChanged(Product aggregate){
        super(aggregate);
    }
    public ProductChanged(){
        super();
    }
}
