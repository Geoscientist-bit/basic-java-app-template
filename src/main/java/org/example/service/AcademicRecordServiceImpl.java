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
    Double average, suma = 0.0;
    List<Grade> gradeList = this.gradeRepository.findAllGrades();

    for (int i = 0; i < gradeList.size(); i++) {
      suma += gradeList.get(i).grade();
    }
    average = suma / sumNumberOfGrades();


    return average;
  }

  @Override
  public Integer sumNumberOfGrades() {

    //System.out.println("Sumando el número de calificaciones");
    logger.info("Sumando el número de calificaciones");
    logger.warn("Sumando el número de calificaciones");
    logger.error("Sumando el número de calificaciones");

    List<Grade> gradeList = this.gradeRepository.findAllGrades();
    // TODO sum number of grades and return the summation


    return gradeList.size();
  }
}
