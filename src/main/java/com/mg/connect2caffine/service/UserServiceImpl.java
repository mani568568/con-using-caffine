package com.mg.connect2caffine.service;


import com.mg.connect2caffine.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
@CacheConfig(cacheNames = {"user"})
@Slf4j
public class UserServiceImpl implements UserService {


    @Cacheable // this tells that result of that method will be stored in to the cache...
    @Override
    public User getUser(Long customerID) {
        log.info("Trying to get customer information for id :"+customerID);
        return getUserData(customerID);
    }

    private User getUserData(Long customerID) {
        return new User(customerID,"m@m.com","Nabula");
    }


}
