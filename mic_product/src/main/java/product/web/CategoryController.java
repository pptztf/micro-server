package product.web;

import api.bean.product.CategoryBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import product.dao.CategoryDao;
import product.domain.Category;
import product.utils.Util;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/6.
 * 类型
 */
@EnableAutoConfiguration
@RestController
public class CategoryController {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    /**
     * 根据级别查询类别
     * @param parms
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/Category",method={RequestMethod.GET})
    public List<Category> queryCategory(@RequestParam Map<String,Object> parms){
        //如果没有传入级别，默认查询第一级
        String level = "1";
        if(!Util.isNullOrEmpty(parms.get("level"))){
            level = parms.get("level").toString();
        }
        List<Category> c = categoryDao.queryCategoryByLevel(level);
        return c;
    }

    /**
     * 根据id查询类别
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/Category/{id}",method={RequestMethod.GET})
    public Category queryCategoryById(@PathVariable Long id){
        Category c = categoryDao.queryCategoryById(id);
        return c;
    }

    /**
     * 添加类别
     * @param cb
     */
    @RequestMapping(value="/Category",method={RequestMethod.PUT})
    public void addCategory(@RequestBody CategoryBean cb){
        Category c = new Category();
        c.setName(cb.getName());
        c.setLevel(cb.getLevel());
        c.setRemark(cb.getRemark());
        categoryDao.save(c);
        if(!Util.isNullOrEmpty(cb.getpId())){
            categoryDao.createRelation(c.getId(),cb.getpId());
        }
    }

    /*@RequestMapping(value="/Category/{id}",method={RequestMethod.POST})
    public void updCategory(@PathVariable Long id){

    }

    @RequestMapping(value="/Category/{id}",method={RequestMethod.DELETE})
    public void delCategory(@PathVariable Long id){

    }*/

}
