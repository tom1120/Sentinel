package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhaoyipc
 * @company QLONG
 * @date 2022-11-05 12:39
 */
@Component
public class RuleNacosProvider {
    @Autowired
    private ConfigService configService;

    public String getRules(String dataId, String app) throws Exception {
        // 将服务名称设置为GroupId
        return configService.getConfig(dataId, app, 3000);
    }
}
