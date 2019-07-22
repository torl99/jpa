package me.dani.application.post;

import org.springframework.context.event.EventListener;

/**
 * PostListener
 */
public class PostListener  {

    @EventListener
    public void onApplicationEvent(PostPublishedEvent event) {
        System.out.println("===================");
        System.out.println(event.getPost().getTitle() + "ist published!!");
        System.out.println("===================");
    }



}
