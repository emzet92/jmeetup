package io.jmeetup.group.domain.publishedlanguage;

import lombok.Value;

import java.util.UUID;

@Value(staticConstructor = "of")
public class GroupId{
    private final String id;

    public static GroupId create() {
        return new GroupId(UUID.randomUUID().toString());
    }

    public static io.jmeetup.group.domain.publishedlanguage.GroupId from(NewMember createdGroup) {
        return of(createdGroup.getGroupId());
    }

    public static io.jmeetup.group.domain.publishedlanguage.GroupId from(NewGroup request) {
        return null;
    }
}
