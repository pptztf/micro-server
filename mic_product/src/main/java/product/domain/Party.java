package product.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by ZhangY05 on 2017/7/5
 * .
 */
@NodeEntity
public class Party {

    @GraphId
    private Long id;

    private Integer partyTypeId;

    private String partyTypeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(Integer partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public String getPartyTypeName() {
        return partyTypeName;
    }

    public void setPartyTypeName(String partyTypeName) {
        this.partyTypeName = partyTypeName;
    }
}
