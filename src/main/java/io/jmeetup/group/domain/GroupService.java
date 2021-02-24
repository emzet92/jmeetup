package io.jmeetup.group.domain;

import io.jmeetup.group.domain.publishedlanguage.GroupName;
import io.jmeetup.group.domain.publishedlanguage.GroupResult;
import io.jmeetup.group.domain.publishedlanguage.NewGroup;
import io.jmeetup.group.domain.requires.GroupRepository;

import static io.jmeetup.group.domain.publishedlanguage.GroupResult.*;

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

        groupRepository.save(MeetupGroup.from(request).toSnapshot());
        return Success.emptyMessage();
    }
}
