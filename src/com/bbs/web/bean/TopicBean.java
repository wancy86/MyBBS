package com.bbs.web.bean;

import java.util.Date;

/**
 * TopicBean entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class TopicBean {//implements java.io.Serializable

	// Fields

	protected Integer topicId;
	protected String topic;
	protected Date topicEntrydate;
	protected Integer topicReplaycount;
	protected Date topicLastrepaytime;

	// Constructors
	/** default constructor */
	public TopicBean() {
	}

	/** full constructor */
	public TopicBean(String topic, Date topicEntrydate,
			Integer topicReplaycount, Date topicLastrepaytime) {
		this.topic = topic;
		this.topicEntrydate = topicEntrydate;
		this.topicReplaycount = topicReplaycount;
		this.topicLastrepaytime = topicLastrepaytime;
	}

	// Property accessors

	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Date getTopicEntrydate() {
		return this.topicEntrydate;
	}

	public void setTopicEntrydate(Date topicEntrydate) {
		this.topicEntrydate = topicEntrydate;
	}

	public Integer getTopicReplaycount() {
		return this.topicReplaycount;
	}

	public void setTopicReplaycount(Integer topicReplaycount) {
		this.topicReplaycount = topicReplaycount;
	}

	public Date getTopicLastrepaytime() {
		return this.topicLastrepaytime;
	}

	public void setTopicLastrepaytime(Date topicLastrepaytime) {
		this.topicLastrepaytime = topicLastrepaytime;
	}

}