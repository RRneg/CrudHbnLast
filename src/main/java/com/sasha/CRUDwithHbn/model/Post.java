package com.sasha.CRUDwithHbn.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;
@Entity
@Table (name = "posts", schema = "practic")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    Integer id;

    @Column(name = "content")
    String content;

    @Column(name = "created")
    String created;

    @Column(name = "updated")
    String updated;


    List<Label> labels;

    @Column(name = "poststatus")
    PostStatus postStatus;

    public Post() {
    }

    public Post(Integer id, String content, String created, String updated, List<Label> labels, PostStatus postStatus) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.updated = updated;
        this.labels = labels;
        this.postStatus = postStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "posts") //не уверен, что с posts
    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public PostStatus getPostStatus() {return postStatus;  }

    public void setPostStatus(PostStatus postStatus) {this.postStatus = postStatus;  }

    @Override
    public String toString() {
        return "com.sasha.sqlpractice.model.Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", labels=" + labels +
                '}';
    }
}
