package posmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import posmall.domain.*;
import posmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private Integer qty;
    private String status;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
