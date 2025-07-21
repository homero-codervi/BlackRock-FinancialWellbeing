package com.blk.auto_ahorro.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/blackrock/challenge/v1/")
public class PerformanceController {

    private LocalDateTime appStartTime;

    @PostConstruct
    public void init() {
        appStartTime = LocalDateTime.now();
    }

    @GetMapping("/performance")
    public Map<String, Object> getPerformance() {
        LocalDateTime now = LocalDateTime.now();
        Duration uptime = Duration.between(appStartTime, now);

        long hours = uptime.toHours();
        long minutes = uptime.toMinutesPart();
        long seconds = uptime.toSecondsPart();
        long millis = uptime.toMillisPart();

        // Format as "yyyy-MM-dd HH:mm:ss.SS"
        String baseDate = appStartTime.toLocalDate().toString();
        String formatted = String.format("%s %02d:%02d:%02d.%02d",
                baseDate, hours, minutes, seconds, millis / 10);

        // Memory in KB
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long memoryUsedKb = memoryBean.getHeapMemoryUsage().getUsed() / 1024;

        // Thread count
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        int threadCount = threadBean.getThreadCount();

        Map<String, Object> result = new HashMap<>();
        result.put("time", formatted);
        result.put("memory", memoryUsedKb);
        result.put("threads", threadCount);

        return result;
    }

}
