package io.jphilips.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(new Topic("spring", "Spring Framework", "Spring framework description"),
			new Topic("java", "Core Java", "Core java description"),
			new Topic("javascript", "JavaScript", "JavaScript description"));

	public List<Topic> getAllTopics() {
		return topics;
	}
}
