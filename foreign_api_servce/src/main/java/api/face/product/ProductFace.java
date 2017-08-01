package api.face.product;

import api.bean.product.CategoryBean;
import api.bean.product.ProductBean;
import api.bean.product.TemplateBean;
import api.core.ApiBase;
import api.core.ApiException;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/6.
 * Template Product Face
 */
@Service
public class ProductFace extends ApiBase {

    /**
     * product micro-server url
     */
    protected String serviceUrl = "";

    /**
     * 查询产品
     *
     * @param id
     * @throws ApiException
     */
    public Map getProductById(Long id) throws ApiException {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        ProductBean p = get(serviceUrl + "/Product/{id}", ProductBean.class, map);
        Map<String, Object> productObjMap = new HashMap<String, Object>();
        productObjMap.put("result", p);

        return productObjMap;
    }

    /**
     * 查询产品
     *
     * @param categoryIds 需要查询的类别
     * @throws ApiException
     */
    public List getProduct(String categoryIds, String partyId) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("categoryId", categoryIds);
        if (partyId != null && partyId != "") {
            map.put("partyId", partyId);
        } else {
            map.put("partyId", null);
        }
        List list = null;
        if (categoryIds != null && categoryIds != "") {
            list = (List) restTemplate.getForObject(serviceUrl + "/Product?categoryId={categoryId}&partyId={partyId}", List.class, map);
        } else {
            list = (List) restTemplate.getForObject(serviceUrl + "/Product", List.class, map);
        }
        return list;
    }

    /**
     * 查询产品
     *
     * @param productIds 需要查询的类别
     * @throws ApiException
     */
    public List getProductByIds(String productIds) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productId", productIds);
        List list = restTemplate.getForObject(serviceUrl + "/Product?productId={productId}", List.class, map);
        return list;
    }

    /**
     * 查询产品
     *
     * @param partyId
     * @throws ApiException
     */
    public List getProductByPartyId(String partyId) throws ApiException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("partyId", partyId);
        List result = get(serviceUrl + "/Product?partyId={partyId}", List.class, map);
        return result;
    }

    /**
     * 查询类别
     * @param level 类别等级
     * @throws ApiException
     */
    public List<CategoryBean> getCategory(String level) throws ApiException{
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("level", level);
        List<CategoryBean> returnList = get (serviceUrl+"/Category?level={level}", List.class, map);
        return returnList;
    }

    /**
     * 添加类别
     * @param c
     * @throws ApiException
     */
    public void addCategory(CategoryBean c) throws ApiException{
        restTemplate.put(serviceUrl+"/Category", c);
    }

    /**
     * 添加产品
     * @param p
     * @throws ApiException
     */
    public ProductBean addProduct(ProductBean p) throws ApiException{
        ProductBean pb = put(serviceUrl+"/Product", p, ProductBean.class);
        return pb;
    }

    /**
     * 修改产品
     * @param p
     * @throws ApiException
     */
    public Map updProduct(ProductBean p) throws ApiException{
        MultiValueMap<String, Object> headers = new LinkedMultiValueMap<String, Object>();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        HttpEntity request = new HttpEntity(p, headers);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id", p.getId());
        Map returnMap = post(serviceUrl+"/Product/{id}",request,Map.class, map);
        return returnMap;
    }


    /*********** Template ***********/
    /**
     * 查询产品模板
     * @param id
     * @throws ApiException
     */
    public Map getTemplateById(Long id) throws ApiException{
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id", id);
        TemplateBean t =  get (serviceUrl+"/Template/{id}", TemplateBean.class, map);
        Map<String,Object> templateObjMap = new HashMap<String,Object>();
        templateObjMap.put("result", t);
        return templateObjMap;
    }

    /**
     * 查询产品模版-列表
     */
    public List queryTemplateList(Map<String,Object> parms) throws ApiException {
        List result = get (serviceUrl+"/Template", List.class, parms);
        return result;
    }

    /**
     * 添加产品模板
     * @param t
     * @throws ApiException
     */
    public TemplateBean addTemplate(TemplateBean t) throws ApiException{
        TemplateBean tb = put(serviceUrl+"/Template", t, TemplateBean.class);
        return tb;
    }

    /**
     * 修改产品模板
     * @param t
     * @throws ApiException
     */
    public TemplateBean updTemplate(TemplateBean t) throws ApiException{
        Map map = new HashMap();
        map.put("id", t.getId());
        TemplateBean tb = post(serviceUrl+"/Template/{id}", t, TemplateBean.class,map);
        return tb;
    }

}
