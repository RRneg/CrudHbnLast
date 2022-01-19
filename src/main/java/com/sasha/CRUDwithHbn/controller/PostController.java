package com.sasha.CRUDwithHbn.controller;


import com.sasha.CRUDwithHbn.model.Post;
import com.sasha.CRUDwithHbn.service.PostService;

import java.util.List;

public class PostController {
    PostService postService = new PostService();
    LabelController labelController = new LabelController();


    public Post saveNewPost(Post post) {
       return postService.save(post);
    }


    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    public Post update(Post post){
        return postService.update(post);
    }

    public Post getPostById(Integer id) {
        return postService.getById(id);
    }

    public void deleteById(Integer id){
        postService.deleteById(id);
    }
}
