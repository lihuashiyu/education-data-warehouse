package issac.service;

import issac.bean.TrafficKeywords;

import java.util.List;

public interface TrafficKeywordsService
{
    List<TrafficKeywords> getKeywords(Integer date);
}
