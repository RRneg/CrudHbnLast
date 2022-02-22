package com.sasha.CRUDwithHbn.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "writers", schema = "postgres")
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @JoinTable(name = "writer_posts",
     joinColumns = @JoinColumn(name = "writer_id",
     referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "posts_id",
    referencedColumnName = "id"))
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Post> posts;



    public Writer() {
    }

    public Writer(Integer id, String firstName, String lastName, List<Post> posts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.posts = posts;

    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "writers", cascade = CascadeType.ALL)
    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", posts=" + posts +
                '}';
    }
}
