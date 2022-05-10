package cn.org.gldd.common.utils;

/**
 * @Author John Carraway
 * @Create 2022/5/10 14:12
 * @Version 1.0
 */
public interface ResultCode {

   // 成功返回结果的代码
   public static final Integer SUCCESS = 20000;

   // 失败返回结果的代码
   public static final Integer ERROR = 20001;

   // 成功返回的消息
   public static final String SUCCESS_MSG = "成功";

   // 失败返回的消息
   public static final String FAILURE_MSG = "失败";
}
