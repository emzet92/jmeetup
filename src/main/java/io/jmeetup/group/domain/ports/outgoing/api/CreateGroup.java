package io.jmeetup.group.domain.ports.outgoing.api;

public class CreateGroup {
    private final String groupName;

    public CreateGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
