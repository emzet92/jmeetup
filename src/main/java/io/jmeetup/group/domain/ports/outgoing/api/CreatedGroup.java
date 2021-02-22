package io.jmeetup.group.domain.ports.outgoing.api;

import lombok.Value;

@Value(staticConstructor = "of")
public class CreatedGroup {
    private final String id;
}
