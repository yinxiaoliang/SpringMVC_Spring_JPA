package com.integration.application.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
/**
 * 
 * 功能描述：
 * 参考：http://kevin19900306.iteye.com/blog/1397744
 * <p>
 * 版权所有：野狼团队
 * <p>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * 
 * @author DevinYang 新增日期：2015年6月19日
 * @author DevinYang 修改日期：2015年6月19日
 *
 */


public class DemoQtz{
	private static final Logger log = LoggerFactory.getLogger(QuartzJobBean.class);
	
	public void execute() {
		log.info("QProces task start....");
		log.info("定时任务执行中··························");
		log.info("QProces task end....");
	}

}
