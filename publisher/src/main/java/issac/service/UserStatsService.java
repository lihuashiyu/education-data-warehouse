package issac.service;

import issac.bean.UserChangeCtPerType;
import issac.bean.UserPageCt;
import issac.bean.UserTradeCt;

import java.util.List;

public interface UserStatsService
{
    List<UserChangeCtPerType> getUserChangeCt(Integer date);
    
    List<UserPageCt> getUvByPage(Integer date);
    
    List<UserTradeCt> getTradeUserCt(Integer date);
}
