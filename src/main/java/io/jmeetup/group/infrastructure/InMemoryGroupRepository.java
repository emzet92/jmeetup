package io.jmeetup.group.infrastructure;

import io.jmeetup.group.domain.ports.incoming.GroupRepository;
import io.jmeetup.group.domain.ports.outgoing.api.Group;
import io.jmeetup.group.domain.ports.outgoing.api.GroupId;

import java.util.Optional;

class InMemoryGroupRepository implements GroupRepository {
    @Override
    public void save(Group group) {

    }

    @Override
    public Optional<Group> find(GroupId groupId) {
        return Optional.empty();
    }
}
