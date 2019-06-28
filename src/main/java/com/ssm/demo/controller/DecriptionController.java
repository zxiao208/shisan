package com.ssm.demo.controller;

import com.ssm.demo.entity.Description;
import com.ssm.demo.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/description")
public class DecriptionController {
    @Autowired
    private DescriptionService descriptionService;

    /**
     * 信息
     */
    @RequestMapping("/infoByMV")
    public ModelAndView infoByMV() {
        Description description = descriptionService.getLastDescription();
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("description", description);
        return new ModelAndView("description", model);
    }

    /**
     * 信息
     */
    @RequestMapping("/infoByRequest")
    public String infoByRequest(HttpServletRequest request) {
        Description description = descriptionService.getLastDescription();
        request.setAttribute("description", description);
        return "description";
    }
}
