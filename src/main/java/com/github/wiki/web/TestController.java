package com.github.wiki.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangwei on 17/8/30.
 */
@RestController
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public String getTestStr() {
        return "This is test string.";
    }
}
