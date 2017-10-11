package loclhost;

/**
 * Created by BlueSky on 2017/10/10.
 */

import org.slf4j.LoggerFactory;

/**
 * Logs日志工具类
 * 若要自定义可配置打印出执行的方法名和执行行号位置等信息，请修改生成logger对象的方法
 */
public class Logs {

    // 本日志类名
    private final static String logClassName = Logs.class.getName();

    /**
     * 获取最原始被调用的堆栈信息
     */
    private static StackTraceElement getCaller() {

        // 获取堆栈信息
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        if (null == traceElements) {
            return null;
        }

        // 最原始被调用的堆栈信息
        StackTraceElement caller = null;

        // 循环遍历到日志类标识
        boolean isEachLogFlag = false;

        // 遍历堆栈信息，获取出最原始被调用的方法信息
        for (StackTraceElement element : traceElements) {
            // 遍历到日志类
            if (element.getClassName().equals(logClassName)) {
                isEachLogFlag = true;
            }

            // 下一个非日志类的堆栈，就是最原始被调用的方法
            if (isEachLogFlag) {
                if (!element.getClassName().equals(logClassName)) {
                    caller = element;
                    break;
                }
            }
        }

        return caller;
    }

    /**
     * 自动匹配请求类名，生成logger对象
     */
    private static org.slf4j.Logger log() {
        // 最原始被调用的堆栈对象
        StackTraceElement caller = getCaller();
        // 空堆栈处理
        if (caller == null) {
            return LoggerFactory.getLogger(Logs.class);
        }

        // 与springboot默认显示日志相同，只显示类名
        return LoggerFactory.getLogger(caller.getClassName());
    }

    /*
    * 下列是封装后方法
    * */

    public static void debug(String message) {
        log().debug(message);
    }

    public static void debug(String message, Throwable exception) {
        log().debug(message, exception);
    }

    public static void debug(String message, Object object) {
        log().debug(message, object);
    }

    public static void debug(String message, Object... object) {
        log().debug(message, object);
    }

    public static void info(String message) {
        log().info(message);
    }

    public static void info(String message, Throwable exception) {
        log().info(message, exception);
    }

    public static void info(String message, Object object) {
        log().info(message, object);
    }

    public static void info(String message, Object... object) {
        log().info(message, object);
    }

    public static void error(String message) {
        log().error(message);
    }

    public static void error(String message, Throwable exception) {
        log().error(message, exception);
    }

    public static void error(String message, Object object) {
        log().error(message, object);
    }

    public static void error(String message, Object... object) {
        log().error(message, object);
    }

    public static void warn(String message) {
        log().warn(message);
    }

    public static void warn(String message, Throwable exception) {
        log().warn(message, exception);
    }

    public static void warn(String message, Object object) {
        log().warn(message, object);
    }

    public static void warn(String message, Object... object) {
        log().warn(message, object);
    }


}
