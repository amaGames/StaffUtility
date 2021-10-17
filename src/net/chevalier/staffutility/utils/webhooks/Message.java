package net.chevalier.staffutility.utils.webhooks;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Message {

	private JsonObject jsonObject = new JsonObject();

	public Message(String message, String name, String icon) {
		if (!(message == null)) {
			this.jsonObject.addProperty("content", message);
		}
		if (!(name == null) && !(icon == null)) {
			this.jsonObject.addProperty("name", name);
			this.jsonObject.addProperty("icon", icon);
		}
	}

	public void setEmbed(Embed webHookEmbed) {
		JsonArray jsonArray = new JsonArray();
		jsonArray.add(webHookEmbed.getJsonObject());
		this.jsonObject.add("embeds", jsonArray);
	}

	public JsonObject getJsonObject() {
		return this.jsonObject;
	}

	public String getJson() {
		return new Gson().toJson(this.jsonObject);
	}

}
