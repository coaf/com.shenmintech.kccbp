package com.shenmintech.common.util;

import java.util.Collections;
import java.util.List;

public class ListUtils {
	public static <T extends Comparable<T>> boolean compare(List<T> a, List<T> b) {
		if(a.size() != b.size()) return false;
		Collections.sort(a);
		Collections.sort(b);
		for(int i=0;i<a.size();i++){
		  if(!a.get(i).equals(b.get(i))) return false;
		}
		return true;
	}
}
