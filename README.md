### 一个简单的前后端分离Demo

主要功能：登录后跳转到书籍管理页面，能够对书籍信息进行增删改查。

![image1](https://github.com/kevinyang0304/kevinyang0304.github.io/blob/master/2019/06/10/%E4%B8%80%E4%B8%AA%E7%AE%80%E5%8D%95%E7%9A%84%E5%89%8D%E5%90%8E%E7%AB%AF%E5%88%86%E7%A6%BB%E9%A1%B9%E7%9B%AE/images/image1.png)

#### 1. 技术栈

后端：

> Spring Boot
> 
> Mybatis Plus
> 
> MySQL

前端：

> Vue
> 
> Axios
> 
> Element-UI

#### 2. 启动项目

##### 前端

进入项目目录后，命令行启动

```bash
npm run dev
```

##### 后端

数据库结构和数据在项目resources\db目录下，新建两个表并插入数据；

修改resources\application.yml中的数据库配置后即可启动；
