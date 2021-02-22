package io.jmeetup.group.domain;

import io.jmeetup.group.domain.ports.incoming.GroupRepository;
import io.jmeetup.group.domain.ports.outgoing.api.NewGroup;
import io.jmeetup.group.domain.ports.outgoing.api.CreatedGroup;

public class GroupApi {
    private final GroupRepository groupRepository;

    public GroupApi(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public CreatedGroup create(NewGroup request) {
        return null;
    }
}
