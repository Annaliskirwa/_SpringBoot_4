package com.annalis.sample.api.service;

import com.annalis.sample.api.domain.Cat;
import com.annalis.sample.api.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService{
    @Autowired
    private CatRepository catRepository;
    @Override
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    @Override
    public Cat registerCat(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public Cat updateCatDetails(Cat updateCat, Integer id) {
        Cat cat = catRepository.findById(id).get();
        cat.setName(updateCat.getName());
        cat.setAge(updateCat.getAge());
        return catRepository.save(cat);
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
