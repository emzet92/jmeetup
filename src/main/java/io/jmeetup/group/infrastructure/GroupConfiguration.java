package io.jmeetup.group.infrastructure;

import io.jmeetup.group.domain.GroupApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GroupConfiguration {
    @Bean
    GroupApi groupApi(){
        return new GroupApi(new InMemoryGroupRepository());
    }
}
