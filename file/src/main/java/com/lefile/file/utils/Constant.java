package com.lefile.file.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value={"classpath:/application.properties"})
public class Constant {

    @Value("${path.root}")
    public static String FileRootPath;

    @Value("${server.baseurl}")
    public static String ServerBaseUrl;

}
