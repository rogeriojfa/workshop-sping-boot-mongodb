package com.superacao.pedidos.services;

import com.superacao.pedidos.domain.User;
import com.superacao.pedidos.repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository usrRep;

    public List<User> findAll(){
        return usrRep.findAll();
    }
}
