package product.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Created by ZhangY05 on 2017/7/5.
 * 组织
 */
@NodeEntity
public class Organization extends Party {

    @Property(name="name")
    private String name;

    @Property(name="level")
    private Integer level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


}
