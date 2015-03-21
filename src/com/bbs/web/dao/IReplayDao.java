package com.bbs.web.dao;

import java.util.List;

import com.bbs.web.bean.ReplayBean;

public interface IReplayDao {
	public Integer AddReplay(ReplayBean replay);

	public Integer UpdateReplay(ReplayBean replay);

	public Integer DeleteReplay(ReplayBean replay);

	public ReplayBean GetReplayById(Integer replayID);

	public List<ReplayBean> GetReplayList(Integer topicID);
	
}
