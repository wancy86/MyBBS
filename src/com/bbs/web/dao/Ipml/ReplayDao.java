package com.bbs.web.dao.Ipml;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.bbs.web.bean.ReplayBean;
import com.bbs.web.dao.IReplayDao;
import java.util.List;

public class ReplayDao implements IReplayDao{

	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
	@Override
	public Integer AddReplay(ReplayBean replay) {
		Session session =sessionFactory.openSession();
		session.save(replay);		
		return null;
	}

	@Override
	public Integer DeleteReplay(ReplayBean replay) {
		Session session=sessionFactory.openSession();
		session.delete(replay);
		return null;
	}

	@Override
	public ReplayBean GetReplayById(Integer replayID) {
		Session session=sessionFactory.openSession();
		ReplayBean replay=(ReplayBean)session.get(ReplayBean.class, replayID);
		return replay;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ReplayBean> GetReplayList(Integer  topicID) {
		Session session=sessionFactory.openSession();
		String hql="from ReplayBean as replay where replay.topicID=:topic_ID";
		Query query = session.createQuery(hql);
		query.setInteger("topic_ID", topicID);
		List<ReplayBean> replayList=(List<ReplayBean>)query.list();
		session.close();
		
		return replayList;
	}

	@Override
	public Integer UpdateReplay(ReplayBean replay) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.update(replay);
		return null;
	}

	
}
