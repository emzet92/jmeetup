package io.jmeetup.group.domain.ports.outgoing.api;

import lombok.Builder;

@Builder
public class NewGroup {
    private final String groupName;
}
