package com.sskim.demo.controller;

import com.sskim.demo.domain.Hello;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HateoasController {

    @GetMapping("/hateoas")
    public EntityModel<Hello> hello() {
        Hello hello = new Hello();
        hello.setPrefix("Hey,");
        hello.setName("sskim");

        EntityModel<Hello> entityModel = EntityModel.of(hello);
        entityModel.add(linkTo(methodOn(HateoasController.class).hello()).withSelfRel());

        return entityModel;
    }
}
