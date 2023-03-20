package com.example.geektrust.entities.video;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class PremiumVideoSubscription extends Subscription{
	
	public PremiumVideoSubscription() {
		
		super.price = Constant.VEDIO_SUBSCRIPTION_PREMIUM_PLAN_PRICE;
		super.validityInMonth = Constant.VEDIO_SUBSCRIPTION_PREMIUM_PLAN_VALIDITY;
		
	}

}
