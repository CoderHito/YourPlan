package com.hito.utils;

import java.util.UUID;

public class UUIDUtil {
	public static String getUUID() {
		String randomUUID = UUID.randomUUID().toString().trim()
				.replace("-", "");
//		int uuid = Integer.parseInt(randomUUID);
		return randomUUID;
	}
}
