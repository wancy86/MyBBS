<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/pages/common/tags.jsp"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="pragma" content="no-cache">
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

		<script type="text/javascript">
			//onload
			$( function() {
				//alert(1);
			});
		
			//add topic
			function AddTopic() {
				//
		
			}
		</script>

	</head>

	<body>

		<div class="container" style="margin-top: 10px;">
			<div class="row well">
				<div class="col-lg-12" style="height: 100px;">
					<h1>
						<a href="web/home" style="text-decoration:none;"><span class="glyphicon glyphicon-home"></span>屌丝基地论坛</a>
					</h1>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12" style="padding: 0px;">
					<div class="panel panel-default" style="min-height: 500px;">
						<!-- Default panel contents -->
						<div class="panel-heading">
							主题
						</div>
						<div class="panel-body">
							<div class="container">
								<div class="row" style="margin-bottom: 3px;">
									<div class="col-lg-6">
										<form action="web/home!AddTopic" method="post" role="form" class="form-inline">
											<div class="input-group">
												<input type="text" class="form-control" placeholder="请输入主题..." id="topicText" name="topicText">
												<span class="input-group-btn">
													<button class="btn btn-primary" type="submit">
														添加主题
													</button> 
												</span>
											</div>
										</form>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-12">
										<table class="table table-bordered" style="width: 100%;">
											<thead>
												<tr>
													<th style="width:50px;">
													#
													</th>
													<th style="width:50%;">主题(<s:property value="topicList.size"/>)</th>
													<th>最新回复/回复数</th>
												</tr>
											</thead>
											<tbody>
												<s:iterator value="topicList" status="status" var="T">
													<tr>
														<td>
															<!--<s:property value="#T[0]"/>-->
															<s:property value="#status.index+1"/>
														</td>
														<td>
															<a href="web/home!TopicDetail?topicID=<s:property value="#T[0]"/>"><s:property value="#T[1]"/></a>
														</td>
														<td>
															<s:property value="#T[2]"/>
														</td>
													</tr>
												</s:iterator>
												<!--
												<s:iterator value="topicList" status="status" var="T">
													<tr>
														<td>
															<s:property value="#status.index"/><s:property value="#T.topicID"/>
														</td>
														<td>
															<s:property value="#T.topic"/>
														</td>
														<td>
															<s:property value="#T.topicLastrepaytime"/>
														</td>
													</tr>
												</s:iterator>
												  -->
												<!-- 
												<c:forEach items="${topicList}" var="topic">
													<tr>
														<td>${topic[1]}</td><td>222</td><td>3333</td>
													</tr>
												</c:forEach>
												 -->
												
											</tbody>
										</table>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-12">
										<ul class="pagination">
											<li class="disabled">
												<a href="#">&laquo;</a>
											</li>
											<li class="active">
												<a href="#">1</a>
											</li>
											<li>
												<a href="#">2</a>
											</li>
											<li>
												<a href="#">3</a>
											</li>
											<li>
												<a href="#">4</a>
											</li>
											<li>
												<a href="#">5</a>
											</li>
											<li>
												<a href="#">&raquo;</a>
											</li>
										</ul>
									</div>
								</div>

							</div>

						</div>

					</div>
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


