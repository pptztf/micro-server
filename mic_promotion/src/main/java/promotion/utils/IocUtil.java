package promotion.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by ZhangY05 on 2017/7/6.
 */
public class IocUtil implements ApplicationContextAware {

    public IocUtil() {
        System.out.println("init IocUtil----------------");
    }

    private static ApplicationContext singleContainer = null;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        singleContainer=applicationContext;
    }

    public static Object getBean(String beanName){
        if(singleContainer==null){
            return null;
        }else{
            return singleContainer.getBean(beanName);
        }
    }
}
