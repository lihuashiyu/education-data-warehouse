package issac.app.func;

import com.alibaba.fastjson.JSONObject;
import issac.util.DimUtil;
import issac.util.ThreadPoolUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.async.ResultFuture;
import org.apache.flink.streaming.api.functions.async.RichAsyncFunction;

import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;


@AllArgsConstructor
@NoArgsConstructor
public abstract class DimAsyncFunction<T> extends RichAsyncFunction<T, T> implements DimJoinFunction<T>
{
    ThreadPoolExecutor executorService;
    // 表名
    private String tableName;
    
    public DimAsyncFunction(String tableName)
    {
        this.tableName = tableName;
    }
    
    @Override
    public void open(Configuration parameters) throws Exception
    {
        executorService = ThreadPoolUtil.getInstance();
    }
    
    @Override
    public void asyncInvoke(T input, ResultFuture<T> resultFuture) throws Exception
    {
        // 从线程池中获取线程 提交异步请求
        executorService.submit(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    // 1. 获取流对象(javaBean)中的关联字段
                    String key = getKey(input);
                    
                    // 2. 根据字段读取维度数据
                    JSONObject dimInfo = DimUtil.getDimInfo(tableName, key);
                    
                    // 3. 关联流对象和读取的维度数
                    if (dimInfo != null)
                    {
                        join(input, dimInfo);
                    }
                    resultFuture.complete(Collections.singleton(input));
                } catch (Exception e)
                {
                    e.printStackTrace();
                    System.out.println("异步维度关联出错");
                }
            }
        });
    }
}
