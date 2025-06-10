package posmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import posmall.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private Integer qty;
    private String status;
}
