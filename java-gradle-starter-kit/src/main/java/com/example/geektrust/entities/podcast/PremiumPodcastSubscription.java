package com.example.geektrust.entities.podcast;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class PremiumPodcastSubscription extends Subscription{

	public PremiumPodcastSubscription() {
		
		super.price = Constant.PODCAST_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
		super.validityInMonth = Constant.PODCAST_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
		
	}
	
}
