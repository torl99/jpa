package me.dani.application.post;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
public class Post extends AbstractAggregateRoot<Post> {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Lob
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Post publish() {
        this.registerEvent(new PostPublishedEvent(this));
        return this;
        
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }
}
