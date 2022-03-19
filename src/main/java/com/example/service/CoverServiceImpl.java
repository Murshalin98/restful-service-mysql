package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Cover;
import com.example.repository.CoverRepository;

@Service
public class CoverServiceImpl implements CoverService {

	@Autowired
	CoverRepository coverRepository;

    @Override
    public List<Cover> findAll() {
        return coverRepository.findAll();
    }

    @Override
    public Cover save(Cover cover) {
    	coverRepository.save(cover);
        return cover;
    }
}