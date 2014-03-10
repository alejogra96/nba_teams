<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<title>nba_teams</title>
<link rel="stylesheet" type="text/css" href="bigbang/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="bigbang/css/bootstrap-responsive.css">
<link rel="stylesheet" type="text/css" href="bigbang/css/nba_teams.css">
</head>
<body>
	<!-- page_container-->
	<div class="page-container">
		<!--title-->
		<div class="title_container">
			<img id="top_img_title" src="bigbang/img/imeges_title.jpeg"
				alt="nba_icon" class="img-rounded">
			<h1 id="page_title">NBA TEAMS</h1>
		</div>
		<div class="button_div">
			<a href="team"><button type="button"
					class="btn btn-primary btn-lg">Add Team</button></a>

		</div>
		<table class="table">
			<tr class="team-row success">
				<td>Name</td>
				<td>City</td>
				<td>Conference</td>
				<td></td>
			</tr>
			<c:forEach items="${teamList}" var="team">
				
				<tr class="team-info-row">
					<td class="teamName-td"><a href="playerList?teamId=${team.id}">${team.teamName}</a></td>
					<td class="cityName-td">${team.cityName}</td>
					<td class="conference-td">${team.conference.conference}</td>
					<td class="edit-button"><a href="team?teamId=${team.id}"
						class="btn btn-warning">Edit</a></td>
				</tr>
				
			</c:forEach>
		</table>
	</div>


	<script type="text/javascript" src="bigbang/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="bigbang/js/bootstrap.js"></script>
	<script type="text/javascript" src="bigbang/js/app/teamList.js"></script>
</body>
</html>