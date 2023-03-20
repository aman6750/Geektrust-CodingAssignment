package com.example.geektrust.entities.music;

import com.example.geektrust.constant.Constant;
import com.example.geektrust.entities.Subscription;

public class PersonalMusicSubscription extends Subscription{

	public PersonalMusicSubscription() {
		super.price = Constant.MUSIC_SUBSCRIPTION_PERSONAL_PLAN_PRICE;
		super.validityInMonth = Constant.MUSIC_SUBSCRIPTION_PERSONAL_PLAN_VALIDITY;
		
	}
	
}
