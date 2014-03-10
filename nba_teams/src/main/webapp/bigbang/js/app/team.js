(function($) {
	initializeTeamEvents();
	initializeTeamView();
})(jQuery);

function initializeTeamEvents() {
	$('#save_team_btn').bind('click', saveTeam);
}

function initializeTeamView() {

}

function saveTeam(ev) {

	ev.preventDefault();

	var team = new Object();
	team.id = (teamId != null && teamId.length > 0) ? teamId : null;
	team.teamName = $("#team_name").val();
	team.cityName = $("#team_city").val();
	team.conference = $("#team_conference").val();

	$.ajax({
		url : "saveTeam",
		type : "POST",
		data : JSON.stringify(team),
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
