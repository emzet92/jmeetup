package io.jmeetup.group.domain.requires;



import io.jmeetup.group.domain.publish.GroupSnapshot;
import io.jmeetup.group.domain.publish.GroupId;
import io.jmeetup.group.domain.publish.GroupName;

import java.util.Optional;

public interface GroupRepository {
    void save(GroupSnapshot groupSnapshot);
    Optional<GroupSnapshot> find(GroupId groupId);
    boolean exist(GroupName groupName);
}
