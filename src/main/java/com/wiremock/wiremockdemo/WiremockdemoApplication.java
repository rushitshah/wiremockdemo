package com.wiremock.wiremockdemo;


import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class WiremockdemoApplication {

  public static void main(String[] args) {

    WireMockServer wireMockServer = new WireMockServer(options().port(8080));
    wireMockServer.start();

  }

}
