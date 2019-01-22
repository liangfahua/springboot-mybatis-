package com.demo.entity;

import java.util.Date;

public class User {
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 会员号
     */
    private String userNo;

    /**
     * 手机号
     */
    private String userMobile;

    /**
     * 联系人电话号码
     */
    private String contactMobile;

    /**
     * email
     */
    private String userEmail;

    /**
     * 微信openid
     */
    private String openId;

    /**
     * 微信unionid
     */
    private String unionid;

    /**
     * 用户密码 密文
     */
    private String userPassword;

    /**
     * 支付密码
     */
    private String paymentPassword;

    /**
     * 用户真实名
     */
    private String realName;

    /**
     * 用户更新版本号 -用于乐观锁
     */
    private Integer version;

    /**
     * 推荐人用户id
     */
    private Integer recommendUserid;

    /**
     * 头像图片
     */
    private String userImg;

    /**
     * 微信名
     */
    private String wechatName;

    /**
     * 微信头像图片
     */
    private String wechatImg;

    /**
     * 微信号二维码图片
     */
    private String wechatIdUrl;

    /**
     * 邀请码余额
     */
    private Long balance4;

    /**
     * 利润池余额
     */
    private Long balance3;

    /**
     * 退款余额
     */
    private Long balance2;

    /**
     * 推广佣金余额
     */
    private Long balance1;

    /**
     * 性别，1.男，2.女
     */
    private Integer sex;

    /**
     * 用户类型-补充枚举 例如: 1-老学员 2:已充值 3:已修改  4:线下客户 5:封杀
     */
    private Integer userType;

    /**
     * 用户级别-补充枚举  对应t_partner的id 
     */
    private Integer userLevel;

    /**
     * 用户状态 例如：1-正常 2-注销- 3-异常
     */
    private Integer userState;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 享受分红(0无  1有)
     */
    private Integer isBonus;

    /**
     * 邀请码剩余数
     */
    private Integer invitationCode;

    /**
     * 用户描述
     */
    private String comment;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 锁定时间
     */
    private Date lockingTime;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 支付宝账号
     */
    private String alipay;

    /**
     * 微信账号
     */
    private String wechatId;

    /**
     * php版openid
     */
    private String phpOpenid;

    /**
     * php版公众号编号
     */
    private Integer uniacid;

    /**
     * 是否关注公众好
     */
    private Integer isSubscribe;

    /**
     * 下级人数
     */
    private Integer subordinate;

    /**
     * 邀请码数变为0的时间
     */
    private Date invitationCodeTime;

    /**
     * 是否改变过关系
     */
    private Integer isRecommend;

    /**
     * 签名
     */
    private String sig;

    /**
     * 签名过期时间
     */
    private Date sigExpiryTime;

    /**
     * 在t_group表加上了group_type，0表示测试群，1表示正式群
     */
    private String identifier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPaymentPassword() {
        return paymentPassword;
    }

    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getRecommendUserid() {
        return recommendUserid;
    }

    public void setRecommendUserid(Integer recommendUserid) {
        this.recommendUserid = recommendUserid;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    public String getWechatImg() {
        return wechatImg;
    }

    public void setWechatImg(String wechatImg) {
        this.wechatImg = wechatImg;
    }

    public String getWechatIdUrl() {
        return wechatIdUrl;
    }

    public void setWechatIdUrl(String wechatIdUrl) {
        this.wechatIdUrl = wechatIdUrl;
    }

    public Long getBalance4() {
        return balance4;
    }

    public void setBalance4(Long balance4) {
        this.balance4 = balance4;
    }

    public Long getBalance3() {
        return balance3;
    }

    public void setBalance3(Long balance3) {
        this.balance3 = balance3;
    }

    public Long getBalance2() {
        return balance2;
    }

    public void setBalance2(Long balance2) {
        this.balance2 = balance2;
    }

    public Long getBalance1() {
        return balance1;
    }

    public void setBalance1(Long balance1) {
        this.balance1 = balance1;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getIsBonus() {
        return isBonus;
    }

    public void setIsBonus(Integer isBonus) {
        this.isBonus = isBonus;
    }

    public Integer getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(Integer invitationCode) {
        this.invitationCode = invitationCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getLockingTime() {
        return lockingTime;
    }

    public void setLockingTime(Date lockingTime) {
        this.lockingTime = lockingTime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getPhpOpenid() {
        return phpOpenid;
    }

    public void setPhpOpenid(String phpOpenid) {
        this.phpOpenid = phpOpenid;
    }

    public Integer getUniacid() {
        return uniacid;
    }

    public void setUniacid(Integer uniacid) {
        this.uniacid = uniacid;
    }

    public Integer getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(Integer isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public Integer getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(Integer subordinate) {
        this.subordinate = subordinate;
    }

    public Date getInvitationCodeTime() {
        return invitationCodeTime;
    }

    public void setInvitationCodeTime(Date invitationCodeTime) {
        this.invitationCodeTime = invitationCodeTime;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public Date getSigExpiryTime() {
        return sigExpiryTime;
    }

    public void setSigExpiryTime(Date sigExpiryTime) {
        this.sigExpiryTime = sigExpiryTime;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}