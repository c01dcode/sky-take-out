package com.sky.config;

import com.sky.properties.AliOssProperties;
import com.sky.utils.AliOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 读取配置信息注入阿里云OSS工具类对象
 */
@Configuration
@Slf4j
public class OssConfiguration {
    @Bean
    public AliOssUtil aliOssUtil(AliOssProperties aliOssProperties){
        log.info("开始创建阿里云OSS工具类{}",aliOssProperties);
        return new AliOssUtil(aliOssProperties.getEndpoint(),aliOssProperties.getAccessKeyId(),aliOssProperties.getAccessKeySecret(),aliOssProperties.getBucketName());
    }
}
