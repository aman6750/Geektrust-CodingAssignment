package com.example.geektrust.entities.podcast;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class PersonalPodcastSubscription extends Subscription{
	
	
	public PersonalPodcastSubscription() {
		super.price = Constant.PODCAST_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
		super.validityInMonth = Constant.PODCAST_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
	}

}
