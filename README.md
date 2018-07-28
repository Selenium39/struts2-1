# struts2-1
```
1.搭建第一个Struts
  1.导jar包
  2.在web.xml中加入Filter(StrutsPrepareAndExecuteFilter)
  3.新建HelloAction并建立方法excute()
  4.建立struts配置文件(必须放在src目录下,并叫做struts.xml)
注意: servlet默认执行service方法,struts默认执行execute方法

2.Struts基本执行过程
    1.url
    2.StrutsPrepareAndExcuteFilter
        1.获取请求路径以及值
        2.到src中找到struts.xml文件,使用dom4j进行解析与action中的name的值是否匹配
 　　　　　然后通过class得到类的全路径,通过反射执行
         Class clazz=Class.forName(action class);
         Method method=clazz.getMethod("execute");
         method.invoke();
        3.得到方法的返回值,匹配result标签的name属性值

3.常用标签
          1.package标签: 类似于代码中的包,用于区分package
             1.name：随便写但是不能相同,与功能没有关系
             2.extends：值是固定的struts-default:让类具有Action功能
             3.namespace:与action中的name的值构成访问路径
          2.action标签:配置action访问路径
          　　１.name:与namespace构成访问路径,action中的name不能相同
              2.class:action路径
              3.method:让action中的多个方法执行
          3.result标签:根据action方法的返回值,配置到不同的路径去
              1.name:和方法的返回值一致
              2.type:如何到路径中去(请求转发或者重定向),默认为转发
                  1.默认值为转发:dispatcher
                  2.重定向:redirect
                  3.重定向到action:redirectAction
                  4.转发到action:chain
          4.修改struts默认常量
            1.方式一:<constant></constant>
            2.方式二:在src下创建struts.properties
            3.在web.xml中配置
          5.引入配置文件  
            <include file=""></include>  
4.action编写的三种方式
   1.创建普通类,不继承任何类和实现任何接口
   2.创建一个类,实现Action接口
   ３.创建一个类,继承ActionSupport
5.访问action的三种方式
    1.使用action标签中的method
    ２.使用通配符
    ３.动态的方法访问
6.结果页面配置
　　 1.全局结果页面
     <global-results>
     <result></result>
     </global-results>
　　 2.局部结果页面
     <result></result>
注意:当配置了全局结果页面又配置了局部结果页面以局部结果页面为准
7.获取表单提交数据
     原始方式获取
     1.使用ActionContext类
     2.使用ServletActionContext类
     3.使用接口注入方式 ServletReqeustAware
     struts获取表单数据:
     4.属性封装:1.定义成员变量2.为成员变量写set方法
     5.模型驱动封装:1.实现ModelDriven接口2.重写getModel方法
 注意:当属性封装和模型驱动封装不能同时封装一个表单属性，这样最后还是模型驱动封装

8.Servlet和Action区别:
Servlet只会创建一次,Action会创建多次

9.获取值栈对象
    1.使用ActionContext类
注意:1.每个Action中只有一个值栈
     2.ValueStack=root(List)+context(Map)
10.向值栈中放数据
　   1.获取值栈对象,调用set方法
     2.获取值栈对象,调用push方法
     ３.声明变量并创建get方法,在具体的执行方法中设置值
11.从值栈中获取数据(s标签库和ognl)
      1.<s:property value="xxx"></s:property>```
      
    
参考视频:https://www.bilibili.com/video/av13748042
