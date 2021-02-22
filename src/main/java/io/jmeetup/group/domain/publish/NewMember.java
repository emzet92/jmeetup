package io.jmeetup.group.domain.publish;

import lombok.Value;

@Value(staticConstructor = "of")
public class NewMember {
    private final String groupId;
    private final String memberId;
}
