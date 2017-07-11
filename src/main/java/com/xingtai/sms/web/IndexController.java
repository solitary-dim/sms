package com.xingtai.sms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.xingtai.sms.web.WebForwardConstants.FWD_LOGIN;
import static com.xingtai.sms.web.WebURIConstants.URI_INDEX;

/**
 * Created with IntelliJ IDEA.
 * User: solitary.wang
 * Date: 2017/7/11
 * Time: 9:27
 */
@Controller
public class IndexController {

    @RequestMapping(value = URI_INDEX)
    @ResponseBody
    public String index() {
        return FWD_LOGIN;
    }
}
