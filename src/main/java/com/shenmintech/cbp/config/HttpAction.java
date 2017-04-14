package com.shenmintech.cbp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 行为流水接口配置类
 * 
 * @author max
 *
 */
@Data
@Component
@ConfigurationProperties(locations = "classpath:action-code.yml", prefix = "httpAction")
public class HttpAction {

  private CbpModule cbpModule;

  @Data
  public static class CbpModule {
    private String userCollectRecord;
    private String userPlayRecord;
    private String userLikeRecord;
    private String userHateRecord;
    private String userReadArticle;
    private String userCollectArticle;
  };

}
