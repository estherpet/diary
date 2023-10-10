package data.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Entry")
@Data
public class Entry {
    private int id;
    private String password;
    private  String title;
    private String body;

}
