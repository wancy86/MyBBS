package com.bbs.web.dao.Ipml;

import java.util.List;
import com.bbs.web.bean.TopicBean;
import com.bbs.web.dao.ITopicDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TopicDao implements ITopicDao {

	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	@Override
	public Integer AddTopic(TopicBean topic) {
		Session session=sessionFactory.openSession();
		session.save(topic);
		Integer topicID=topic.getTopicId();
		return topicID;
	}

	@Override
	public Integer DeleteTopic(TopicBean topic) {
		Session session=sessionFactory.openSession();
		String hql = "delete from topic where topic_id = " + topic.getTopicId();
        Query query = session.createQuery(hql);
        query.executeUpdate();
        session.close();
		return null;
	}

	@Override
	public TopicBean GetTopicById(Integer topic_id) {
		Session session=sessionFactory.openSession();
		TopicBean res=(TopicBean)session.get(TopicBean.class, topic_id);
		
		/*
		String hql = "from TopicBean topicBean where topicBean.topicId=:topic_id";
		Query query=session.createQuery(hql);
		query.setInteger("topic_id", topic_id);
		query.setFetchSize(1);
		TopicBean res = (TopicBean)query.list().get(0);
		*/
		
        session.close();
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TopicBean> GetTopicList() {
		Session session=sessionFactory.openSession();
		String hql = "select topicId,topic,topicEntrydate,topicReplaycount,topicLastrepaytime from TopicBean";
        List<TopicBean> res = (List<TopicBean>)session.createQuery(hql).list();
        
        session.close();
		return res;
	}

	@Override
	public Integer UpdateTopic(TopicBean topic) {
		Session session = sessionFactory.openSession();
        String hql = "update topic set topic=:topic,topic_replaycount=:topic_replaycount,topic_lastrepaytime=:topic_lastrepaytime";
        Query query = session.createQuery(hql);
        query.setString("topic", topic.getTopic());
        query.setInteger("topic_replaycount", topic.getTopicReplaycount());
        query.setTime("topic_lastrepaytime", topic.getTopicLastrepaytime());
        query.executeUpdate();
        session.close();
		return null;
	}

}
