package issac.service.impl;

import issac.bean.UserChangeCtPerType;
import issac.bean.UserPageCt;
import issac.bean.UserTradeCt;
import issac.mapper.UserStatsMapper;
import issac.service.UserStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStatsServiceImpl implements UserStatsService
{
    
    @Autowired
    UserStatsMapper userStatsMapper;
    
    @Override
    public List<UserChangeCtPerType> getUserChangeCt(Integer date)
    {
        return userStatsMapper.selectUserChangeCtPerType(date);
    }
    
    @Override
    public List<UserPageCt> getUvByPage(Integer date)
    {
        return userStatsMapper.selectUvByPage(date);
    }
    
    @Override
    public List<UserTradeCt> getTradeUserCt(Integer date)
    {
        return userStatsMapper.selectTradeUserCt(date);
    }
    
}
