package services;

import data.models.Diary;
import data.repositories.DiaryRepositories;
import dto.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements  DiaryService{
    @Autowired
    private DiaryRepositories userRepositories;
    private boolean isLoggedIn = true;

    @Override
    public void logIn(Request registerDto) {
        Diary diary = userRepositories.findByUsername(registerDto.getUsername());
     userExist(registerDto.getUsername());
        if (diary.getPassword().equals(registerDto.getPassword()))isLoggedIn = true;

    }

    @Override
    public void register(Request registerDto) {
        validate(registerDto.getUsername());
        User user = new User();
        user.setUsername(registerDto.getUsername());
        user.setPassword(registerDto.getPassword());
        userRepositories.save(user);

    }
    public void validate(String username){
        if (userExist(username))throw new IllegalArgumentException("user already exist");
    }
    private boolean userExist(String username) {
        User user = userRepositories.findByUsername(username);
         if (user == null) return false;
         return true;
    }
    @Override
    public void changePassword(Request registerDto) {
//        User user = userRepositories.findByUsername(registerDto.getUsername());
//        userExist(registerDto.getUsername());
//        if (user.getPassword().equals(registerDto.getOldPassword())) user.setPassword(registerDto.getNewPassword());

    }
    @Override
    public int numberOfUser() {
//        return (int) userRepositories.count();
    }

    @Override
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
