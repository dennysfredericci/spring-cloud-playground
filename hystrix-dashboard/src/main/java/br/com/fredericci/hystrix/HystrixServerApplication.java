package br.com.fredericci.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixServerApplication.class, args);
    }

}
