package promotion.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by ZhangY05 on 2017/7/11.
 * 满减
 */
@NodeEntity
public class FullCut extends BasePromotion {

    private Integer baseCount;
    private Integer cutCout;

    public Integer getBaseCount() {
        return baseCount;
    }

    public void setBaseCount(Integer baseCount) {
        this.baseCount = baseCount;
    }

    public Integer getCutCout() {
        return cutCout;
    }

    public void setCutCout(Integer cutCout) {
        this.cutCout = cutCout;
    }
}
