package issac.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yhm
 * @create 2023-04-25 17:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeywordBean
{
    // 窗口起始时间
    private String stt;
    
    // 窗口闭合时间
    private String edt;
    
    // 关键词来源
    private String source;
    
    // 关键词
    @TransientSink
    private Long keywordLength;
    
    // 关键词
    private String keyword;
    
    // 关键词出现频次
    private Long keyword_count;
    
    // 时间戳
    private Long ts;
}

