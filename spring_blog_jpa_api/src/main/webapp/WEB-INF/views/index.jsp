<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>
<%-- <c:forEach var="i" begin="0" end="3">
	<h1>Index! ${i}</h1>
</c:forEach> --%>
<section id="intro" style="background-color: aqua; color: white; margin-bottom: 10px; height: 1000px">INTRO SECTION</section>



<section id="project" style="background-color: blue; color: white; margin-bottom: 10px; height: 1000px">PROJECT SECTION</section>



<section id="skill" style=" margin-bottom: 10px; height: 1000px; border: 1px solid red;">
	<c:forEach var="data" items="${skill_list.data}">
		<div class="d-flex align-items-center" style="border: 1px solid gold; float: right; width: 33%;">
			<img class="p-2" alt="no image" style="width: 82px; height: 82px;" src="${data.imageUri}">
			<h4 class="p-2" >${data.skillName}</h4>
		</div>
	</c:forEach>
</section>


<%@ include file="layout/footer.jsp"%>
