package io.jmeetup.group.domain

import io.jmeetup.group.domain.requires.GroupRepository
import io.jmeetup.group.infrastructure.GroupTestRepository
import io.jmeetup.group.infrastructure.InMemoryGroupRepository

trait GroupApiTestConfiguration extends GroupTestRepository{
    GroupManagementApi groupApi = new GroupManagementApi(new GroupService(repository()))
}