package issac.service;

import issac.bean.ExaminationCourseStats;
import issac.bean.ExaminationPaperStats;
import issac.bean.ExaminationQuestionStats;
import issac.bean.ExaminationScoreDurDistribution;

import java.util.List;

public interface ExaminationStatsService
{
    List<ExaminationPaperStats> getExaminationPaperStats(Integer date);
    
    List<ExaminationCourseStats> getExaminationCourseStats(Integer date);
    
    List<ExaminationScoreDurDistribution> getExaminationScoreDurDistribution(Integer date);
    
    List<ExaminationQuestionStats> getExaminationQuestionStats(Integer date);
}
