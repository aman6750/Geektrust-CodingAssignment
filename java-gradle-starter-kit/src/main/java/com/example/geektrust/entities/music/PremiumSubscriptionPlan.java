package com.example.geektrust.entities.music;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class PremiumSubscriptionPlan extends Subscription{
	
	public PremiumSubscriptionPlan() {
		super.price = Constant.MUSIC_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
		super.validityInMonth = Constant.MUSIC_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
	}

}
