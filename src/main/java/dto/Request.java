package dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Request")
@Data
public class Request {
    private String username;
    private  String password;
    private  String oldPassword;
    private String newPassword;
}
