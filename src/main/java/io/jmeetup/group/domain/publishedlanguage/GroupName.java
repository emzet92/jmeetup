package io.jmeetup.group.domain.publishedlanguage;

import lombok.Value;

@Value(staticConstructor = "of")
public class GroupName {
    private final String groupName;

    public static GroupName from(NewGroup newGroup) {
        return of(newGroup.getGroupName());
    }


}
