package issac.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Category0rderStats
{
    
    // 类别名称
    String categoryName;
    
    // 订单总额
    BigDecimal orderTotalAmount;
}
