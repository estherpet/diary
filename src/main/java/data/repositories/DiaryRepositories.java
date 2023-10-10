package data.repositories;

import data.models.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiaryRepositories extends MongoRepository<Diary,String> {

}
