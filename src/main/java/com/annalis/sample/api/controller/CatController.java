package com.annalis.sample.api.controller;

import com.annalis.sample.api.domain.Cat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    private Logger logger  = LoggerFactory.getLogger(CatController.class);
    @PostMapping("/cats")
    public Cat createCat(@RequestBody Cat cat){
        logger.info("Received cat: {}", cat);
        //do something about the cats
        return cat;
    }
}
