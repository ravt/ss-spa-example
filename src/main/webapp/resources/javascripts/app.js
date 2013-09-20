var app = {};

$(document).ready(function() {
	// load base fragments
	$.ajax({
		type : "GET",
		url : "list",
		async : false,
		success : function(response) {
			console.log(response);
			$("#container1").html(response);
		},
		error : function(e) {
			console.log(e);
			alert('Error: ' + e);
		}
	});
	
	
	$.ajax({
		type : "GET",
		url : "new",
		async : false,
		success : function(response) {
			$("#container2").html(response);
		},
		error : function(e) {
			alert('Error: ' + e);
		}

	});
	
	
	// finally call foundation
	$(document).foundation();
});