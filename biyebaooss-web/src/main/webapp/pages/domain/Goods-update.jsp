<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.lg-3-extend {
	width: 13%
}

.lg-9-extend {
	width: 37%
}
</style>
</head>
<body>
	<form class="form-horizontal">
		<div class="form-group">
			<label class="col-lg-3  lg-3-extend control-label">题目:</label>
			<div class="col-lg-9 lg-9-extend">
				<input name="name" style="display: inline; width: 70%;"
					class="form-control" type="text" dataType="Require" id="nameID" />
				<span class="required">*</span>
			</div>
			<label class="col-lg-3 lg-3-extend control-label">价格:</label>
			<div class="col-lg-9 lg-9-extend">

				<input name="price" style="display: inline; width: 70%;"
					class="form-control" type="text" id="priceID" />
			</div>

		</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3  lg-3-extend control-label">来源:</label>
			<div class="col-lg-9 lg-9-extend">
				<input name="sourceType" style="display: inline; width: 70%;"
					class="form-control" type="text" dataType="Require"
					id="sourceTypeID" /> <span class="required">*</span>
			</div>
			<label class="col-lg-3 lg-3-extend control-label">权重:</label>
			<div class="col-lg-9 lg-9-extend">
				<input name="weights" style="display: inline; width: 70%;"
					class="form-control" type="text" dataType="Number" require="false"
					id="weightsID" />
			</div>
		</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 lg-3-extend control-label">推荐到首页:</label>
			<div class="col-lg-9 lg-9-extend">
				<div class="btn-group select" id="recommendID"></div>
				<input type="hidden" id="recommendID_" name="recommend" />
			</div>
			<div class="form-group">
				<label class="col-lg-3 lg-3-extend control-label">销售量:</label>
				<div class="col-lg-9 lg-9-extend">
					<input name="saleNum" style="display: inline; width: 70%;"
						class="form-control" type="text" dataType="Number" require="false"
						id="saleNumID" />
				</div>
				<label class="col-lg-3 lg-3-extend control-label">浏览量:</label>
				<div class="col-lg-9 lg-9-extend">
					<input name="viewNum" style="display: inline; width: 70%;"
						class="form-control" type="text" dataType="Number" require="false"
						id="viewNumID" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-3 lg-3-extend control-label">数据库:</label>
				<div class="col-lg-9 lg-9-extend">
					<div class="btn-group select" id="dbTypeID"></div>
					<input type="hidden" id="dbTypeID_" name="dbType" />
				</div>
				<label class="col-lg-3 lg-3-extend control-label">编程语言:</label>
				<div class="col-lg-9 lg-9-extend">
					<div class="btn-group select" id="langTypeID"></div>
					<input type="hidden" id="langTypeID_" name="langType" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-3 lg-3-extend control-label">概要:</label>
				<div class="col-lg-9" style="">
					<textarea class="form-control" style="display: inline; width: 94%;"
						rows="3" id="summaryID" name="summary"></textarea>
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-3 lg-3-extend control-label">详情:</label>
				<div class="col-lg-9">
					<textarea class="form-control" style="width: 94%; height: 20%;"
						id="descriptionID" name="description"></textarea>
				</div>
			</div>
	</form>

	<script type="text/javascript">
			var selectItems = {};
			var contents = [{title:'请选择', value: ''}];
			contents.push({title:'ORACLE' , value:'ORACLE'});
			contents.push({title:'MYSQL' , value:'MYSQL'});
			contents.push({title:'SQLSERVER' , value:'SQLSERVER'});
			contents.push({title:'ACCESS' , value:'ACCESS'});

			selectItems['dbTypeID'] = contents;
			       var contents = [{title:'请选择', value: ''}];
			contents.push({title:'VC' , value:'VC'});
			contents.push({title:'VB' , value:'VB'});
			contents.push({title:'Android' , value:'Android'});
			contents.push({title:'IOS' , value:'IOS'});
			contents.push({title:'C#' , value:'C#'});
			contents.push({title:'C' , value:'C'});
			contents.push({title:'JAVA' , value:'JAVA'});
			contents.push({title:'PHP' , value:'PHP'});
			contents.push({title:'JSP' , value:'JSP'});
			contents.push({title:'ASP' , value:'ASP'});
			selectItems['langTypeID'] = contents;
			 var contents = [{title:'请选择', value: ''}];
			 contents.push({title:'是' , value:'1'});
				contents.push({title:'否' , value:'0'});
			selectItems['recommendID'] = contents;
</script>
</body>
</html>