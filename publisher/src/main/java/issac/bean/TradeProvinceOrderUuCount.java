package issac.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TradeProvinceOrderUuCount
{
    
    // 省份名称
    String provinceName;
    
    // 下单独立用户数
    Long orderUuCt;
}
