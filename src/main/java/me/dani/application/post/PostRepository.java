package me.dani.application.post;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import me.dani.application.MyRepository;

public interface PostRepository extends MyRepository<Post, Long>, QuerydslPredicateExecutor<Post> {

}