package data.repositories;

import data.models.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntryRepositories extends MongoRepository<Entry,String> {

}
