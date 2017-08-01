package promotion.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by ZhangY05 on 2017/7/6.
 * Base Dao
 */
public interface BaseDao<T> extends GraphRepository<T> {

    /**
     * 根据id查询信息
     * {0} 表示 传入的参数 id
     * @param id
     * @return T
     */
    @Query("MATCH (n) WHERE id(n)={0} RETURN n")
     <T> T getFromId(Integer id);

    /**
     * 创建两个节点之间的关系,节点关系由startNodeId指向endNodeId
     * @param startNodeId 节点id
     * @param endNodeId 节点id
     * @param relationShipType 关系类型
     * @return
     */
    @Query("START startNode=node({0}),endNode=node({1}) CREATE (startNode)-[:DATA]->(endNode)")
     void createRelationship(Integer startNodeId,Integer endNodeId,String relationShipType);

    /**
     * 根据id删除节点（没有关系关联的节点）
     * @return
     */
    @Query("start n=node({0}) delete n")
     <T> T deleteRelationship(Integer id);

    /**
     * 删除节点和节点关系(指向别的节点的关系)
     * @param id 节点id
     * @return
     */
    @Query("START n=node({0}) MATCH (n)-[s]-() delete n,s")
     <T> T deleteRelationships(Integer id);


    /**
     * 删除两个节点和节点关系
     * @param id 节点id
     * @param relationShip 关系类型
     * @return
     */
    @Query("START startNode=node({0}),endNode=node({1}) "
            + "MATCH (startNode)-[r:{2}]-(endNode) delete startNode,r,endNode ")
     <T> T deleteRelationship(Integer startNodeId,Integer endNodeId,String relationShip);

}
