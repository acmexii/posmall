package posmall.domain;

import java.util.*;
import lombok.*;
import posmall.domain.*;
import posmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private Integer qty;
    private String status;
}
