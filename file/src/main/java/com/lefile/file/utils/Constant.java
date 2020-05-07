package com.lefile.file.utils;

import org.springframework.beans.factory.annotation.Value;

public class Constant {

    @Value("${path.root}")
    public static String FileRootPath;

    @Value("${server.baseurl}")
    public static String ServerBaseUrl;

}
