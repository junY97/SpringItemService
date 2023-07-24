package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author junyeong.jo .
 * @since 2023-07-12
 */


@Getter
@Setter
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    private Boolean open; //판매 여부
    private List<String> regions; //등록 지역
    private ItemType itemType;
    private String deliveryCode;
    public Item() {}

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


}
