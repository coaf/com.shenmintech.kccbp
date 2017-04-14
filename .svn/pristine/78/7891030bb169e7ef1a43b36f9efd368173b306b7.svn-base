package com.shenmintech.cbp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import lombok.extern.slf4j.Slf4j;

/**
 * 使用@WebListener注解，实现ServletContextListener接口
 *
 * @author max
 */
@Slf4j
@WebListener
public class MyServletContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    log.info("ServletContex初始化");
    log.info(sce.getServletContext().getServerInfo());
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    log.info("ServletContex销毁");
  }

}
