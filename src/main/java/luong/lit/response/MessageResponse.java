package luong.lit.response;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class MessageResponse {
    public String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public MessageResponse() {
        this.message = "OK";
    }
}
