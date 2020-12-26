package com.ecodation.enums;

public enum Level {
	HIGHT(3), MEDIUM(2), LOW(1);
	
	// nesne değişkeni
	private final int levelCode;
	
	// constrctor
	private Level(int levelCode) {
		this.levelCode = levelCode;
	}
	
	public int getLevelCode() {
		return levelCode;
	}
	
}
