package com.example.geektrust.entities.music;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class FreeMusicSubscription extends Subscription{
	
	public FreeMusicSubscription() {
		super.price = Constant.MUSIC_SUBSCRIPTION_FREE_PLAN_PRICE;
		super.validityInMonth = Constant.MUSIC_SUBSCRIPTION_FREE_PLAN_VALIDITY;
	}

}
