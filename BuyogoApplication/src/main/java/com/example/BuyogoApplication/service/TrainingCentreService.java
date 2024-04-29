package com.example.BuyogoApplication.service;

import com.example.BuyogoApplication.entity.TrainingCenter;
import com.example.BuyogoApplication.exception.ResourceNotFoundException;
import com.example.BuyogoApplication.repository.TrainingCentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCentreService {

    @Autowired
    private  TrainingCentreRepository trainingCentreRepository;

    public String createTrainingCentre(TrainingCenter trainingCenter) {
        trainingCentreRepository.save(trainingCenter);
        return "Training centre create Successful...";
    }

    public TrainingCenter getCentreById(long userId) throws ResourceNotFoundException {
        return trainingCentreRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Training centre not found with given id :"+userId));
    }

    public List<TrainingCenter> findAllCentre() {
        return trainingCentreRepository.findAll();
    }

}
