package issac.service;

import issac.bean.*;

import java.util.List;

public interface CourseStatsService
{
    List<CourseOrderStats> getCourseOrderStats(Integer date);
    
    List<SubjectOrderStats> getSubjectOrderStats(Integer date);
    
    List<Category0rderStats> getCategoryOrderStats(Integer date);
    
    List<CourseReviewStats> getCourseReviewStats(Integer date);
    
}
