package promotion.dao;

import org.springframework.data.neo4j.annotation.Query;
import promotion.domain.Promotion;

import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/11.
 * 活动Dao
 */
public interface PromotionDao extends BaseDao<Promotion> {

    /**
     * 创建数据
     * {0} 代表传入的参数
     */
    @Query(" create (n:Promotion {0}) return n; ")
     Map createPromotion(Map map);

    /**
     * 查询所有信息
     * @return
     */
    @Query(" match (n:Promotion) return n ;")
     List<Promotion> findAllPromotion();

    /**
     * 查询活动
     * @param id
     * @return
     */
    @Query(" start n=node({0}) return n; ")
     Promotion findPromotion(Long id);


    @Query("start n=node({0}) return n")
     Object findNode(Long id);

    /**
     * 修改单条数据
     * 使用 set n+={map}，this will add and update properties, while keeping existing ones.
     * If use SET n = {map}  Set all properties. This will remove any existing properties.
     * @param id,map
     * @return
     */
    @Query(" match (n:Promotion {id:{0}}) set n+={1}  return n; ")
     Promotion updatePromotion(Long id,Map map);




    /**
     * 创建两个节点之间的关系,节点关系由startNodeId指向endNodeId；此处用于创建，活动属于哪种方式、哪种范围
     * @param startNodeId 节点id
     * @param endNodeId 节点id
     * @param relationShipType 关系类型
     * @return
     */
    @Query("START startNode=node({0}),endNode=node({1}) CREATE (startNode)-[:BELONG]->(endNode)")//由于关系类型，无法传入，暂时先增加方法
    //@Query("MATCH (p:Person { name: {0} }), (o:Organization { name: {1} }) CREATE (p)-[:{2}]->(o)")
     void createRelationshipBelong(Integer startNodeId,Integer endNodeId,String relationShipType);


    /**
     * 根据传入的商品id，查询对应的活动
     * @param productId
     * @return
     */
    @Query("match (p:Product)-[r]->(m:Promotion)-[t]->(type:PromotionType) where p.productId='111' return m,type ")
     List findProByProductInfo(String productId);


    /**
     * 根据传入的卖家id，查询对应的活动
     * @param sellerId
     * @return
     */
    @Query("match (s:Seller)-[r]->(m:Promotion) where s.sellerId={0} return m ")
     List<Promotion> findProBySellerInfo(Long sellerId);


    /**
     * 根据传入的商品类型，查询对应的活动
     * @param typeId
     * @return
     */
   @Query("match (pt:PromotionType)-[r]->(m:Promotion) where pt.typeId={0} return m ")
    List<Promotion> findProByTypeInfo(Long typeId);


    /**
     * 根据传入的地域信息，查询对应的活动
     * @param zoneId
     * @return
     */
    @Query("match (z:Zone)-[r]->(m:Promotion) where z.zoneId={0} return m ")
     List<Promotion> findProByZoneInfo(Long zoneId);
}
