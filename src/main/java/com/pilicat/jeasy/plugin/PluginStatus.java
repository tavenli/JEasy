package com.pilicat.jeasy.plugin;

/**
 * 插件的状态
 * 
 * @author Taven.Li
 *
 */
public enum PluginStatus {

	/**
	 * 插件已加载，并启动
	 */
	Started,	
	/**
	 * 插件已停止
	 */
	Stoped,	
	/**
	 * 插件准备就绪，等待启动
	 */
	Ready
	
}
