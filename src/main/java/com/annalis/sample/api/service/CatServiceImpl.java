package com.annalis.sample.api.service;

import com.annalis.sample.api.domain.Cat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService{
    @Override
    public List<Cat> getAllCats() {
        return null;
    }

    @Override
    public Cat registerCat(Cat cat) {
        return null;
    }

    @Override
    public Cat updateCatDetails(Cat cat, Integer id) {
        return null;
    }

    @Override
    public String removeCatDetails(Integer id) {
        return null;
    }

    @Override
    public Cat findCatById(Integer id) {
        return null;
    }
}
