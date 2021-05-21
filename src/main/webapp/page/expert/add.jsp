<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>添加专家用户信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${ctx}/public/css/font.css">
    <link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/public/js/xadmin.js"></script>
    <script type="text/javascript" src="src/main/webapp/public/My97DatePicker/calendar.js"></script>
    <script type="text/javascript" src="src/main/webapp/public/My97DatePicker/WdatePicker.js"></script>

    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="x-body">
        <form class="layui-form" method="POST" id="expertForm"  action="${ctx}/expert/add">
        <input type="hidden" name="id" id="id" value="${expert.id }" >
        
        <c:if test="${user_session.level=='1'}">
        	<input type="hidden" name="userId" id="userId" value="${user_session.id }" >
        </c:if>
        
        <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>用户id
              </label>
              <div class="layui-input-inline">
                  <select id="userId" name="userId" class="valid" >
                    <c:forEach items="${requestScope.user_list}" var="line" varStatus="stat">
                    <option value="${line.id}" <c:if test="${expert.userId == line.id }">selected</c:if>>${line.username}</option>
                    </c:forEach>
                  </select>
              </div>
          </div>
        
          <div class="layui-form-item" >
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="name" name="name" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.name }">
              </div>
             
          </div>
          <div class="layui-form-item" >
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>身份证号码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="cardNumber" name="cardNumber" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.cardNumber }">
              </div>
          </div>
           <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>性别
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sex" name="sex" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.sex }">
              </div>
          </div>
           <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>类别
              </label>
             
              <div class="layui-input-inline">
                  <select id="categoryId" name="categoryId" class="valid" >
                    <c:forEach items="${requestScope.category_list}" var="line" varStatus="stat">
                    <option value="${line.id}" <c:if test="${expert.userId == line.id }">selected</c:if>>${line.name}</option>
                    </c:forEach>
                  </select>
              </div>
          </div>
           <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>出生日期
              </label>
              <div class="layui-input-inline">
              	<input class="Wdate" onFocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyyMMdd HH:mm:ss'})"  type="date"  name="birthday" value="${expert.birthday}" />
			  </div>
              
          </div>
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>所在单位代码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="workCode" name="workCode" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.workCode }">
              </div>
          </div>
          
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>专业学科
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="professionalDiscipline" name="professionalDiscipline" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.professionalDiscipline }">
              </div>
          </div>
          
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>最后学历
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="finalEducation" name="finalEducation" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.finalEducation }">
              </div>
          </div>
          
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>最高学位
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="highestDegree" name="highestDegree" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.highestDegree }">
              </div>
          </div>
          
                    <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>通讯地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="postalAddress" name="postalAddress" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.postalAddress }">
              </div>
          </div>
          
                    <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>邮件编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="postalCode" name="postalCode" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.postalCode }">
              </div>
          </div>
          
                    <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>手机号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="tel" name="tel" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.tel }">
              </div>
          </div>
          
                    <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>民族
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="nation" name="nation" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.nation }">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>联系地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="political" name="political" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.political }">
              </div>
          </div>
  			<div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>备注个人说明
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="remark" name="remark" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${expert.remark }">
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

            var id = document.getElementById("id").value;
            console.log(id);
            if (id === null || id === '') {
                layer.alert("增加成功", {icon: 6},function () {
            	document.getElementById('expertForm').submit();
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            } else{
                layer.alert("修改成功", {icon: 6},function () {
            	document.getElementById('expertForm').submit();
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
               
            });
            }
            console.log(data);
            //发异步，把数据提交给php
            return false;
          });
          
          
        });
    </script>
    
  </body>

</html>