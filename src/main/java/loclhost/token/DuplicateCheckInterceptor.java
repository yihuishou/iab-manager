package loclhost.token;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.UUID;

/**
 * Created by LadyLady on 2018-03-29.
 */
public class DuplicateCheckInterceptor implements HandlerInterceptor {
    //在请求处理之前进行调用（Controller方法调用之前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        if (o instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) o;
            Method method = handlerMethod.getMethod();

            boolean hasCheck = method.isAnnotationPresent(CheckDuplicate.class);
            boolean hasSet = method.isAnnotationPresent(SetDuplicateMark.class);

            // 有注解的时候进行检查
            if (hasCheck || hasSet) {

                if (hasSet && !hasCheck) {
                    String uuidToken = UUID.randomUUID().toString();
                    // 需要添加token
                    httpServletRequest.getSession().setAttribute("token", uuidToken);
                    httpServletRequest.setAttribute("token", uuidToken);
                }

                if (hasCheck && !hasSet) {
                    // 移除token前检查
                    if (isRepeatSubmit(httpServletRequest)) {


                        // 是重复提交则放弃提交
                        return false;
                    }
                    httpServletRequest.getSession().removeAttribute("token");
                }
            }

            return true;

        }

        return true;

    }

    private boolean isRepeatSubmit(HttpServletRequest request) {

        String serverToken = (String) request.getSession(false).getAttribute("token");

        // session中没有token
        if (serverToken == null) {
            return true;
        }
        String clinetToken = request.getParameter("token");
        // 请求中没有token
        if (clinetToken == null) {
            return true;
        }
        // 请求的token和session中的不匹配
        if (!serverToken.equals(clinetToken)) {
            return true;
        }
        return false;

    }

    //请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
