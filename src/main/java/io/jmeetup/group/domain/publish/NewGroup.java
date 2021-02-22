package io.jmeetup.group.domain.publish;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class NewGroup {
    String groupName;
}
