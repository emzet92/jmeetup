package io.jmeetup.group.infrastructure;

import io.jmeetup.group.domain.publish.MeetupGroup;
import io.jmeetup.group.domain.publish.GroupId;
import io.jmeetup.group.domain.publish.GroupName;
import io.jmeetup.group.domain.requires.GroupRepository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryGroupRepository implements GroupRepository {
    private final Map<GroupId, MeetupGroup> storage = new ConcurrentHashMap<>();

    @Override
    public void save(MeetupGroup meetupGroup) {
        storage.putIfAbsent(meetupGroup.getGroupId(), meetupGroup);
    }

    @Override
    public Optional<MeetupGroup> find(GroupId groupId) {
        return Optional.ofNullable(storage.get(groupId));
    }

    @Override
    public boolean exist(GroupName groupName) {
        return storage.values().stream().anyMatch(meetupGroup -> meetupGroup.getGroupName().equals(groupName));
    }
}
