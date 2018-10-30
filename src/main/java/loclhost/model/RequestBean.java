package loclhost.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LadyLady on 2018-10-19.
 */
@ApiModel(value = "请求对象", description = "接收请求的对象")
public class RequestBean {

    @ApiModelProperty(value = "操作类型" + "\n必输项" + "\n 共六种类型分别对应以下六种操作" + "\n圈存充值： transfer" + "\n身份认证： validation" + "\n圈存查询： queryTransfer" + "\n卡信息查询： queryCardInfo" + "\n卡密码修改： modifyPassword" + "\n卡挂失： lossCard", example = "transfer")
    String handleType;

    @ApiModelProperty(value = "学生学号，除了身份认证操作时外为必输项", example = "210005686")
    String stuNo;

    @ApiModelProperty(value = "主卡号，卡挂失操作时为必输项", example = "200000289854")
    String cardCode;

    @ApiModelProperty(value = "密码，必须为6位纯数字且不可为空，身份认证操作和卡密码修改操作时为必输项", example = "123456")
    String password;

    @ApiModelProperty(value = "身份证号，18位，身份认证操作时为必输项", example = "510100197512305607")
    String idcard;

    @ApiModelProperty(value = "校园卡新密码，必须为6位纯数字且不可为空，卡密码修改操作时为必输项", example = "123456")
    String newPassword;

    @ApiModelProperty(value = "查询起始日期，格式：yyyy-MM-dd，查询时间范围最大支持3个月，圈存查询操作时为必输项", example = "2018-10-01")
    String queryTransferFlowStartDate;

    @ApiModelProperty(value = "查询结束日期，格式：yyyy-MM-dd，查询时间范围最大支持3个月，圈存查询操作时为必输项", example = "2018-10-20")
    String queryTransferFlowEndDate;

    @ApiModelProperty(value = "银行流水号,数字14位，圈存充值操作时为必输项", example = "20181020000001")
    String bankTransferFlow;

    @ApiModelProperty(value = "银行交易时间，格式：yyyy-MM-dd HH:mm:ss，圈存充值操作时为必输项", example = "2018-10-20 12:38:42")
    String bankTransferTime;

    @ApiModelProperty(value = "圈存金额 单位：元，圈存充值操作时为必输项", example = "125.36")
    String transferMoney;

    public String getStuNo() {

        return stuNo;
    }

    public void setStuNo(String stuNo) {

        this.stuNo = stuNo;
    }

    public String getCardCode() {

        return cardCode;
    }

    public void setCardCode(String cardCode) {

        this.cardCode = cardCode;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getIdcard() {

        return idcard;
    }

    public void setIdcard(String idcard) {

        this.idcard = idcard;
    }

    public String getNewPassword() {

        return newPassword;
    }

    public void setNewPassword(String newPassword) {

        this.newPassword = newPassword;
    }

    public String getQueryTransferFlowStartDate() {

        return queryTransferFlowStartDate;
    }

    public void setQueryTransferFlowStartDate(String queryTransferFlowStartDate) {

        this.queryTransferFlowStartDate = queryTransferFlowStartDate;
    }

    public String getQueryTransferFlowEndDate() {

        return queryTransferFlowEndDate;
    }

    public void setQueryTransferFlowEndDate(String queryTransferFlowEndDate) {

        this.queryTransferFlowEndDate = queryTransferFlowEndDate;
    }

    public String getBankTransferFlow() {

        return bankTransferFlow;
    }

    public void setBankTransferFlow(String bankTransferFlow) {

        this.bankTransferFlow = bankTransferFlow;
    }

    public String getBankTransferTime() {

        return bankTransferTime;
    }

    public void setBankTransferTime(String bankTransferTime) {

        this.bankTransferTime = bankTransferTime;
    }

    public String getTransferMoney() {

        return transferMoney;
    }

    public void setTransferMoney(String transferMoney) {

        this.transferMoney = transferMoney;
    }

    public String getHandleType() {

        return handleType;
    }

    public void setHandleType(String handleType) {

        this.handleType = handleType;
    }

}
