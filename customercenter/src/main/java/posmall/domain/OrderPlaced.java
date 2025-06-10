package posmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import posmall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer qty;
    private String productName;
    private Long productId;
}
