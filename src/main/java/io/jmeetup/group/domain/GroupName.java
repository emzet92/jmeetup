package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publish.NewGroup;
import lombok.Value;

@Value(staticConstructor = "of")
class GroupName implements io.jmeetup.group.domain.publish.GroupName {
    private final String groupName;

    public static GroupName from(NewGroup newGroup) {
        return of(newGroup.getGroupName());
    }


}
