package x.mvmn.permock.util;

import java.util.HashMap;
import java.util.Map;

public class CollectionsUtil {

	public static class MapBuilder<K, V> {
		private Map<K, V> map = new HashMap<>();

		public MapBuilder<K, V> and(K key, V value) {
			map.put(key, value);
			return this;
		}

		public Map<K, V> build() {
			return map;
		}
	}

	public static <K, V> MapBuilder<K, V> mapOf(K key, V value) {
		MapBuilder<K, V> mapBuilder = new MapBuilder<>();
		return mapBuilder.and(key, value);
	}
}
