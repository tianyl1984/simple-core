package com.tianyl.core.orm;

import java.util.List;

public class Page<T> {

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalSize;

	private List<T> data;

	public Integer getTotalPage() {
		return totalSize / pageSize + (totalSize % pageSize == 0 ? 0 : 1);
	}

	public Integer getOffset() {
		return (pageNum - 1) * pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

}
