<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/pages/common/header.jsp"%><!--引入权限系统该页面需无须引用header.jsp -->
<%@ page import="java.util.Date"%>
<% String formId = "form_" + new Date().getTime();
   String gridId = "grid_" + new Date().getTime();
   String path = request.getContextPath()+request.getServletPath().substring(0,request.getServletPath().lastIndexOf("/")+1);
%>
<script type="text/javascript">
var grid;
var form;
var _dialog;
$(function (){
    grid = $("#<%=gridId%>");
    form = $("#<%=formId%>");
	PageLoader = {
	   //
	    initSearchPanel:function(){
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
              form.find('#langtype_SELECT').select({
            title: '请选择',
            contents: contents
       }).on('change',function(){
           form.find('#langtypeID_').val($(this).getValue());
       });
              var contents2 = [{title:'请选择', value: ''}];
              contents2.push({title:'Oracle' , value:'Oracle'});
              contents2.push({title:'MySql' , value:'MySql'});
              contents2.push({title:'Access' , value:'Access'});
              contents2.push({title:'SqServer' , value:'SqlServer'});
              form.find('#dbType_SELECT').select({
                  title: '请选择',
                  contents: contents2
             }).on('change',function(){
                 form.find('#dbTypeID_').val($(this).getValue());
             });
	    	
	    	
	    	
	        	            	                	            	                	            	                	            	                	            	                	            	                	            	        	     },
	    initGridPanel: function(){
	         var self = this;
	         var width = 110;
	         return grid.grid({
	                identity:"id",
	                buttons: [
	                        {content: '<button class="btn btn-primary" type="button"><span class="glyphicon glyphicon-plus"><span>添加</button>', action: 'add'},
	                        {content: '<button class="btn btn-success" type="button"><span class="glyphicon glyphicon-edit"><span>修改</button>', action: 'modify'},
	                        {content: '<button class="btn btn-danger" type="button"><span class="glyphicon glyphicon-remove"><span>删除</button>', action: 'delete'},
	                        {content: '<button class="btn btn-danger" type="button"><span class="glyphicon glyphicon-check"><span>审核</button>', action: 'check'}
	                    ],
	                url:"${pageContext.request.contextPath}/Booking/pageJson.koala",
	                columns: [
	                     	                         	                         { title: '题目', name: 'title', width: 150},
	                         	                         	                         	                         { title: '数据库', name: 'dbType', width: width},
	                         	                         	                         	                         { title: '语言', name: 'langType', width: width},
	                         	                         	                         	                         { title: '邮箱', name: 'mail', width: 120},
	                         	                         	                         	                         { title: '电话', name: 'telephone', width: width},
	                         	                         	                         	                         { title: '预定时间', name: 'bookingTime', width: width},
	                         	                         	                         	                         { title: '审核人', name: 'auditor', width: width},
	                         	                         	                             { title: '操作', width: 120, render: function (rowdata, name, index)
	                                 {
	                                     var param = '"' + rowdata.id + '"';
	                                     var h = "<a href='javascript:openDetailsPage(" + param + ")'>查看</a> ";
	                                     return h;
	                                 }
	                             }
	                ]
	         }).on({
	                   'add': function(){
	                       self.add($(this));
	                   },
	                   'modify': function(event, data){
	                        var indexs = data.data;
	                        var $this = $(this);
	                        if(indexs.length == 0){
	                            $this.message({
	                                type: 'warning',
	                                content: '请选择一条记录进行修改'
	                            })
	                            return;
	                        }
	                        if(indexs.length > 1){
	                            $this.message({
	                                type: 'warning',
	                                content: '只能选择一条记录进行修改'
	                            })
	                            return;
	                        }
	                       self.modify(indexs[0], $this);
	                    },
	                   'delete': function(event, data){
	                        var indexs = data.data;
	                        var $this = $(this);
	                        if(indexs.length == 0){
	                            $this.message({
	                                   type: 'warning',
	                                   content: '请选择要删除的记录'
	                            });
	                            return;
	                        }
	                        var remove = function(){
	                            self.remove(indexs, $this);
	                        };
	                        $this.confirm({
	                            content: '确定要删除所选记录吗?',
	                            callBack: remove
	                        });
	                   },
	                   'check': function(event, data){
	                        var indexs = data.data;
	                        var $this = $(this);
	                        if(indexs.length == 0){
	                            $this.message({
	                                   type: 'warning',
	                                   content: '请选择要审核的记录'
	                            });
	                            return;
	                        }
	                        var check = function(){
	                            self.check(indexs, $this);
	                        };
	                        $this.confirm({
	                            content: '请选择要审核该的记录?',
	                            callBack: check
	                        });
	                   }
	         });
	    },
	    add: function(grid){
	        var self = this;
	        var dialog = $('<div class="modal fade"><div class="modal-dialog">'
	        	+'<div class="modal-content"><div class="modal-header"><button type="button" class="close" '
	        	+'data-dismiss="modal" aria-hidden="true">&times;</button>'
	        	+'<h4 class="modal-title">新增</h4></div><div class="modal-body">'
	        	+'<p>One fine body&hellip;</p></div><div class="modal-footer">'
	        	+'<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>'
	        	+'<button type="button" class="btn btn-success" id="save">保存</button></div></div>'
	        	+'</div></div>');
	        $.get('<%=path%>/Booking-add.jsp').done(function(html){
	            dialog.modal({
	                keyboard:false
	            }).on({
	                'hidden.bs.modal': function(){
	                    $(this).remove();
	                }
	            }).find('.modal-body').html(html);
	            self.initPage(dialog.find('form'));
	        });
	        dialog.find('#save').on('click',{grid: grid}, function(e){
	              if(!Validator.Validate(dialog.find('form')[0],3))return;
	              $.post('${pageContext.request.contextPath}/Booking/add.koala', dialog.find('form').serialize()).done(function(result){
	                   if(result.success ){
	                        dialog.modal('hide');
	                        e.data.grid.data('koala.grid').refresh();
	                        e.data.grid.message({
	                            type: 'success',
	                            content: '保存成功'
	                         });
	                    }else{
	                        dialog.find('.modal-content').message({
	                            type: 'error',
	                            content: result.actionError
	                        });
	                     }
	              });
	        });
	    },
	    modify: function(id, grid){
	        var self = this;
	        var dialog = $('<div class="modal fade"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button><h4 class="modal-title">修改</h4></div><div class="modal-body"><p>One fine body&hellip;</p></div><div class="modal-footer"><button type="button" class="btn btn-default" data-dismiss="modal">取消</button><button type="button" class="btn btn-success" id="save">保存</button></div></div></div></div>');
	        $.get('<%=path%>/Booking-update.jsp').done(function(html){
	               dialog.find('.modal-body').html(html);
	               self.initPage(dialog.find('form'));
	               $.get( '${pageContext.request.contextPath}/Booking/get/' + id + '.koala').done(function(json){
	                       json = json.data;
	                        var elm;
	                        for(var index in json){
	                            elm = dialog.find('#'+ index + 'ID');
	                            if(elm.hasClass('select')){
	                                elm.setValue(json[index]);
	                            }else{
	                                elm.val(json[index]);
	                            }
	                        }
	                });
	                dialog.modal({
	                    keyboard:false
	                }).on({
	                    'hidden.bs.modal': function(){
	                        $(this).remove();
	                    }
	                });
	                dialog.find('#save').on('click',{grid: grid}, function(e){
	                    if(!Validator.Validate(dialog.find('form')[0],3))return;
	                    $.post('${pageContext.request.contextPath}/Booking/update.koala?id='+id, dialog.find('form').serialize()).done(function(result){
	                        if(result.success){
	                            dialog.modal('hide');
	                            e.data.grid.data('koala.grid').refresh();
	                            e.data.grid.message({
	                            type: 'success',
	                            content: '保存成功'
	                            });
	                        }else{
	                            dialog.find('.modal-content').message({
	                            type: 'error',
	                            content: result.actionError
	                            });
	                        }
	                    });
	                });
	        });
	    },
	    initPage: function(form){
	              form.find('.form_datetime').datetimepicker({
	                   language: 'zh-CN',
	                   format: "yyyy-mm-dd",
	                   autoclose: true,
	                   todayBtn: true,
	                   minView: 2,
	                   pickerPosition: 'bottom-left'
	               }).datetimepicker('setDate', new Date());//加载日期选择器
	               form.find('.select').each(function(){
	                    var select = $(this);
	                    var idAttr = select.attr('id');
	                    select.select({
	                        title: '请选择',
	                        contents: selectItems[idAttr]
	                    }).on('change', function(){
	                        form.find('#'+ idAttr + '_').val($(this).getValue());
	                    });
	               });
	    },
	    remove: function(ids, grid){
	    	var data = [{ name: 'ids', value: ids.join(',') }];
	    	$.post('${pageContext.request.contextPath}/Booking/delete.koala', data).done(function(result){
	                        if(result.success){
	                            grid.data('koala.grid').refresh();
	                            grid.message({
	                                type: 'success',
	                                content: '删除成功'
	                            });
	                        }else{
	                            grid.message({
	                                type: 'error',
	                                content: result.result
	                            });
	                        }
	    	});
	    },
	    check:function(ids,grid){
	    	var data = [{ name: 'ids', value: ids.join(',') }];
	    	$.post('${pageContext.request.contextPath}/Booking/check.koala', data).done(function(result){
	                        if(result.success){
	                            grid.data('koala.grid').refresh();
	                            grid.message({
	                                type: 'success',
	                                content: '审核成功'
	                            });
	                        }else{
	                            grid.message({
	                                type: 'error',
	                                content: result.result
	                            });
	                        }
	    	});
	    }
	}
	PageLoader.initSearchPanel();
	PageLoader.initGridPanel();
	form.find('#search').on('click', function(){
            if(!Validator.Validate(document.getElementById("<%=formId%>"),3))return;
            var params = {};
            form.find('input').each(function(){
                var $this = $(this);
                var name = $this.attr('name');
                if(name){
                    params[name] = $this.val();
                }
            });
            grid.getGrid().search(params);
        });
});

