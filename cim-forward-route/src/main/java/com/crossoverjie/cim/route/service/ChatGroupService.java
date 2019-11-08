package com.crossoverjie.cim.route.service;

import java.util.List;

/**
 * Function: 群组服务
 * 参考腾讯IM云，群，公开方法
 * 只做群核心功能
 * 不做非群功能外的关系链（如群资料，群名片，副管理员等）
 * 非核心、外部功能依靠外部程序保障。
 *
 * @author georgeYang
 * Date: 2019/11/01 21:57
 * @since JDK 1.8
 */
public interface ChatGroupService {
    /**
     * 创建群聊(群，也是用户)
     *
     * @param chatGroupName
     * @param adminUserId
     * @param userIds
     * @return 返回群id
     */
    Long createChatGroup(String chatGroupName, Long adminUserId, List<Long> userIds) throws Exception;

    /**
     * 判断群聊是否存在，群聊id和用户id一样生成。
     *
     * @param chatGroupId
     * @return
     */
    boolean isChatGroupExist(Long chatGroupId);

    /**
     * 获取群成员列表。
     *
     * @param chatGroupId
     * @return
     */
    List<Long> getGroupMemberList(Long chatGroupId);

    /**
     * 添加群成员、加入群聊
     *
     * @param chatGroupId
     * @return
     */
    boolean addGroupMember(Long chatGroupId, Long userId);

    /**
     * 成员是否是群主
     *
     * @param chatGroupId
     * @param userId
     * @return
     */
    boolean isGroupAdmin(Long chatGroupId, Long userId);

    /**
     * 移除群成员、退出群聊
     *
     * @param chatGroupId
     * @param userId
     * @return
     */
    boolean deleteGroupMember(Long chatGroupId, Long userId);

    /**
     * 查询群是否存在该用户
     *
     * @param chatGroupId
     * @param userId
     * @return
     */
    boolean isGroupMemberExist(Long chatGroupId, Long userId);

    /**
     * 解散群
     *
     * @param chatGroupId
     * @return
     */
    boolean dismissGroup(Long chatGroupId);

    /**
     * 向群发消息
     *
     * @param chatGroupId
     * @param message
     * @return 马上收到消息的总人数
     */
    Integer sendGroupMessage(Long chatGroupId, String message);
}