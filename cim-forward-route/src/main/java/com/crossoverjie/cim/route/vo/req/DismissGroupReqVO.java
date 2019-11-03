package com.crossoverjie.cim.route.vo.req;

public class DismissGroupReqVO extends BaseGroupReqVO {

    @Override
    public String toString() {
        return "DismissGroupReqVO{" +
                "chatGroupId='" + this.getChatGroupId() + '\'' +
                ", userId=" + this.getUserId() +
                '}';
    }
}
