package com.bbs.web.action;

//import java.io.Console;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.apache.log4j.Logger;
import java.util.List;
import com.bbs.common.base.BaseAction;
import com.bbs.common.base.BaseJsonBean;
import com.bbs.web.bean.ReplayBean;
import com.bbs.web.bean.TopicBean;
import com.bbs.web.service.Topic2ReplayService;

/**
 * 
 * @author mark
 * @date 2013-3-23 21:58:48
 * @TODO 描述 
 */
public class HomeAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private Logger LOG = Logger.getLogger(getClass());

	// 入参
	protected Integer uid;// 请求时的uid
	protected String currentPage = "home";
	protected String topicText;
	protected String replayText;
	protected Integer topicID;
	protected TopicBean topic;


	// 回参
	protected BaseJsonBean jsonResult;
	protected List<TopicBean> topicList=null;
	public List<TopicBean> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<TopicBean> topicList) {
		this.topicList = topicList;
	}
	protected List<ReplayBean> replayList=null;	
	public List<ReplayBean> getReplayList() {
		return replayList;
	}
	public void setReplayList(List<ReplayBean> replayList) {
		this.replayList = replayList;
	}
	
	//service
	protected Topic2ReplayService topic2ReplayService;
	public void setTopic2ReplayService(Topic2ReplayService topic2ReplayService) {
		this.topic2ReplayService = topic2ReplayService;
	}
	public Topic2ReplayService getTopic2ReplayService() {
		return topic2ReplayService;
	}


	/**
	 * 默认方法，进入网站首页home页面
	 */
	public String execute() throws Exception {
		LOG.info("Start the BBS!");
		//show all the topics
		topicList=topic2ReplayService.GetTopicList();
		//topicList.size()
		
		return "success";

	}
	
	public String AddTopic()
	{
		
		LOG.info("Add Topic>>>>>>>>>>>>>>>>>>>>"+this.topicText);
		
		TopicBean topic=new TopicBean();
		topic.setTopic(topicText);
		topic.setTopicReplaycount(0);
		topic.setTopicEntrydate(new Date());		
		topic.setTopicLastrepaytime(new Date());
		topic2ReplayService.AddTopic(topic);
		topicID=topic.getTopicId();
		
		return "TopicAdded";
	}
	
	
	
	
	//get the topic and show the detial
	public String TopicDetail()
	{
		if(topicID==0)
			return "";
		//get the topic and replay			
		topic=topic2ReplayService.GetTopicById(topicID);
		
		//get the replay
		replayList=topic2ReplayService.GetTopicReplayList(topicID);
			
		return "TopicDetail";
	}
	
	
	public String ReplayTopic()
	{
		//ReplayBean replay=new ReplayBean(topicID,replayText,"",new Date());
		ReplayBean replay=new ReplayBean();
		replay.setReplayContent(replayText);
		replay.setTopicID(topicID);
		replay.setReplayName("");
		replay.setReplayTime(new Date());
		
		LOG.info(replayText);
		
		topic2ReplayService.ReplayTopic(replay);
		
		//这就是内部跳转，Mark
		return TopicDetail();
	}
	
	

	

	public BaseJsonBean getJsonResult() {
		return jsonResult;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setJsonResult(BaseJsonBean jsonResult) {
		this.jsonResult = jsonResult;
	}
	
	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	
	public Integer getTopicID() {
		return topicID;
	}
	public void setTopicID(Integer topicID) {
		this.topicID = topicID;
	}
	
	public String getTopicText() {
		return topicText;
	}
	public void setTopicText(String topicText) {
		this.topicText = topicText;
	}
	public TopicBean getTopic() {
		return topic;
	}
	public void setTopic(TopicBean topic) {
		this.topic = topic;
	}
	public String getReplayText() {
		return replayText;
	}
	public void setReplayText(String replayText) throws UnsupportedEncodingException {
		this.replayText =replayText;
		//this.replayText = new String(replayText.getBytes("ISO8859-1"),"UTF-8");
	}
	
	

}
