<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>专家专业水平（经历）</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
    <link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="x-body">
        <form class="layui-form" method="POST" id="experienceForm"  action="${ctx}/experience/add">
        <input type="hidden" name="id" id="id" value="${experience.id }" >
          <div class="layui-form-item">
              <label for="expertId" class="layui-form-label">
                  <span class="x-red">*</span>专家关联id
              </label>
              <div class="layui-input-inline">
                  <select id="expertId" name="expertId" class="valid" >
                    <c:forEach items="${requestScope.expert_list}" var="line" varStatus="stat">
                    <option value="${line.id}" <c:if test="${expert.expertId == line.id }">selected</c:if>>${line.name}</option>
                    </c:forEach>
                  </select>
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="startDate" class="layui-form-label">
                  <span class="x-red">*</span>开始年月
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="startDate" name="startDate" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.startDate }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="endDate" class="layui-form-label">
                  <span class="x-red">*</span>结束年月
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="endDate" name="endDate" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.endDate }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="work" class="layui-form-label">
                  <span class="x-red">*</span>学习或工作单位
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="work" name="work" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.work }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="education" class="layui-form-label">
                  <span class="x-red">*</span>学历
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="education" name="education" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.education }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="degree" class="layui-form-label">
                  <span class="x-red">*</span>学位
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="degree" name="degree" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.degree }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="position" class="layui-form-label">
                  <span class="x-red">*</span>职位
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="position" name="position" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.position }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="title" class="layui-form-label">
                  <span class="x-red">*</span>职称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="title" name="title" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.title }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>备注
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="remark" name="remark" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${experience.remark }">
              </div>
            
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <input type="submit" value=" 提交" class="layui-btn" lay-filter="add" lay-submit=""/>
                 
          </div>
      </form>
    </div>
    <script>
        layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
          //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });

          //监听提交
          form.on('submit(add)', function(data){
        	  
            console.log(data);
            var id = document.getElementById("id").value;
            console.log(id);
            if (id === null || id === '') {
                layer.alert("增加成功", {icon: 6},function () {
            	document.getElementById('experienceForm').submit();
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
               
            });
            } else{
                layer.alert("修改成功", {icon: 6},function () {
            	document.getElementById('experienceForm').submit();
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
               
            });
            }

            //发异步，把数据提交给php
            
            return false;
          });
          
          
        });
    </script>
    
  </body>

</html>