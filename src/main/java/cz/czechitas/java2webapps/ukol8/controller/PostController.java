package cz.czechitas.java2webapps.ukol8.controller;

import cz.czechitas.java2webapps.ukol8.entity.Post;
import cz.czechitas.java2webapps.ukol8.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class PostController {
    private final PostService service;

    @Autowired
    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView seznamPostu() {
        return new ModelAndView("index")
                .addObject("posty", service.list());
    }

    @GetMapping("/post/{slug}")
    public ModelAndView jedenPost(@PathVariable String slug) {
        return new ModelAndView("detail")
                .addObject("posty", service.singlePost(slug));
    }



    //Vytvoř controller a v něm dvě metody, pro zobrazení úvodí stránky se seznamem
    // postů a pro zobrazení jednoho kompletního postu.

}
