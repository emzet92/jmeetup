package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publish.NewGroup;

import java.util.ArrayList;
import java.util.List;

class MeetupGroup {
    private final GroupId groupId;
    private final GroupName groupName;
    private final List<GroupMember> groupMembers = new ArrayList<>();

    static MeetupGroup from(NewGroup request) {
        return new MeetupGroup(GroupId.create(), GroupName.from(request));
    }

    MeetupGroup(GroupId groupId, GroupName groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public void add(GroupMember groupMember){

    }

    public io.jmeetup.group.domain.publish.MeetupGroup toSnapshot(){
        return io.jmeetup.group.domain.publish.MeetupGroup.builder()
                .groupId(groupId)
                .groupName(groupName)
                .build();
    }
}
