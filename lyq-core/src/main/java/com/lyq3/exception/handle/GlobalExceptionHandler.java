package com.lyq3.exception.handle;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 全局的权限验证和异常拦截
 * @author lyq
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 登录认证异常
     */
    @ExceptionHandler({ UnauthenticatedException.class, AuthenticationException.class })
    @ResponseBody
    public Map<String,Object> authenticationException(HttpServletRequest request, HttpServletResponse response) {
        // 输出JSON
        Map<String,Object> map = new HashMap<>();
        map.put("code", "888");
        map.put("message", "未登录");
        return map;
    }

    /**
     * 权限异常
     */
    @ExceptionHandler({ UnauthorizedException.class, AuthorizationException.class })
    @ResponseBody
    public Map<String,Object> authorizationException(HttpServletRequest request, HttpServletResponse response) {
        // 输出JSON
        Map<String,Object> map = new HashMap<>();
        map.put("code", "666");
        map.put("message", "无权限");
        return map;
    }

    /**
     * 业务异常
     */
//    @ExceptionHandler(BussinessException.class)
//    @ResponseBody
//    public Map<String,Object> bussinessException(BussinessException e) {
//        // 输出JSON
//        Map<String,Object> map = new HashMap<>();
//        map.put("code", e.getCode());
//        map.put("message",e.getMessage());
//        return map;
//    }
    /**
     * 其他未知异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> bussinessException(Exception e) {
        // 输出JSON
        Map<String,Object> map = new HashMap<>();
        map.put("code", 999);
        map.put("message","未知运行错误");
        e.printStackTrace();
        return map;
    }
}