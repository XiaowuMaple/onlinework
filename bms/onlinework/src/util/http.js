const prefix = "http://localhost/onlinework/";

export default {
	post(url, params, callback) {
		url = prefix + url;
		let request = new XMLHttpRequest();
		request.open("POST", url, true);
		request.responseType = "json";
		request.addEventListener("load", event => { 
			console.log(url, request.response);
			callback(request.response);
		})
		request.send(params);
	}
}
