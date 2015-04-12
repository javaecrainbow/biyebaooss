<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form class="form-horizontal">
		<input type="hidden" id="idID" name="id" /> <input type="hidden"
			id="versionID" name="version" />

		<div class="form-group">
			<label class="col-lg-3 control-label">题目:</label>
			<div class="col-lg-9">
				<input name="title" style="display: inline; width: 94%;"
					class="form-control" type="text" dataType="Require" id="titleID" />
				<span class="required">*</span>
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">邮箱:</label>
			<div class="col-lg-9">
				<input name="mail" style="display: inline; width: 94%;"
					class="form-control" type="text" dataType="Email" id="mailID" /> <span
					class="required">*</span>
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">电话:</label>
			<div class="col-lg-9">
				<input name="telephone" style="display: inline; width: 94%;"
					class="form-control" type="text" dataType="Mobile" id="telephoneID" />
				<span class="required">*</span>
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">数据库:</label>
			<div class="col-lg-9">
				<div class="btn-group select" id="dbTypeID"></div>
				<input type="hidden" id="dbTypeID_" name="dbType" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">语言:</label>
			<div class="col-lg-9">
				<div class="btn-group select" id="langTypeID"></div>
				<input type="hidden" id="langTypeID_" name="langType" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">备注:</label>
			<div class="col-lg-9">
				<textarea class="form-control" style="display: inline; width: 94%;"
					rows="3" id="markID" name="mark"></textarea>
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">需求详情:</label>
			<div class="col-lg-9">
				<textarea class="form-control" style="display: inline; width: 94%;"
					rows="3" id="contentsID" name="contents"></textarea>
			</div>
		</div>
	</form>
	<script type="text/javascript">
    var selectItems = {};
                                    var contents = [{title:'请选择', value: ''}];
        contents.push({title:'Oracle' , value:'Oracle'});
        contents.push({title:'MySql' , value:'MySql'});
        contents.push({title:'Access' , value:'Access'});
        contents.push({title:'SqServer' , value:'SqlServer'});
        selectItems['dbTypeID'] = contents;
                var contents = [{title:'请选择', value: ''}];
        contents.push({title:'VC' , value:'VC'});
        contents.push({title:'VB' , value:'VB'});
        contents.push({title:'Android' , value:'Android'});
        contents.push({title:'IOS' , value:'IOS'});
        contents.push({title:'C#' , value:'C#'});
        contents.push({title:'PHP' , value:'PHP'});
        contents.push({title:'JSP' , value:'JSP'});
        contents.push({title:'C' , value:'C'});
        contents.push({title:'ASP' , value:'ASP'});
        contents.push({title:'JAVA' , value:'JAVA'});
        selectItems['langTypeID'] = contents;
                        </script>
</body>
</html>