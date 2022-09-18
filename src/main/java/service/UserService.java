package service;

import model.User;
import rest.Response;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 9/18/2022
 * Time: 5:59 PM
 */
public interface UserService {

    Response create(User user);

    Response findAll();

    Response findById(Long id);

    Response edit(Long id, User user);

    Response delete(Long id);


}
