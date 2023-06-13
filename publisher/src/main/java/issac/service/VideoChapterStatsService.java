package issac.service;

import issac.bean.VedioChapterStats;

import java.util.List;

public interface VideoChapterStatsService
{
    List<VedioChapterStats> getVedioChapterStats(Integer date);
}
