package Subscription.demo_subs.controller;

import org.springframework.web.bind.annotation.RestController;

import Subscription.demo_subs.model.Subscription;
import Subscription.demo_subs.service.SubscriptionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/subscription")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService)  {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping("/{id}")
    public Subscription getSubscriptionDetails(@PathVariable String id) {
        return subscriptionService.getSubscriptionById(id);
    }

    @PostMapping
    public String createSubscriptionDetails(@RequestBody Subscription subscription) {
        Subscription saved = subscriptionService.saveSubscription(subscription);
        return "Successful, your subscription created with ID: " + saved.getId();
    }
}
