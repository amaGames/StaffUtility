package net.chevalier.staffutility.utils.commands.objects;

public enum Permission {

	STAFF("STAFF", 2),
	DEFAULT("DEFAULT", 1);

	private String name;
	private int permissionLevel;

	Permission(String name, int permissionLevel) {
		this.name = name;
		this.permissionLevel = permissionLevel;
	}

	public String getName() {
		return this.name;
	}

	public int getPermissionLevel() {
		return this.permissionLevel;
	}

	public static boolean comparePermission(Permission source, Permission target) {
		return (target.getPermissionLevel() >= source.getPermissionLevel());
	}

}
