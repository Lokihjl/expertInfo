<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>论文发表及专著出版情况</title>
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
        <form class="layui-form" method="POST" id="paperForm"  action="${ctx}/paper/add">
        <input type="hidden" name="id" id="id" value="${paper.id }" >
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>论文或著作名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="name" name="name" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.name }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
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
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>著作类别
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="type" name="type" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.type }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>刊物名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="publication" name="publication" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.publication }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>论论文时间
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="paperTime" name="paperTime" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.paperTime }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>卷
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="volume" name="volume" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.volume }">
              </div>
             
          </div>
          
                    <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>起始页码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="startPage" name="startPage" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.startPage }">
              </div>
             
          </div>
          
                    <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>止页
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="endPage" name="endPage" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.endPage }">
              </div>
             
          </div>
          
                    <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>著作时间
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="writeTime" name="writeTime" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.writeTime }">
              </div>
             
          </div>
          
                    <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>社地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="adress" name="adress" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.adress }">
              </div>
             
          </div>
          
                    <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>总共页数
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="total" name="total" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.total }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>排名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="ranking" name="ranking" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.ranking }">
              </div>
             
          </div>
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>详细信息
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="remark" name="remark" required="" lay-verify="required"
                  autocomplete="off" class="layui-input" value="${paper.remark }">
              </div>
            
          </div>
          <!--  <div class="layui-form-item">
            <label for="phone" class="layui-form-label">
                <span class="x-red">*</span>选择部门
            </label>
            <div class="layui-input-inline">
                <select id="paper_id" name="paperId" class="valid">
                  <c:forEach items="${requestScope.paper_list}" var="line" varStatus="stat">
                  <option value="${line.id}" <c:if test="${paper.paper_id == line.id }">selected</c:if>>${line.name}</option>
                  </c:forEach>
                </select>
            </div>         
        </div> -->

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
            //发异步，把数据提交给php
            var id = document.getElementById("id").value;
            console.log(id);
            if (id === null || id === '') {
                layer.alert("增加成功", {icon: 6},function () {
            	document.getElementById('paperForm').submit();
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
               
            });
            } else{
                layer.alert("修改成功", {icon: 6},function () {
            	document.getElementById('paperForm').submit();
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            }

           
            return false;
          });
          
          
        });
    </script>
    
  </body>

</html>