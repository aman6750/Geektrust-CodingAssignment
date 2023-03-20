package com.example.geektrust.entities.video;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class FreeVideoSubscription extends Subscription {
	
	public FreeVideoSubscription() {
		super.price= Constant.VEDIO_SUBSCRIPTION_FREE_PLAN_PRICE;
		super.validityInMonth = Constant.VEDIO_SUBSCRIPTION_FREE_PLAN_VALIDITY;
	}

}
