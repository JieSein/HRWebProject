function show() {
	var box = document.getElementById("box");
	var text = box.innerHTML;
	var newBox = document.createElement("p");
	newBox.innerHTML = text.substring(0, 40);

	box.innerHTML = "";
	box.appendChild(newBox);
}

function shows(obj,id){
	var objDiv = $("#" + id + "");
	$(objDiv).css("display", "block");
	$(objDiv).css("left", event.clientX);
	$(objDiv).css("top", event.clientY + 10);
	$(objDiv).css("width", "250px");
	$(objDiv).css("font-size", "13px");
}

function hide(obj, id) {
	var objDiv = $("#" + id + "");
	$(objDiv).css("display", "none");
}

window.onload = function() {
	show();
}

