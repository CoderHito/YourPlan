$(function() {
	// *****登录对话框*****
	$(".login").click(function() {
		$(".login_user_name").val("");
		$(".login_user_psw").val("");
		$(".login_error").css("display", "none");
		$(".container").css("opacity", "0.3");
		$(".login_dialog").dialog({
			closeOnEscape : false,
			open : function(event, ui) {
				$(".ui-dialog-titlebar-close", ui.dialog | ui).hide();
			}
		});
	});

	$(".btn_login").click(function() {
		var name = $(".login_user_name").val();
		var password = $(".login_user_psw").val();
		$.ajax({
			// TODO 修改为post参数传递不过去
			url : "http://localhost:8088/Plan/server/login",
			type : "POST",
			dataType : "json",
			data : {
				name : name,
				password : password
			},
			success : function(data) {
				if (data.result == "success") {
					// TODO
					window.location.href = "http://www.baidu.com";
				} else {
					// TODO 居中
					$(".login_error").css("display", "inline");

					$(".login_error span").css("color", "red");
					if (data.exist == "NO") {
						$(".login_error span").html("该用户名不存在");
					} else if (data.same == "NO") {
						$(".login_error span").html("密码错误");
					}
				}
			}

		});
	});

	$(".btn_login_cancel").click(function() {
		$(".login_dialog").dialog("close");
		$(".container").css("opacity", "1");
	});

	// *****注册对话框*****
	$(".register").click(function() {
		$(".reg_user_name").val("");
		$(".reg_user_psw").val("");
		$(".reg_user_repsw").val("");
		$(".reg_error").css("display", "none");
		$(".container").css("opacity", "0.3");
		$(".register_dialog").dialog({
			closeOnEscape : false,
			open : function(event, ui) {
				$(".ui-dialog-titlebar-close", ui.dialog | ui).hide();
			}
		});
	});

	$(".btn_reg").click(function() {
		var reg_name = $(".reg_user_name").val();
		var reg_psw = $(".reg_user_psw").val();
		var reg_repsw = $(".reg_user_repsw").val();
		// TODO
		// var reg_email = $(".reg_user_email").val();
		$.ajax({
			url : "http://localhost:8088/Plan/server/register",
			type : "POST",
			dataType : "json",
			data : {
				name : reg_name,
				password : reg_psw,
				repsw : reg_repsw
			// email:email
			},
			success : function(data) {
				console.log(data);
				if (data.result == "success") {
					// TODO
					window.location.href = "http://www.baidu.com";
				} else {
					// TODO 居中
					$(".reg_error").css("display", "inline");
					$(".reg_error span").css("color", "red");
					if (data.exist == "YES") {
						$(".reg_error span").html("用户名以存在");
					} else if (data.same == "NO") {
						$(".reg_error span").html("密码输入不一致");
					}
				}
			}
		})
		// $(".reg_error").css("display","inline");
		// $(".reg_error span").html("dasdasd");
	});

	$(".btn_reg_cancel").click(function() {
		$(".reg_error").css("display", "inline");
		$(".register_dialog").dialog("close");
		$(".container").css("opacity", "1");
	});

});