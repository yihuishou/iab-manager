package loclhost.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by LadyLady on 2018-10-19.
 */
@ApiModel(value = "响应对象", description = "响应结果对象")
public class ResponseBean {

    @ApiModelProperty(value = "操作类型" + "\n必输项"+"\n共五种类型分别对应以下六种操作" + "\n圈存充值： transfer" + "\n身份认证： validation" + "\n圈存查询： queryTransfer" +"\n卡信息查询： queryCardInfo" + "\n卡密码修改： modifyPassword" + "\n卡挂失： lossCard",example = "transfer")
    String handleType;


    @ApiModelProperty(value = "数据集")
    List<Data> data;




/*

    @ApiModelProperty(value = "操作时间,格式：yyyy-MM-dd HH:mm:ss", example = "2018-10-20 12:38:42")
    String handleTime;
*/

    @ApiModelProperty(value = "响应消息：" + "\n成功：操作成功" + "\n失败：操作失败",example = "操作成功")
    String message;

    @ApiModelProperty(value = "响应代码：" + "\n成功：success" + "\n失败：fail",example = "success")
    String resultCode;

/*
    @ApiModelProperty("校园卡信息对象，卡信息查询操作时返回")
    CardInfo cardInfo;


    @ApiModelProperty("圈存流水信息集合，圈存查询操作时返回，无数据时返回空集合")
    List<TransferFlowInfo> transferFlowInfoList;
*/
    public String getHandleType() {

        return handleType;
    }

    public void setHandleType(String handleType) {

        this.handleType = handleType;
    }

    public List<Data> getData() {

        return data;
    }

    public void setData(List<Data> data) {

        this.data = data;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }

    public String getResultCode() {

        return resultCode;
    }

    public void setResultCode(String resultCode) {

        this.resultCode = resultCode;
    }

}
