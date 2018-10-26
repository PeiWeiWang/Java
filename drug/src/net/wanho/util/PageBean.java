package net.wanho.util;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
	// 当前页
	private int pageNo;
	// 总页数
	private int totalPages;
	// 每页记录数
	private int pageSize;
	// 总记录数
	private int totalRecords;
	// 是否有上一页
	private boolean isHavePrePage;
	// 是否有下一页
	private boolean isHaveNextPage;
	// 数据
	private List<T> pageDatas = new ArrayList<>();

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public boolean isHavePrePage() {
		return isHavePrePage;
	}

	public void setHavePrePage(boolean isHavePrePage) {
		this.isHavePrePage = isHavePrePage;
	}

	public boolean isHaveNextPage() {
		return isHaveNextPage;
	}

	public void setHaveNextPage(boolean isHaveNextPage) {
		this.isHaveNextPage = isHaveNextPage;
	}

	public List<T> getPageDatas() {
		return pageDatas;
	}

	public void setPageDatas(List<T> pageDatas) {
		this.pageDatas = pageDatas;
	}

	public PageBean(int pageNo, int pageSize, int totalRecords) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		if (totalRecords < 0) {
			throw new RuntimeException("总记录数不能小于0");
		}
		// 设置总条数
		this.totalRecords = totalRecords;
		// 计算总页数
		this.totalPages = this.totalRecords / this.pageSize;
		if (this.totalRecords % this.pageSize != 0) {
			this.totalPages++;
		}
		// 计算是否有上一页
		if (this.pageNo > 1) {
			this.isHavePrePage = true;
		} else {
			this.isHavePrePage = false;
		}

		// 计算是否有下一页
		if (this.pageNo<this.totalPages) {
			this.isHaveNextPage= true;
		} else {
			this.isHaveNextPage = false;
		}

	}

}
