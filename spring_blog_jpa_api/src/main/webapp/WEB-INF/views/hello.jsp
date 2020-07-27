<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link href="css/portfoilo.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>프로그래머 김형민</title>
<style type="text/css">
.container .wrapper {
	border: 1px solid black;
	width: 100%;
	height: 100px;
	padding:30px;
	text-align: center;
}

.container .wrapper .content {
	border: 1px solid yellow;
	display: inline-block;
}
</style>
</head>
<body>
	<div class="container">
		<div class="wrapper">
			<div class="content">DIV1</div>
		</div>
	</div>
	<%@ include file="layout/footer.jsp"%>