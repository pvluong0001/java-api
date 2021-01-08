package luong.lit.response;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class DataResponse extends MessageResponse {
    public Object node;

    public DataResponse(String message, JsonNode node) {
        this.message = message;
        this.node = node;
    }

    public DataResponse(Object object) {
        this.node = object;
    }

    public DataResponse() {
        this.message = "Ok from entity";
    }
}
