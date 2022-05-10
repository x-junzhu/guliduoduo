package cn.org.gldd.common.exceptionhandler;

/**
 * @Author John Carraway
 * @Create 2022/5/10 15:16
 * @Version 1.0
 */
public class GlddException extends RuntimeException{

   private Integer code;

   private String msg;

   public GlddException(Integer code, String msg){
      super();
      this.code = code;
      this.msg = msg;
   }

   public Integer getCode() {
      return code;
   }

   public void setCode(Integer code) {
      this.code = code;
   }

   public String getMsg() {
      return msg;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }
}
