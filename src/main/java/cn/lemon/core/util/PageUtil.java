package cn.lemon.core.util;

import java.util.List;

/**
 * 分页工具类
 * @author 34305
 *
 * @param <T>
 */
public class PageUtil<T> {

	/**
	 * 每页显示条数
	 */
	private Integer pageSize = 20;
	
	/**
	 * 页数
	 */
	private Integer pageIndex = 0;
	
	/**
	 * 数据
	 */
	private List<T> list;
	
	/**
	 * 是否有下一页
	 */
	private boolean hasNext;
	
	/**
	 * 是否有上一页
	 */
	private boolean hasPro;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public boolean isHasPro() {
		return hasPro;
	}

	public void setHasPro(boolean hasPro) {
		this.hasPro = hasPro;
	}

	public PageUtil(List<T> list) {
		super();
		this.list = list;
	}

	public PageUtil() {
		super();
	}

	public PageUtil(Integer pageSize, Integer pageIndex, List<T> list) {
		super();
		this.pageSize = pageSize;
		this.pageIndex = pageIndex;
		this.list = list;
	}
}