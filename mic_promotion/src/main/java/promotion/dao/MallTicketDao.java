package promotion.dao;

import org.springframework.data.neo4j.annotation.Query;
import promotion.domain.MallTicket;
import promotion.domain.Scope;

import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/11.
 * 商城券
 */
public interface MallTicketDao extends BaseDao<MallTicket>{

    /**
     * 创建商城券
     * {0} 代表传入的参数
     */
    @Query(" create (n:MallTicket{0}) return n; ")
     Map createMallTicket(Map map);



    /**
     * 查询所有商城券
     * @return
     */
    @Query(" match (n:MallTicket) return n ;")
     List<MallTicket> findAllMallTicket();


    /**
     * 查询商城券
     * @param id
     * @return
     */
    @Query(" match (n:MallTicket {id:{0}}) return n; ")
     Scope findMallTicket(Long id);


    /**
     * 修改商城券
     * 使用 set n+={map}，this will add and update properties, while keeping existing ones.
     * If use SET n = {map}  Set all properties. This will remove any existing properties.
     * @param id,map
     * @return
     */
    @Query(" match (n:MallTicket {id:{0}}) set n+={1}  return n; ")
    Scope updateMallTicket(Long id, Map map);
}
