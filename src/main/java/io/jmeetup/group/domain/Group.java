package io.jmeetup.group.domain;

class Group implements io.jmeetup.group.domain.ports.outgoing.api.Group {
    private final GroupId groupId;
    private final GroupName groupName;

    Group(GroupId groupId, GroupName groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

}
