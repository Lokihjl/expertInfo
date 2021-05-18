<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>专家库信息管理平台</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="${ctx}/public/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
	<link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="${ctx}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>

</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="./index.html">专家库信息管理平台</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${user_session.username}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a href="./logout?username=${user_session.username}">退出</a></dd>
            </dl>
          </li>
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
        <c:if test="${user_session.level=='0'}">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>用户管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/user/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>用户列表</cite>
                        </a>
                    </li >
                  
                        <li>
                            <a _href="${ctx }/user/add">
                                <i class="iconfont">&#xe6a7;</i>
                                <cite>添加用户</cite>
                            </a>
                        </li>
                   
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>专家与用户的信息维护</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/employee/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>专家与用户的信息列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${ctx }/employee/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加专家与用户的信息</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>专家类别维护</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/category/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>专家类别列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${ctx }/category/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加专家类别</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>公告管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/notice/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>公告查询</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${ctx }/notice/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>添加公告</cite>
                        </a>
                    </li >
                   
                   
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>下载中心</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/document/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>文档查询</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${ctx }/document/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>上传文档</cite>
                        </a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>聊天室</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/chat/chat">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>聊天</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </c:if>
        
         <c:if test="${user_session.level=='1'}">
         	<li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>专家信息</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/notice/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>专家信息查询</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${ctx }/notice/add">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>修改专家信息</cite>
                        </a>
                    </li >
                   
                   
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>个人信息管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/notice/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>个人信息查询</cite>
                        </a>
                    </li >                 
                   
                </ul>
            </li>
         
         </c:if>
         
         <c:if test="${user_session.level=='2'}">
         
         <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>专家信息</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/notice/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>专家信息查询</cite>
                        </a>
                    </li >                 
                   
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>个人信息管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${ctx }/notice/list?pageNum=1&pageSize=6">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>个人信息查询</cite>
                        </a>
                    </li >
                   
                </ul>
            </li>
         </c:if>
        
            

            
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='${ctx}/welcome' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2021 v2.0 All Rights Reserved </div>
    </div>
    <!-- 底部结束 -->
 
</body>
</html>