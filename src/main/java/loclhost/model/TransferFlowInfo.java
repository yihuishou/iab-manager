package loclhost.model;

/**
 * Created by LadyLady on 2018-10-19.
 */
// @ApiModel(value = "圈存流水",description = "圈存充值查询结果")
public class TransferFlowInfo {
/*

    @ApiModelProperty(value = "学生姓名",example = "小明")
    String cardName;

    @ApiModelProperty(value = "校园卡号", example = "201088888")
    String cardCode;

    @ApiModelProperty(value = "银行卡号", example = "6212262201023557228")
    String bankCardCord;

    @ApiModelProperty(value = "银行流水号,数字14位", example = "20181020000001")
    String bankTransferFlow;
*/

    // @ApiModelProperty(value = "银行交易时间,格式：yyyy-MM-dd HH:mm:ss", example = "2018-10-20 12:38:42")
    String bankTransferTime;

/*    @ApiModelProperty(value = "校园流水号,数字14位", example = "20181020000001")
    String schoolTransferFlow;

    @ApiModelProperty(value = "校园交易时间,格式：yyyy-MM-dd HH:mm:ss", example = "2018-10-20 12:38:42")
    String schoolTransferTime;*/

    // @ApiModelProperty(value = "圈存金额 单位：元", example = "125.36")
    String transferMoney;
/*

    public String getCardCode() {

        return cardCode;
    }

    public void setCardCode(String cardCode) {

        this.cardCode = cardCode;
    }

    public String getCardName() {

        return cardName;
    }

    public void setCardName(String cardName) {

        this.cardName = cardName;
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
*/

    public String getBankTransferTime() {

        return bankTransferTime;
    }

    public void setBankTransferTime(String bankTransferTime) {

        this.bankTransferTime = bankTransferTime;
    }
/*

    public String getSchoolTransferFlow() {

        return schoolTransferFlow;
    }

    public void setSchoolTransferFlow(String schoolTransferFlow) {

        this.schoolTransferFlow = schoolTransferFlow;
    }

    public String getSchoolTransferTime() {

        return schoolTransferTime;
    }

    public void setSchoolTransferTime(String schoolTransferTime) {

        this.schoolTransferTime = schoolTransferTime;
    }
*/

    public String getTransferMoney() {

        return transferMoney;
    }

    public void setTransferMoney(String transferMoney) {

        this.transferMoney = transferMoney;
    }
}
