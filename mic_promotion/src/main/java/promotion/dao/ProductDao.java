package promotion.dao;

import org.springframework.data.neo4j.annotation.Query;
import promotion.domain.Product;
import promotion.domain.Scope;

import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/11.
 */
public interface ProductDao extends BaseDao<Product>  {

    /**
     * 此处的商品是指参加活动的商品，下同
     */

    /**
     * 创建商品数据
     * {0} 代表传入的参数
     */
    @Query(" create (n:Product{0}) return n; ")
     Map createProduct(Map map);



    /**
     * 查询所有商品信息
     * @return
     */
    @Query(" match (n:Product) return n ;")
     List<Product> findAllProduct();


    /**
     * 查询商品
     * @param id
     * @return
     */
    @Query(" match (n:Product {id:{0}}) return n; ")
     Scope findProduct(Long id);


    /**
     * 修改商品数据
     * 使用 set n+={map}，this will add and update properties, while keeping existing ones.
     * If use SET n = {map}  Set all properties. This will remove any existing properties.
     * @param id,map
     * @return
     */
    @Query(" match (n:Product {id:{0}}) set n+={1}  return n; ")
     Scope updateProduct(Long id, Map map);

    /**
     * 为活动添加商品
     * relationship:JOIN
     */
    @Query("START startNode=node({0}),endNode=node({1}) CREATE (startNode)-[:JOIN]->(endNode)")
     void createRelationshipJoin(Integer startNodeId,Integer endNodeId,String relationShipType);

//	/**
//	 * 为活动添加不参加商品
//	 * relationship:DISJOIN
//	 */
//	@Query("START startNode=node({0}),endNode=node({1}) CREATE (startNode)-[:DISJOIN]->(endNode)")
//	public void createRelationshipDisjoin(Integer startNodeId,Integer endNodeId,String relationShipType);
}
