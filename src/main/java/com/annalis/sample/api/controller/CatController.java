package com.annalis.sample.api.controller;

import com.annalis.sample.api.domain.Cat;
import com.annalis.sample.api.service.CatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    private CatService catService;
    private Logger logger  = LoggerFactory.getLogger(CatController.class);
//    @PostMapping("/cats")
//    public Cat createCat(@RequestBody Cat cat){
//        logger.info("Received cat: {}", cat);
//        //do something about the cats
//        return cat;
//    }
    @GetMapping("/cats")
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }
    @PostMapping("/cats")
    public Cat  registerCat(@RequestBody Cat cat){
        return catService.registerCat(cat);
    }
    @PutMapping("/cats/{id}")
    public Cat updateCatDetails(@PathVariable Integer id, @RequestBody Cat cat){
        return catService.updateCatDetails(cat, id);
    }
    @GetMapping("/cats/{id}")
    public Cat findCatById(@PathVariable Integer id){
        return catService.findCatById(id);
    }
    @DeleteMapping("/cats/{id}")
    public String  removeCatDetails(@PathVariable Integer id){
        return catService.removeCatDetails(id);
    }
}
