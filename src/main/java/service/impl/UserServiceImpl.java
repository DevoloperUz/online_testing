package service.impl;

import model.User;
import repository.UserRepository;
import rest.Response;
import service.UserService;

public class UserServiceImpl implements UserService {
    public UserRepository userRepository = new UserRepository();

    @Override
    public Response create(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return new Response(false, "Such email already exists!");
        }
        userRepository.create(user);
        return null;
    }

    @Override
    public Response findAll() {
        return null;
    }

    @Override
    public Response findById(Long id) {
        return null;
    }

    @Override
    public Response edit(Long id, User user) {
        return null;
    }

    @Override
    public Response delete(Long id) {
        return null;
    }
}
