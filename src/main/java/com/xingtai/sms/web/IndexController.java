package com.xingtai.sms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static com.xingtai.sms.web.WebForwardConstants.FWD_LOGIN;
import static com.xingtai.sms.web.WebURIConstants.URI_LOGIN;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created with IntelliJ IDEA.
 * User: solitary.wang
 * Date: 2017/7/11
 * Time: 9:27
 */
@Controller
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = URI_LOGIN, method = {GET})
    public ModelAndView loginPanel() {
        LOGGER.info("enter login panel!");
        return new ModelAndView(FWD_LOGIN);
    }
}
