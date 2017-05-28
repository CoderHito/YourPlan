$(function() {
	
	function imgupload(){
		$("#imgupload").submit(function (){
			console.log("图片上传成功");
			return true;
		});	
	};
	
	$("#img_input2").on("change", function(e) {

		var file = e.target.files[0]; //获取图片资源

		// 只选择图片文件
		if(!file.type.match('image.*')) {
			return false;
		}

		var reader = new FileReader();

		reader.readAsDataURL(file); // 读取文件

		// 渲染文件
		reader.onload = function(arg) {

			var img = '<img class="preview" src="' + arg.target.result + '" alt="preview"/>';
			$("#preview_box2").empty().append(img);
		}
		
		
	});
	
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
			url : "http://localhost:8088/Plan/server/login.do",
			type : "POST",
			dataType : "json",
			data : {
				name : name,
				password : password
			},
			success : function(data) {
				if (data.result == "success") {
					// TODO
					window.location.href = "http://localhost:8088/Plan/server/todo.do";
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
		// TODO 邮箱 、验证码
		// var reg_email = $(".reg_user_email").val();
		
		/*if (!imgupload()){
			return ;
		}*/
		
		$.ajax({
			url : "http://localhost:8088/Plan/server/register.do",
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
					window.location.href = "http://localhost:8088/Plan/server/todo.do";
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
	});

	$(".btn_reg_cancel").click(function() {
		$(".reg_error").css("display", "inline");
		$(".register_dialog").dialog("close");
		$(".container").css("opacity", "1");
	});

});