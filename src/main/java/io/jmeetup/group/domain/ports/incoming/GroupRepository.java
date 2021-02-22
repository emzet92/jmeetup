package io.jmeetup.group.domain.ports.incoming;


import io.jmeetup.group.domain.ports.outgoing.api.Group;
import io.jmeetup.group.domain.ports.outgoing.api.GroupId;

import java.util.Optional;

public interface GroupRepository {
    void save(Group group);
    Optional<Group> find(GroupId groupId);
}
