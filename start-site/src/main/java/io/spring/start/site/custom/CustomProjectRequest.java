package io.spring.start.site.custom;

import java.util.List;

import io.spring.initializr.web.project.WebProjectRequest;

public class CustomProjectRequest extends WebProjectRequest {
	/**
	 * 是否多模块
	 */
	private Boolean multiModule;
	/**
	 * 代码质量的选择
	 */
	private List<CodeQuantityEnum> codeQuantities;

}
