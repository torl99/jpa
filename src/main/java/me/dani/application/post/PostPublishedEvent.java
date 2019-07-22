package me.dani.application.post;

import org.springframework.context.ApplicationEvent;

/**
 * PostPublishedEvent
 */
public class PostPublishedEvent extends ApplicationEvent {

    private final Post post;

    public PostPublishedEvent(Object source) {
        super(source);
        this.post = (Post) source;
    }
    
    public Post getPost() {
        return post;
    }
    
}