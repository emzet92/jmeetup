package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publish.NewGroup;
import io.jmeetup.group.domain.publish.GroupResult;
import io.jmeetup.group.domain.publish.NewMember;

public class GroupManagementApi {
    private final GroupService groupService;

    public GroupManagementApi(GroupService groupService) {
        this.groupService = groupService;
    }

    public GroupResult create(NewGroup newGroup) {
        return groupService.create(newGroup);
    }

    public GroupResult add(NewMember newMember) {

        return null;
    }
}
