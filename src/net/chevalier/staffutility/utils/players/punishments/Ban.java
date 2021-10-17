package net.chevalier.staffutility.utils.players.punishments;

import java.util.Date;

public class Ban {

	public String reason;
	public String executor;
	public Date expire;

	public static Ban newInstance() {
		return new Ban();
	}

	public String getReason() {
		return this.reason;
	}

	public String getExecutor() {
		return this.executor;
	}

	public Date getExpire() {
		return this.expire;
	}

}
