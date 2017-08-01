package product.utils;

/**
 * Created by ZhangY05 on 2017/7/5.
 */
public class Util {

    /**
     * 判断对象是否为空
     * @param object
     * @return
     */
    public static boolean isNullOrEmpty(Object object){
        if(object==null||"".equals(object.toString()))
            return true;
        return false;
    }
}
