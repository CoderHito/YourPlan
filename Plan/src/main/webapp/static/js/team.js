$(function() {
	// 根据输入查找此人是否注册
	$(".find_user").on("click", function() {
		var name = $("#user_name").val();
		console.log(name);

		$.ajax({
			type : "POST",
			url : "http://localhost:8088/Plan/team/findUserByName.do",
			dataType : "json",
			data : {
				user_name : name
			},
			async : false,
			success : function(data) {
				console.log(data);
				if (data.result == "error") {
					$(".no_user").css("display", "inline");
					window.setTimeout(function() {
						$('[data-dismiss="alert"]').alert('close');
						location.reload();
					}, 1000);
				} else {
					location.reload();
					// $('.antoclose').click();
				}

			}

		})

	})

	$('#delFriend').on('show.bs.modal', function(event) {
		var btn_del = $(event.relatedTarget);
		var fname = btn_del.data('fname');
		console.log(fname);
		$.ajax({
			type : "POST",
			url : "http://localhost:8088/Plan/team/delFriend.do",
			dataType : "json",
			data : {
				fname : fname
			},
			async : false,
			success : function(data) {
				console.log(data);
				if (data.result == "error") {
					
				} else {
					location.reload();
				}
			}
		})
	})
	
	$(".btn_add_team").on("click",function (){
		var team_title = $("#add_team_title").val();
		console.log("addteam");
		console.log(team_title);
		
		$.ajax({
			type : "POST",
			url : "http://localhost:8088/Plan/team/newTeam.do",
			dataType : "json",
			data : {
				team_title:team_title
			},
			async : false,
			success : function(data) {
				console.log(data);
				if (data.result == "error") {
					
				} else {
					location.reload();
				}
			}
		})
		
	})

})