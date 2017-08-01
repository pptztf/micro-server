package promotion.dao;

import org.springframework.data.neo4j.annotation.Query;
import promotion.domain.Scope;
import promotion.domain.StoreTicket;

import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/11.
 * 购物券
 */
public interface StoreTicketDao extends BaseDao<StoreTicket> {

    /**
     * 创建店铺券数据
     * @param map {0} 代表传入的参数
     * @return
     */
    @Query(" create (n:StoreTicket{0}) return n; ")
    Map createStoreTicket(Map map);


    /**
     * 查询所有店铺券信息
     * @return
     */
    @Query(" match (n:StoreTicket) return n ;")
    List<StoreTicket> findAllStoreTicket();

    /**
     * 查询店铺券
     * @param id
     * @return
     */
    @Query(" match (n:StoreTicket {id:{0}}) return n; ")
    StoreTicket findStoreTicket(Long id);


    /**
     * 修改店铺券
     * 用 set n+={map}，this will add and update properties, while keeping existing ones.
     * If use SET n = {map}  Set all properties. This will remove any existing properties.
     * @param id
     * @param map
     * @return
     */
    @Query(" match (n:StoreTicket {id:{0}}) set n+={1}  return n; ")
    Scope updateStoreTicket(Long id, Map map);
}
