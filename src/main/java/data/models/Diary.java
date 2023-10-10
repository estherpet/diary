package data.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
@Data
public class Diary {
    private int id;
    private String username;
    private String password;
    private  String emailAddress;
}
