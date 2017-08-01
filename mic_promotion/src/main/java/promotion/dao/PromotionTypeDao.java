package promotion.dao;

import org.springframework.data.neo4j.annotation.Query;
import promotion.domain.Promotion;
import promotion.domain.PromotionType;

import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/11.
 * 活动类型
 */
public interface PromotionTypeDao extends BaseDao<PromotionType> {

    /**
     * 创建数据
     * {0} 代表传入的参数
     */
    @Query(" create (n:PromotionType{0}) return n; ")
     Map createPromotionType(Map map);



    /**
     * 查询所有信息
     * @return
     */
    @Query(" match (n:PromotionType) return n ;")
     List<PromotionType> findAllPromotionType();


    /**
     * 查询活动类型
     * @param id
     * @return
     */
    @Query(" match (n:PromotionType {id:{0}}) return n; ")
     Promotion findPromotionType(Long id);


    /**
     * 修改单条数据
     * 使用 set n+={map}，this will add and update properties, while keeping existing ones.
     * If use SET n = {map}  Set all properties. This will remove any existing properties.
     * @param id,map
     * @return
     */
    @Query(" match (n:PromotionType {id:{0}}) set n+={1}  return n; ")
     Promotion updatePromotionType(Long id,Map map);
}
