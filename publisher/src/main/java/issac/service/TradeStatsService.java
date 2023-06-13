package issac.service;

import issac.bean.*;

import java.math.BigDecimal;
import java.util.List;

public interface TradeStatsService
{
    
    List<TradeSourceStats> getTradeSourceStats(Integer date);
    
    List<TradeProvinceOrderAmount> getTradeProvinceOrderAmount(Integer date);
    
    List<TradeProvinceOrderUuCount> getTradeProvinceOrderUuCount(Integer date);
    
    List<TradeProvinceOrderCount> getTradeProvinceOrderCount(Integer date);
    
    BigDecimal getOrderTotalAmount(Integer date);
    
    Long getOrderTotalCount(Integer date);
}
