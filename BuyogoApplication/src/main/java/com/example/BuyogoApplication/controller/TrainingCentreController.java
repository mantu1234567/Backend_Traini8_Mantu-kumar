package com.example.BuyogoApplication.controller;

import com.example.BuyogoApplication.entity.TrainingCenter;
import com.example.BuyogoApplication.exception.ResourceNotFoundException;
import com.example.BuyogoApplication.service.TrainingCentreService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/TrainingCentre/")
public class TrainingCentreController {

    @Autowired
    TrainingCentreService trainingCentreService;
    @PostMapping("create")
    public String createTrainingCentre(@RequestBody @Valid TrainingCenter trainingCenter){
    return trainingCentreService.createTrainingCentre(trainingCenter);
    }
    @GetMapping("findById/{id}")
    public TrainingCenter getCentreById(@PathVariable (value = "id") long userId) {
        return trainingCentreService.getCentreById(userId);
    }
    @GetMapping("findAll")
    public List<TrainingCenter> findAllCentre(){
        return trainingCentreService.findAllCentre();
    }


}
