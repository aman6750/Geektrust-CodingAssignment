package com.example.geektrust.entities.Factory;

import com.example.geektrust.entities.Subscription;
import com.example.geektrust.entities.podcast.FreePodcastSubscription;
import com.example.geektrust.entities.podcast.PersonalPodcastSubscription;
import com.example.geektrust.entities.podcast.PremiumPodcastSubscription;
import com.example.geektrust.enums.SubscriptionPlan;

public class PodcastSubscriptionFactory extends AbstractFactory{

	@Override
	Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType) {
		
		switch(subscriptionPlanType) {
		
		case FREE: return  new FreePodcastSubscription();
		case PERSONAL: return new PersonalPodcastSubscription();
		case PREMIUM: return new PremiumPodcastSubscription();
		
		}
		
		return null;
	}

	
	
}
