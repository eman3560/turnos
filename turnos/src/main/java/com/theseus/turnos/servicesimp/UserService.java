package com.theseus.turnos.servicesimp;


import com.theseus.turnos.dao.IUserDao;
import com.theseus.turnos.entities.User;
import com.theseus.turnos.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao entityDao;

    public List<User> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"usuario"));
    }

    public List<User> findByUsuario(String usuario) {
        return entityDao.findByUsuario("%" + usuario + "%");
    }

    public User get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(User entity) {
        entityDao.save(entity);
    }

    @Transactional
    public String delete(User entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
