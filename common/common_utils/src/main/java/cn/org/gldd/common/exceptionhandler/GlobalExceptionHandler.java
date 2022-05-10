package cn.org.gldd.common.exceptionhandler;

import cn.org.gldd.common.utils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author John Carraway
 * @Create 2022/5/10 15:18
 * @Version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        return Result.error().message("执行了全局异常");
    }

    @ExceptionHandler(GlddException.class)
    @ResponseBody
    public Result error(GlddException e){
        e.printStackTrace();
        return Result.error().code(e.getCode()).message(e.getMessage());
    }
}
