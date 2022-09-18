package repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.User;
import rest.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 9/18/2022
 * Time: 6:03 PM
 */

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
