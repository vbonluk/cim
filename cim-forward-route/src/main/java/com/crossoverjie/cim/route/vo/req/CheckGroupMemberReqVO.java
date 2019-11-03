package com.crossoverjie.cim.route.vo.req;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class CheckGroupMemberReqVO extends BaseGroupReqVO{

    @Override
    public String toString() {
        return "CheckGroupMemberReqVO{" +
                "chatGroupId='" + this.getChatGroupId() + '\'' +
                ", userId=" + this.getUserId() +
                '}';
    }

}
