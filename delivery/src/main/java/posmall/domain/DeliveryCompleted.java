package posmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import posmall.domain.*;
import posmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private Integer qty;
    private String status;

    public DeliveryCompleted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
