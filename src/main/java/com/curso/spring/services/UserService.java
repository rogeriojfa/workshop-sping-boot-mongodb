package com.curso.spring.services;

import com.curso.spring.domain.User;
import com.curso.spring.repositoty.UserRepository;
import com.curso.spring.services.exception.ObjectNotfoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository usrRep;

    public List<User> findAll(){
        return usrRep.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = usrRep.findById(id);
        return obj.orElseThrow(() -> new ObjectNotfoundException("Objeto não encontrado"));
    }
}