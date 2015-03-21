package com.bbs.web.bean;

import java.util.Date;

/**
 * ReplayBean entity. @author MyEclipse Persistence Tools
 */

public class ReplayBean implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Integer replayId;
	protected Integer topicID;
	protected String replayContent;
	protected String replayName;
	protected Date replayTime;

	// Constructors

	/** default constructor */
	public ReplayBean() {
	}

	/** full constructor */
	public ReplayBean(Integer topicId, String replayContent, String replayName,
			Date replayTime) {
		this.topicID = topicId;
		this.replayContent = replayContent;
		this.replayName = replayName;
		this.replayTime = replayTime;
	}

	// Property accessors

	public Integer getReplayId() {
		return this.replayId;
	}

	public void setReplayId(Integer replayId) {
		this.replayId = replayId;
	}

	public Integer getTopicID() {
		return this.topicID;
	}

	public void setTopicID(Integer topicId) {
		this.topicID = topicId;
	}

	public String getReplayContent() {
		return this.replayContent;
	}

	public void setReplayContent(String replayContent) {
		this.replayContent = replayContent;
	}

	public String getReplayName() {
		return this.replayName;
	}

	public void setReplayName(String replayName) {
		this.replayName = replayName;
	}

	public Date getReplayTime() {
		return this.replayTime;
	}

	public void setReplayTime(Date replayTime) {
		this.replayTime = replayTime;
	}

}