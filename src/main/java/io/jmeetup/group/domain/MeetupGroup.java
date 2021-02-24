package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publishedlanguage.GroupId;
import io.jmeetup.group.domain.publishedlanguage.GroupName;
import io.jmeetup.group.domain.publishedlanguage.MeetupGroupSnapshot;
import io.jmeetup.group.domain.publishedlanguage.NewGroup;

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

    public MeetupGroupSnapshot toSnapshot(){
        return MeetupGroupSnapshot.builder()
                .groupId(groupId.getId())
                .groupName(groupName.getGroupName())
                .build();
    }
}
