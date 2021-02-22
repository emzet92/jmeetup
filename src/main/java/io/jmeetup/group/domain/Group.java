package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publish.GroupSnapshot;
import io.jmeetup.group.domain.publish.NewGroup;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final GroupId groupId;
    private final GroupName groupName;
    private final List<GroupMember> groupMembers = new ArrayList<>();

    static Group from(NewGroup request) {
        return new Group(GroupId.create(), GroupName.from(request));
    }

    Group(GroupId groupId, GroupName groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public void add(GroupMember groupMember){

    }

    public GroupSnapshot toSnapshot(){
        return GroupSnapshot.builder()
                .groupId(groupId)
                .groupName(groupName)
                .build();
    }
}
