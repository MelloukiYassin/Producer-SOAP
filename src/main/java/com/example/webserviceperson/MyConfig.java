package com.example.webserviceperson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {

    @Bean
    public SimpleJaxWsServiceExporter serviceExporter1(){
        SimpleJaxWsServiceExporter serviceExporter = new SimpleJaxWsServiceExporter();
        serviceExporter.setBaseAddress("http://0.0.0.0:8090/PersonWebServiceSoap");
        return serviceExporter;
    }


}
