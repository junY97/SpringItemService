package hello.itemservice.upload.domain;

import lombok.Data;

import java.util.List;

/**
 * @author junyeong.jo .
 * @since 2023-12-08
 */

@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;
}
