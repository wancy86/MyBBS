package com.bbs.web.service;
import java.util.List;

import com.bbs.web.bean.ReplayBean;
import com.bbs.web.bean.TopicBean;
import com.bbs.web.dao.*;

public class Topic2ReplayService {
	
	//topics
	private ITopicDao topicDao;
	private IReplayDao replayDao;
	

	public Integer AddTopic(TopicBean topic) {
		Integer topicID=topicDao.AddTopic(topic);
		return topicID;
	}

	
	public Integer DeleteTopic(TopicBean topic) {
		topicDao.DeleteTopic(topic);
		return null;
	}

	
	public TopicBean GetTopicById(Integer topic_id) {
		
		return topicDao.GetTopicById(topic_id);
	}

	
	public List<TopicBean> GetTopicList() {
		return (List<TopicBean>)topicDao.GetTopicList();
	}

	
	public Integer UpdateTopic(TopicBean topic) {
		topicDao.UpdateTopic(topic);
		return null;
	}


	public ITopicDao getTopicDao() {
		return topicDao;
	}

	public void setTopicDao(ITopicDao topicDao) {
		this.topicDao = topicDao;
	}

	public IReplayDao getReplayDao() {
		return replayDao;
	}

	public void setReplayDao(IReplayDao replayDao) {
		this.replayDao = replayDao;
	}
	
	
	//replay service	
	public int ReplayTopic(ReplayBean replay)
	{
		replayDao.AddReplay(replay);
		return 0;
	}
	
	public List<ReplayBean> GetTopicReplayList(Integer topicID)
	{
		List<ReplayBean> res=replayDao.GetReplayList(topicID);		
		
		return res;
	}
	
	
	
}
