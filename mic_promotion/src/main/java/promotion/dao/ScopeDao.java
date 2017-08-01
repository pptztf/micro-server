package promotion.dao;

import org.springframework.data.neo4j.annotation.Query;
import promotion.domain.Scope;

import java.util.List;
import java.util.Map;

/**
 * Created by ZhangY05 on 2017/7/11.
 * 范围数据
 */
public interface ScopeDao extends BaseDao<Scope>{

    /**
     * 创建范围数据
     * {0} 代表传入的参数
     */
    @Query(" create (n:Scope{0}) return n; ")
     Map createScope(Map map);



    /**
     * 查询所有范围信息
     * @return
     */
    @Query(" match (n:Scope) return n ;")
     List<Scope> findAllScope();


    /**
     * 查询范围
     * @param id
     * @return
     */
    @Query(" match (n:Scope {id:{0}}) return n; ")
     Scope findScope(Long id);


    /**
     * 修改单条范围数据
     * 使用 set n+={map}，this will add and update properties, while keeping existing ones.
     * If use SET n = {map}  Set all properties. This will remove any existing properties.
     * @param id,map
     * @return
     */
    @Query(" match (n:Scope {id:{0}}) set n+={1}  return n; ")
     Scope updateScope(Long id,Map map);
}
