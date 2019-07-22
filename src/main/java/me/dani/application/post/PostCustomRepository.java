package me.dani.application.post;

import java.util.List;

public interface PostCustomRepository {

    List<Post> findByPost();
    
}