$(function() {
	var new_type;
	$(".span_plus").on("click", function() {
		console.log("click");
		$('#newPlan').on('show.bs.modal', function(event) {
			console.log("show.bs.modal");
			var span = $(event.relatedTarget);
			new_type = span.data('type');
		})
	})

	$('#detail').on('show.bs.modal', function(event) {
		console.log("show.bs.modal");
		var button = $(event.relatedTarget);
		var plan_id = button.data('id');
		var title = button.data('title');
		var descr = button.data('descr');
		var start = button.data('start');
		var end = button.data('end');
		$("#plan_id").val(plan_id);
		$("#start").val(start);
		$("#end").val(end);
		$("#title").val(title);
		$("#descr").val(descr);
	})

	$(".plan_del").on("click", function() {
		var plan_id = $("#plan_id").val();
		console.log("del" + plan_id);
		
		$.ajax({
			type : "POST",
			url : "/Plan/plan/delPlan.do",
			dataType : "json",
			data : {
				id : plan_id,
			},
			async : false,
			success : function(data) {
				console.log(data);
				if (data.result == "error") {
					alert("保存失败");
				} else {
					// window.location.href("/Plan/server/plan.do");
					location.reload();
				}
			}
		})
		$('.antoclose').click();
		
	})

	// 修改计划
	$(".antosubmit").on("click", function() {
		var title = $("#title").val();
		var descr = $("#descr").val();
		var start = $("#start").val();
		var end = $("#end").val();
		var plan_id = $("#plan_id").val();
		console.log(plan_id);

		$.ajax({
			type : "POST",
			url : "/Plan/plan/updatePlan.do",
			dataType : "json",
			data : {
				id : plan_id,
				title : title,
				descr : descr,
				start : start,
				end : end
			},
			async : false,
			success : function(data) {
				console.log(data);
				if (data.result == "error") {
					alert("保存失败");
				} else {
					// window.location.href("/Plan/server/plan.do");
					location.reload();
				}
			}
		})
		$('.antoclose').click();
	})
	// 新建计划
	$(".new_antosubmit").on("click", function() {
		var title = $("#new_title").val();
		var descr = $("#new_descr").val();
		var start = $("#new_start").val();
		var end = $("#new_end").val();

		$.ajax({
			type : "POST",
			url : "/Plan/plan/newPlan.do",
			dataType : "json",
			data : {
				plan_type : new_type,
				title : title,
				descr : descr,
				start : start,
				end : end
			},
			async : false,
			success : function(data) {
				console.log(data);
				if (data.result == "error") {
					alert("保存失败");
				} else {
					// window.location.href("/Plan/server/plan.do");
					location.reload();
				}
			}
		})
		$('.new_antoclose').click();
	})

})