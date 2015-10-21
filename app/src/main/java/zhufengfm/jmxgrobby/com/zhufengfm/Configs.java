package zhufengfm.jmxgrobby.com.zhufengfm;

/**
 * Created by Administrator on 15-10-19.
 *
 */

/**
 * 定义常量
 */
public class Configs {
    //欢迎页需要的共享参数
    public static final String SP_NAME = "app";
    //欢迎页显示的版本号，根据其判断是否需要显示欢迎页
    public static final String SP_KEY_WELCOME_SHOW_VER = "wsv";
    //json返回成功和失败判断的唯一标识
    public static final int TASK_RESULT_OK = 0;

    //异步任务的action定义
    public static final int TASK_ACTION_DISCOVER_CATEGORIES = 1;

    //是否为开发版本
    public static final boolean  ISDEBUG = true;
    public static final int TASK_ACTION_DISCOVER_RECOMMENDS = 2;
}