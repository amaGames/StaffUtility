package net.chevalier.staffutility.utils;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHookManager {

	public static void sendMessage(String json, String url) {
		HttpURLConnection urlConnection;
		OutputStream outputStream;
		try {
			urlConnection = (HttpURLConnection) new URL(url).openConnection();
			urlConnection.addRequestProperty("Content-Type", "application/JSON; charset=utf-8");
			urlConnection.addRequestProperty("User-Agent", "");
			urlConnection.setDoOutput(true);
			urlConnection.setRequestMethod("POST");
			urlConnection.setRequestProperty("Content-Length", String.valueOf(json.length()));
			outputStream = urlConnection.getOutputStream();
			outputStream.write(json.getBytes("UTF-8"));
			urlConnection.getResponseCode();
			outputStream.flush();
			outputStream.close();
			urlConnection.disconnect();
		}
		catch (Exception exception) {
		}
	}

}
