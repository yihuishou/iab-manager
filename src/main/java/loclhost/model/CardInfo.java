package loclhost.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LadyLady on 2018-10-19.
 */
// @ApiModel(value = "校园卡信息", description = "查询校园卡信息时返回的结果")
public class CardInfo {

    @ApiModelProperty(value = "学生学号", example = "210005686")
    String stuNo;

    @ApiModelProperty(value = "学生姓名", example = "小明")
    String stuName;

    @ApiModelProperty(value = "学生身份证号", example = "510100197512305607")
    String idcard;

    @ApiModelProperty(value = "主卡号，卡挂失操作时为必输项", example = "200000289854")
    String cardCode;

    @ApiModelProperty(value = "部门", example = "图书馆")
    String department;

    @ApiModelProperty(value = "余额，单位：元", example = "323.69")
    String balance;

    @ApiModelProperty(value = "校园卡状态" + "共三种：" + "\n正常：normal" + "\n销卡：deleted " + "\n挂失：lost", example = "normal")
    String cardState;

    public String getStuNo() {

        return stuNo;
    }

    public void setStuNo(String stuNo) {

        this.stuNo = stuNo;
    }

    public String getIdcard() {

        return idcard;
    }

    public void setIdcard(String idcard) {

        this.idcard = idcard;
    }

    public String getCardCode() {

        return cardCode;
    }

    public void setCardCode(String cardCode) {

        this.cardCode = cardCode;
    }

    public String getStuName() {

        return stuName;
    }

    public void setStuName(String stuName) {

        this.stuName = stuName;
    }

    public String getCardState() {

        return cardState;
    }

    public void setCardState(String cardState) {

        this.cardState = cardState;
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
}
