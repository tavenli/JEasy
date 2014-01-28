package com.pilicat.jeasy.plugin;

/**
 * 插件接口，所有的插件需实现该接口
 * 
 * @author Taven.Li
 *
 */
public interface IAppPlugin {

	/**
	 * 实现插件的安装和初始化逻辑
	 * 
	 * @return
	 * @throws Exception
	 */
	boolean install() throws Exception;
	
	/**
	 * 实现插件的卸载逻辑，包括卸载需要删除的配置和数据等逻辑
	 * 
	 * @return
	 * @throws Exception
	 */
	boolean uninstall() throws Exception;
	
	/**
	 * 启动插件
	 * 
	 * @return
	 * @throws Exception
	 */
	boolean start() throws Exception;
	
	/**
	 * 停止插件，要卸载前必须先停止插件
	 * 
	 * @return
	 * @throws Exception
	 */
	boolean stop() throws Exception;
	
	/**
	 * 返回当前插件的可使用状态
	 * 
	 * @return
	 */
	PluginStatus status();
	
}
