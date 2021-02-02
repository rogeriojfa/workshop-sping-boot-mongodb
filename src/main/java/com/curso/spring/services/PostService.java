package com.curso.spring.services;

import com.curso.spring.domain.Post;
import com.curso.spring.domain.User;
import com.curso.spring.repositoty.PostRepository;
import com.curso.spring.services.exception.ObjectNotfoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;




@Service
public class PostService {

    @Autowired
    private PostRepository pstRep;

    public Post findById(String id) {
        Optional<Post> obj = pstRep.findById(id);
        return obj.orElseThrow(() -> new ObjectNotfoundException("Objeto não encontrado"));
    }
}
