package io.jmeetup.group.domain

import io.jmeetup.group.domain.publish.NewGroup
import spock.lang.Specification

class GroupManagementApiTest extends Specification implements GroupApiTestConfiguration {
    def "should create new group"() {
        when:
        def createdGroup = groupApi.create(NewGroup.builder().groupName("new group").build())


        then:
        createdGroup.valid
        createdGroup.message().isEmpty()
    }

    def "cannot create new group if already exists"() {
        given:
        groupApi.create(NewGroup.builder().groupName("new group").build())

        when:
        def tryToCreate = groupApi.create(NewGroup.builder().groupName("new group").build())

        then:
        !tryToCreate.valid
    }
}

