<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="common/tags.jsp" %>
<%@ include file="common/header.jsp" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'topic.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet"
			href="resource/bootstrap/css/bootstrap-theme.css" type="text/css"></link>
	<link rel="stylesheet" href="resource/bootstrap/css/bootstrap.css"
		type="text/css"></link>
	<script type="text/javascript" src="resource/jquery-1.11.1.js"></script>
	<script type="text/javascript"
		src="resource/bootstrap/js/bootstrap.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
		<div class="container" style="margin-top:10px;">
			<div class="row well">
				<div class="col-lg-12" style="height: 100px;">
					<h1>
						<a href="web/home" style="text-decoration:none;"><span class="glyphicon glyphicon-home"></span>屌丝基地论坛</a>
					</h1>
				</div>
			</div>			
			<div class="row">
				<div class="col-lg-12 well">
					<h1><s:property value="topic.topic"/></h1>
				</div>				
			</div>
			
			<div class="row">
				<div class="col-lg-12" style="padding:0px;">
					<table class="table table-bordered">	
						<s:iterator value="replayList" var="replay" status="status">
							<tr>
								<td style="height:200px;width:15%;">#<s:property value="#status.index+1"/></td>
								<td><s:property value="#replay.replayContent"/></td>
							</tr>
						</s:iterator>
					</table>
						
				</div>
			</div>
			
			<div class="row">
				<div class="col-lg-12" style="padding:0px;">
				<form action="web/home!ReplayTopic" method="post">
					<table class="table table-bordered" style="width:100%;">						
						<tr>
							<td style="height:170px;">							
								<input type="hidden" name="topicID" value='<s:property value="topicID"/>'/>
								<textarea rows="7" cols="133" id="replayText" name="replayText"></textarea>
							</td>
							<td style="width:200px;">
								<button type="submit" class="btn btn-primary" style="height:150px;width:180px;"><font size="7">回复</font></button>
							</td>
						</tr>						
					</table>
				</form>
				</div>
			</div>
			
			<div class="row" style="">
				<div class="col-lg-12" style="padding: 0px;">
					<div class="panel panel-default">
						<div class="panel-body">
							@24K纯屌丝
							<br />
							copy right 2014-2100
						</div>
					</div>
				</div>
			</div>
			
			
		</div>
		<s:debug/>
	</body>
</html>
