package net.chevalier.staffutility.utils.webhooks;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Embed {

	private JsonObject jsonObject = new JsonObject();

	public void setTitle(String title) {
		this.jsonObject.addProperty("title", title);
	}

	public void setDescription(String description) {
		this.jsonObject.addProperty("description", description);
	}

	public void setColor(int color) {
		this.jsonObject.addProperty("color", color);
	}

	public JsonObject getJsonObject() {
		return this.jsonObject;
	}

	public String getJson() {
		return new Gson().toJson(this.jsonObject);
	}

}
