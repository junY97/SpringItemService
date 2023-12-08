package hello.itemservice.upload.domain;

import lombok.Data;

/**
 * @author junyeong.jo .
 * @since 2023-12-08
 */

@Data
public class UploadFile {
    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
