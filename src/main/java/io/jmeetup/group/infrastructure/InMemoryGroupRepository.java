package io.jmeetup.group.infrastructure;

import io.jmeetup.group.domain.publishedlanguage.GroupId;
import io.jmeetup.group.domain.publishedlanguage.GroupName;
import io.jmeetup.group.domain.publishedlanguage.MeetupGroupSnapshot;
import io.jmeetup.group.domain.requires.GroupRepository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryGroupRepository implements GroupRepository {
    private final Map<GroupId, MeetupGroupSnapshot> storage = new ConcurrentHashMap<>();

    @Override
    public void save(MeetupGroupSnapshot meetupGroupSnapshot) {
        storage.putIfAbsent(GroupId.of(meetupGroupSnapshot.getGroupId()), meetupGroupSnapshot);
    }

    @Override
    public Optional<MeetupGroupSnapshot> find(GroupId groupId) {
        return Optional.ofNullable(storage.get(groupId));
    }

    @Override
    public boolean exist(GroupName groupName) {
        return storage.values().stream().anyMatch(meetupGroupSnapshot -> meetupGroupSnapshot.getGroupName().equals(groupName));
    }
}
