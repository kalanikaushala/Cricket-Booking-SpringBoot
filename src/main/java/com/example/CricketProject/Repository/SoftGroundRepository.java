package com.example.CricketProject.Repository;


import com.example.CricketProject.Model.SoftGroundModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface SoftGroundRepository extends JpaRepository<SoftGroundModel,Integer> {
    List<SoftGroundModel> findByDate(LocalDate date);
    List<SoftGroundModel> findByMobile(String mobile);




}
