package io.jmeetup.group.domain;

import io.jmeetup.group.domain.ports.incoming.GroupRepository;
import io.jmeetup.group.domain.ports.outgoing.api.CreateGroup;
import io.jmeetup.group.domain.ports.outgoing.api.CreatedGroup;

public class GroupApi {
    private final GroupRepository groupRepository;

    public GroupApi(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    CreatedGroup createGroup(CreateGroup request) {
        return null;
    }
}
