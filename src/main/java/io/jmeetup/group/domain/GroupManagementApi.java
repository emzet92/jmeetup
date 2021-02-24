package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publishedlanguage.NewGroup;
import io.jmeetup.group.domain.publishedlanguage.GroupResult;
import io.jmeetup.group.domain.publishedlanguage.NewMember;

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
