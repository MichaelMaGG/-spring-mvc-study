# auto

`mvn-project`

GroupId `com.ziroom.tech.cat.sample`

ArtifactId  `cat-sample`

Version `1.0.0-SNAPSHOT`

项目接入CAT：
1.pom.xml文件中引入CAT client
	<dependency>
		<groupId>com.dianping.cat</groupId>
		<artifactId>cat-client</artifactId>
		<version>4.0.0</version>
	</dependency>
2.web.xml中添加CAT filter
    <filter>
        <filter-name>cat-filter</filter-name>
        <filter-class>com.dianping.cat.servlet.CatFilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>cat-filter</filter-name>
        <url-pattern>/*</url-pattern>
        <dispatcher>REQUEST</dispatcher>
        <dispatcher>FORWARD</dispatcher>
    </filter-mapping>
3.配置domain
	<config mode="client">
         <domain id="example-web"/>
     </config>
4./data/appdatas/cat/目录下，新建一个client.xml文件
      <config mode="client">
          <servers>
             <server ip="192.168.213.115" port="2280" />
         </servers>
      </config>
 

 