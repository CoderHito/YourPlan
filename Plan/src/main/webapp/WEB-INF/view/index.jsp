<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<meta charset="utf-8" />
<meta name="keywords"
	content="工作计划，工作日志，日程计划，项目管理，时间管理，团队协作，工作效率，日程管理，工作计划软件" />
<title>YourPlan</title>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<link href="https://cdn.bootcss.com/jqueryui/1.12.1/jquery-ui.css"
	rel="stylesheet">
<script src="https://cdn.bootcss.com/jqueryui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/static/css/base.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/js/main.js"></script>
</head>

<body>
	<!--  <script type="application/javascript">
		var user_name = ${user_name};		
	</script> -->
	<div class="container">
		<div class="row1">
			<div class="logo">
				<a title="YourPlan" href="/Plan/server/index.do">
					<h3>YourPlan</h3>
				</a>
			</div>
			<div class="log-reg">
				<nav style="margin-top: 20px;">
					<a title="登录" class="login" href="javascript:;"> 登录 </a> | <a
						title="注册" class="register" href="javascript:;"> 注册 </a>
				</nav>
			</div>
			<%-- <%} %> --%>
		</div>
		<div class="row2">
			<h1 class="row2title">你理想的工作方式</h1>
			<div class="display">
				<div class="center">
					<a href="#" class="holder"><img
						src="<%=request.getContextPath()%>/static/img/01.png" /></a> <br />
					<strong class="">日程</strong>
					<p>任务提醒、番茄时钟让你更专注于你的工作</p>
				</div>
				<div class="center">
					<a href="#" class="holder"><img
						src="<%=request.getContextPath()%>/static/img/01.png" /></a> <br />
					<strong>计划</strong>
					<p>工作计划、进度跟进让你的团队协作可视化</p>
				</div>
				<div class="center">
					<a href="#" class="holder"><img
						src="<%=request.getContextPath()%>/static/img/01.png" /></a> <br />
					<strong>笔记</strong>
					<p>工作总结，笔记分享让回顾变得简单而方便</p>
				</div>
			</div>
		</div>

		<div class="login_dialog yincang" title="登录">
			<div class="login_user">
				<img src="<%=request.getContextPath()%>/static/img/user.png" /> <input
					class="login_user_name" type="text" placeholder="用户名" />
			</div>
			<div class="login_psw">
				<img src="<%=request.getContextPath()%>/static/img/password.png" />
				<input class="login_user_psw" type="password" placeholder="密码" />
			</div>

			<div class="login_error">
				<span></span>
			</div>

			<div class="btns">
				<button class="btn_login">登录</button>
				<button class="btn_login_cancel">取消</button>
			</div>
		</div>

		<div class="register_dialog yincang" title="注册">

			<div class="reg_user">
				<img src="<%=request.getContextPath()%>/static/img/user.png" /> <input
					class="reg_user_name" type="text" placeholder="用户名" />
			</div>
			<div class="reg_psw">
				<img src="<%=request.getContextPath()%>/static/img/password.png" />
				<input class="reg_user_psw" type="password" placeholder="密码" />
			</div>
			<div class="reg_psw">
				<img src="<%=request.getContextPath()%>/static/img/password.png" />
				<input class="reg_user_repsw" type="password" placeholder="重复密码" />
			</div>
			<!-- <form id="imgupload"
				action="/Plan/upload/uploadFile.do"
				method="post" enctype="multipart/form-data">
				<div class="img_upload">
					<span> 上传头像</span> <input id="img_input2" type="file"
						accept="image/*" /> <label for="img_input2" id="img_label2">选择文件
						<i class="fa fa-plus fa-lg"></i>
					</label>
					<div id="preview_box2"></div>
				</div>
			</form> -->
			<div class="reg_error">
				<span></span>
			</div>

			<div class="btns">
				<button class="btn_reg">注册</button>
				<button class="btn_reg_cancel">取消</button>
			</div>

		</div>

	</div>
</body>

</html>