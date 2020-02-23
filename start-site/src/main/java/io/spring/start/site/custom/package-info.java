package io.spring.start.site.custom;
/**
 * 自定义公司的项目结构<br>
 * 1.带有checkstyle(格式化），spotbug（bug检查）,jacoco（代码覆盖率），pmd（最佳实践）；<br>
 * 2.pom.xml中的build.xml带有checkstyle,spotbug,jacoco的配置<br>
 * 3.支持多模块项目,依赖管理在父pom.xml文件中<br>
 * 4.mybatis支持多种:mybatisplus文件；<br>
 * 5.支持公司公共组件；<br>
 * 5.支持样例文件:mybatis配置，swagger配置，uc配置，DataSource配置，web cors, validate配置；<br>
 * 
 * 扩展功能：通过事件机制完成<br>
 * 1.支持git，自动在git上创建项目；<br>
 * 2.支持Apollo，自动在apollo上配置项目id，数据源配置，uc配置等；<br>
 * 3.支持cmdb，自动在cmdb上配置appid信息<br>
 */
