package io.jmeetup.group.domain.requires;



import io.jmeetup.group.domain.publish.MeetupGroup;
import io.jmeetup.group.domain.publish.GroupId;
import io.jmeetup.group.domain.publish.GroupName;

import java.util.Optional;

public interface GroupRepository {
    void save(MeetupGroup meetupGroup);
    Optional<MeetupGroup> find(GroupId groupId);
    boolean exist(GroupName groupName);
}
