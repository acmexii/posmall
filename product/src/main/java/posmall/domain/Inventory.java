package posmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import posmall.ProductApplication;
import posmall.domain.StockDecreased;

@Entity
@Table(name = "Inventory_table")
@Data
//<<< DDD / Aggregate Root
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer stock;

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = ProductApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void changeStock(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        StockDecreased stockDecreased = new StockDecreased(inventory);
        stockDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if deliveryCompleted.cjLogisId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> deliveryMap = mapper.convertValue(deliveryCompleted.getCjLogisId(), Map.class);

        repository().findById(deliveryCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            StockDecreased stockDecreased = new StockDecreased(inventory);
            stockDecreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
