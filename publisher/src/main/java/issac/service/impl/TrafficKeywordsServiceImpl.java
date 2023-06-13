package issac.service.impl;

import issac.bean.TrafficKeywords;
import issac.mapper.TrafficKeywordsMapper;
import issac.service.TrafficKeywordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafficKeywordsServiceImpl implements TrafficKeywordsService
{
    
    @Autowired
    TrafficKeywordsMapper trafficKeywordsMapper;
    
    @Override
    public List<TrafficKeywords> getKeywords(Integer date)
    {
        return trafficKeywordsMapper.selectKeywords(date);
    }
}
