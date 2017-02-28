const prefix = "http://www.rainstep.cn/onlinework/";

export default {
	post(url, params, callback) {
		url = prefix + url;
		let request = new XMLHttpRequest();
		request.open("POST", url, true);
		request.responseType = "json";
		request.addEventListener("load", event => { 
			console.log("url: ", url);
			console.log("params: ", params);
			console.log("response:", request.response);
			callback(request.response);
		})
		let formData = new FormData();
		for(let k in params) {
			formData.append(k, params[k]);
		}
		request.send(formData);
	}
}
