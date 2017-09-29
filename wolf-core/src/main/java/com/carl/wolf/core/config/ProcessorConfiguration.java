/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.carl.wolf.core.config;

import com.carl.wolf.core.listener.ModuleScanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 处理器配置
 *
 * @author Carl
 * @date 2017/9/16
 * @since 1.0.0
 */
@Configuration
public class ProcessorConfiguration {
    @Bean
    protected ModuleScanProcessor moduleScan() {
        return new ModuleScanProcessor();
    }
}
