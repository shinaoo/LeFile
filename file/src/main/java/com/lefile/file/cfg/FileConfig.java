package com.lefile.file.cfg;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@Configuration
public class FileConfig {

    @Bean
    public MultipartConfigElement multipartConfigFactory(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofMegabytes(10L));
        factory.setMaxRequestSize(DataSize.ofMegabytes(200L));
        return factory.createMultipartConfig();
    }
}
