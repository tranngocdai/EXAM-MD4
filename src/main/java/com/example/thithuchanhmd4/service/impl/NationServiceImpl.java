package com.example.thithuchanhmd4.service.impl;

import com.example.thithuchanhmd4.model.Nation;
import com.example.thithuchanhmd4.repository.NationRepository;
import com.example.thithuchanhmd4.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class NationServiceImpl implements NationService {

    @Autowired
    private NationRepository nationRepository;

    @Override
    public Page<Nation> findAll(Pageable pageable) {
        return nationRepository.findAll(pageable);
    }

    @Override
    public Optional<Nation> findById(Long id) {
        return nationRepository.findById(id);
    }

    @Override
    public void save(Nation nation) {
        nationRepository.save(nation);
    }

    @Override
    public void remove(Long id) {
        nationRepository.deleteById(id);
    }
}
