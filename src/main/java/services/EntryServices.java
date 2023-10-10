package services;
import dto.Response;

public interface EntryServices {
void addEntry(Response entryDto);
void deleteEntry(int id);
String findEntryByTitle(String title);
void updateEntry();
int numberOfEntry();
Response findById(int id);
}
