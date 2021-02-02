package com.curso.spring.domain;

import com.curso.spring.dto.AuthorDTO;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Post implements Serializable {
    @Id
    public String id;
    public Date data;
    public String title;
    public String body;
    public AuthorDTO author;

    public Post(){

    }

    public Post(String id, Date data, String title, String body, AuthorDTO author) {
        this.id = id;
        this.data = data;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(getId(), post.getId()) && Objects.equals(getData(), post.getData()) && Objects.equals(getTitle(), post.getTitle()) && Objects.equals(getBody(), post.getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getData(), getTitle(), getBody());
    }
}
