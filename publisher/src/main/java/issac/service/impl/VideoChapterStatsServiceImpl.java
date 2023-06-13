package issac.service.impl;

import issac.bean.VedioChapterStats;
import issac.mapper.VideoChapterStatsMapper;
import issac.service.VideoChapterStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoChapterStatsServiceImpl implements VideoChapterStatsService
{
    @Autowired
    VideoChapterStatsMapper videoChapterStatsMapper;
    
    @Override
    public List<VedioChapterStats> getVedioChapterStats(Integer date)
    {
        return videoChapterStatsMapper.selectVedioChapterStats(date);
    }
}
