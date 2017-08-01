package promotion.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Created by ZhangY05 on 2017/7/6.
 * 满减
 */
@NodeEntity
public class NmPromotion extends BasePromotion {

    @Property(name="fullPiece")
    private int fullPiece; //满N件
    @Property(name="minusPiece")
    private int minusPiece;//减M件

    public int getFullPiece() {
        return fullPiece;
    }

    public void setFullPiece(int fullPiece) {
        this.fullPiece = fullPiece;
    }

    public int getMinusPiece() {
        return minusPiece;
    }

    public void setMinusPiece(int minusPiece) {
        this.minusPiece = minusPiece;
    }
}
