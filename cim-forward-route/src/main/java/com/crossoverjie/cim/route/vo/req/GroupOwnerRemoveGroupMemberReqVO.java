package com.crossoverjie.cim.route.vo.req;

public class GroupOwnerRemoveGroupMemberReqVO extends BaseGroupReqVO {
    private Long groupOwnerId;

    public Long getGroupOwnerId() {
        return groupOwnerId;
    }

    public void setGroupOwnerId(Long groupOwnerId) {
        this.groupOwnerId = groupOwnerId;
    }

    @Override
    public String toString() {
        return "GroupOwnerRemoveGroupMemberReqVO{" +
                "chatGroupId='" + this.getChatGroupId() + '\'' +
                ", userId=" + this.getUserId() + ", groupOwnerId=" + getGroupOwnerId() +
                '}';
    }
}
