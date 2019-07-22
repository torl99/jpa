package me.dani.application.post;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dani.application.MyRepository;

public interface PostRepository extends MyRepository<Post, Long> {

}