var openDetailsPage = function(id){
        var dialog = $('<div class="modal fade"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button><h4 class="modal-title">查看</h4></div><div class="modal-body"><p>One fine body&hellip;</p></div><div class="modal-footer"><button type="button" class="btn btn-info" data-dismiss="modal">返回</button></div></div></div></div>');
        $.get('<%=path%>/Booking-view.jsp').done(function(html){
               dialog.find('.modal-body').html(html);
               $.get( '${pageContext.request.contextPath}/Booking/get/' + id + '.koala').done(function(json){
                       json = json.data;
                        var elm;
                        for(var index in json){
                        if(json[index]+"" == "false"){
                        		dialog.find('#'+ index + 'ID').html("<span style='color:#d2322d' class='glyphicon glyphicon-remove'></span>");
                        	}else if(json[index]+"" == "true"){
                        		dialog.find('#'+ index + 'ID').html("<span style='color:#47a447' class='glyphicon glyphicon-ok'></span>");
                        	}else{
                          		 dialog.find('#'+ index + 'ID').html(json[index]+"");
                        	}
                        }
               });
                dialog.modal({
                    keyboard:false
                }).on({
                    'hidden.bs.modal': function(){
                        $(this).remove();
                    }
                });
        });
}
</script>
</head>
<body>
	<div
		style="width: 98%; margin-right: auto; margin-left: auto; padding-top: 15px;">
		<!-- search form -->
		<form name=<%=formId%> id=<%=formId%> target="_self"
			class="form-horizontal">
			<table border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<div class="form-group">
							<label class="control-label" style="width: 100px; float: left;">题目:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<input name="title" class="form-control" type="text"
									style="width: 180px;" id="titleID" />
							</div>
							<label class="control-label" style="width: 100px; float: left;">数据库:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<div class="btn-group select" id="dbType_SELECT"></div>
								<input type="hidden" id="dbTypeID_" name=dbType />
							</div>
							<label class="control-label" style="width: 100px; float: left;">语言:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<div class="btn-group select" id="langtype_SELECT"></div>
								<input type="hidden" id="langtypeID_" name="langType" />
							</div>
							<label class="control-label" style="width: 100px; float: left;">邮箱:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<input name="mail" class="form-control" type="text"
									style="width: 180px;" id="mailID" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label" style="width: 100px; float: left;">电话:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<input name="telephone" class="form-control" type="text"
									style="width: 180px;" id="telephoneID" />
							</div>
							<label class="control-label" style="width: 100px; float: left;">审核人:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<input name="auditor" class="form-control" type="text"
									style="width: 180px;" id="auditorID" />
							</div>
						</div>
					</td>
					<td style="vertical-align: bottom;"><button id="search"
							type="button"
							style="position: relative; margin-left: -57px; top: -15px"
							class="btn btn-primary">
							<span class="glyphicon glyphicon-search"></span>&nbsp;查询
						</button></td>
				</tr>
			</table>
		</form>
		<!-- grid -->
		<div id=<%=gridId%>></div>
	</div>
</body>
</html>
