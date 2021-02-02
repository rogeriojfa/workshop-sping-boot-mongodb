package com.curso.spring.resources;

import com.curso.spring.domain.Post;
import com.curso.spring.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService pstSrv;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = pstSrv.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
