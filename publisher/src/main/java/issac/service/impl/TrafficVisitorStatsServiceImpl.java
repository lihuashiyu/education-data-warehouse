package issac.service.impl;

import issac.bean.TrafficVisitorStatsPerHour;
import issac.bean.TrafficVisitorTypeStats;
import issac.mapper.TrafficVisitorStatsMapper;
import issac.service.TrafficVisitorStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TrafficVisitorStatsServiceImpl implements TrafficVisitorStatsService
{
    @Autowired
    
    private TrafficVisitorStatsMapper trafficVisitorStatsMapper;
    
    // 获取分时流量统计数据
    @Override
    public List<TrafficVisitorStatsPerHour> getVisitorPerHrStats(Integer date)
    {
        return trafficVisitorStatsMapper.selectVisitorStatsPerHr(date);
    }
    
    @Override
    public List<TrafficVisitorTypeStats> getVisitorTypeStats(Integer date)
    {
        return trafficVisitorStatsMapper.selectVisitorTypeStats(date);
    }
    
}
