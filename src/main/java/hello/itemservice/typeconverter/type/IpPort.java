package hello.itemservice.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author junyeong.jo .
 * @since 2023-09-05
 */

@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

}
