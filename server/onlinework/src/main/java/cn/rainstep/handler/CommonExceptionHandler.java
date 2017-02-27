package cn.rainstep.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zero on 2017/2/25.
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handlerException(Exception e) {
        Map<String, Object> wrapData = new HashMap<>();
        wrapData.put("result", false);
        wrapData.put("data", null);
        wrapData.put("message", "服务器异常，请联系管理员");
        e.printStackTrace();
        return wrapData;
    }

}
