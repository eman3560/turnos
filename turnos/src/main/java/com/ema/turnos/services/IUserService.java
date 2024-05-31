package com.ema.turnos.services;



import com.ema.turnos.entities.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    List<User> findByUsuario(String usuario);
    User get(Integer id);
    void save(User entity);
    String delete(User entity);
}
