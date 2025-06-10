package posmall.domain;

import java.util.*;
import lombok.*;
import posmall.domain.*;
import posmall.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer qty;
    private String productName;
    private Long productId;
}
