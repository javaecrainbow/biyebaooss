<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery/jquery-1.8.3.js"></script>

<script charset="utf-8" src="editor/kindeditor.js"></script>
<script charset="utf-8" src="editor/lang/zh_CN.js"></script>
<script type="text/javascript">
  $(function(){

     var editor;
     KindEditor.ready(function(K) {
       editor = K.create('#editor_id');
       });
      var options = {
        cssPath : '/css/index.css',
      filterMode:true};
var editor = K.create('textarea[name="content"]', options);
  });
</script>
</head>
<body>

	fewfwfwefsdf
	<textarea id="editor_id" name="content"
		style="width: 700px; height: 300px;"></textarea>

</body>
</html>
