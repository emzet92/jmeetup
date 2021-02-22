package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publish.GroupResult;
import io.jmeetup.group.domain.publish.NewGroup;
import io.jmeetup.group.domain.requires.GroupRepository;

import static io.jmeetup.group.domain.publish.GroupResult.*;

class GroupService {
    private final GroupRepository groupRepository;

    GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public GroupResult create(NewGroup request) {
        boolean exist = groupRepository.exist(GroupName.from(request));

        if (exist) {
            return Failure.emptyMessage();
        }

        groupRepository.save(Group.from(request).toSnapshot());
        return Success.emptyMessage();
    }
}
