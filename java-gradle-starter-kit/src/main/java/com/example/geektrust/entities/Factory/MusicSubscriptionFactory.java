package com.example.geektrust.entities.Factory;

import com.example.geektrust.entities.Subscription;
import com.example.geektrust.entities.music.FreeMusicSubscription;
import com.example.geektrust.entities.music.PersonalMusicSubscription;
import com.example.geektrust.entities.music.PremiumSubscriptionPlan;
import com.example.geektrust.enums.SubscriptionPlan;

public class MusicSubscriptionFactory extends AbstractFactory{

	@Override
	Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
	
		switch(subscriptionPlanType) {
		
		case FREE: return new FreeMusicSubscription();
		case PERSONAL: return new PersonalMusicSubscription();
		case PREMIUM: return new PremiumSubscriptionPlan();
		
		}
		
		return null;
	}
	
	

}
