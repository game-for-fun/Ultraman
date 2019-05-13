package com.ultraman.model;

import java.util.List;

import javax.ws.rs.FormParam;

/**
 * 分页
 * @author gjw
 *
 */
public class Page<T> {

	/**
	 * 结果集
	 */
	private List<T> datas;
	/**
	 * 记录总数
	 */
	private Integer rowCount;
	/**
	 * 分页大小 
	 */
	@FormParam("pageSize")
	private Integer pageSize;
	/**
	 * 页号
	 */
	@FormParam("pageNo")
	private Integer pageNo;
	/**
	 * 跳过条数
	 */
	private Integer skip;
	/**
	 * 个数（通用）
	 */
	private List<Integer> count;

	public List<Integer> getCount() {
		return count;
	}

	public void setCount(List<Integer> count) {
		this.count = count;
	}

	/**
	 * 总页数
	 * @return
	 */
	public Integer getTotalPage() {
		return (rowCount % pageSize) == 0 ? rowCount / pageSize : rowCount / pageSize + 1;
	}

	public Integer getSkip() {
		skip = (pageNo - 1) * pageSize;
		return skip;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = (pageSize == null) ? 30 : pageSize;
	}

	public Integer getPageNo() {
		return pageNo == null ? 1 : pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = (pageNo == null) ? 1 : pageNo;
	}

	public void setSkip(Integer skip) {
		this.skip = skip;
	}

}
