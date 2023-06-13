package issac.service.impl;

import issac.bean.ExaminationCourseStats;
import issac.bean.ExaminationPaperStats;
import issac.bean.ExaminationQuestionStats;
import issac.bean.ExaminationScoreDurDistribution;
import issac.mapper.ExaminationStatsMapper;
import issac.service.ExaminationStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminationStatsServiceImpl implements ExaminationStatsService
{
    
    @Autowired
    ExaminationStatsMapper examinationStatsMapper;
    
    @Override
    public List<ExaminationPaperStats> getExaminationPaperStats(Integer date)
    {
        return examinationStatsMapper.selectExaminationPaperStats(date);
    }
    
    @Override
    public List<ExaminationCourseStats> getExaminationCourseStats(Integer date)
    {
        return examinationStatsMapper.selectExaminationCourseStats(date);
    }
    
    @Override
    public List<ExaminationScoreDurDistribution> getExaminationScoreDurDistribution(Integer date)
    {
        return examinationStatsMapper.selectExaminationScoreDurDistribution(date);
    }
    
    @Override
    public List<ExaminationQuestionStats> getExaminationQuestionStats(Integer date)
    {
        return examinationStatsMapper.selectExaminationQuestionStats(date);
    }
}
