package dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Response")
@Data
public class Response {
    private String body;
    private  int id;
    private String title;

}
