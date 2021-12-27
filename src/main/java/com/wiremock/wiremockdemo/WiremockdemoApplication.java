package com.wiremock.wiremockdemo;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.contract.wiremock.WireMockSpring;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class WiremockdemoApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(WiremockdemoApplication.class, args);
  }

  @Bean
  public Options wireMockOptions() throws IOException {

    final WireMockConfiguration options = WireMockSpring.options();
    options.port(8080);
    WireMockServer wireMockServer = new WireMockServer();
    wireMockServer.start();

    return options;
  }

}
