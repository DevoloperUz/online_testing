package service;

import model.User;
import rest.Response;

public interface UserService {

    Object create(User user);

    Response findAll();

    Response findById(Long id);

    Response edit(Long id, User user);

    Response delete(Long id);


}
