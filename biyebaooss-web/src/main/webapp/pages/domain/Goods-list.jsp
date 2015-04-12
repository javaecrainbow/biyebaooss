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
<%@ taglib prefix="p" uri="/WEB-INF/permission.tld"%>
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
	        	           var startTimeVal = form.find('#posttimeID_start');
	                     var startTime = startTimeVal.parent();
	                     var endTimeVal = form.find('#posttimeID_end');
	                     var endTime = endTimeVal.parent();
	                     startTime.datetimepicker({
	                                        language: 'zh-CN',
	                                        format: "yyyy-mm-dd",
	                                        autoclose: true,
	                                        todayBtn: true,
	                                        minView: 2,
	                                        pickerPosition: 'bottom-left'
	                     }).on('changeDate', function(){
	                                 endTime.datetimepicker('setStartDate', startTimeVal.val());
	                           });//加载日期选择器
	                     var yesterday = new Date();
	                     yesterday.setDate(yesterday.getDate() - 1);
	                     endTime.datetimepicker({
	                             language: 'zh-CN',
	                             format: "yyyy-mm-dd",
	                             autoclose: true,
	                             todayBtn: true,
	                             minView: 2,
	                             pickerPosition: 'bottom-left'
	                     }).on('changeDate', function(ev){
	                                startTime.datetimepicker('setEndDate', endTimeVal.val());
	                           }).datetimepicker('setDate', new Date()).trigger('changeDate');//加载日期选择器
	                     startTime.datetimepicker('setDate', yesterday).trigger('changeDate');
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
	                	            	        	     },
	    initGridPanel: function(){
	         var self = this;
	         var width = 80;
	         var arrA = new Array();
	        	 arrA[0] = {content: '<button class="btn btn-primary" type="button"><span class="glyphicon glyphicon-plus"><span>添加</button>', action: 'add'}; 
		         arrA[1] = {content: '<button class="btn btn-success" type="button"><span class="glyphicon glyphicon-edit"><span>修改</button>', action: 'modify'}; 
		         arrA[2] = {content: '<button class="btn btn-danger" type="button"><span class="glyphicon glyphicon-remove"><span>删除</button>', action: 'delete'};  
	         return grid.grid({
	                identity:"id",
	                buttons: arrA,
	                url:"${pageContext.request.contextPath}/Goods/pageJson.koala",
	                sortName:"name",
	                columns: [
	                     	                         	                         { title: '题目', name: 'name', width: width},
	                         	                         	                         	                         { title: '数据库', name: 'dbType', width: width},
	                         	                         	                         	                         { title: '编程语言', name: 'langType', width: width},
	                         	                         	                         	                         { title: '价格', name: 'price', width: width},
	                         	                         	                         	                         { title: '来源', name: 'sourceType', width: width},
	                         	                         	                         	                         { title: '权重', name: 'weights', width: width},
	                         	                         	                         	                         { title: '发布时间', name: 'postTime', width: width},
	                         	                         	                         	                         { title: '销售量', name: 'saleNum', width: width},
	                         	                         	                         	                         { title: '浏览量', name: 'viewNum', width: width},
	                         	                         	                         	                      	{ title: '推荐', name: 'recommend', width: width},
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
	                   }
	         });
	    },
	    add: function(grid){
	        var self = this;
	        var dialog = $('<div class="modal fade"><div class="modal-dialog">'
	        	+'<div class="modal-content" style="width:900px"><div class="modal-header"><button type="button" class="close" '
	        	+'data-dismiss="modal" aria-hidden="true">&times;</button>'
	        	+'<h4 class="modal-title">新增</h4></div><div class="modal-body">'
	        	+'<p>One fine body&hellip;</p></div><div class="modal-footer">'
	        	+'<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>'
	        	+'<button type="button" class="btn btn-success" id="save">保存</button></div></div>'
	        	+'</div></div>');

			$.ajax({type:"get",url:'<%=path%>/Goods-add.jsp',async:false,
			success:function(html){
				 dialog.modal({
		                keyboard:false
		            }).on({
		                'hidden.bs.modal': function(){
		                    $(this).remove();

		                }
		            }).find('.modal-body').html(html)
		            self.initPage(dialog.find('form'));
			}	
			})
	        
	        dialog.find('#save').on('click',{grid: grid}, function(e){
	              if(!Validator.Validate(dialog.find('form')[0],3))return;
	              $.post('${pageContext.request.contextPath}/Goods/add.koala', dialog.find('form').serialize()).done(function(result){
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
	        var dialog = $('<div class="modal fade"><div class="modal-dialog"><div class="modal-content" style="width:900px"><div class="modal-header"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button><h4 class="modal-title">修改</h4></div><div class="modal-body"><p>One fine body&hellip;</p></div><div class="modal-footer"><button type="button" class="btn btn-default" data-dismiss="modal">取消</button><button type="button" class="btn btn-success" id="save">保存</button></div></div></div></div>');
	        $.get('<%=path%>/Goods-update.jsp').done(function(html){
	               dialog.find('.modal-body').html(html);
	               self.initPage(dialog.find('form'));
	               $.get( '${pageContext.request.contextPath}/Goods/get/' + id + '.koala').done(function(json){
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
	                    $.post('${pageContext.request.contextPath}/Goods/update.koala?id='+id, dialog.find('form').serialize()).done(function(result){
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
                   form.find('#descriptionID').bind("focus",function(){
                	   if(editor !='undefined'){
                	   initKindEditor();
                	   }
                   });

	    },
	    remove: function(ids, grid){
	    	var data = [{ name: 'ids', value: ids.join(',') }];
	    	$.post('${pageContext.request.contextPath}/Goods/delete.koala', data).done(function(result){
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
        $.get('<%=path%>/Goods-view.jsp').done(function(html){
               dialog.find('.modal-body').html(html);
               $.get( '${pageContext.request.contextPath}/Goods/get/' + id + '.koala').done(function(json){
                       json = json.data;
                        var elm;
                        for(var index in json){
                           dialog.find('#'+ index + 'ID').html(json[index]);
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
var editor;
function initKindEditor(){
	editor=KindEditor.create('textarea[name="description"]', {  
			uploadJson : '/pages/kindeditor/upload_json.jsp',
			fileManagerJson : '/pages/kindeditor/file_manager_json.jsp',
			allowFileManager : true,
		afterBlur: function(){this.sync();} 
		});
}
</script>
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
								<input name="name" class="form-control" type="text"
									style="width: 180px;" id="nameID" />
							</div>
							<label class="control-label" style="width: 100px; float: left;">来源:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<input name="sourceType" class="form-control" type="text"
									style="width: 180px;" id="sourcetypeID" />
							</div>
							<label class="control-label" style="width: 100px; float: left;">发布时间:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<div class="input-group date form_datetime"
									style="width: 160px; float: left;">
									<input type="text" class="form-control" style="width: 160px;"
										name="postTime" id="posttimeID_start"> <span
										class="input-group-addon"><span
										class="glyphicon glyphicon-th"></span></span>
								</div>
								<div
									style="float: left; width: 10px; margin-left: auto; margin-right: auto;">&nbsp;-&nbsp;</div>
								<div class="input-group date form_datetime"
									style="width: 160px; float: left;">
									<input type="text" class="form-control" style="width: 160px;"
										name="postTimeEnd" id="posttimeID_end"> <span
										class="input-group-addon"><span
										class="glyphicon glyphicon-th"></span></span>
								</div>
							</div>
							<label class="control-label" style="width: 100px; float: left;">编程语言:&nbsp;</label>
							<div style="margin-left: 15px; float: left;">
								<div class="btn-group select" id="langtype_SELECT"></div>
								<input type="hidden" id="langtypeID_" name="langType" />
							</div>
						</div>
					</td>
					<td style="vertical-align: bottom;"><button id="search"
							type="button"
							style="position: relative; margin-left: 35px; top: -15px"
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
