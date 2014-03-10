(function($) {
	initializePlayerEvents();
	initializePlayerView();
})(jQuery);

function initializePlayerEvents() {
	$('#save_player_btn').bind('click', savePlayer);
}

function initializePlayerView() {
	$("#player_age").numericInput({
		allowFloat : false, // Accpets positive numbers (floating point)
		allowNegative : false
	// Accpets positive or negative integer
	});
}

function savePlayer(ev) {

	ev.preventDefault();
	
	var player = new Object();
	player.teamId = teamId;
	player.id = (playerId != null && playerId.length > 0) ? playerId : null;
	player.name = $("#player_name").val();
	player.lastName = $("#player_lastName").val();
	player.age = $("#player_age").val();
	player.position = $("#player_position").val();

	$.ajax({
		url : "savePlayer",
		type : "POST",
		data : JSON.stringify(player),
		dataType : "json",
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type",
					"application/json; charset=UTF-8");
		},
		success : function(data) {
			if (data.status = "OK") {
				alert("success !");
				// redirect if needed
			} else {
				alert("error");
				// redirect or show message or something
			}
		},
		error : function(data) {
			alert("error trying to connect with the server");
			// show error probably by net connection or internal error (validate
			// all cases)
		}

	});
}
