package com.example.BuyogoApplication.repository;

import com.example.BuyogoApplication.entity.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingCentreRepository extends JpaRepository<TrainingCenter,Long> {


}
