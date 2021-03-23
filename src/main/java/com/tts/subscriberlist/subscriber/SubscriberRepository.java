package com.tts.subscriberlist.subscriber;

import org.springframework.data.repository.CrudRepository;

//We aren't actually making a repository class...
//we are describing what one should be
public interface SubscriberRepository extends CrudRepository<Subscriber, Long>
{

}
