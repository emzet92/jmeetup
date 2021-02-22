package io.jmeetup.group.infrastructure;

import io.jmeetup.group.domain.publish.GroupSnapshot;
import io.jmeetup.group.domain.publish.GroupId;
import io.jmeetup.group.domain.publish.GroupName;
import io.jmeetup.group.domain.requires.GroupRepository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryGroupRepository implements GroupRepository {
    private final Map<GroupId, GroupSnapshot> storage = new ConcurrentHashMap<>();

    @Override
    public void save(GroupSnapshot groupSnapshot) {
        storage.putIfAbsent(groupSnapshot.getGroupId(), groupSnapshot);
    }

    @Override
    public Optional<GroupSnapshot> find(GroupId groupId) {
        return Optional.ofNullable(storage.get(groupId));
    }

    @Override
    public boolean exist(GroupName groupName) {
        return storage.values().stream().anyMatch(groupSnapshot -> groupSnapshot.getGroupName().equals(groupName));
    }
}
