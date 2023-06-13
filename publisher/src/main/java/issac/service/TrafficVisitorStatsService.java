package issac.service;

import issac.bean.TrafficVisitorStatsPerHour;
import issac.bean.TrafficVisitorTypeStats;

import java.util.List;

public interface TrafficVisitorStatsService
{
    
    // 获取分时流量数据
    List<TrafficVisitorStatsPerHour> getVisitorPerHrStats(Integer date);
    
    // 获取新老访客流量数据
    List<TrafficVisitorTypeStats> getVisitorTypeStats(Integer date);
    
}
