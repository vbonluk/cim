package com.crossoverjie.cim.route.vo.req;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class AddGroupMemberReqVo extends BaseGroupReqVO{

    @Override
    public String toString() {
        return "AddGroupMemberReqVo{" +
                "chatGroupId='" + this.getChatGroupId() + '\'' +
                ", userId=" + this.getUserId() +
                '}';
    }
}
