package promotion.domain;

/**
 * Created by ZhangY05 on 2017/7/6.
 * 设置“加”
 */
public class SetPromotion extends BasePromotion{

    private Integer singleBuyCount;
    private boolean oneLimit;

    public Integer getSingleBuyCount() {
        return singleBuyCount;
    }

    public void setSingleBuyCount(Integer singleBuyCount) {
        this.singleBuyCount = singleBuyCount;
    }

    public boolean isOneLimit() {
        return oneLimit;
    }

    public void setOneLimit(boolean oneLimit) {
        this.oneLimit = oneLimit;
    }
}
