<%@ page session="false"%>
<html>
<head>
<title>Upload File Request Page</title>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>

<script type="text/javascript">
	function upload() {
		var frm = $('#formm');
		frm.submit(function(e) {
			$.ajax({
				type : frm.attr('method'),
				url : frm.attr('action'),
				data : frm.serialize(),
				success : function(data) {
					alert('ok');
				}
			});
		})
	}
</script>

</head>
<body>
	<form id="formm" method="POST"
		action="http://localhost:8088/Plan/upload/uploadFile.do"
		enctype="multipart/form-data">
		File to upload: <input type="file" name="file"> <input
			type="submit" value="Upload" > Press here
		to upload the file!
	</form>


</body>
</html>