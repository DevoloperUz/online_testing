package repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.User;
import rest.Response;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRepository {
    public List<User> userList = new ArrayList<>();

    public Response create(User user) {
        userList.add(user);
        return new Response(true, "User successfully created!");
    }

    public boolean existsByEmail(String email) {
        return userList.stream().anyMatch(user -> user.getEmail().equalsIgnoreCase(email));
    }
}
