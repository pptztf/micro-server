package promotion.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by ZhangY05 on 2017/7/6.
 * 阶梯满减
 */
@NodeEntity
public class SaveFullLadder extends BasePromotion{

    private Integer baseCoutOneLevel;//一级 满多少
    private Integer baseCutOneLevel;//一级 减多少
    private Integer baseCoutTwoLevel;//二级 满多少
    private Integer baseCutTwoLevel;//二级 减多少
    private Integer baseCoutThreeLevel;//三级 满多少
    private Integer baseCutThreeLevel;//三级 减多少

    public Integer getBaseCoutOneLevel() {
        return baseCoutOneLevel;
    }

    public void setBaseCoutOneLevel(Integer baseCoutOneLevel) {
        this.baseCoutOneLevel = baseCoutOneLevel;
    }

    public Integer getBaseCutOneLevel() {
        return baseCutOneLevel;
    }

    public void setBaseCutOneLevel(Integer baseCutOneLevel) {
        this.baseCutOneLevel = baseCutOneLevel;
    }

    public Integer getBaseCoutTwoLevel() {
        return baseCoutTwoLevel;
    }

    public void setBaseCoutTwoLevel(Integer baseCoutTwoLevel) {
        this.baseCoutTwoLevel = baseCoutTwoLevel;
    }

    public Integer getBaseCutTwoLevel() {
        return baseCutTwoLevel;
    }

    public void setBaseCutTwoLevel(Integer baseCutTwoLevel) {
        this.baseCutTwoLevel = baseCutTwoLevel;
    }

    public Integer getBaseCoutThreeLevel() {
        return baseCoutThreeLevel;
    }

    public void setBaseCoutThreeLevel(Integer baseCoutThreeLevel) {
        this.baseCoutThreeLevel = baseCoutThreeLevel;
    }

    public Integer getBaseCutThreeLevel() {
        return baseCutThreeLevel;
    }

    public void setBaseCutThreeLevel(Integer baseCutThreeLevel) {
        this.baseCutThreeLevel = baseCutThreeLevel;
    }
}
