package io.github.kuyer.config.web;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.kuyer.common.Constants;

/**
 * 配置中心首页
 * @author rory.zhang
 */
@Controller
public class ConfigWeb implements ErrorController {
	
	/**
	 * 配置中心首页界面
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "config/config-index";
	}
	
	/**
	 * 错误界面
	 * @return
	 */
	@RequestMapping(value=Constants.PAGE_ERROR_PATH)
	public String error() {
		return "config/config-error";
	}

	@Override
	public String getErrorPath() {
		return Constants.PAGE_ERROR_PATH;
	}

}
