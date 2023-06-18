package dev.be.async.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class AsyncConfig {
    // 이 프로젝트에서 Async 하게 동작할 수 있도록 어노테이션 선언
}
