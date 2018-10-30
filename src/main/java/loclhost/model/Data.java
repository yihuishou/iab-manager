package loclhost.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LadyLady on 2018-10-19.
 */

@ApiModel(value = "数据对象")
public class Data {

    @ApiModelProperty(value = "学生学号", example = "210005686")
    String stuNo;

    @ApiModelProperty(value = "学生姓名", example = "小明")
    String stuName;

    @ApiModelProperty(value = "主卡号", example = "200000289854")
    String cardCode;

    @ApiModelProperty(value = "部门", example = "图书馆")
    String department;

    @ApiModelProperty(value = "余额，单位：元", example = "323.69")
    String balance;

    @ApiModelProperty(value = "校园卡状态" + "共三种：" + "\n正常：normal" + "\n销卡：deleted " + "\n挂失：lost", example = "normal")
    String cardState;

    @ApiModelProperty(value = "密码，必须为6位纯数字且不可为空", example = "123456")
    String password;

    @ApiModelProperty(value = "身份证号，18位", example = "510100197512305607")
    String idcard;

    @ApiModelProperty(value = "校园卡新密码，必须为6位纯数字且不可为空", example = "123456")
    String newPassword;

    @ApiModelProperty(value = "查询起始日期，格式：yyyy-MM-dd，查询时间范围最大支持3个月",example = "2018-10-01")
    String queryTransferFlowStartDate;

    @ApiModelProperty(value = "查询结束日期，格式：yyyy-MM-dd，查询时间范围最大支持3个月",example = "2018-10-20")
    String queryTransferFlowEndDate;

    @ApiModelProperty(value = "银行卡号", example = "6212262201023557228")
    String bankCardCord;

    @ApiModelProperty(value = "银行流水号,数字14位", example = "20181020000001")
    String bankTransferFlow;

    @ApiModelProperty(value = "银行交易时间，格式：yyyy-MM-dd HH:mm:ss", example = "2018-10-20 12:38:42")
    String bankTransferTime;

    @ApiModelProperty(value = "圈存金额 单位：元", example = "125.36")
    String transferMoney;

    public String getStuNo() {

        return stuNo;
    }

    public void setStuNo(String stuNo) {

        this.stuNo = stuNo;
    }

    public String getStuName() {

        return stuName;
    }

    public void setStuName(String stuName) {

        this.stuName = stuName;
    }

    public String getCardCode() {

        return cardCode;
    }

    public void setCardCode(String cardCode) {

        this.cardCode = cardCode;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public String getBalance() {

        return balance;
    }

    public void setBalance(String balance) {

        this.balance = balance;
    }

    public String getCardState() {

        return cardState;
    }

    public void setCardState(String cardState) {

        this.cardState = cardState;
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

    public String getBankCardCord() {

        return bankCardCord;
    }

    public void setBankCardCord(String bankCardCord) {

        this.bankCardCord = bankCardCord;
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
}
