package loclhost.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import loclhost.model.RequestBean;
import loclhost.model.ResponseBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LadyLady on 2018-10-19.
 */
@Api(value = "接收请求接口",tags = "接收请求接口")
@RestController

public class AppServer {

    @ApiOperation(value = "API接口",notes = "Json格式数据，Post方式")
    @PostMapping("API")
    public ResponseBean transfer(@RequestBody RequestBean requestBean) {

        return null;

    }

/*    @ApiOperation("卡挂失")
    @PostMapping("lossCard")
    public ResponseBean lossCard(@RequestBody RequestBean requestBean) {

        return null;

    }

    @ApiOperation("身份验证")
    @PostMapping("validation")
    public ResponseBean validation(@RequestBody RequestBean requestBean) {

        return null;
    }

    @ApiOperation("修改密码")
    @PostMapping("modifyPassword")
    public ResponseBean modifyPassword(@RequestBody RequestBean requestBean) {

        return null;

    }

    @ApiOperation("查询卡信息")
    @PostMapping("queryCardUserInfo")
    public ResponseBean queryCardUserInfo(@RequestBody RequestBean requestBean) {

        return null;
    }

    @ApiOperation("查询卡流水")
    @PostMapping("queryTransferFlow")
    public ResponseBean queryTransferFlow(@RequestBody RequestBean requestBean) {

        return null;
    }*/
}
