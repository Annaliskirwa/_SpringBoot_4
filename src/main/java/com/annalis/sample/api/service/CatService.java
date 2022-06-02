package com.annalis.sample.api.service;

import com.annalis.sample.api.domain.Cat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatService {
    List<Cat> getAllCats();
    Cat registerCat(Cat cat);
    Cat updateCatDetails(Cat cat, Integer id);
    String removeCatDetails(Integer id);
    Cat findCatById(Integer id);

}
