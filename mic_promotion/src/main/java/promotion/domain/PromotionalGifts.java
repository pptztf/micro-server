package promotion.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by ZhangY05 on 2017/7/6.
 * 赠品促销
 */
@NodeEntity
public class PromotionalGifts extends BasePromotion {

    private String giftContent;//存储序列化的赠品信息

    public String getGiftContent() {
        return giftContent;
    }

    public void setGiftContent(String giftContent) {
        this.giftContent = giftContent;
    }

    public void processBussines(){
        System.out.println("处理商品促销业务...");
    }
}
