package io.jmeetup.group.domain.requires;



import io.jmeetup.group.domain.publishedlanguage.GroupId;
import io.jmeetup.group.domain.publishedlanguage.GroupName;
import io.jmeetup.group.domain.publishedlanguage.MeetupGroupSnapshot;

import java.util.Optional;

public interface GroupRepository {
    void save(MeetupGroupSnapshot meetupGroupSnapshot);
    Optional<MeetupGroupSnapshot> find(GroupId groupId);
    boolean exist(GroupName groupName);
}
