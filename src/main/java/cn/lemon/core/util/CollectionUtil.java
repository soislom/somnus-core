package cn.lemon.core.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;

/**
 * 集合工具栏
 * 
 * @author 34305
 *
 */
public class CollectionUtil {

	/**
	 * 初始化hashMap
	 * 
	 * @return
	 */
	public static <K, V> HashMap<K, V> initHashMap() {
		return new HashMap<K, V>(100);
	}

	/**
	 * 初始化hashMap
	 * 
	 * @param size
	 * @return
	 */
	public static <K, V> HashMap<K, V> initHashMap(int size) {
		return new HashMap<K, V>((int) (size / 0.75));
	}

	/**
	 * 初始化hashMap
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public static <K, V> HashMap<K, V> initHashMap(K key, V value) {
		HashMap<K, V> map = new HashMap<K, V>(100);
		map.put(key, value);
		return map;
	}

	/**
	 * 数组添加元素，会产生一个新数组，不影响原数组
	 * 
	 * @param array
	 * @param element
	 * @return
	 */
	public static <E> E[] append(E[] array, E element) {
		E[] newArray = copy(array, array.length + 1, element.getClass());
		newArray[array.length] = element;
		return newArray;
	}

	/**
	 * 数组 copy 新数组
	 * 
	 * @param array
	 * @param newSize
	 * @param clasz
	 * @return
	 */
	public static <E> E[] copy(E[] array, int newSize, Class<?> clasz) {
		E[] newArray = initArray(clasz, newSize);
		System.arraycopy(array, 0, newArray, 0, array.length >= newSize ? newSize : array.length);
		return newArray;
	}

	/**
	 * 初始化数组
	 * 
	 * @param clasz
	 * @param size
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <E> E[] initArray(Class<?> clasz, int size) {
		return (E[]) Array.newInstance(clasz, size);
	}

	/**
	 * 判断数组是否为空
	 * 
	 * @param array
	 * @return
	 */
	public static <E> boolean isEmpty(E[] array) {
		return array == null || array.length == 0;
	}

	/**
	 * 判断数组是否不为空
	 * 
	 * @param array
	 * @return
	 */
	public static <E> boolean isNotEmpty(E[] array) {
		return !isEmpty(array);
	}

	/**
	 * 判断集合是否为空
	 * 
	 * @param collection
	 * @return
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}

	/**
	 * 判断集合是否不为空
	 * 
	 * @param collection
	 * @return
	 */
	public static boolean isNotEmpty(Collection<?> collection) {
		return !isEmpty(collection);
	}

}
