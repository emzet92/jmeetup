package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publish.NewGroup;
import io.jmeetup.group.domain.publish.NewMember;
import lombok.Value;

import java.util.UUID;

@Value(staticConstructor = "of")
class GroupId implements io.jmeetup.group.domain.publish.GroupId {
    private final String id;

    public static GroupId create() {
        return new GroupId(UUID.randomUUID().toString());
    }

    public static io.jmeetup.group.domain.publish.GroupId from(NewMember createdGroup) {
        return of(createdGroup.getGroupId());
    }

    public static io.jmeetup.group.domain.publish.GroupId from(NewGroup request) {
        return null;
    }
}
