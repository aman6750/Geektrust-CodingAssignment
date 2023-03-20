package com.example.geektrust.entities.podcast;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class FreePodcastSubscription extends Subscription{

	public FreePodcastSubscription() {
		super.price = Constant.PODCAST_SUBSCRIPTION_FREE_PLAN_PRICE;
		super.validityInMonth = Constant.PODCAST_SUBSCRIPTION_FREE_PLAN_VALIDITY;
	}
	
}
