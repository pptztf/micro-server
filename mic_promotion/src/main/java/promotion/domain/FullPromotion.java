package promotion.domain;

import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

/**
 * Created by ZhangY05 on 2017/7/11.
 * 满增
 */
@NodeEntity
public class FullPromotion extends BasePromotion {

    private Integer basePrice;
    private Integer addPrice;
    private List<String> giftes;
    private boolean isChecked;

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(Integer addPrice) {
        this.addPrice = addPrice;
    }

    public List<String> getGiftes() {
        return giftes;
    }

    public void setGiftes(List<String> giftes) {
        this.giftes = giftes;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
