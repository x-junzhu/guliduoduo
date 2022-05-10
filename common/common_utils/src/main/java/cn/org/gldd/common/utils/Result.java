package cn.org.gldd.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author John Carraway
 * @Create 2022/5/10 14:12
 * @Version 1.0
 */
public class Result {

   private Boolean success;

   private Integer code;

   private String message;

   // 返回的数据
   private Map<String, Object> data = new HashMap<>();

   // 私有化构造函数
   private Result(){}

   private Result(Boolean success, Integer code, String message){
      this.success = success;
      this.code = code;
      this.message = message;
   }

   private Result(Boolean success, Integer code, String message, Map<String, Object> data){
      this.success = success;
      this.code = code;
      this.message = message;
      this.data = data;
   }

   // 链式返回结果
   public Result success(Boolean success){
      this.setSuccess(success);
      this.setMessage("成功");
      this.setCode(20000);
      return this;
   }

   public Result message(String message){
      this.setMessage(message);
      return this;
   }

   public Result code(Integer code){
      this.setCode(code);
      return this;
   }

   public Result data(String key, Object val){
      this.data.put(key, val);
      return this;
   }

   public Result data(Map<String, Object> map){
      this.setData(map);
      return this;
   }

   public Boolean getSuccess() {
      return success;
   }

   public void setSuccess(Boolean success) {
      this.success = success;
   }

   public Integer getCode() {
      return code;
   }

   public void setCode(Integer code) {
      this.code = code;
   }

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public Map<String, Object> getData() {
      return data;
   }

   public void setData(Map<String, Object> data) {
      this.data = data;
   }
}
