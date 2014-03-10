<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>add-player</title>
<link rel="stylesheet" type="text/css" href="bigbang/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="bigbang/css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="bigbang/css/nba_teams.css" />
</head>
 <body>
	<div class="page-container">
		<div class="add-title">
			<img id="top-img-add" src="bigbang/img/imeges_title.jpeg"
				alt="nba_icon" class="img-rounded" />
			<h1 id="add-title">Add Player</h1>
		</div>
		<div class="add-form">

			<form role="form" class="player-form" id="player_form_id">

				<div class="form-group">
					<label for="player_name">Name:</label> <input type="text"
						class="form-control" id="player_name"
						placeholder="Type the player`s name" value="${player.name}" />
				</div>

				<div class="spacer-div"></div>

				<div class="form-group">
					<label for="player_lastName">Last Name:</label> <input type="text"
						class="form-control" id="player_lastName"
						placeholder="Type the player`s last name"
						value="${player.lastName}">
				</div>

				<div class="spacer-div"></div>

				<div class="form-group">
					<label for="player_age">Age:</label> <input type="text"
						class="form-control" id="player_age"
						placeholder="Type the player`s age" value="${player.age}">
				</div>


				<div class="spacer-div"></div>

				<div class="form-group">
					<label for="player_position">position:</label> <select
						id="player_position">
						<c:forEach items="${positions}" var="position">
							<option value="${position}"
								<c:if test="${position == player.position }"> selected</c:if>>${position.positionName}</option>
						</c:forEach>
					</select>
				</div>

				<div class="spacer-div"></div>


				<button id="save_player_btn" type="submit" class="btn btn-default">Add</button>

				<div class="spacer-div"></div>

				<a href="playerList?teamId=${teamId}" class="btn btn-inverse"><i
					class="icon-white icon-arrow-left"></i> Back to player list</a>
			</form>
		</div>
	</div>


	<script>
	playerId = "${player.id}";
	</script>
	<script>
	teamId = "${teamId}";
	</script>
	<script type="text/javascript" src="bigbang/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="bigbang/js/bootstrap.js"></script>
	<script type="text/javascript" src="bigbang/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="bigbang/js/numericInput.js"></script>
	<script type="text/javascript" src="bigbang/js/app/player.js"></script>
	
</body>
</html>
