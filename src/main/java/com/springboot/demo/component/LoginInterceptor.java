package com.springboot.demo.component;

import com.springboot.demo.util.Const;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     * 基于URL实现的拦截器
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(">>>CommonInterceptor>>>>>>>在请求处理之前进行调用");
       /* String path = request.getServletPath();*/
        // 这写你拦截需要干的事儿，比如取缓存，SESSION，权限判断等
        System.out.println("====================================");
        // 跳转登录-------controller类中的登陆方法
        /*response.sendRedirect(request.getContextPath() + "/chenjie/index");*/
        return true;// 只有返回true才会继续向下执行，返回false取消当前请求


    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println(">>>CommonInterceptor>>>>>>>请求处理之后进行调用");

    }

    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,
                                Object handler, Exception ex)throws Exception {

        System.out.println(">>>CommonInterceptor>>>>>>>在整个请求结束之后被调用");

    }

}