package com.woody.controller;

import com.woody.util.IPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class IndexController {

    Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("")
    public String index(HttpServletRequest request) throws Exception {

        //hello

//        Enumeration<String> names = request.getHeaderNames();
//        for(Enumeration e=names;e.hasMoreElements();){
//            String hname = e.nextElement().toString();
//            String h = request.getHeader(hname);
//            log.info(hname+":"+h);
//        }
//        return "redirect:/index.html";
        String ip = IPUtil.getRealIp(request);
//        request.setAttribute("IP", "IP:"+ip);
//        log.info(ip);
//        log.info(IPUtil.getMACAddress(IPUtil.getRealIp(request)));

//        String agent=request.getHeader("User-Agent");
//        //解析agent字符串
//        UserAgent userAgent = UserAgent.parseUserAgentString(agent);
//        //获取浏览器对象
//        Browser browser = userAgent.getBrowser();
//        //获取操作系统对象
//        OperatingSystem operatingSystem = userAgent.getOperatingSystem();
//        System.out.println("浏览器名:"+browser.getName());
//        System.out.println("浏览器类型:"+browser.getBrowserType());
//        System.out.println("浏览器家族:"+browser.getGroup());
//        System.out.println("浏览器生产厂商:"+browser.getManufacturer());
//        System.out.println("浏览器使用的渲染引擎:"+browser.getRenderingEngine());
//        System.out.println("浏览器版本:"+userAgent.getBrowserVersion());
//
//        System.out.println("操作系统名:"+operatingSystem.getName());
//        System.out.println("访问设备类型:"+operatingSystem.getDeviceType());
//        System.out.println("操作系统家族:"+operatingSystem.getGroup());
//        System.out.println("操作系统生产厂商:"+operatingSystem.getManufacturer());

        return "index";
    }

}
