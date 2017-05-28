<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>YourPlan</title>

<!-- Bootstrap -->
<link
	href="<%=request.getContextPath()%>/static/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="<%=request.getContextPath()%>/static/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link
	href="<%=request.getContextPath()%>/static/vendors/nprogress/nprogress.css"
	rel="stylesheet">
<!-- FullCalendar -->
<link
	href="<%=request.getContextPath()%>/static/vendors/fullcalendar/dist/fullcalendar.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/static/vendors/fullcalendar/dist/fullcalendar.print.css"
	rel="stylesheet" media="print">

<!-- Custom styling plus plugins -->
<link
	href="<%=request.getContextPath()%>/static/build/css/custom.min.css"
	rel="stylesheet">

<link href="<%=request.getContextPath()%>/static/css/todo.css"
	rel="stylesheet">


</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="<%=request.getContextPath()%>/server/index.do"
							class="site_title"><i class="fa fa-paw"></i> <span>YourPlan!</span></a>
					</div>

					<div class="clearfix"></div>

					<!-- menu profile quick info -->
					<div class="profile clearfix">
						<div class="profile_pic">
							<img src="<%=request.getContextPath()%>/static/img/img.jpg"
								alt="..." class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>Welcome,</span>
							<h2>${user_name }</h2>
						</div>
					</div>
					<!-- /menu profile quick info -->

					<br />

					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">
						<div class="menu_section">
							<!-- <h3>General</h3> -->
							<ul class="nav side-menu">
								<li><a href="<%=request.getContextPath()%>/server/index.do"><i
										class="fa fa-home"></i> 首页 </a></li>
								<li><a href="<%=request.getContextPath()%>/server/todo.do"><i
										class="fa fa-edit"></i> 日程 </a></li>
								<li><a href="<%=request.getContextPath()%>/server/plan.do"><i
										class="fa fa-desktop"></i> 计划</a></li>
								<li><a href="<%=request.getContextPath()%>/server/team.do"><i
										class="fa fa-table"></i> 团队</a></li>
							</ul>
						</div>

					</div>
					<!-- /sidebar menu -->

					<!-- /menu footer buttons -->
					<!-- /menu footer buttons -->
				</div>
			</div>

			<!-- top navigation -->
			<div class="top_nav">
				<div class="nav_menu">
					<nav>
					<div class="nav toggle">
						<a id="menu_toggle"><i class="fa fa-bars"></i></a>
					</div>

					<ul class="nav navbar-nav navbar-right">
						<li class=""><a href="javascript:;"
							class="user-profile dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false"> <img
								src="<%=request.getContextPath()%>/static/img/img.jpg" alt="">${user_name }
								<span class=" fa fa-angle-down"></span>
						</a>
							<ul class="dropdown-menu dropdown-usermenu pull-right">
								<li><a href="javascript:;"> Profile</a></li>
								<li><a href="javascript:;"> <span
										class="badge bg-red pull-right">50%</span> <span>Settings</span>
								</a></li>
								<li><a href="javascript:;">Help</a></li>
								<li><a href="http://localhost:8088/Plan/server/index.do"><i
										class="fa fa-sign-out pull-right"></i> Log Out</a></li>
							</ul></li>

						<li role="presentation" class="dropdown"><a
							href="javascript:;" class="dropdown-toggle info-number"
							data-toggle="dropdown" aria-expanded="false"> <i
								class="fa fa-envelope-o"></i> <span class="badge bg-green">6</span>
						</a>
							<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
								role="menu">
								<li><a> <span class="image"><img
											src="<%=request.getContextPath()%>/static/img/img.jpg"
											alt="Profile Image" /></span> <span> <span>John Smith</span>
											<span class="time">3 mins ago</span>
									</span> <span class="message"> Film festivals used to be
											do-or-die moments for movie makers. They were where... </span>
								</a></li>
								<li><a> <span class="image"><img
											src="<%=request.getContextPath()%>/static/img/img.jpg"
											alt="Profile Image" /></span> <span> <span>John Smith</span>
											<span class="time">3 mins ago</span>
									</span> <span class="message"> Film festivals used to be
											do-or-die moments for movie makers. They were where... </span>
								</a></li>
								<li><a> <span class="image"><img
											src="<%=request.getContextPath()%>/static/img/img.jpg"
											alt="Profile Image" /></span> <span> <span>John Smith</span>
											<span class="time">3 mins ago</span>
									</span> <span class="message"> Film festivals used to be
											do-or-die moments for movie makers. They were where... </span>
								</a></li>
								<li><a> <span class="image"><img
											src="<%=request.getContextPath()%>/static/img/img.jpg"
											alt="Profile Image" /></span> <span> <span>John Smith</span>
											<span class="time">3 mins ago</span>
									</span> <span class="message"> Film festivals used to be
											do-or-die moments for movie makers. They were where... </span>
								</a></li>
								<li>
									<div class="text-center">
										<a> <strong>See All Alerts</strong> <i
											class="fa fa-angle-right"></i>
										</a>
									</div>
								</li>
							</ul></li>
					</ul>
					</nav>
				</div>
			</div>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main">
				<div class="">
					<div class="page-title">
						<div class="title_left">
							<h3>
								Calendar <small>Click to add/edit events</small>
							</h3>
						</div>

						<div class="title_right">
							<div
								class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Search for..."> <span
										class="input-group-btn">
										<button class="btn btn-default" type="button">Go!</button>
									</span>
								</div>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>

					<div class="row">
						<div class="col-md-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										Calendar Events <small>Sessions</small>
									</h2>
									<ul class="nav navbar-right panel_toolbox">
										<li><a class="collapse-link"><i
												class="fa fa-chevron-up"></i></a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" role="button" aria-expanded="false"></a>
											<ul class="dropdown-menu" role="menu">
												<li><a href="#">Settings 1</a></li>
												<li><a href="#">Settings 2</a></li>
											</ul></li>
									</ul>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id='calendar'></div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /page content -->

			<!-- footer content -->
			<footer>
			<div class="pull-right">
				Gentelella - Bootstrap Admin Template by <a
					href="https://colorlib.com">Colorlib</a>
			</div>
			<div class="clearfix"></div>
			</footer>
			<!-- /footer content -->
		</div>
	</div>

	<!-- calendar modal -->
	<div id="CalenderModalNew" class="modal fade" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">新建日程</h4>
				</div>
				<div class="modal-body">
					<div id="testmodal" style="padding: 5px 20px;">
						<form id="antoform" class="form-horizontal calender" role="form">
							<div class="form-group">
								<label class="col-sm-3 control-label">Title</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="title" name="title">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">Description</label>
								<div class="col-sm-9">
									<textarea class="form-control" style="height: 55px;" id="descr"
										name="descr"></textarea>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default antoclose"
						data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary antosubmit">保存</button>
				</div>
			</div>
		</div>
	</div>
	<div id="CalenderModalEdit" class="modal fade" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<div class="option_list dropdown">
						<span class="glyphicon glyphicon-list option_list"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"></span>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a class="todo_complete">完成</a></li>
							<li role="separator" class="divider"></li>
							<li><a class="todo_del">删除</a></li>
						</ul>
					</div>

					<h4 class="modal-title" id="myModalLabel2">编辑日程</h4>
				</div>
				<div class="modal-body">

					<div id="testmodal2" style="padding: 5px 20px;">
						<form id="antoform2" class="form-horizontal calender" role="form">
							<div class="form-group">
								<label class="col-sm-3 control-label">Title</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="title2"
										name="title2">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">Description</label>
								<div class="col-sm-9">
									<textarea class="form-control" style="height: 55px;"
										id="descr2" name="descr"></textarea>
								</div>
							</div>

						</form>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default antoclose2"
						data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary antosubmit2">保存</button>
				</div>
			</div>
		</div>
	</div>

	<div id="fc_create" data-toggle="modal" data-target="#CalenderModalNew"></div>
	<div id="fc_edit" data-toggle="modal" data-target="#CalenderModalEdit"></div>
	<!-- /calendar modal -->

	<!-- JSON -->
	<script src="<%=request.getContextPath()%>/static/js/json2.js"></script>
	<!-- jQuery -->
	<script
		src="<%=request.getContextPath()%>/static/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script
		src="<%=request.getContextPath()%>/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script
		src="<%=request.getContextPath()%>/static/vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script
		src="<%=request.getContextPath()%>/static/vendors/nprogress/nprogress.js"></script>
	<!-- FullCalendar -->
	<script
		src="<%=request.getContextPath()%>/static/vendors/moment/min/moment.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/static/vendors/fullcalendar/dist/fullcalendar.min.js"></script>


	<!-- Custom Theme Scripts -->
	<script src="<%=request.getContextPath()%>/static/build/js/custom.js"></script>

</body>

</html>