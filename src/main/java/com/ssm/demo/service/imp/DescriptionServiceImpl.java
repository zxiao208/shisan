package com.ssm.demo.service.imp;

import com.ssm.demo.dao.DescriptionDao;
import com.ssm.demo.entity.Description;
import com.ssm.demo.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@Service注解一定不能忘记
@Service("descriptionService")
public class DescriptionServiceImpl implements DescriptionService{
        @Autowired
        private DescriptionDao descriptionDao;

        @Override
        public Description getLastDescription() {
            return descriptionDao.getLastDescription();
        }
}
