package cz.czechitas.java2webapps.ukol8.service;

import cz.czechitas.java2webapps.ukol8.entity.Post;
import cz.czechitas.java2webapps.ukol8.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> list() {
        return postRepository.findAll();
    }

    //public Object singlePost(String slug) {
    //    Optional<Post> post = postRepository.findOne(slug);
    //    return new ModelAndView()
    //}

    //Ve službě PostService vytvoř metodu list(), která bude vracet seznam všech postů
    // (zatím bez stránkování a řazení). Dále tam vytvoř metodu singlePost(String slug),
    // která najde jeden post podle zadaného slug a ten vrátí.
}
