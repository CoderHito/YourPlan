<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>YourPlan</title>

<link href="<%=request.getContextPath()%>/static/css/team.css"
	rel="stylesheet">

<!-- Bootstrap -->
<link
	href="<%=request.getContextPath()%>/static/vendors/bootstrap/dist/css/bootstrap.css"
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
								<li><a href="/Plan/server/index.do"><i
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
				<!-- 右边页面 -->
				<div class="container">
					<div class="row">
						<div class="col-md-6">
							<div class="team_kanban">
								<div style="padding: 5px 2px">
									<div class="team_kanban_title">
										<span>好友</span> <br />
									</div>
									<div class="list-group">
										<c:forEach items="${friendList}" var="friend">
											<div class="list-group-item">
												<div>
													<img style="width: 10%; margin-left: 5px; margin-top: 0px;"
														src="<%=request.getContextPath()%>/static/img/img.jpg"
														alt="..." class="img-circle profile_img">
													<button type="button"
														class="btn btn-round btn-info btn-name"
														style="margin-left: 10px;">${friend.f_name }</button>
													<button type="button" data-fname="${friend.f_name }"
														data-toggle="modal" data-target="#delFriend"
														class="btn btn-round btn-danger btn-sm btn-del">
														&nbsp;&nbsp;del&nbsp;&nbsp;</button>
												</div>
											</div>
										</c:forEach>

									</div>
									<div class="team_kanban_title">
										<span class="glyphicon glyphicon-plus span_plus"
											data-type="好友" data-toggle="modal" data-target="#addFriend"></span>
									</div>

								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="team_kanban">
								<div style="padding: 5px 2px">
									<div class="team_kanban_title">
										<span>团队</span> <br />
									</div>
									<div class="list-group">
										<c:forEach items="${createTeamList}" var="team">
											<div class="list-group-item">
												<button type="button"
													class="btn btn-round btn-info btn-name"
													style="margin-left: 10px;">${team.team_title }</button>
												<button type="button" data-team="${team.team_title}"
													data-toggle="modal" data-target="#delTeam"
													class="btn btn-round btn-danger btn-sm btn-del">
													&nbsp;&nbsp;del&nbsp;&nbsp;</button>
											</div>
										</c:forEach>

										<c:forEach items="${memberTeamList}" var="team">
											<div class="list-group-item">
												<button type="button"
													class="btn btn-round btn-info btn-name"
													style="margin-left: 10px;">${team.team_title }</button>
											</div>
										</c:forEach>
									</div>
									<div class="team_kanban_title">
										<span class="glyphicon glyphicon-plus span_plus"
											data-type="团队" data-toggle="modal" data-target="#addTeam"></span>
									</div>

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

	<!-- Modal -->
	<div class="modal fade" id="addFriend" tabindex="-1" role="dialog"
		aria-labelledby="detailLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="detailLabel">查找好友</h4>
				</div>
				<div class="modal-body">
					<form id="plan_form" class="form-horizontal calender" role="form">
						<input name="plan_id" id="plan_id" type="hidden">
						<div class="form-group">
							<label class="col-sm-3 control-label">用户名</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="user_name"
									name="title">
							</div>

							<div class="alert alert-danger yincang no_user" role="alert">
								<button type="button" class="close" data-dismiss="alert"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								该用户不存在
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default antoclose"
						data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary find_user">添加</button>
				</div>
			</div>
		</div>
	</div>
	<!-- delFriend modal -->
	<div class="modal fade" id="delFriend" tabindex="-1" role="dialog"
		aria-labelledby="detailLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="detailLabel">删除好友</h4>
				</div>
				<div class="modal-body">
					<form id="plan_form" class="form-horizontal calender" role="form">
						<input name="plan_id" id="plan_id" type="hidden">
						<div class="form-group">
							<label class="col-sm-3 control-label"></label>
							<div class="col-sm-6">
								<label class="control-label">确认与该用户解除好友关系？</label>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default antoclose"
						data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary del_friend">确认</button>
				</div>
			</div>
		</div>
	</div>
	<!-- delFriend modal -->

	<div id="addMember" class="modal fade" tabindex="1" role="dialog"
		aria-labelledby="mySmallModalLabel">
		<div class="modal-dialog modal-sm" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h6 class="modal-title" id="detailLabel">添加成员</h6>
				</div>
				<div class="modal-body">
					<img style="width: 30px; margin-left: 5px; margin-top: 5px;"
						src="<%=request.getContextPath()%>/static/img/img.jpg" alt="..."
						class="img-circle profile_img"> <img
						style="width: 30px; margin-left: 5px; margin-top: 5px;"
						src="<%=request.getContextPath()%>/static/img/img.jpg" alt="..."
						class="img-circle profile_img"> <img
						style="width: 30px; margin-left: 5px; margin-top: 5px;"
						src="<%=request.getContextPath()%>/static/img/img.jpg" alt="..."
						class="img-circle profile_img">
				</div>
			</div>
		</div>
	</div>

	<div id="addTeam" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="mySmallModalLabel">
		<div class="modal-dialog modal-sm" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h6 class="modal-title" id="detailLabel">添加团队</h6>
				</div>
				<div class="modal-body">
					<form id="plan_form" class="form-horizontal calender" role="form">
						<input name="plan_id" id="plan_id" type="hidden">
						<div class="form-group">
							<label class="col-sm-3 control-label">Title</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="add_team_title"
									name="title">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">member</label>
							<div class="member_img">
								<img style="width: 30px; margin-left: 5px; margin-top: 5px;"
									title="yourself"
									src="<%=request.getContextPath()%>/static/img/img.jpg"
									alt="..." class="img-circle profile_img">
								<div class="option_list dropdown pos">
									<span class="glyphicon glyphicon-plus member_plus option_list"
										data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="true"></span>
									<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
										<c:forEach items="${friendList}" var="friend">
											<li><img
												style="width: 30px; margin-left: 5px; margin-top: 5px;"
												src="<%=request.getContextPath()%>/static/img/img.jpg"
												alt="..." class="img-circle profile_img"> <span
												style="margin-top: 5px; margin-left: 5px;" class="add_fname">${friend.f_name }</span></li>
											<li role="separator" class="divider"></li>
										</c:forEach>
									</ul>
								</div>
							</div>

						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default antoclose"
						data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary btn_add_team">保存</button>
				</div>
			</div>
		</div>
	</div>


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
	<script
		src="<%=request.getContextPath()%>/static/build/js/custom.min.js"></script>

	<script src="<%=request.getContextPath()%>/static/js/team.js"></script>

</body>

</html>