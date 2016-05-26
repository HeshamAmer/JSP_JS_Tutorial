/**
 * 
 */

document.addEventListener("DOMContentLoaded", function(event) {
	// do work
	console.log(document.getElementById("span1").innerHTML);
	var x = document.getElementById("span1").innerHTML = "HELLLLLLLOOOOOOO";
	console.log("Calling change in span, Span value is " + x);

	var y = document.getElementById("text1");
	document.getElementById("button1").addEventListener("click", function() {
		y.value++;
		console.log(y);
		
	});

});
