package io.jmeetup.group.infrastructure

import io.jmeetup.group.domain.ports.outgoing.api.CreatedGroup
import io.jmeetup.group.domain.ports.outgoing.api.NewGroup
import spock.lang.Specification

class GroupApiTest extends Specification {
    def "should create new group"() {
        given:
        def groupApi = new GroupConfiguration().groupApi()

        when:
        def createdGroup = groupApi.create(NewGroup.builder().groupName("new group").build())

        then:
        createdGroup.id != null
    }
}

