package com.crossoverjie.cim.route.vo.req;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class LeaveGroupMemberReqVO extends BaseGroupReqVO{

    @Override
    public String toString() {
        return "LeaveGroupMemberReqVO{" +
                "chatGroupId='" + this.getChatGroupId() + '\'' +
                ", userId=" + this.getUserId() +
                '}';
    }

}
