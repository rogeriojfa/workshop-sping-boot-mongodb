package com.curso.spring.services;

import com.curso.spring.domain.Post;
import com.curso.spring.repositoty.PostRepository;
import com.curso.spring.services.exception.ObjectNotfoundException;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository pstRep;

    public Post findById(String id) {
        Optional<Post> obj = pstRep.findById(id);
        return obj.orElseThrow(() -> new ObjectNotfoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return pstRep.searchTitle(text);
    }

    public List<Post> fullTextSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 24*60*60*1000);
        return pstRep.fullSearch(text, minDate, maxDate);
    }
}
