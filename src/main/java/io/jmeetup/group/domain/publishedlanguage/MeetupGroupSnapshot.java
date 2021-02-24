package io.jmeetup.group.domain.publishedlanguage;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class MeetupGroupSnapshot {
    String groupId;
    String groupName;
    int membersLimit;
}
