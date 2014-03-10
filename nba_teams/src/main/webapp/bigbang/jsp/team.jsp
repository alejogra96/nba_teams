<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>nba_teams</title>
<link rel="stylesheet" type="text/css" href="bigbang/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="bigbang/css/bootstrap-responsive.css">
<link rel="stylesheet" type="text/css" href="bigbang/css/nba_teams.css">
</head>
<body>
	<div class="page-container">
		<div class="add-title">
			<img id="top-img-add" src="bigbang/img/imeges_title.jpeg"
				alt="nba_icon" class="img-rounded">
			<h1 id="add-title">Add Team</h1>
		</div>
		<div class="add-form">

			<form role="form" class="team-form" id="team_form_id">
				
				<div class="form-group">
				    <label for="team_name">Team Name:</label>
				    <input type="text" class="form-control" id="team_name" placeholder="Type the team`s name" value="${team.teamName}">
				</div>
				
				<div class="form-group">
				    <label for="team_city">Team City:</label>
				    <input type="text" class="form-control" id="team_city" placeholder="Type the team`s city" value="${team.cityName}">
				</div>
			

				<div class="spacer-div"></div>

				<div class="form-group">
				    <label for="team_conference">Team Conference:</label>
				    <select id="team_conference">
				    	<c:forEach items="${conferences}" var="conference">
						<option value="${conference}"<c:if test="${conference == team.conference }"> selected</c:if>>${conference.conference}</option>
						</c:forEach>
					</select>
				</div>

				<div class="spacer-div"></div>

				<button id="save_team_btn" type="submit" class="btn btn-default">Submit</button>

				<div class="spacer-div"></div>

				<a href="teamList" class="btn btn-inverse"><i
					class="icon-white icon-arrow-left"></i> Back to teams</a>
			</form>
		</div>
	</div>


	<script>
		teamId = "${team.id}";
	</script>
	<script type="text/javascript" src="bigbang/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="bigbang/js/bootstrap.js"></script>
	<script type="text/javascript" src="bigbang/js/app/team.js"></script>
</body>
</html>