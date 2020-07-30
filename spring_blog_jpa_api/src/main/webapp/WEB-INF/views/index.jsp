<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>
<section id="intro">
	<div class="box">
		<div class="card-top">
			<div class="image-box">
				<img class="card-img-top" src="/image/me.jpg" alt="Card image">
			</div>
			<div style="text-align: center;">
				<button type="button" class="btn btn-primary" onClick="window.open('https://github.com/commin0813/IntroduceMyself')">경력기술서</button>
			</div>
		</div>
		<div class="card-bottom">
			<div class="card-body">
				<c:forEach var="data" items="${intro_list.data}">
					<h4 class="card-title">${data.title}</h4>
					<p class="card-text">${data.content}</p>
					<br />
				</c:forEach>
			</div>
		</div>
	</div>
</section>
<section id="project">
	<main style="margin-top: 30px; margin-bottom: 50px">
		<h1 style="text-align: center; margin-top: 100px; margin-bottom: 50px">Project</h1>
		<br />
		<section class="page-section">
			<div class="container">
				<div class="timeline">
					<div class="timeline__wrap">
						<div class="timeline__items">
							<c:forEach var="data" items="${project_list.data}">
								<div class="timeline__item">
									<div class="timeline__content">
										<h2>${data.startDateString}-${data.endDateString}</h2>
										<p>${data.projectName}-${data.projectDesc}</p>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</section>
	</main>
</section>


<section id="skill">
	<div class="container">
		<div class="row">
			<div class="col" style="text-align: center; margin-top: 100px; margin-bottom: 50px">
				<h1>Language & Framework</h1>
			</div>
			<div class="w-100"></div>
			<c:set var="count" value="0" />
			<c:forEach var="data" items="${skill_list.data}">
				<c:if test="${data.skillType == 'LANGUAGE'}">
					<c:set var="count" value="${count + 1}" />
					<div class="col-sm-4" style="text-align: center;">
						<div class="image-box">
							<img class="p-2" alt="no image" src="${data.imageUri}">
						</div>
						<h4 class="p-2" style="margin-top: -50px">${data.skillName}</h4>
					</div>
				</c:if>

				<%-- <c:if test="${count%2 == 0 }">
					<div class="w-100" id="two"></div>
				</c:if> --%>
			</c:forEach>
		</div>
		<div class="row" style="margin-top: 20px;">
			<div class="col" style="text-align: center; margin-top: 100px; margin-bottom: 50px">
				<h1>Database</h1>
			</div>
			<div class="w-100"></div>
			<c:set var="count" value="0" />
			<c:forEach var="data" items="${skill_list.data}">
				<c:if test="${data.skillType == 'DATABASE'}">
					<c:set var="count" value="${count + 1}" />
					<div class="col-sm-3" style="text-align: center">
						<div class="image-box">
							<img class="p-2" alt="no image" src="${data.imageUri}">
						</div>
						<h4 class="p-2" style="margin-top: -50px">${data.skillName}</h4>
					</div>
				</c:if>
				<%-- <c:if test="${count%2 == 0 }">
					<div class="w-100"></div>
				</c:if> --%>
			</c:forEach>
		</div>
	</div>
	<%-- <div>
		LANGUAGE SECTION<br />
		<c:forEach var="data" items="${skill_list.data}">
			<c:if test="${data.skillType == 'LANGUAGE'}">
				<div class="d-flex align-items-center" style="border: 1px solid gold; float: left; width: 33%;">
					<img class="p-2" alt="no image" style="width: 82px; height: 82px;" src="${data.imageUri}">
					<h4 class="p-2">${data.skillName}</h4>
				</div>
			</c:if>
		</c:forEach>
	</div>
	<div>
		DATABASE SECTION<br />
		<c:forEach var="data" items="${skill_list.data}">
			<c:if test="${data.skillType == 'DATABASE'}">
				<div class="d-flex align-items-center" style="border: 1px solid gold; float: left; width: 33%;">
					<img class="p-2" alt="no image" style="width: 82px; height: 82px;" src="${data.imageUri}">
					<h4 class="p-2">${data.skillName}</h4>
				</div>
			</c:if>
		</c:forEach>
	</div> --%>
</section>
<%@ include file="layout/footer.jsp"%>
