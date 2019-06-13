### 一个简单的前后端分离Demo

主要功能：登录后跳转到书籍管理页面，能够对书籍信息进行增删改查。

![images-README\image1](images-README\image1.png)

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
