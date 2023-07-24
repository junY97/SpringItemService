package hello.itemservice.domain.item;

/**
 * @author junyeong.jo .
 * @since 2023-07-24
 */
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
