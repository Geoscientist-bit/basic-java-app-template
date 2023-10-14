package org.example.service;

import java.util.List;
import org.example.model.Grade;
import org.example.repository.GradeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcademicRecordServiceImpl implements AcademicRecordService {

  private static final Logger logger = LoggerFactory.getLogger(AcademicRecordServiceImpl.class);
  private final GradeRepository gradeRepository;

  public AcademicRecordServiceImpl(GradeRepository gradeRepository) {
    this.gradeRepository = gradeRepository;
  }

  @Override
  public Double calculateAverage() {
    double sum, average = 0;
    List<Grade> gradeList = this.gradeRepository.findAllGrades();
    average = sumNumberOfGrades() / gradeList.size();


    return average;
  }

  @Override
  public Double sumNumberOfGrades() {
    Double suma = 0d;
    //System.out.println("Sumando el número de calificaciones");
    logger.info("Sumando el número de calificaciones");
    logger.warn("Sumando el número de calificaciones");
    logger.error("Sumando el número de calificaciones");

    List<Grade> gradeList = this.gradeRepository.findAllGrades();
    // TODO sum number of grades and return the summation
    for (int i = 0; i < gradeList.size(); i++) {
      //System.out.println(gradeList.get(i).grade());
      suma += gradeList.get(i).grade();
    }
    //System.out.println(suma);
    return suma;
  }
}
