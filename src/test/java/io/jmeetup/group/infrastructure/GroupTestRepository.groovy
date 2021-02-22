package io.jmeetup.group.infrastructure

trait GroupTestRepository {
    def repository() {
        new InMemoryGroupRepository()
    }
}
