package promotion.bean;

import java.util.Date;

/**
 * Created by ZhangY05 on 2017/7/6.
 *  暂时匹配单品促销，其他促销后续使用java引擎规则实现
 */
public class PromotionBean extends RuleBaseBean {

    private Long id;
    private String saleName;
    private String saleAddress;
    private String saleMark;
    private Date createTime;
    private int saleStatus;//活动状态
    private int examineStatus;//审核状态
    private String userName;
    private String userAccount;
    private String userRole;
    private int flag;
    private boolean allJoin;
    private int integral; //赠送积分
    private String mallTicketId;//关联商城券id
    private String storeTicketId;//关联店铺券id
    private Double straightDown;//直降**元
    private Double disCount;//折扣
    private int promotionTypeId;//关联促销类型的id
    private int scopeId;//关联促销范围的id
    private String productJson;//参与促销的商品信息
    private boolean timeLimit;//限时
    private boolean amountLimit;//限量
    private boolean oneLimit;//限购一个

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getSaleName() {
        return saleName;
    }

    @Override
    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    @Override
    public String getSaleAddress() {
        return saleAddress;
    }

    @Override
    public void setSaleAddress(String saleAddress) {
        this.saleAddress = saleAddress;
    }

    @Override
    public String getSaleMark() {
        return saleMark;
    }

    @Override
    public void setSaleMark(String saleMark) {
        this.saleMark = saleMark;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public int getSaleStatus() {
        return saleStatus;
    }

    @Override
    public void setSaleStatus(int saleStatus) {
        this.saleStatus = saleStatus;
    }

    @Override
    public int getExamineStatus() {
        return examineStatus;
    }

    @Override
    public void setExamineStatus(int examineStatus) {
        this.examineStatus = examineStatus;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserAccount() {
        return userAccount;
    }

    @Override
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String getUserRole() {
        return userRole;
    }

    @Override
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public int getFlag() {
        return flag;
    }

    @Override
    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public boolean isAllJoin() {
        return allJoin;
    }

    @Override
    public void setAllJoin(boolean allJoin) {
        this.allJoin = allJoin;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getMallTicketId() {
        return mallTicketId;
    }

    public void setMallTicketId(String mallTicketId) {
        this.mallTicketId = mallTicketId;
    }

    public String getStoreTicketId() {
        return storeTicketId;
    }

    public void setStoreTicketId(String storeTicketId) {
        this.storeTicketId = storeTicketId;
    }

    public Double getStraightDown() {
        return straightDown;
    }

    public void setStraightDown(Double straightDown) {
        this.straightDown = straightDown;
    }

    public Double getDisCount() {
        return disCount;
    }

    public void setDisCount(Double disCount) {
        this.disCount = disCount;
    }

    @Override
    public int getPromotionTypeId() {
        return promotionTypeId;
    }

    @Override
    public void setPromotionTypeId(int promotionTypeId) {
        this.promotionTypeId = promotionTypeId;
    }

    @Override
    public int getScopeId() {
        return scopeId;
    }

    @Override
    public void setScopeId(int scopeId) {
        this.scopeId = scopeId;
    }

    public String getProductJson() {
        return productJson;
    }

    public void setProductJson(String productJson) {
        this.productJson = productJson;
    }

    public boolean isTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(boolean timeLimit) {
        this.timeLimit = timeLimit;
    }

    public boolean isAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(boolean amountLimit) {
        this.amountLimit = amountLimit;
    }

    public boolean isOneLimit() {
        return oneLimit;
    }

    public void setOneLimit(boolean oneLimit) {
        this.oneLimit = oneLimit;
    }
}
