package com.bbs.web.dao;

import com.bbs.web.bean.TopicBean;
import java.util.List;

public interface ITopicDao {

	
	
	public Integer AddTopic(TopicBean topic);

	public Integer UpdateTopic(TopicBean topic);

	public Integer DeleteTopic(TopicBean topic);

	public TopicBean GetTopicById(Integer topic_id);

	public List<TopicBean> GetTopicList();

}
