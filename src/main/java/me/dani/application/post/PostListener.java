package me.dani.application.post;

import org.springframework.context.ApplicationListener;

/**
 * PostListener
 */
public class PostListener implements ApplicationListener<PostPublishedEvent> {

    @Override
    public void onApplicationEvent(PostPublishedEvent event) {
        System.out.println("===================");
        System.out.println(event.getPost().getTitle() + "ist published!!");
        System.out.println("===================");
    }



}
