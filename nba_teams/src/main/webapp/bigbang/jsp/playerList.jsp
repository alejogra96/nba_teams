<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>players</title>
<link rel="stylesheet" type="text/css" href="bigbang/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="bigbang/css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="bigbang/css/nba_teams.css" />
</head>
<body>
	<!-- page_container-->
	<div class="page-container">
		<!--title-->
		<div class="title_container">
			<img id="top_img_title" src="bigbang/img/imeges_title.jpeg"
				alt="nba_icon" class="img-rounded">
				<h1 id="page_title">PLAYERS</h1>
		</div>
		<div class="button_div">
			<a href="player?teamId=${teamId}"><button type="button"
					class="btn btn-primary btn-lg">Add Player</button></a>

		</div>


		<table class="table">
			<tr class="team-row success">
				<td>Name</td>
				<td>Last Name</td>
				<td>Age</td>
				<td>Position</td>
				<td></td>
			</tr>

			<c:forEach items="${playerList}" var="player">
			
				<tr class="player-row info">
					<td class="playerName-td"><a href="playerList?teamId=${team.id}">${player.name}</a></td>
					<td class="lastName-td">${player.lastName}</td>
					<td class="age-td">${player.age}</td>
					<td class="position-td">${player.position.positionName}</td>
					<td class="edit-button"><a href="player?playerId=${player.id}&teamId=${team.id}"
						class="btn btn-warning">Edit</a></td>
				</tr>
				
				
			</c:forEach>

		</table>
	</div>



	<script type="text/javascript">
		teamId = "${teamId}";
	</script>
	<script type="text/javascript" src="bigbang/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="bigbang/js/bootstrap.js"></script>
	<script type="text/javascript" src="bigbang/js/app/playerList.js"></script>

</body>
</html>

