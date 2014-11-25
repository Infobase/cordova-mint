var exec = require('cordova/exec');

var mintExport = {};

mintExport.initAndStartSession = function(apiKey, successCallback, errorCallback) {
	exec(
		successCallback, // success callback function
		errorCallback, // error callback function
		'MintPlugin', // mapped to our native Java class called "CalendarPlugin"
		'initAndStartSession', // with this action name
		[apiKey]
	); 
 }
 
 module.exports = mintExport;