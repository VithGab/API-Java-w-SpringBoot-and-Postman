package Subscription.demo_subs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import Subscription.demo_subs.model.Subscription;


@Repository
public class SubscriptionRepository { 
    private List<Subscription> subscriptions = new ArrayList<>();
    private Long idCounter = 1L;
    
    public Subscription save(Subscription subscription) {
        if(subscription.getId() == null || subscription.getId().isBlank()) {
            subscription.setId(idCounter.toString());
            idCounter++;
        }
        subscriptions.add(subscription);
        return subscription;
    }

    public Subscription byId(String id) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getId().equals(id)) {
                return subscription;
            }
        }
        return null;
    }
}
