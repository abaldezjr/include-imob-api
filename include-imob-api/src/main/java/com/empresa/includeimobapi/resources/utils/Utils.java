package com.empresa.includeimobapi.resources.utils;

import java.util.Objects;

public class Utils {

	public static Boolean isNullOrEmpty(Object obj) {
		if (Objects.isNull(obj)) {
			return true;
		}
		return false;
	}

}
