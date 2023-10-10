 package services;

import data.models.Entry;
import data.repositories.EntryRepositories;
import dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
 public class EntryServiceImplementation implements EntryServices{
    @Autowired
   private  EntryRepositories entryRepositories;
    @Override
    public void addEntry(Response entryDto) {
        Entry entry = new Entry();
        entry.setTitle(entryDto.getTitle());
        entry.setBody(entryDto.getBody());
        entryRepositories.save(entry);
    }
    @Override
    public void deleteEntry(int id) {
//        Entry entry = entryRepositories.findById(id);
//        entryRepositories.delete(entry);
    }
    @Override
    public String findEntryByTitle(String title) {
        for (Entry entry: entryRepositories.findAll()){
            if (entry.getTitle().equals(title))return title;
        }
        return title;
    }
    @Override
    public void updateEntry() {

    }

    @Override
    public int numberOfEntry() {
        return (int) entryRepositories.count();
    }

    @Override
    public Response findById(int id) {
//      var foundEntry =   entryRepositories.findById(id);
//      Response response = new Response();
//      response.setTitle(foundEntry.getTitle());
//      response.setBody(foundEntry.getBody());
//        return  response;
        return null;
    }
}
