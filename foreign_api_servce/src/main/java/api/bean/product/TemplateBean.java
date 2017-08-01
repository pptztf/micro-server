package api.bean.product;

import java.util.List;

/**
 * Created by ZhangY05 on 2017/7/6.
 * 模板
 */
public class TemplateBean {

    private Long id;
    private String name;
    private String content;
    private List<Long> productTypeIdList;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<Long> getProductTypeIdList() {
        return productTypeIdList;
    }
    public void setProductTypeIdList(List<Long> productTypeIdList) {
        this.productTypeIdList = productTypeIdList;
    }


}
